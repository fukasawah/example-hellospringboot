package dev.fukasawah.example.hellospringboot.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ResourceLeakController {
	private static byte[] DUMMY = new byte[0];

	@RequestMapping("/memory")
	int home(@RequestParam("size") int size) {
		if (size <= 0) {
			size = 1;
		}
		try {
			DUMMY = new byte[1024 * 1024 * size];
			return DUMMY.length;
		} catch (Throwable e) {
			e.printStackTrace();
			return -1;
		}
	}

}