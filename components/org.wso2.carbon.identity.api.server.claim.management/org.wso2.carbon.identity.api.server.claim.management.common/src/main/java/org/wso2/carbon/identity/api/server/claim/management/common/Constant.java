/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.api.server.claim.management.common;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Claim Management constant class.
 */
public class Constant {

    public static final String CLAIM_MANAGEMENT_PREFIX = "CMT-";
    public static final String CMT_PATH_COMPONENT = "/claim-dialects";
    public static final String LOCAL_DIALECT_PATH = "local";

    /**
     * Enum for error messages.
     */
    public enum ErrorMessage {

        ERROR_CODE_ERROR_ADDING_DIALECT("50001",
                "Unable to add claim dialect.",
                "Server encountered an error while adding the claim dialect %s."),
        ERROR_CODE_ERROR_ADDING_EXTERNAL_CLAIM("50002",
                "Unable to add external claim.",
                "Server encountered an error while adding the external claim %s."),
        ERROR_CODE_ERROR_ADDING_LOCAL_CLAIM("50003",
                "Unable to add local claim.",
                "Server encountered an error while adding the local claim %s."),
        ERROR_CODE_ERROR_DELETING_DIALECT("50004",
                "Unable to delete claim dialect.",
                "Server encountered an error while deleting the claim dialect for identifier %s."),
        ERROR_CODE_ERROR_DELETING_EXTERNAL_CLAIM("50005",
                "Unable to delete external claim.",
                "Server encountered an error while deleting the external claim for identifier %s in dialect " +
                        "identifier %s."),
        ERROR_CODE_ERROR_DELETING_LOCAL_CLAIM("50006",
                "Unable to delete local claim.",
                "Server encountered an error while deleting the local claim for identifier %s."),
        ERROR_CODE_ERROR_RETRIEVING_DIALECT("50007",
                "Unable to retrieve claim dialect.",
                "Server encountered an error while retrieving the claim dialect for identifier %s."),
        ERROR_CODE_ERROR_RETRIEVING_DIALECTS("50008",
                "Unable to retrieve claim dialects.",
                "Server encountered an error while retrieving the claim dialects."),
        ERROR_CODE_ERROR_RETRIEVING_EXTERNAL_CLAIM("50009",
                "Unable to retrieve external claim.",
                "Server encountered an error while retrieving the external claim for identifier %s in dialect " +
                        "identifier %s."),
        ERROR_CODE_ERROR_RETRIEVING_EXTERNAL_CLAIMS("500010",
                "Unable to retrieve external claims.",
                "Server encountered an error while retrieving the external claims for dialect identifier %s."),
        ERROR_CODE_ERROR_RETRIEVING_LOCAL_CLAIM("500011",
                "Unable to retrieve local claim.",
                "Server encountered an error while retrieving the local claim for identifier %s."),
        ERROR_CODE_ERROR_RETRIEVING_LOCAL_CLAIMS("500012",
                "Unable to retrieve local claims.",
                "Server encountered an error while retrieving the local claims."),
        ERROR_CODE_ERROR_UPDATING_DIALECT("500013",
                "Unable to update claim dialect.",
                "Server encountered an error while updating the claim dialect for identifier %s."),
        ERROR_CODE_ERROR_UPDATING_EXTERNAL_CLAIM("500014",
                "Unable to update external claim.",
                "Server encountered an error while updating the external claim for identifier %s in dialect " +
                        "identifier %s."),
        ERROR_CODE_ERROR_UPDATING_LOCAL_CLAIM("500015",
                "Unable to update local claim.",
                "Server encountered an error while updating the local claim for identifier %s."),
        ERROR_CODE_DIALECT_NOT_FOUND("500016",
                "Resource not found.",
                "Unable to find a resource matching the provided claim dialect identifier %s."),
        ERROR_CODE_CLAIMS_NOT_FOUND_FOR_DIALECT("500017",
                "Resource not found.",
                "Unable to find any claims matching the provided claim dialect identifier %s."),
        ERROR_CODE_EXTERNAL_CLAIM_NOT_FOUND("500018",
                "Resource not found.",
                "Unable to find a resource matching the provided external claim identifier %s in dialect " +
                        "identifier %s."),
        ERROR_CODE_LOCAL_CLAIM_NOT_FOUND("500019",
                "Resource not found.",
                "Unable to find a resource matching the provided local claim identifier %s."),
        ERROR_CODE_EXTERNAL_CLAIM_CONFLICT("500020",
                "Unable to update external claim.",
                "Existing external claim uri %s in dialect identifier %s cannot be changed."),
        ERROR_CODE_LOCAL_CLAIM_CONFLICT("500021",
                "Unable to update local claim.",
                "Existing local claim uri %s cannot be changed."),
        ERROR_CODE_PAGINATION_NOT_IMPLEMENTED("500022",
                "Pagination not supported.",
                "Pagination capabilities are not supported in this version of the API."),
        ERROR_CODE_FILTERING_NOT_IMPLEMENTED("500023",
                "Filtering not supported.",
                "Filtering capability is not supported in this version of the API."),
        ERROR_CODE_SORTING_NOT_IMPLEMENTED("500024",
                "Sorting not supported.",
                "Sorting capability is not supported in this version of the API."),
        ERROR_CODE_ATTRIBUTE_FILTERING_NOT_IMPLEMENTED("500025",
                "Attribute filtering not supported.",
                "Attribute filtering capability is not supported in this version of the API."),
        ERROR_CODE_INVALID_USERSTORE("500026",
                "Invalid attribute mapping.",
                "Invalid userstore %s provided in attribute mapping."),
        ERROR_CODE_INVALID_DIALECT_ID("500027",
                "Invalid dialect id.",
                "Used dialect id %s does not exist."),
        ERROR_CODE_EMPTY_CLAIM_DIALECT("500028",
                "Empty claim dialect URI.",
                "Claim dialect URI cannot be empty."),
        ERROR_CODE_EMPTY_LOCAL_CLAIM_URI("500029",
                "Empty local claim URI.",
                "Local claim URI cannot be empty."),
        ERROR_CODE_EMPTY_MAPPED_ATTRIBUTES_IN_LOCAL_CLAIM("500030",
                "Empty mapped attributes.",
                "Mapped attributes cannot be empty."),
        ERROR_CODE_LOCAL_CLAIM_HAS_MAPPED_EXTERNAL_CLAIM("500031",
                "Unable to remove local claim.",
                "Unable to remove local claim while having associations with external claims."),
        ERROR_CODE_EMPTY_EXTERNAL_CLAIM_URI("500032",
                "Empty external claim URI.",
                "External claim URI cannot be empty."),
        ERROR_CODE_INVALID_EXTERNAL_CLAIM_DIALECT("500033",
                "Invalid external claim dialect.",
                "The provided claim dialect is the local claim dialect and cannot be used as an external dialect."),
        ERROR_CODE_EMPTY_EXTERNAL_DIALECT_URI("500034",
                "Empty external claim dialect URI.",
                "External dialect URI cannot be empty."),
        ERROR_CODE_MAPPED_TO_EMPTY_LOCAL_CLAIM_URI("500035",
                "Empty mapped local claim URI.",
                "Mapped local claim URI cannot be empty."),
        ERROR_CODE_INVALID_INPUT("500036",
                "Invalid input.",
                "One of the given inputs is invalid.")
        ;

