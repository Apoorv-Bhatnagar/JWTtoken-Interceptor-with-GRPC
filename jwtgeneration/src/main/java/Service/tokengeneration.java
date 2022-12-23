package Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class tokengeneration {
    public static String jwtToken(String tokenClaim)
    {
        Map<String,Object> mp=new HashMap<String,Object>();
        mp.put("email",tokenClaim);
        mp.put("pswd","aaaaassdsa");
        return Jwts.builder()
                .setSubject("Any subject we can set like login")
                .setClaims(mp)
                .setIssuedAt(new Date(new Date().getTime())).setExpiration(Date.from(ZonedDateTime.now().plusMinutes(10).toInstant()))
                .signWith(SignatureAlgorithm.HS256,"my secret key").compact();

    }


}
