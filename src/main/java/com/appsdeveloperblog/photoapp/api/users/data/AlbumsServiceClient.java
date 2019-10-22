package com.appsdeveloperblog.photoapp.api.users.data;

import com.appsdeveloperblog.photoapp.api.users.ui.model.AlbumResponseModel;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "albums-ws")
public interface AlbumsServiceClient {

	@GetMapping("/users/{id}/albums")
	public List<AlbumResponseModel> getAlbums(@PathVariable String id);
}