        private final String code;
        private final String message;
        private final String description;

        private static final Map<String, ErrorMessage> messageIndex = new HashMap<>(ErrorMessage.values().length);
        static final String BUNDLE = "ServerClientErrorMappings";
        static ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE);

        static {
            for (ErrorMessage em : ErrorMessage.values()) {
                messageIndex.put(em.code, em);
            }
        }

        ErrorMessage(String code, String message, String description) {
            this.code = code;
            this.message = message;
            this.description = description;
        }

        public String getCode() {
            return CLAIM_MANAGEMENT_PREFIX + code;
        }

        public String getMessage() {
            return message;
        }

        public String getDescription() {
            return description;
        }

        /**
         * Get the proper error message mapped to the server side error.
         *
         * @param serverCode Error code from the server.
         * @return Error message.
         */
        public static ErrorMessage getMappedErrorMessage(String serverCode) {

            try {
                String errorCode = resourceBundle.getString(serverCode);
                return messageIndex.get(errorCode);
            } catch (Throwable e) {
                // Ignore if error mapping has invalid input.
            }
            return ErrorMessage.ERROR_CODE_INVALID_INPUT;
        }

        @Override
        public String toString() {
            return code + " | " + message;
        }
    }

    // Claim property keys.
    public static final String PROP_DESCRIPTION = "Description";
    public static final String PROP_DISPLAY_NAME = "DisplayName";
    public static final String PROP_DISPLAY_ORDER = "DisplayOrder";
    public static final String PROP_READ_ONLY = "ReadOnly";
    public static final String PROP_REG_EX = "RegEx";
    public static final String PROP_REQUIRED = "Required";
    public static final String PROP_SUPPORTED_BY_DEFAULT = "SupportedByDefault";
}
