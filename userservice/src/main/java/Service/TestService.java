package Service;

import Interceptor.Interceptor;
import io.grpc.stub.StreamObserver;
import org.globallogic.grpc.Test;
import org.globallogic.grpc.TestServiceGrpc;

public class TestService extends TestServiceGrpc.TestServiceImplBase {
    @Override
    public void home(Test.Empty request, StreamObserver<Test.responseMessage> responseObserver) {
        Test.responseMessage.Builder rspnse = Test.responseMessage.newBuilder();
        rspnse.setMessage("welcome"+ Interceptor.UID);
        responseObserver.onNext(rspnse.build());
        responseObserver.onCompleted();
    }
}
