import json
import requests

import lemoncheesecake.api as lcc
from lemoncheesecake.matching import *

SUITE = {
    "description": "Github tests"
}

URL_data = "https://data.grampower.com/gp_mobile_ems/wifi_consumer_app/commercial/"
URL_staging = "http://staging.grampower.com:64003/wifi_consumer_app/commercial/"

# https://data.grampower.com:64003/wifi_consumer_app/commercial/
# API_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6Ijk3OTk0MDM2NjYiLCJvcmlnX2lhdCI6MTU1MjcxMzUyMiwidXNlcl9pZCI6NDYxLCJlbWFpbCI6ImhlbWFudEBncmFtcG93ZXIuY29tIiwiZXhwIjoxNTU1MzA1NTIyfQ.rMupPje8ybucN2TVjxtm8RV3l1ohyRK05s5mB__wDD0"
# Type = "application/json"

@lcc.test("Test Login")
def organization():
    lcc.set_step("post login request")
    # lcc.log_info("GET %s" % URL)
    # lcc.log_info("POST %s" % URL)
    # resp = requests.get(URL)
    # resp = request.post(URL)

    headers = {"Authorization":"GP eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6Ijk3OTk0MDM2NjYiLCJvcmlnX2lhdCI6MTU1MjcxMzUyMiwidXNlcl9pZCI6NDYxLCJlbWFpbCI6ImhlbWFudEBncmFtcG93ZXIuY29tIiwiZXhwIjoxNTU1MzA1NTIyfQ.rMupPje8ybucN2TVjxtm8RV3l1ohyRK05s5mB__wDD0",
                "Content-Type":"application/json"}

    # data1 = {"Username":"9799403666",
    #         "Password":"grampower123"}


    data1 = {"SerialNo":"@#$$!!??**12486",
            "ConsumerCategory":"Utility",
            "MeterMode":"prepaid",
            "IsDualSource":1}

    # resp = requests.post(url = URL_staging + "login" ,json=data1 )  
    resp = requests.post(url = URL_staging + "dashboard_data" ,json=data1, headers = headers ) 

    print '\n'
    print "locally_check_parameters:" ,data1, '\n' 
    # y = data1["SerialNo"]
    # print (y)

    require_that("HTTP code", resp.status_code, is_(200))
    data = resp.json()

    x = data["MeterIP"]
    print (x)
    # print "this is data value:" , data, '\n'


    local_check = resp.text
    print  "locally_check_the_respone:" ,local_check, '\n'


    lcc.log_info("Response\n%s" % json.dumps(data, indent=4))

    lcc.set_step("Check API response")
    check_that_in(
        data,
        "FirstName", is_("Hemant"),
        # "Password", is_string(),
        # "type", is_("Organization"),
        # "id", is_integer(),
        # "description", is_not_none(),
        # "login", is_(present()),
        # "created_at", match_pattern("^\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2}Z$"),
        # "has_organization_projects", is_true(),
        # "followers", is_(greater_than_or_equal_to(0)),
        # "following", is_(greater_than_or_equal_to(0)),
        # "repos_url", ends_with("/repos"),
        # "issues_url", ends_with("/issues"),
        # "events_url", ends_with("/events"),
        # "hooks_url", ends_with("/hooks"),
        # "members_url", ends_with("/members{/member}"),
        # "public_members_url", ends_with("/public_members{/member}")
    )