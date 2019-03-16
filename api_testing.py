import json
import requests

import lemoncheesecake.api as lcc
from lemoncheesecake.matching import *

SUITE = {
    "description": "Github tests"
}

URL_data = "https://data.grampower.com/gp_mobile_ems/wifi_consumer_app/commercial/"
URL_staging = "http://staging.grampower.com:64003/wifi_consumer_app/commercial/"

TOKEN = ""


@lcc.test("Test API Testing")
def organization():
    lcc.set_step("post test api request")
    
    # headers = {"Authorization":"GP eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6Ijk3OTk0MDM2NjYiLCJvcmlnX2lhdCI6MTU1MjcxMzUyMiwidXNlcl9pZCI6NDYxLCJlbWFpbCI6ImhlbWFudEBncmFtcG93ZXIuY29tIiwiZXhwIjoxNTU1MzA1NTIyfQ.rMupPje8ybucN2TVjxtm8RV3l1ohyRK05s5mB__wDD0",
    #             "Content-Type":"application/json"}

    data1 = {"Username":"9799403666",
            "Password":"grampower123"}

    resp = requests.post(url = URL_staging + "login" ,json=data1 )  
    # resp = requests.post(url = URL_staging + "dashboard_data" ,json=data1, headers = headers ) 

    print '\n'
    print "locally_check_parameters:" ,data1, '\n' 
    # y = data1["SerialNo"]
    # print (y)

    require_that("HTTP code", resp.status_code, is_(200))
    data = resp.json()

    TOKEN = str(data["Token"])
    print type(TOKEN)
    print (TOKEN)
    # print "this is data value:" , data, '\n'


    local_check = resp.text
    print  "locally_check_the_respone:" ,local_check, '\n'


    lcc.log_info("Response\n%s" % json.dumps(data, indent=4))

    lcc.set_step("Check API response")
    check_that_in(
        data,
        "FirstName", is_("Hemant"),
        

     organization1(TOKEN)


    )


# print TOKEN()

def organization1(x):

    lcc.set_step("post logout request")
    
    headers = {"Authorization":"GP " + x,
                "Content-Type":"application/json"}

    print headers["Authorization"]

    # data1 = {"Username":"9799403666",
    #         "Password":"grampower123"}


    data2 = {"SerialNo":"@#$$!!??**12486",
            "ConsumerCategory":"Utility",
            "MeterMode":"prepaid",
            "IsDualSource":1}

    # resp1 = requests.post(url = URL_staging + "login" ,json=data1 )  
    resp1 = requests.post(url = URL_staging + "dashboard_data" ,json=data2, headers = headers ) 

    print '\n'
    print "locally_check_parameters1:" ,data2, '\n' 
    # y = data1["SerialNo"]
    # print (y)

    require_that("HTTP code", resp1.status_code, is_(200))
    data3 = resp1.json()

    xy = data3["RemainingCredit"]
    print (xy)

    yz = data3["TotalAllottedBudgetInRupees"]
    print (yz)



    if xy < yz:
        print "I am hero"
    else:
        ab = data3["MeterIP"]
        print (ab)



    # x = data["Token"]
    # print (x)
    # print "this is data value:" , data, '\n'


    local_check1 = resp1.text
    print  "locally_check_the_respone1:" ,local_check1, '\n'


    lcc.log_info("Response\n%s" % json.dumps(data3, indent=4))

    lcc.set_step("Check API response")
    check_that_in(
        data3,
        "FirstName", is_("Hemant"),


)


