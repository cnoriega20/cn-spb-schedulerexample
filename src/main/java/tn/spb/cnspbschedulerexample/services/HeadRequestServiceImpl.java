package tn.spb.cnspbschedulerexample.services;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.impl.IOFileUploadException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@Slf4j
public class HeadRequestServiceImpl implements HeadRequestService {

    private HttpHeaders httpHeaders;

    @Override
    public String doHeadRequest() {

        HttpClient httpClient = HttpClient.newHttpClient();
        try{
            var httpRequest= HttpRequest.newBuilder(URI.create("https://spring.io/guides"))
                    .method("HEAD", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse httpResponse = httpClient.send(httpRequest,
                    HttpResponse.BodyHandlers.discarding());
            httpHeaders = httpResponse.headers();
        } catch (IOException | InterruptedException e){
            log.error("Failed to send HEAD request");
        }

        return httpHeaders.toString();

    }
}
