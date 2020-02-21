#!groovy

import java.time.*

String getProfileType(String begin="02:00:00",String end="04:00:00"){
    String profile = "";
    LocalTime t = LocalTime.now().withNano(0);
    LocalTime beginTime = LocalTime.parse(begin);
    LocalTime endTime = LocalTime.parse(end);
    if(t.isAfter(beginTime) && t.isBefore(endTime)){
        profile = "full";
    }else{
        profile = "smoke";
    }

    println(t.toString());
    println(profile);
    return profile
}

return this;

