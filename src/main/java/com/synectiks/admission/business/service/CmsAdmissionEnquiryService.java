package com.synectiks.admission.business.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class CmsAdmissionEnquiryService {
//    @Autowired
//    private AdmissionEnquiryRepository admissionEnquiryRepository;
//
//    public Long getTotalAdmissions(Long branchId) {
//        Long a = getTotalFollowup(branchId);
//        Long b = getTotalDeclined(branchId);
//        Long c = getTotalConverted(branchId);
//        return a + b + c;
//    }
//
//    public Long getTotalFollowup(Long branchId) {
//        AdmissionEnquiry admissionEnquiry = new AdmissionEnquiry();
//
//        if (branchId != null) {
//            Branch branch = new Branch();
//            branch.setId(branchId);
//            admissionEnquiry.setBranch(branch);
//        }
//
//        admissionEnquiry.setStatus(EnquiryStatus.FOLLOWUP);
//        Example<AdmissionEnquiry> example = Example.of(admissionEnquiry);
//        Long cnt = this.admissionEnquiryRepository.count(example);
//        return cnt;
//    }
//
//    public Long getTotalDeclined(Long branchId) {
//        AdmissionEnquiry admissionEnquiry = new AdmissionEnquiry();
//
//        if (branchId != null) {
//            Branch branch = new Branch();
//            branch.setId(branchId);
//            admissionEnquiry.setBranch(branch);
//        }
//
//
//
//        admissionEnquiry.setStatus(EnquiryStatus.DECLINED);
//        Example<AdmissionEnquiry> example = Example.of(admissionEnquiry);
//        Long cnt = this.admissionEnquiryRepository.count(example);
//        return cnt;
//    }
//
//    public Long getTotalConverted(Long branchId) {
//        AdmissionEnquiry admissionEnquiry = new AdmissionEnquiry();
//
//        if (branchId != null) {
//            Branch branch = new Branch();
//            branch.setId(branchId);
//            admissionEnquiry.setBranch(branch);
//        }
//
//        admissionEnquiry.setStatus(EnquiryStatus.CONVERTED);
//        Example<AdmissionEnquiry> example = Example.of(admissionEnquiry);
//        Long cnt = this.admissionEnquiryRepository.count(example);
//        return cnt;
//    }
//
//    public List<CmsAdmissionEnquiryVo> searchAdmissionOnType(String admissionEnquiryType,Long branchId) throws Exception {
//        AdmissionEnquiry admissionEnquiry = new AdmissionEnquiry();
//        Branch branch = new Branch();
//        branch.setId(branchId);
//        admissionEnquiry.setBranch(branch);
//
//        if(!admissionEnquiryType.equalsIgnoreCase("RECEIVED")) {
//            if(admissionEnquiryType.equalsIgnoreCase("FOLLOWUP")) {
//                admissionEnquiry.setStatus(EnquiryStatus.FOLLOWUP);
//            }else if(admissionEnquiryType.equalsIgnoreCase("DECLINED")) {
//                admissionEnquiry.setStatus(EnquiryStatus.DECLINED);
//            }else if(admissionEnquiryType.equalsIgnoreCase("CONVERTED")) {
//                admissionEnquiry.setStatus(EnquiryStatus.CONVERTED);
//            }
//        }
//
//        Example<AdmissionEnquiry> example = Example.of(admissionEnquiry);
//        List<AdmissionEnquiry> list = this.admissionEnquiryRepository.findAll(example);
//        List<CmsAdmissionEnquiryVo> ls = new ArrayList<>();
//        for(AdmissionEnquiry temp: list) {
//            CmsAdmissionEnquiryVo cae = CommonUtil.createCopyProperties(temp, CmsAdmissionEnquiryVo.class);
//            cae.setStrEnquiryDate(DateFormatUtil.changeDateFormat(CmsConstants.DATE_FORMAT_dd_MM_yyyy, CmsConstants.DATE_FORMAT_yyyy_MM_dd, DateFormatUtil.changeDateFormat(CmsConstants.DATE_FORMAT_yyyy_MM_dd, DateFormatUtil.converUtilDateFromLocaDate(temp.getEnquiryDate()))));
//
//            ls.add(cae);
//        }
//        return ls;
//    }
//
//    public List<CmsAdmissionEnquiryVo> admissionEnquiryList(Long branchId) throws Exception {
//        AdmissionEnquiry admissionEnquiry = new AdmissionEnquiry();
//        Branch branch = new Branch();
//        branch.setId(branchId);
//        admissionEnquiry.setBranch(branch);
//
//        Example<AdmissionEnquiry> example = Example.of(admissionEnquiry);
//        List<AdmissionEnquiry> list = this.admissionEnquiryRepository.findAll(example);
//        List<CmsAdmissionEnquiryVo> ls = new ArrayList<>();
//        for(AdmissionEnquiry temp: list) {
//            CmsAdmissionEnquiryVo cae = CommonUtil.createCopyProperties(temp, CmsAdmissionEnquiryVo.class);
//            cae.setStrEnquiryDate(DateFormatUtil.changeDateFormat(CmsConstants.DATE_FORMAT_dd_MM_yyyy, CmsConstants.DATE_FORMAT_yyyy_MM_dd, DateFormatUtil.changeDateFormat(CmsConstants.DATE_FORMAT_yyyy_MM_dd, DateFormatUtil.converUtilDateFromLocaDate(temp.getEnquiryDate()))));
//            ls.add(cae);
//        }
//        return ls;
//    }
//

}


