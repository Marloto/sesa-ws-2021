package de.thi.inf.sesa.hexa.statistic;

import de.thi.inf.sesa.hexa.repository.PostRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class StatisticServiceImpl extends StatisticServiceGrpc.StatisticServiceImplBase {
    @Autowired
    private PostRepository posts;

    @Override
    public void posts(PostsStatisticRequest request, StreamObserver<PostsStatisticResponse> responseObserver) {
        long count = posts.count();
        PostsStatisticResponse response = PostsStatisticResponse.newBuilder().setCount((int) count).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
