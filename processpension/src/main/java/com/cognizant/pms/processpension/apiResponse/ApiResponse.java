package com.cognizant.pms.processpension.apiResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
    private int status;
    private String message;
    private Object data;
}
