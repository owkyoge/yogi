package com.example.serviceimpl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.WalletDao;
import com.example.pogo.SenderReciver;
import com.example.pogo.Wallet;
import com.example.service.FundService;

@Service
public class FundServiceImpl implements FundService {

	@Autowired
	WalletDao walDao;

	@Override
	public void find(SenderReciver sr) {
		List<Wallet> walletList = walDao.find();

		Wallet senderWallet = null;
		Wallet recevierWallet = null;

		for (Wallet w : walletList) {

			if (w.getAccNo().equals(sr.getSenderAccNo())) {

				senderWallet = w;
			}

			if (w.getAccNo().equals(sr.getReceiverAccNo())) {

				recevierWallet = w;
			}

		}
		BigDecimal senderAmt = null;
		Long senderAccNo = null;
		if (senderWallet != null) {

			senderAccNo = senderWallet.getAccNo();

			senderAmt = senderWallet.getAmt();

		}

		if (recevierWallet != null) {

			BigDecimal reciverAmt = recevierWallet.getAmt();
			Long receverAccNo = recevierWallet.getAccNo();
			BigDecimal receverUpdatedamt = reciverAmt.add(sr.getAmt());

			walDao.update(receverAccNo, receverUpdatedamt);

		}

		BigDecimal amt3 = senderWallet.getAmt();
		BigDecimal remainingAmtinSender = senderAmt.subtract(sr.getAmt());
		walDao.update(senderAccNo, remainingAmtinSender);

	}

}
