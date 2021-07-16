package com.cottagecoders.timedrift;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;

public class TimeDrift {
  public static void main(String... args) throws IOException {
    NTPUDPClient client = new NTPUDPClient();
    client.open();
    InetAddress hostAddr = InetAddress.getByName("time4.google.com");
    TimeInfo ntpTime = client.getTime(hostAddr);
    ntpTime.computeDetails();

    System.out.println("npt time:\t" + ntpTime.getReturnTime() + "\t" + new Date(ntpTime.getReturnTime()) +
        "\nRoundtrip delay(ms)=" + ntpTime.getDelay() + ", clock offset(ms)=" + ntpTime.getOffset());
    client.close();
  }
}
