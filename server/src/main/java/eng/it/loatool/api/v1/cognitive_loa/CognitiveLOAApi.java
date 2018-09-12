package eng.it.loatool.api.v1.cognitive_loa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import eng.it.loatool.cognitive_loa.CognitiveLOA;
import eng.it.util.ResponseEntityTransformer;

@Controller
public class CognitiveLOAApi {

    @GetMapping("/v1/cognitive-loa")
    public ResponseEntity<?> getAllCognitiveLOA() {
        return ResponseEntityTransformer.transformOk(
            getAllCognitiveLOAService.getAllCognitiveLOA()
        );
    }

    @GetMapping("/v1/cognitive-loa/{id}")
    public ResponseEntity<?> getSingleCognitiveLOA(@PathVariable("id") Integer id) {
        return ResponseEntityTransformer.transform(
            getSingleCognitiveLOAService.getSingleCognitiveLOA(id)
        );
    }

    @PutMapping("/v1/cognitive-loa/{id}")
    public ResponseEntity<?> putCognitiveLOA(
        @PathVariable("id") Integer id,
        @RequestBody CognitiveLOA body
    ) {
        return ResponseEntityTransformer.transform(
            putCognitiveLOAService.putCognitiveLOA(id, body)
        );
    }

    @Autowired private PutCognitiveLOAService putCognitiveLOAService;
    @Autowired private GetAllCognitiveLOAService getAllCognitiveLOAService;
    @Autowired private GetSingleCognitiveLOAService getSingleCognitiveLOAService;

}