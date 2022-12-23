package Service;

import com.globallogic.grpc.Jwt;
import com.globallogic.grpc.testingGrpc;
import io.grpc.stub.StreamObserver;

public class testingservice  extends testingGrpc.testingImplBase{


    @Override
    public void login(Jwt.credential request, StreamObserver<Jwt.APIResponse> responseObserver) {
        String email=request.getEmail();
        String pswd=request.getPassword();
        Jwt.APIResponse.Builder rspnse= Jwt.APIResponse.newBuilder();
       if(email.equals(pswd))
       {
             rspnse.setJwttoken(tokengeneration.jwtToken(email));
       }
       else
       rspnse.setMsge("invalid credentail");
       responseObserver.onNext(rspnse.build());
       responseObserver.onCompleted();

    }
}
