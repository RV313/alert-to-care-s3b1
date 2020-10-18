package com.philips.demo.service.Monitoring;

import org.springframework.stereotype.Service;

@Service
public class MonitoringServiceImp implements MonitoringService {

	private String message;

	@Override
	public String vitalCheckSpo2(int spo2) {
		RangeChecker checker = new RangeChecker(90, 100);
		message = checker.contains(spo2);
		return "Spo2" + message;
	}

	@Override
	public String vitalCheckBpm(int bpm) {
		RangeChecker checker = new RangeChecker(70, 150);
		message = checker.contains(bpm);
		return "Bpm" + message;

	}

	@Override
	public String vitalCheckRespRate(int respRate) {
		RangeChecker checker = new RangeChecker(30, 95);
		message = checker.contains(respRate);
		return "RespRate" + message;
	}

}
