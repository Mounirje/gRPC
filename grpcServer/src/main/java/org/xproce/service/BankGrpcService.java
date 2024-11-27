package org.xproce.service;

import io.grpc.stub.StreamObserver;
import org.xproce.stubs.Bank;
import org.xproce.stubs.BankServiceGrpc;
import org.xproce.stubs.BankServiceGrpc.BankServiceImplBase;

public class BankGrpcService extends BankServiceImplBase{
    @Override
    public void convert(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        String currencyFrom = request.getCurrencyFrom();
    }
}
