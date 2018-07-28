/**
 *
 * Copyright (C) 2002-2012 "SYSNET International, Inc."
 * support@sysnetint.com [http://www.sysnetint.com]
 *
 * This file is part of OpenEMPI.
 *
 * OpenEMPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.hl7.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.hl7.v3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateFault201310Request_QNAME = new QName("urn:hl7-org:v3", "CreateFault201310Request");
    private final static QName _Create201310Request_QNAME = new QName("urn:hl7-org:v3", "Create201310Request");
    private final static QName _PIXConsumerPRPAIN201310UVRequest_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_PRPA_IN201310UVRequest");
    private final static QName _PIXConsumerPRPAIN201309UVSecuredRequest_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_PRPA_IN201309UVSecuredRequest");
    private final static QName _PIXConsumerPRPAIN201309UVRequest_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_PRPA_IN201309UVRequest");
    private final static QName _PIXConsumerMCCIIN000002UV01Request_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_MCCI_IN000002UV01Request");
    private final static QName _PIXConsumerPRPAIN201301UVSecuredRequest_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_PRPA_IN201301UVSecuredRequest");
    private final static QName _RespondingGatewayPRPAIN201305UV02Request_QNAME = new QName("urn:hl7-org:v3", "RespondingGateway_PRPA_IN201305UV02Request");
    private final static QName _PIXConsumerPRPAIN201304UVRequest_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_PRPA_IN201304UVRequest");
    private final static QName _Create201302Request_QNAME = new QName("urn:hl7-org:v3", "Create201302Request");
    private final static QName _PIXConsumerPRPAIN201302UVSecuredRequest_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_PRPA_IN201302UVSecuredRequest");
    private final static QName _PIXConsumerPRPAIN201302UVRequest_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_PRPA_IN201302UVRequest");
    private final static QName _Create201305Request_QNAME = new QName("urn:hl7-org:v3", "Create201305Request");
    private final static QName _PIXConsumerPRPAIN201309UVResponse_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_PRPA_IN201309UVResponse");
    private final static QName _RespondingGatewayPRPAIN201305UV02SecuredRequest_QNAME = new QName("urn:hl7-org:v3", "RespondingGateway_PRPA_IN201305UV02SecuredRequest");
    private final static QName _RespondingGatewayPRPAIN201306UV02Response_QNAME = new QName("urn:hl7-org:v3", "RespondingGateway_PRPA_IN201306UV02Response");
    private final static QName _ClinicalDocument_QNAME = new QName("urn:hl7-org:v3", "ClinicalDocument");
    private final static QName _CreateAckMsgRequest_QNAME = new QName("urn:hl7-org:v3", "CreateAckMsgRequest");
    private final static QName _PIXConsumerPRPAIN201301UVRequest_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_PRPA_IN201301UVRequest");
    private final static QName _PIXConsumerPRPAIN201310UVSecuredRequest_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_PRPA_IN201310UVSecuredRequest");
    private final static QName _PIXConsumerPRPAIN201304UVSecuredRequest_QNAME = new QName("urn:hl7-org:v3", "PIXConsumer_PRPA_IN201304UVSecuredRequest");
    private final static QName _COCTMT080000UVNonPersonLivingSubjectAsContent_QNAME = new QName("urn:hl7-org:v3", "asContent");
    private final static QName _COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME = new QName("urn:hl7-org:v3", "representedOrganization");
    private final static QName _COCTMT090102UV02AssignedPersonAssignedPerson_QNAME = new QName("urn:hl7-org:v3", "assignedPerson");
    private final static QName _COCTMT230100UVRelatedManufacturerRepresentedManufacturer_QNAME = new QName("urn:hl7-org:v3", "representedManufacturer");
    private final static QName _COCTMT090100UV01PersonAsLocatedEntity_QNAME = new QName("urn:hl7-org:v3", "asLocatedEntity");
    private final static QName _COCTMT230100UVSubContentContainedPackagedMedicine_QNAME = new QName("urn:hl7-org:v3", "containedPackagedMedicine");
    private final static QName _PRPAMT201301UV02PatientPatientNonPersonLivingSubject_QNAME = new QName("urn:hl7-org:v3", "patientNonPersonLivingSubject");
    private final static QName _PRPAMT201301UV02PatientPatientPerson_QNAME = new QName("urn:hl7-org:v3", "patientPerson");
    private final static QName _COCTMT090000UV01RoleOtherScopingOrganization_QNAME = new QName("urn:hl7-org:v3", "scopingOrganization");
    private final static QName _IVLINTHigh_QNAME = new QName("urn:hl7-org:v3", "high");
    private final static QName _IVLINTLow_QNAME = new QName("urn:hl7-org:v3", "low");
    private final static QName _IVLINTCenter_QNAME = new QName("urn:hl7-org:v3", "center");
    private final static QName _IVLINTWidth_QNAME = new QName("urn:hl7-org:v3", "width");
    private final static QName _PRPAMT201301UV02BirthPlaceSubjectOf_QNAME = new QName("urn:hl7-org:v3", "subjectOf");
    private final static QName _PRPAMT201301UV02BirthPlaceBirthplace_QNAME = new QName("urn:hl7-org:v3", "birthplace");
    private final static QName _COCTMT530000UVHealthCareFacilityServiceProviderOrganization_QNAME = new QName("urn:hl7-org:v3", "serviceProviderOrganization");
    private final static QName _COCTMT530000UVHealthCareFacilityLocation_QNAME = new QName("urn:hl7-org:v3", "location");
    private final static QName _PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME = new QName("urn:hl7-org:v3", "author");
    private final static QName _COCTMT030000UV04EmploymentEmployerOrganization_QNAME = new QName("urn:hl7-org:v3", "employerOrganization");
    private final static QName _COCTMT090300UV01LicensedEntityIssuingOrganization_QNAME = new QName("urn:hl7-org:v3", "issuingOrganization");
    private final static QName _COCTMT500000UV04CarrierRoleUnderwritingCarrierOrganization_QNAME = new QName("urn:hl7-org:v3", "underwritingCarrierOrganization");
    private final static QName _COCTMT490000UV04HealthCareProviderHealthCareProviderPerson_QNAME = new QName("urn:hl7-org:v3", "healthCareProviderPerson");
    private final static QName _COCTMT230100UVIngredientIngredient_QNAME = new QName("urn:hl7-org:v3", "ingredient");
    private final static QName _COCTMT670000UV04GuarantorRoleGuarantorPerson_QNAME = new QName("urn:hl7-org:v3", "guarantorPerson");
    private final static QName _COCTMT670000UV04GuarantorRoleGuarantorOrganization_QNAME = new QName("urn:hl7-org:v3", "guarantorOrganization");
    private final static QName _COCTMT500000UV04PolicyOrAccountLimitation_QNAME = new QName("urn:hl7-org:v3", "limitation");
    private final static QName _COCTMT500000UV04PolicyOrAccountHolder_QNAME = new QName("urn:hl7-org:v3", "holder");
    private final static QName _PRPAMT201301UV02ContactPartyContactPerson_QNAME = new QName("urn:hl7-org:v3", "contactPerson");
    private final static QName _PRPAMT201301UV02ContactPartyContactOrganization_QNAME = new QName("urn:hl7-org:v3", "contactOrganization");
    private final static QName _ENSuffix_QNAME = new QName("urn:hl7-org:v3", "suffix");
    private final static QName _ENDelimiter_QNAME = new QName("urn:hl7-org:v3", "delimiter");
    private final static QName _ENValidTime_QNAME = new QName("urn:hl7-org:v3", "validTime");
    private final static QName _ENPrefix_QNAME = new QName("urn:hl7-org:v3", "prefix");
    private final static QName _ENFamily_QNAME = new QName("urn:hl7-org:v3", "family");
    private final static QName _ENGiven_QNAME = new QName("urn:hl7-org:v3", "given");
    private final static QName _ADExplicitDeliveryModeIdentifier_QNAME = new QName("urn:hl7-org:v3", "deliveryModeIdentifier");
    private final static QName _ADExplicitHouseNumber_QNAME = new QName("urn:hl7-org:v3", "houseNumber");
    private final static QName _ADExplicitState_QNAME = new QName("urn:hl7-org:v3", "state");
    private final static QName _ADExplicitCity_QNAME = new QName("urn:hl7-org:v3", "city");
    private final static QName _ADExplicitAdditionalLocator_QNAME = new QName("urn:hl7-org:v3", "additionalLocator");
    private final static QName _ADExplicitStreetAddressLine_QNAME = new QName("urn:hl7-org:v3", "streetAddressLine");
    private final static QName _ADExplicitDeliveryInstallationArea_QNAME = new QName("urn:hl7-org:v3", "deliveryInstallationArea");
    private final static QName _ADExplicitDeliveryInstallationQualifier_QNAME = new QName("urn:hl7-org:v3", "deliveryInstallationQualifier");
    private final static QName _ADExplicitStreetNameType_QNAME = new QName("urn:hl7-org:v3", "streetNameType");
    private final static QName _ADExplicitDirection_QNAME = new QName("urn:hl7-org:v3", "direction");
    private final static QName _ADExplicitCensusTract_QNAME = new QName("urn:hl7-org:v3", "censusTract");
    private final static QName _ADExplicitUnitID_QNAME = new QName("urn:hl7-org:v3", "unitID");
    private final static QName _ADExplicitPostalCode_QNAME = new QName("urn:hl7-org:v3", "postalCode");
    private final static QName _ADExplicitStreetName_QNAME = new QName("urn:hl7-org:v3", "streetName");
    private final static QName _ADExplicitDeliveryInstallationType_QNAME = new QName("urn:hl7-org:v3", "deliveryInstallationType");
    private final static QName _ADExplicitStreetNameBase_QNAME = new QName("urn:hl7-org:v3", "streetNameBase");
    private final static QName _ADExplicitDeliveryMode_QNAME = new QName("urn:hl7-org:v3", "deliveryMode");
    private final static QName _ADExplicitCountry_QNAME = new QName("urn:hl7-org:v3", "country");
    private final static QName _ADExplicitPostBox_QNAME = new QName("urn:hl7-org:v3", "postBox");
    private final static QName _ADExplicitDeliveryAddressLine_QNAME = new QName("urn:hl7-org:v3", "deliveryAddressLine");
    private final static QName _ADExplicitUseablePeriod_QNAME = new QName("urn:hl7-org:v3", "useablePeriod");
    private final static QName _ADExplicitCareOf_QNAME = new QName("urn:hl7-org:v3", "careOf");
    private final static QName _ADExplicitUnitType_QNAME = new QName("urn:hl7-org:v3", "unitType");
    private final static QName _ADExplicitPrecinct_QNAME = new QName("urn:hl7-org:v3", "precinct");
    private final static QName _ADExplicitBuildingNumberSuffix_QNAME = new QName("urn:hl7-org:v3", "buildingNumberSuffix");
    private final static QName _ADExplicitHouseNumberNumeric_QNAME = new QName("urn:hl7-org:v3", "houseNumberNumeric");
    private final static QName _ADExplicitCounty_QNAME = new QName("urn:hl7-org:v3", "county");
    private final static QName _COCTMT510000UV06PolicyHolderUnderwritingOrganization_QNAME = new QName("urn:hl7-org:v3", "underwritingOrganization");
    private final static QName _COCTMT510000UV06PolicyHolderPolicyHolderPerson_QNAME = new QName("urn:hl7-org:v3", "policyHolderPerson");
    private final static QName _COCTMT510000UV06PolicyHolderPolicyHolderOrganization_QNAME = new QName("urn:hl7-org:v3", "policyHolderOrganization");
    private final static QName _PRPAMT201303UV02PersonBirthPlace_QNAME = new QName("urn:hl7-org:v3", "birthPlace");
    private final static QName _COCTMT530000UVSourceOf2Encounter_QNAME = new QName("urn:hl7-org:v3", "encounter");
    private final static QName _COCTMT530000UVSourceOf2Supply_QNAME = new QName("urn:hl7-org:v3", "supply");
    private final static QName _COCTMT530000UVSourceOf2Procedure_QNAME = new QName("urn:hl7-org:v3", "procedure");
    private final static QName _COCTMT530000UVSourceOf2Act_QNAME = new QName("urn:hl7-org:v3", "act");
    private final static QName _COCTMT530000UVSourceOf2Observation_QNAME = new QName("urn:hl7-org:v3", "observation");
    private final static QName _COCTMT530000UVSourceOf2SubstanceAdministration_QNAME = new QName("urn:hl7-org:v3", "substanceAdministration");
    private final static QName _COCTMT530000UVSourceOf2Organizer_QNAME = new QName("urn:hl7-org:v3", "organizer");
    private final static QName _PRPAMT201302UV02StudentSchoolOrganization_QNAME = new QName("urn:hl7-org:v3", "schoolOrganization");
    private final static QName _STExplicitReference_QNAME = new QName("urn:hl7-org:v3", "reference");
    private final static QName _STExplicitThumbnail_QNAME = new QName("urn:hl7-org:v3", "thumbnail");
    private final static QName _COCTMT530000UVObservationDataEnterer_QNAME = new QName("urn:hl7-org:v3", "dataEnterer");
    private final static QName _COCTMT530000UVObservationRecordTarget_QNAME = new QName("urn:hl7-org:v3", "recordTarget");
    private final static QName _COCTMT530000UVObservationDefinition_QNAME = new QName("urn:hl7-org:v3", "definition");
    private final static QName _COCTMT510000UV06PreconditionActReference_QNAME = new QName("urn:hl7-org:v3", "actReference");
    private final static QName _COCTMT080000UVContainerAsIdentifiedContainer_QNAME = new QName("urn:hl7-org:v3", "asIdentifiedContainer");
    private final static QName _COCTMT530000UVSubject2Patient_QNAME = new QName("urn:hl7-org:v3", "patient");
    private final static QName _COCTMT530000UVSubject2Specimen_QNAME = new QName("urn:hl7-org:v3", "specimen");
    private final static QName _COCTMT530000UVSubject2RelatedEntity_QNAME = new QName("urn:hl7-org:v3", "relatedEntity");
    private final static QName _StrucDocThRenderMultiMedia_QNAME = new QName("urn:hl7-org:v3", "renderMultiMedia");
    private final static QName _StrucDocThLinkHtml_QNAME = new QName("urn:hl7-org:v3", "linkHtml");
    private final static QName _StrucDocThBr_QNAME = new QName("urn:hl7-org:v3", "br");
    private final static QName _StrucDocThSup_QNAME = new QName("urn:hl7-org:v3", "sup");
    private final static QName _StrucDocThSub_QNAME = new QName("urn:hl7-org:v3", "sub");
    private final static QName _StrucDocThContent_QNAME = new QName("urn:hl7-org:v3", "content");
    private final static QName _StrucDocThFootnoteRef_QNAME = new QName("urn:hl7-org:v3", "footnoteRef");
    private final static QName _StrucDocThFootnote_QNAME = new QName("urn:hl7-org:v3", "footnote");
    private final static QName _COCTMT510000UV06Beneficiary2Beneficiary_QNAME = new QName("urn:hl7-org:v3", "beneficiary");
    private final static QName _StrucDocItemTable_QNAME = new QName("urn:hl7-org:v3", "table");
    private final static QName _StrucDocItemCaption_QNAME = new QName("urn:hl7-org:v3", "caption");
    private final static QName _StrucDocItemList_QNAME = new QName("urn:hl7-org:v3", "list");
    private final static QName _StrucDocItemParagraph_QNAME = new QName("urn:hl7-org:v3", "paragraph");
    private final static QName _MFMIMT700711UV01AuthorOrPerformerAssignedDevice_QNAME = new QName("urn:hl7-org:v3", "assignedDevice");
    private final static QName _COCTMT030000UV04PersonAsCoveredParty_QNAME = new QName("urn:hl7-org:v3", "asCoveredParty");
    private final static QName _PRPAMT201302UV02PersonalRelationshipRelationshipHolder2_QNAME = new QName("urn:hl7-org:v3", "relationshipHolder2");
    private final static QName _PRPAMT201302UV02PersonalRelationshipRelationshipHolder1_QNAME = new QName("urn:hl7-org:v3", "relationshipHolder1");
    private final static QName _COCTMT150000UV02OrganizationContainsPartOrganization_QNAME = new QName("urn:hl7-org:v3", "partOrganization");
    private final static QName _COCTMT230100UVMedicationSubjectOf5_QNAME = new QName("urn:hl7-org:v3", "subjectOf5");
    private final static QName _COCTMT300000UV04SubstanceAdministrationOrderPertinentInformation_QNAME = new QName("urn:hl7-org:v3", "pertinentInformation");
    private final static QName _COCTMT300000UV04SubstanceAdministrationOrderReason_QNAME = new QName("urn:hl7-org:v3", "reason");
    private final static QName _COCTMT290000UV06InjuryLocationLocatedInjuryPlace_QNAME = new QName("urn:hl7-org:v3", "locatedInjuryPlace");
    private final static QName _PRPAMT201303UV02GuardianGuardianOrganization_QNAME = new QName("urn:hl7-org:v3", "guardianOrganization");
    private final static QName _PRPAMT201303UV02GuardianGuardianPerson_QNAME = new QName("urn:hl7-org:v3", "guardianPerson");
    private final static QName _COCTMT530000UVConsumableAdministerableMaterial_QNAME = new QName("urn:hl7-org:v3", "administerableMaterial");
    private final static QName _COCTMT530000UVConsumableMedication_QNAME = new QName("urn:hl7-org:v3", "medication");
    private final static QName _COCTMT490000UV04BillableClinicalProductOrigin_QNAME = new QName("urn:hl7-org:v3", "origin");
    private final static QName _COCTMT490000UV04BillableClinicalProductConsultant_QNAME = new QName("urn:hl7-org:v3", "consultant");
    private final static QName _COCTMT490000UV04BillableClinicalProductDestination_QNAME = new QName("urn:hl7-org:v3", "destination");
    private final static QName _COCTMT490000UV04BillableClinicalProductReferrer_QNAME = new QName("urn:hl7-org:v3", "referrer");
    private final static QName _COCTMT230100UVTerritorialAuthorityGoverningCountry_QNAME = new QName("urn:hl7-org:v3", "governingCountry");
    private final static QName _COCTMT230100UVTerritorialAuthorityTerritory_QNAME = new QName("urn:hl7-org:v3", "territory");
    private final static QName _COCTMT510000UV06UnderwriterScoperOrganization_QNAME = new QName("urn:hl7-org:v3", "scoperOrganization");
    private final static QName _COCTMT080000UVSpecimenAlternateIdentifierAssigningOrganization_QNAME = new QName("urn:hl7-org:v3", "assigningOrganization");
    private final static QName _MCCIMT000200UV01OrganizationNotificationParty_QNAME = new QName("urn:hl7-org:v3", "notificationParty");
    private final static QName _COCTMT290000UV06BillableClinicalServiceResponsibleParty_QNAME = new QName("urn:hl7-org:v3", "responsibleParty");
    private final static QName _COCTMT290000UV06BillableClinicalServicePerformer_QNAME = new QName("urn:hl7-org:v3", "performer");
    private final static QName _COCTMT290000UV06BillableClinicalServiceSubjectOf2_QNAME = new QName("urn:hl7-org:v3", "subjectOf2");
    private final static QName _COCTMT290000UV06BillableClinicalServiceReusableDevice_QNAME = new QName("urn:hl7-org:v3", "reusableDevice");
    private final static QName _COCTMT290000UV06BillableClinicalServiceComponent_QNAME = new QName("urn:hl7-org:v3", "component");
    private final static QName _COCTMT530000UVPerformerAssignedEntity_QNAME = new QName("urn:hl7-org:v3", "assignedEntity");
    private final static QName _PRPAIN201305UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME = new QName("urn:hl7-org:v3", "queryByParameter");
    private final static QName _MFMIMT700701UV01PriorRegistrationSubject1_QNAME = new QName("urn:hl7-org:v3", "subject1");
    private final static QName _MFMIMT700701UV01PriorRegistrationSubject2_QNAME = new QName("urn:hl7-org:v3", "subject2");
    private final static QName _COCTMT080000UVSpecimenSourcePerson_QNAME = new QName("urn:hl7-org:v3", "sourcePerson");
    private final static QName _COCTMT080000UVSpecimenSourceManufactured_QNAME = new QName("urn:hl7-org:v3", "sourceManufactured");
    private final static QName _COCTMT080000UVSpecimenSourceNatural_QNAME = new QName("urn:hl7-org:v3", "sourceNatural");
    private final static QName _COCTMT080000UVSpecimenSourceNonPersonLivingSubject_QNAME = new QName("urn:hl7-org:v3", "sourceNonPersonLivingSubject");
    private final static QName _COCTMT080000UVSpecimenProductOf_QNAME = new QName("urn:hl7-org:v3", "productOf");
    private final static QName _COCTMT510000UV06SponsorSponsorOrganization_QNAME = new QName("urn:hl7-org:v3", "sponsorOrganization");
    private final static QName _COCTMT510000UV06PersonalRelationshipRelationshipHolder_QNAME = new QName("urn:hl7-org:v3", "relationshipHolder");
    private final static QName _COCTMT510000UV06PersonalRelationshipPersonalRelationshipWith_QNAME = new QName("urn:hl7-org:v3", "personalRelationshipWith");
    private final static QName _COCTMT230100UVPackagedMedicineSubContent_QNAME = new QName("urn:hl7-org:v3", "subContent");
    private final static QName _COCTMT230100UVPackagedMedicineAsSuperContent_QNAME = new QName("urn:hl7-org:v3", "asSuperContent");
    private final static QName _COCTMT260003UVSubject2OtherMedication_QNAME = new QName("urn:hl7-org:v3", "otherMedication");
    private final static QName _COCTMT260003UVSubject2OtherSupply_QNAME = new QName("urn:hl7-org:v3", "otherSupply");
    private final static QName _COCTMT510000UV06PolicyOrProgramReplacementOf_QNAME = new QName("urn:hl7-org:v3", "replacementOf");
    private final static QName _COCTMT090000UV01AssignedEntityAssignedOrganization_QNAME = new QName("urn:hl7-org:v3", "assignedOrganization");
    private final static QName _COCTMT960000UV05PositionComponent2_QNAME = new QName("urn:hl7-org:v3", "component2");
    private final static QName _COCTMT510000UV06ResponsiblePartyRepresentedPerson_QNAME = new QName("urn:hl7-org:v3", "representedPerson");
    private final static QName _COCTMT510000UV06ResponsiblePartyAgentPerson_QNAME = new QName("urn:hl7-org:v3", "agentPerson");
    private final static QName _MCCIMT000200UV01DeviceAsAgent_QNAME = new QName("urn:hl7-org:v3", "asAgent");
    private final static QName _COCTMT310000UV04AccomodationSuppliedPertinentInformation1_QNAME = new QName("urn:hl7-org:v3", "pertinentInformation1");
    private final static QName _PRPAMT201310UV02PatientProviderOrganization_QNAME = new QName("urn:hl7-org:v3", "providerOrganization");
    private final static QName _PRPAMT201306UV02QueryByParameterMatchCriterionList_QNAME = new QName("urn:hl7-org:v3", "matchCriterionList");
    private final static QName _COCTMT510000UV06CoveredPartyCoveredOrganization1_QNAME = new QName("urn:hl7-org:v3", "coveredOrganization1");
    private final static QName _COCTMT510000UV06CoveredPartyCoveredPerson_QNAME = new QName("urn:hl7-org:v3", "coveredPerson");
    private final static QName _COCTMT510000UV06CoveredPartyCoveredNonPersonLivingSubject_QNAME = new QName("urn:hl7-org:v3", "coveredNonPersonLivingSubject");
    private final static QName _COCTMT510000UV06CoveredPartyIndirectAuthority2_QNAME = new QName("urn:hl7-org:v3", "indirectAuthority2");
    private final static QName _COCTMT290000UV06AssignedEntityAssignedNonPersonLivingSubject_QNAME = new QName("urn:hl7-org:v3", "assignedNonPersonLivingSubject");
    private final static QName _COCTMT290000UV06AssignedEntityAssignedProviderPerson_QNAME = new QName("urn:hl7-org:v3", "assignedProviderPerson");
    private final static QName _COCTMT040008UVResponsibleAgentOrganization_QNAME = new QName("urn:hl7-org:v3", "agentOrganization");
    private final static QName _COCTMT040008UVResponsibleAgentDevice_QNAME = new QName("urn:hl7-org:v3", "agentDevice");
    private final static QName _COCTMT080000UVSubject4SpecimenObservationEvent_QNAME = new QName("urn:hl7-org:v3", "specimenObservationEvent");
    private final static QName _COCTMT080000UVSubject4AutomationSpecimenObservationEvent_QNAME = new QName("urn:hl7-org:v3", "automationSpecimenObservationEvent");
    private final static QName _COCTMT710007UVPlaceLocatedEntity_QNAME = new QName("urn:hl7-org:v3", "locatedEntity");
    private final static QName _COCTMT510000UV06Limitation2CoverageCharge_QNAME = new QName("urn:hl7-org:v3", "coverageCharge");
    private final static QName _COCTMT510000UV06Limitation2FinancialParticipationCharge_QNAME = new QName("urn:hl7-org:v3", "financialParticipationCharge");
    private final static QName _COCTMT310000UV04AccommodationRequestorRoleAccommodationRequestor_QNAME = new QName("urn:hl7-org:v3", "accommodationRequestor");
    private final static QName _COCTMT530000UVRelatedEntityRelatedAnimal_QNAME = new QName("urn:hl7-org:v3", "relatedAnimal");
    private final static QName _COCTMT530000UVRelatedEntityScopingEntity_QNAME = new QName("urn:hl7-org:v3", "scopingEntity");
    private final static QName _COCTMT530000UVRelatedEntityScopingAnimal_QNAME = new QName("urn:hl7-org:v3", "scopingAnimal");
    private final static QName _COCTMT530000UVRelatedEntityScopingPerson_QNAME = new QName("urn:hl7-org:v3", "scopingPerson");
    private final static QName _COCTMT530000UVRelatedEntityRelatedPerson_QNAME = new QName("urn:hl7-org:v3", "relatedPerson");
    private final static QName _COCTMT600000UV06ManufacturedProductManufacturedVisionProduct_QNAME = new QName("urn:hl7-org:v3", "manufacturedVisionProduct");
    private final static QName _COCTMT230100UVSpecializedKindGeneralizedMedicineClass_QNAME = new QName("urn:hl7-org:v3", "generalizedMedicineClass");
    private final static QName _COCTMT510000UV06PayorInvoicePayorOrganization_QNAME = new QName("urn:hl7-org:v3", "invoicePayorOrganization");
    private final static QName _COCTMT490000UV04ManufacturedProductManufacturerManufacturedProductOrganization_QNAME = new QName("urn:hl7-org:v3", "manufacturerManufacturedProductOrganization");
    private final static QName _COCTMT510000UV06BeneficiaryGroupOrganization_QNAME = new QName("urn:hl7-org:v3", "groupOrganization");
    private final static QName _COCTMT510000UV06BeneficiaryMemberPerson_QNAME = new QName("urn:hl7-org:v3", "memberPerson");
    private final static QName _COCTMT510000UV06BeneficiaryMemberNonPersonLivingSubject_QNAME = new QName("urn:hl7-org:v3", "memberNonPersonLivingSubject");
    private final static QName _COCTMT510000UV06BeneficiaryMemberOrganization1_QNAME = new QName("urn:hl7-org:v3", "memberOrganization1");
    private final static QName _COCTMT740000UV04OralHealthServiceReferencedBy_QNAME = new QName("urn:hl7-org:v3", "referencedBy");
    private final static QName _COCTMT530000UVManufacturedProductManufacturedMaterial_QNAME = new QName("urn:hl7-org:v3", "manufacturedMaterial");
    private final static QName _COCTMT530000UVManufacturedProductManufacturerOrganization_QNAME = new QName("urn:hl7-org:v3", "manufacturerOrganization");
    private final static QName _COCTMT530000UVManufacturedProductManufacturedLabeledDrug_QNAME = new QName("urn:hl7-org:v3", "manufacturedLabeledDrug");
    private final static QName _COCTMT060000UV01RoleTransportPlayingEntity_QNAME = new QName("urn:hl7-org:v3", "playingEntity");
    private final static QName _COCTMT260003UVManufacturedProductManufacturedMaterialKind_QNAME = new QName("urn:hl7-org:v3", "manufacturedMaterialKind");
    private final static QName _COCTMT490000UV04WarrantorWarrantingWarrantorOrganization_QNAME = new QName("urn:hl7-org:v3", "warrantingWarrantorOrganization");
    private final static QName _PRPAMT201306UV02MatchCriterionListMatchAlgorithm_QNAME = new QName("urn:hl7-org:v3", "matchAlgorithm");
    private final static QName _PRPAMT201306UV02MatchCriterionListMinimumDegreeMatch_QNAME = new QName("urn:hl7-org:v3", "minimumDegreeMatch");
    private final static QName _PRPAMT201306UV02MatchCriterionListMatchWeight_QNAME = new QName("urn:hl7-org:v3", "matchWeight");
    private final static QName _COCTMT530000UVSubstanceAdministrationConsumable_QNAME = new QName("urn:hl7-org:v3", "consumable");
    private final static QName _COCTMT490000UV04ContentPackagedProductContained_QNAME = new QName("urn:hl7-org:v3", "contained");
    private final static QName _COCTMT510000UV06DefinitionTransportation_QNAME = new QName("urn:hl7-org:v3", "transportation");
    private final static QName _COCTMT510000UV06DefinitionBillableClinicalProduct1_QNAME = new QName("urn:hl7-org:v3", "billableClinicalProduct1");
    private final static QName _COCTMT510000UV06DefinitionCrossReference1_QNAME = new QName("urn:hl7-org:v3", "crossReference1");
    private final static QName _COCTMT510000UV06DefinitionOralHealthService1_QNAME = new QName("urn:hl7-org:v3", "oralHealthService1");
    private final static QName _COCTMT510000UV06DefinitionBillableClinicalService1_QNAME = new QName("urn:hl7-org:v3", "billableClinicalService1");
    private final static QName _COCTMT510000UV06DefinitionSupplyEvent1_QNAME = new QName("urn:hl7-org:v3", "supplyEvent1");
    private final static QName _COCTMT510000UV06DefinitionSupplyEvent2_QNAME = new QName("urn:hl7-org:v3", "supplyEvent2");
    private final static QName _COCTMT510000UV06DefinitionAccomodationSupplied1_QNAME = new QName("urn:hl7-org:v3", "accomodationSupplied1");
    private final static QName _COCTMT510000UV06DefinitionServiceDefinition_QNAME = new QName("urn:hl7-org:v3", "serviceDefinition");
    private final static QName _COCTMT150000UV02OrganizationPartOfWholeOrganization_QNAME = new QName("urn:hl7-org:v3", "wholeOrganization");
    private final static QName _COCTMT710000UV01LocatedEntityHasPartsLocatedPlace_QNAME = new QName("urn:hl7-org:v3", "locatedPlace");
    private final static QName _COCTMT080000UVProductActRef_QNAME = new QName("urn:hl7-org:v3", "actRef");
    private final static QName _COCTMT080000UVProductProcess_QNAME = new QName("urn:hl7-org:v3", "process");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.hl7.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Nation }
     * 
     */
    public PRPAMT201302UV02Nation createPRPAMT201302UV02Nation() {
        return new PRPAMT201302UV02Nation();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01Person }
     * 
     */
    public COCTMT090100UV01Person createCOCTMT090100UV01Person() {
        return new COCTMT090100UV01Person();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Location }
     * 
     */
    public COCTMT740000UV04Location createCOCTMT740000UV04Location() {
        return new COCTMT740000UV04Location();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Product2 }
     * 
     */
    public COCTMT290000UV06Product2 createCOCTMT290000UV06Product2() {
        return new COCTMT290000UV06Product2();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Patient }
     * 
     */
    public PRPAMT201301UV02Patient createPRPAMT201301UV02Patient() {
        return new PRPAMT201301UV02Patient();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02BirthPlace }
     * 
     */
    public PRPAMT201301UV02BirthPlace createPRPAMT201301UV02BirthPlace() {
        return new PRPAMT201301UV02BirthPlace();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Reason2 }
     * 
     */
    public COCTMT300000UV04Reason2 createCOCTMT300000UV04Reason2() {
        return new COCTMT300000UV04Reason2();
    }

    /**
     * Create an instance of {@link COCTMT150000UV02Organization }
     * 
     */
    public COCTMT150000UV02Organization createCOCTMT150000UV02Organization() {
        return new COCTMT150000UV02Organization();
    }

    /**
     * Create an instance of {@link PPDPQ }
     * 
     */
    public PPDPQ createPPDPQ() {
        return new PPDPQ();
    }

    /**
     * Create an instance of {@link COCTMT080000UVContent4 }
     * 
     */
    public COCTMT080000UVContent4 createCOCTMT080000UVContent4() {
        return new COCTMT080000UVContent4();
    }

    /**
     * Create an instance of {@link PIVLTS }
     * 
     */
    public PIVLTS createPIVLTS() {
        return new PIVLTS();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02BirthPlace }
     * 
     */
    public PRPAMT201302UV02BirthPlace createPRPAMT201302UV02BirthPlace() {
        return new PRPAMT201302UV02BirthPlace();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04HealthCareProvider }
     * 
     */
    public COCTMT490000UV04HealthCareProvider createCOCTMT490000UV04HealthCareProvider() {
        return new COCTMT490000UV04HealthCareProvider();
    }

    /**
     * Create an instance of {@link COCTMT240000UV01ServiceDeliveryLocation }
     * 
     */
    public COCTMT240000UV01ServiceDeliveryLocation createCOCTMT240000UV01ServiceDeliveryLocation() {
        return new COCTMT240000UV01ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01AssignedPerson }
     * 
     */
    public COCTMT090100UV01AssignedPerson createCOCTMT090100UV01AssignedPerson() {
        return new COCTMT090100UV01AssignedPerson();
    }

    /**
     * Create an instance of {@link PPDTS }
     * 
     */
    public PPDTS createPPDTS() {
        return new PPDTS();
    }

    /**
     * Create an instance of {@link COCTMT230100UVManufacturer }
     * 
     */
    public COCTMT230100UVManufacturer createCOCTMT230100UVManufacturer() {
        return new COCTMT230100UVManufacturer();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02ContactParty }
     * 
     */
    public PRPAMT201301UV02ContactParty createPRPAMT201301UV02ContactParty() {
        return new PRPAMT201301UV02ContactParty();
    }

    /**
     * Create an instance of {@link COCTMT530000UVLocation }
     * 
     */
    public COCTMT530000UVLocation createCOCTMT530000UVLocation() {
        return new COCTMT530000UVLocation();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02PatientOfOtherProvider }
     * 
     */
    public PRPAMT201304UV02PatientOfOtherProvider createPRPAMT201304UV02PatientOfOtherProvider() {
        return new PRPAMT201304UV02PatientOfOtherProvider();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Person }
     * 
     */
    public PRPAMT201303UV02Person createPRPAMT201303UV02Person() {
        return new PRPAMT201303UV02Person();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PolicyHolder }
     * 
     */
    public COCTMT510000UV06PolicyHolder createCOCTMT510000UV06PolicyHolder() {
        return new COCTMT510000UV06PolicyHolder();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Device2 }
     * 
     */
    public COCTMT290000UV06Device2 createCOCTMT290000UV06Device2() {
        return new COCTMT290000UV06Device2();
    }

    /**
     * Create an instance of {@link CD }
     * 
     */
    public CD createCD() {
        return new CD();
    }

    /**
     * Create an instance of {@link POCDMT000040Entry }
     * 
     */
    public POCDMT000040Entry createPOCDMT000040Entry() {
        return new POCDMT000040Entry();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject16 }
     * 
     */
    public COCTMT230100UVSubject16 createCOCTMT230100UVSubject16() {
        return new COCTMT230100UVSubject16();
    }

    /**
     * Create an instance of {@link STExplicit }
     * 
     */
    public STExplicit createSTExplicit() {
        return new STExplicit();
    }

    /**
     * Create an instance of {@link COCTMT530000UVMaterial }
     * 
     */
    public COCTMT530000UVMaterial createCOCTMT530000UVMaterial() {
        return new COCTMT530000UVMaterial();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01DataEnterer }
     * 
     */
    public MFMIMT700701UV01DataEnterer createMFMIMT700701UV01DataEnterer() {
        return new MFMIMT700701UV01DataEnterer();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04Student }
     * 
     */
    public COCTMT030000UV04Student createCOCTMT030000UV04Student() {
        return new COCTMT030000UV04Student();
    }

    /**
     * Create an instance of {@link AdxpExplicitHouseNumberNumeric }
     * 
     */
    public AdxpExplicitHouseNumberNumeric createAdxpExplicitHouseNumberNumeric() {
        return new AdxpExplicitHouseNumberNumeric();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04HealthCareProvider }
     * 
     */
    public COCTMT300000UV04HealthCareProvider createCOCTMT300000UV04HealthCareProvider() {
        return new COCTMT300000UV04HealthCareProvider();
    }

    /**
     * Create an instance of {@link PIXConsumerPRPAIN201301UVRequestType }
     * 
     */
    public PIXConsumerPRPAIN201301UVRequestType createPIXConsumerPRPAIN201301UVRequestType() {
        return new PIXConsumerPRPAIN201301UVRequestType();
    }

    /**
     * Create an instance of {@link COCTMT530000UVMaterialPart }
     * 
     */
    public COCTMT530000UVMaterialPart createCOCTMT530000UVMaterialPart() {
        return new COCTMT530000UVMaterialPart();
    }

    /**
     * Create an instance of {@link SLISTPQ }
     * 
     */
    public SLISTPQ createSLISTPQ() {
        return new SLISTPQ();
    }

    /**
     * Create an instance of {@link COCTMT230100UVAuthor }
     * 
     */
    public COCTMT230100UVAuthor createCOCTMT230100UVAuthor() {
        return new COCTMT230100UVAuthor();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02MothersMaidenName }
     * 
     */
    public PRPAMT201306UV02MothersMaidenName createPRPAMT201306UV02MothersMaidenName() {
        return new PRPAMT201306UV02MothersMaidenName();
    }

    /**
     * Create an instance of {@link COCTMT080000UVManufacturedProduct }
     * 
     */
    public COCTMT080000UVManufacturedProduct createCOCTMT080000UVManufacturedProduct() {
        return new COCTMT080000UVManufacturedProduct();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06DirectAuthorityOver }
     * 
     */
    public COCTMT510000UV06DirectAuthorityOver createCOCTMT510000UV06DirectAuthorityOver() {
        return new COCTMT510000UV06DirectAuthorityOver();
    }

    /**
     * Create an instance of {@link COCTMT030007UVEmployment }
     * 
     */
    public COCTMT030007UVEmployment createCOCTMT030007UVEmployment() {
        return new COCTMT030007UVEmployment();
    }

    /**
     * Create an instance of {@link COCTMT530000UVEntity }
     * 
     */
    public COCTMT530000UVEntity createCOCTMT530000UVEntity() {
        return new COCTMT530000UVEntity();
    }

    /**
     * Create an instance of {@link StrucDocTitle }
     * 
     */
    public StrucDocTitle createStrucDocTitle() {
        return new StrucDocTitle();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01LocatedEntity }
     * 
     */
    public MCCIMT000300UV01LocatedEntity createMCCIMT000300UV01LocatedEntity() {
        return new MCCIMT000300UV01LocatedEntity();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Component1 }
     * 
     */
    public COCTMT290000UV06Component1 createCOCTMT290000UV06Component1() {
        return new COCTMT290000UV06Component1();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02CareGiver }
     * 
     */
    public PRPAMT201303UV02CareGiver createPRPAMT201303UV02CareGiver() {
        return new PRPAMT201303UV02CareGiver();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02PersonalRelationship }
     * 
     */
    public PRPAMT201303UV02PersonalRelationship createPRPAMT201303UV02PersonalRelationship() {
        return new PRPAMT201303UV02PersonalRelationship();
    }

    /**
     * Create an instance of {@link TELExplicit }
     * 
     */
    public TELExplicit createTELExplicit() {
        return new TELExplicit();
    }

    /**
     * Create an instance of {@link PN }
     * 
     */
    public PN createPN() {
        return new PN();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04MedicalService }
     * 
     */
    public COCTMT310000UV04MedicalService createCOCTMT310000UV04MedicalService() {
        return new COCTMT310000UV04MedicalService();
    }

    /**
     * Create an instance of {@link PRPAIN201309UV02MCCIMT000100UV01Message }
     * 
     */
    public PRPAIN201309UV02MCCIMT000100UV01Message createPRPAIN201309UV02MCCIMT000100UV01Message() {
        return new PRPAIN201309UV02MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectId }
     * 
     */
    public PRPAMT201306UV02LivingSubjectId createPRPAMT201306UV02LivingSubjectId() {
        return new PRPAMT201306UV02LivingSubjectId();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06PatientEncounter }
     * 
     */
    public COCTMT290000UV06PatientEncounter createCOCTMT290000UV06PatientEncounter() {
        return new COCTMT290000UV06PatientEncounter();
    }

    /**
     * Create an instance of {@link COCTMT530000UVActReference }
     * 
     */
    public COCTMT530000UVActReference createCOCTMT530000UVActReference() {
        return new COCTMT530000UVActReference();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04ContactParty }
     * 
     */
    public COCTMT030000UV04ContactParty createCOCTMT030000UV04ContactParty() {
        return new COCTMT030000UV04ContactParty();
    }

    /**
     * Create an instance of {@link AdxpAdditionalLocator }
     * 
     */
    public AdxpAdditionalLocator createAdxpAdditionalLocator() {
        return new AdxpAdditionalLocator();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04ResponsibleParty }
     * 
     */
    public COCTMT740000UV04ResponsibleParty createCOCTMT740000UV04ResponsibleParty() {
        return new COCTMT740000UV04ResponsibleParty();
    }

    /**
     * Create an instance of {@link AdxpExplicitUnitID }
     * 
     */
    public AdxpExplicitUnitID createAdxpExplicitUnitID() {
        return new AdxpExplicitUnitID();
    }

    /**
     * Create an instance of {@link COCTMT030007UVGuarantor }
     * 
     */
    public COCTMT030007UVGuarantor createCOCTMT030007UVGuarantor() {
        return new COCTMT030007UVGuarantor();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04OtherIDs }
     * 
     */
    public COCTMT030000UV04OtherIDs createCOCTMT030000UV04OtherIDs() {
        return new COCTMT030000UV04OtherIDs();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Person }
     * 
     */
    public PRPAMT201301UV02Person createPRPAMT201301UV02Person() {
        return new PRPAMT201301UV02Person();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Reason }
     * 
     */
    public MFMIMT700701UV01Reason createMFMIMT700701UV01Reason() {
        return new MFMIMT700701UV01Reason();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02ContactParty }
     * 
     */
    public PRPAMT201303UV02ContactParty createPRPAMT201303UV02ContactParty() {
        return new PRPAMT201303UV02ContactParty();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04InFulfillmentOf }
     * 
     */
    public COCTMT310000UV04InFulfillmentOf createCOCTMT310000UV04InFulfillmentOf() {
        return new COCTMT310000UV04InFulfillmentOf();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Location }
     * 
     */
    public COCTMT060000UV01Location createCOCTMT060000UV01Location() {
        return new COCTMT060000UV01Location();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02CoveredParty }
     * 
     */
    public PRPAMT201303UV02CoveredParty createPRPAMT201303UV02CoveredParty() {
        return new PRPAMT201303UV02CoveredParty();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04AccommodationCoverage }
     * 
     */
    public COCTMT500000UV04AccommodationCoverage createCOCTMT500000UV04AccommodationCoverage() {
        return new COCTMT500000UV04AccommodationCoverage();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01EntityRsp }
     * 
     */
    public MCCIMT000200UV01EntityRsp createMCCIMT000200UV01EntityRsp() {
        return new MCCIMT000200UV01EntityRsp();
    }

    /**
     * Create an instance of {@link POCDMT000040Component5 }
     * 
     */
    public POCDMT000040Component5 createPOCDMT000040Component5() {
        return new POCDMT000040Component5();
    }

    /**
     * Create an instance of {@link PRPAIN201305UV02QUQIMT021001UV01ControlActProcess }
     * 
     */
    public PRPAIN201305UV02QUQIMT021001UV01ControlActProcess createPRPAIN201305UV02QUQIMT021001UV01ControlActProcess() {
        return new PRPAIN201305UV02QUQIMT021001UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link POCDMT000040ResponsibleParty }
     * 
     */
    public POCDMT000040ResponsibleParty createPOCDMT000040ResponsibleParty() {
        return new POCDMT000040ResponsibleParty();
    }

    /**
     * Create an instance of {@link POCDMT000040Device }
     * 
     */
    public POCDMT000040Device createPOCDMT000040Device() {
        return new POCDMT000040Device();
    }

    /**
     * Create an instance of {@link SCExplicit }
     * 
     */
    public SCExplicit createSCExplicit() {
        return new SCExplicit();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02MFMIMT700711UV01Subject2 }
     * 
     */
    public PRPAIN201310UV02MFMIMT700711UV01Subject2 createPRPAIN201310UV02MFMIMT700711UV01Subject2() {
        return new PRPAIN201310UV02MFMIMT700711UV01Subject2();
    }

    /**
     * Create an instance of {@link PIXConsumerPRPAIN201310UVRequestType }
     * 
     */
    public PIXConsumerPRPAIN201310UVRequestType createPIXConsumerPRPAIN201310UVRequestType() {
        return new PIXConsumerPRPAIN201310UVRequestType();
    }

    /**
     * Create an instance of {@link SXCMTS }
     * 
     */
    public SXCMTS createSXCMTS() {
        return new SXCMTS();
    }

    /**
     * Create an instance of {@link POCDMT000040Performer2 }
     * 
     */
    public POCDMT000040Performer2 createPOCDMT000040Performer2() {
        return new POCDMT000040Performer2();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Guardian }
     * 
     */
    public PRPAMT201301UV02Guardian createPRPAMT201301UV02Guardian() {
        return new PRPAMT201301UV02Guardian();
    }

    /**
     * Create an instance of {@link StrucDocParagraph }
     * 
     */
    public StrucDocParagraph createStrucDocParagraph() {
        return new StrucDocParagraph();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Definition }
     * 
     */
    public MFMIMT700701UV01Definition createMFMIMT700701UV01Definition() {
        return new MFMIMT700701UV01Definition();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Group }
     * 
     */
    public PRPAMT201303UV02Group createPRPAMT201303UV02Group() {
        return new PRPAMT201303UV02Group();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectAdministrativeGender }
     * 
     */
    public PRPAMT201306UV02LivingSubjectAdministrativeGender createPRPAMT201306UV02LivingSubjectAdministrativeGender() {
        return new PRPAMT201306UV02LivingSubjectAdministrativeGender();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02GuardianId }
     * 
     */
    public PRPAMT201302UV02GuardianId createPRPAMT201302UV02GuardianId() {
        return new PRPAMT201302UV02GuardianId();
    }

    /**
     * Create an instance of {@link AdxpCountry }
     * 
     */
    public AdxpCountry createAdxpCountry() {
        return new AdxpCountry();
    }

    /**
     * Create an instance of {@link COCTMT820000UVAssignedProvider }
     * 
     */
    public COCTMT820000UVAssignedProvider createCOCTMT820000UVAssignedProvider() {
        return new COCTMT820000UVAssignedProvider();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Employee }
     * 
     */
    public PRPAMT201303UV02Employee createPRPAMT201303UV02Employee() {
        return new PRPAMT201303UV02Employee();
    }

    /**
     * Create an instance of {@link COCTMT030202UV01Person }
     * 
     */
    public COCTMT030202UV01Person createCOCTMT030202UV01Person() {
        return new COCTMT030202UV01Person();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02MinimumDegreeMatch }
     * 
     */
    public PRPAMT201306UV02MinimumDegreeMatch createPRPAMT201306UV02MinimumDegreeMatch() {
        return new PRPAMT201306UV02MinimumDegreeMatch();
    }

    /**
     * Create an instance of {@link ED }
     * 
     */
    public ED createED() {
        return new ED();
    }

    /**
     * Create an instance of {@link COCTMT030007UVCitizen }
     * 
     */
    public COCTMT030007UVCitizen createCOCTMT030007UVCitizen() {
        return new COCTMT030007UVCitizen();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06PrescriptionOrder }
     * 
     */
    public COCTMT600000UV06PrescriptionOrder createCOCTMT600000UV06PrescriptionOrder() {
        return new COCTMT600000UV06PrescriptionOrder();
    }

    /**
     * Create an instance of {@link COCTMT080000UVNatural }
     * 
     */
    public COCTMT080000UVNatural createCOCTMT080000UVNatural() {
        return new COCTMT080000UVNatural();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Subject3 }
     * 
     */
    public MFMIMT700711UV01Subject3 createMFMIMT700711UV01Subject3() {
        return new MFMIMT700711UV01Subject3();
    }

    /**
     * Create an instance of {@link COCTMT090002UV01Organization }
     * 
     */
    public COCTMT090002UV01Organization createCOCTMT090002UV01Organization() {
        return new COCTMT090002UV01Organization();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01RespondTo }
     * 
     */
    public MCCIMT000100UV01RespondTo createMCCIMT000100UV01RespondTo() {
        return new MCCIMT000100UV01RespondTo();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Subject }
     * 
     */
    public COCTMT060000UV01Subject createCOCTMT060000UV01Subject() {
        return new COCTMT060000UV01Subject();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Device1 }
     * 
     */
    public COCTMT960000UV05Device1 createCOCTMT960000UV05Device1() {
        return new COCTMT960000UV05Device1();
    }

    /**
     * Create an instance of {@link COCTMT260003UVAssignedEntity }
     * 
     */
    public COCTMT260003UVAssignedEntity createCOCTMT260003UVAssignedEntity() {
        return new COCTMT260003UVAssignedEntity();
    }

    /**
     * Create an instance of {@link COCTMT710007UVLocatedEntity }
     * 
     */
    public COCTMT710007UVLocatedEntity createCOCTMT710007UVLocatedEntity() {
        return new COCTMT710007UVLocatedEntity();
    }

    /**
     * Create an instance of {@link POCDMT000040Patient }
     * 
     */
    public POCDMT000040Patient createPOCDMT000040Patient() {
        return new POCDMT000040Patient();
    }

    /**
     * Create an instance of {@link TSExplicit }
     * 
     */
    public TSExplicit createTSExplicit() {
        return new TSExplicit();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04MinimumAvailableAccommodation }
     * 
     */
    public COCTMT310000UV04MinimumAvailableAccommodation createCOCTMT310000UV04MinimumAvailableAccommodation() {
        return new COCTMT310000UV04MinimumAvailableAccommodation();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Reason }
     * 
     */
    public COCTMT290000UV06Reason createCOCTMT290000UV06Reason() {
        return new COCTMT290000UV06Reason();
    }

    /**
     * Create an instance of {@link POCDMT000040Section }
     * 
     */
    public POCDMT000040Section createPOCDMT000040Section() {
        return new POCDMT000040Section();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06HealthCareProvider }
     * 
     */
    public COCTMT290000UV06HealthCareProvider createCOCTMT290000UV06HealthCareProvider() {
        return new COCTMT290000UV06HealthCareProvider();
    }

    /**
     * Create an instance of {@link IVLTS }
     * 
     */
    public IVLTS createIVLTS() {
        return new IVLTS();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01AssignedEntity }
     * 
     */
    public COCTMT090000UV01AssignedEntity createCOCTMT090000UV01AssignedEntity() {
        return new COCTMT090000UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link COCTMT710000UV01Place }
     * 
     */
    public COCTMT710000UV01Place createCOCTMT710000UV01Place() {
        return new COCTMT710000UV01Place();
    }

    /**
     * Create an instance of {@link COCTMT530000UVBirthplace }
     * 
     */
    public COCTMT530000UVBirthplace createCOCTMT530000UVBirthplace() {
        return new COCTMT530000UVBirthplace();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Receiver }
     * 
     */
    public MCCIMT000100UV01Receiver createMCCIMT000100UV01Receiver() {
        return new MCCIMT000100UV01Receiver();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectBirthPlaceName }
     * 
     */
    public PRPAMT201306UV02LivingSubjectBirthPlaceName createPRPAMT201306UV02LivingSubjectBirthPlaceName() {
        return new PRPAMT201306UV02LivingSubjectBirthPlaceName();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06VisionProduct }
     * 
     */
    public COCTMT600000UV06VisionProduct createCOCTMT600000UV06VisionProduct() {
        return new COCTMT600000UV06VisionProduct();
    }

    /**
     * Create an instance of {@link IVLPPDTS }
     * 
     */
    public IVLPPDTS createIVLPPDTS() {
        return new IVLPPDTS();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Escort }
     * 
     */
    public COCTMT060000UV01Escort createCOCTMT060000UV01Escort() {
        return new COCTMT060000UV01Escort();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Coverage2 }
     * 
     */
    public COCTMT510000UV06Coverage2 createCOCTMT510000UV06Coverage2() {
        return new COCTMT510000UV06Coverage2();
    }

    /**
     * Create an instance of {@link AdxpExplicitPrecinct }
     * 
     */
    public AdxpExplicitPrecinct createAdxpExplicitPrecinct() {
        return new AdxpExplicitPrecinct();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06AdministrativeDiagnosisReference }
     * 
     */
    public COCTMT290000UV06AdministrativeDiagnosisReference createCOCTMT290000UV06AdministrativeDiagnosisReference() {
        return new COCTMT290000UV06AdministrativeDiagnosisReference();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02QueryByParameter }
     * 
     */
    public PRPAMT201306UV02QueryByParameter createPRPAMT201306UV02QueryByParameter() {
        return new PRPAMT201306UV02QueryByParameter();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Organization }
     * 
     */
    public COCTMT510000UV06Organization createCOCTMT510000UV06Organization() {
        return new COCTMT510000UV06Organization();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06SpecimenCollectionEvent }
     * 
     */
    public COCTMT290000UV06SpecimenCollectionEvent createCOCTMT290000UV06SpecimenCollectionEvent() {
        return new COCTMT290000UV06SpecimenCollectionEvent();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Agent }
     * 
     */
    public MCCIMT000100UV01Agent createMCCIMT000100UV01Agent() {
        return new MCCIMT000100UV01Agent();
    }

    /**
     * Create an instance of {@link CS }
     * 
     */
    public CS createCS() {
        return new CS();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02CoveredParty }
     * 
     */
    public PRPAMT201304UV02CoveredParty createPRPAMT201304UV02CoveredParty() {
        return new PRPAMT201304UV02CoveredParty();
    }

    /**
     * Create an instance of {@link PRPAIN201301UV02MFMIMT700701UV01RegistrationEvent }
     * 
     */
    public PRPAIN201301UV02MFMIMT700701UV01RegistrationEvent createPRPAIN201301UV02MFMIMT700701UV01RegistrationEvent() {
        return new PRPAIN201301UV02MFMIMT700701UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04PrescriberRole }
     * 
     */
    public COCTMT300000UV04PrescriberRole createCOCTMT300000UV04PrescriberRole() {
        return new COCTMT300000UV04PrescriberRole();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06ServiceDefinition }
     * 
     */
    public COCTMT510000UV06ServiceDefinition createCOCTMT510000UV06ServiceDefinition() {
        return new COCTMT510000UV06ServiceDefinition();
    }

    /**
     * Create an instance of {@link AdxpExplicitDeliveryInstallationQualifier }
     * 
     */
    public AdxpExplicitDeliveryInstallationQualifier createAdxpExplicitDeliveryInstallationQualifier() {
        return new AdxpExplicitDeliveryInstallationQualifier();
    }

    /**
     * Create an instance of {@link AdxpState }
     * 
     */
    public AdxpState createAdxpState() {
        return new AdxpState();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Place }
     * 
     */
    public MCCIMT000100UV01Place createMCCIMT000100UV01Place() {
        return new MCCIMT000100UV01Place();
    }

    /**
     * Create an instance of {@link COCTMT530000UVResponsibleParty2 }
     * 
     */
    public COCTMT530000UVResponsibleParty2 createCOCTMT530000UVResponsibleParty2() {
        return new COCTMT530000UVResponsibleParty2();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06SecondaryPerformer }
     * 
     */
    public COCTMT290000UV06SecondaryPerformer createCOCTMT290000UV06SecondaryPerformer() {
        return new COCTMT290000UV06SecondaryPerformer();
    }

    /**
     * Create an instance of {@link SC }
     * 
     */
    public SC createSC() {
        return new SC();
    }

    /**
     * Create an instance of {@link POCDMT000040AssignedAuthor }
     * 
     */
    public POCDMT000040AssignedAuthor createPOCDMT000040AssignedAuthor() {
        return new POCDMT000040AssignedAuthor();
    }

    /**
     * Create an instance of {@link POCDMT000040AssociatedEntity }
     * 
     */
    public POCDMT000040AssociatedEntity createPOCDMT000040AssociatedEntity() {
        return new POCDMT000040AssociatedEntity();
    }

    /**
     * Create an instance of {@link COCTMT820000UVHealthCareProvider }
     * 
     */
    public COCTMT820000UVHealthCareProvider createCOCTMT820000UVHealthCareProvider() {
        return new COCTMT820000UVHealthCareProvider();
    }

    /**
     * Create an instance of {@link POCDMT000040Entity }
     * 
     */
    public POCDMT000040Entity createPOCDMT000040Entity() {
        return new POCDMT000040Entity();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02MFMIMT700711UV01ControlActProcess }
     * 
     */
    public PRPAIN201310UV02MFMIMT700711UV01ControlActProcess createPRPAIN201310UV02MFMIMT700711UV01ControlActProcess() {
        return new PRPAIN201310UV02MFMIMT700711UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link PRPAIN201301UV02MFMIMT700701UV01Subject2 }
     * 
     */
    public PRPAIN201301UV02MFMIMT700701UV01Subject2 createPRPAIN201301UV02MFMIMT700701UV01Subject2() {
        return new PRPAIN201301UV02MFMIMT700701UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT260003UVSubject }
     * 
     */
    public COCTMT260003UVSubject createCOCTMT260003UVSubject() {
        return new COCTMT260003UVSubject();
    }

    /**
     * Create an instance of {@link POCDMT000040StructuredBody }
     * 
     */
    public POCDMT000040StructuredBody createPOCDMT000040StructuredBody() {
        return new POCDMT000040StructuredBody();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02LanguageCommunication }
     * 
     */
    public PRPAMT201302UV02LanguageCommunication createPRPAMT201302UV02LanguageCommunication() {
        return new PRPAMT201302UV02LanguageCommunication();
    }

    /**
     * Create an instance of {@link POCDMT000040RegionOfInterest }
     * 
     */
    public POCDMT000040RegionOfInterest createPOCDMT000040RegionOfInterest() {
        return new POCDMT000040RegionOfInterest();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06AssignedEntity }
     * 
     */
    public COCTMT290000UV06AssignedEntity createCOCTMT290000UV06AssignedEntity() {
        return new COCTMT290000UV06AssignedEntity();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02 }
     * 
     */
    public PRPAIN201310UV02 createPRPAIN201310UV02() {
        return new PRPAIN201310UV02();
    }

    /**
     * Create an instance of {@link POCDMT000040Authorization }
     * 
     */
    public POCDMT000040Authorization createPOCDMT000040Authorization() {
        return new POCDMT000040Authorization();
    }

    /**
     * Create an instance of {@link RTOMOPQ }
     * 
     */
    public RTOMOPQ createRTOMOPQ() {
        return new RTOMOPQ();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01Role }
     * 
     */
    public MCAIMT900001UV01Role createMCAIMT900001UV01Role() {
        return new MCAIMT900001UV01Role();
    }

    /**
     * Create an instance of {@link COCTMT820000UVRoleOther }
     * 
     */
    public COCTMT820000UVRoleOther createCOCTMT820000UVRoleOther() {
        return new COCTMT820000UVRoleOther();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Author1 }
     * 
     */
    public COCTMT290000UV06Author1 createCOCTMT290000UV06Author1() {
        return new COCTMT290000UV06Author1();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06BillableModifier }
     * 
     */
    public COCTMT290000UV06BillableModifier createCOCTMT290000UV06BillableModifier() {
        return new COCTMT290000UV06BillableModifier();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Device }
     * 
     */
    public MCCIMT000100UV01Device createMCCIMT000100UV01Device() {
        return new MCCIMT000100UV01Device();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Member }
     * 
     */
    public PRPAMT201310UV02Member createPRPAMT201310UV02Member() {
        return new PRPAMT201310UV02Member();
    }

    /**
     * Create an instance of {@link StrucDocText }
     * 
     */
    public StrucDocText createStrucDocText() {
        return new StrucDocText();
    }

    /**
     * Create an instance of {@link AdxpExplicitCensusTract }
     * 
     */
    public AdxpExplicitCensusTract createAdxpExplicitCensusTract() {
        return new AdxpExplicitCensusTract();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04PertinentInformation }
     * 
     */
    public COCTMT490000UV04PertinentInformation createCOCTMT490000UV04PertinentInformation() {
        return new COCTMT490000UV04PertinentInformation();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02PatientOfOtherProvider }
     * 
     */
    public PRPAMT201301UV02PatientOfOtherProvider createPRPAMT201301UV02PatientOfOtherProvider() {
        return new PRPAMT201301UV02PatientOfOtherProvider();
    }

    /**
     * Create an instance of {@link PRPAMT201307UV02PatientIdentifier }
     * 
     */
    public PRPAMT201307UV02PatientIdentifier createPRPAMT201307UV02PatientIdentifier() {
        return new PRPAMT201307UV02PatientIdentifier();
    }

    /**
     * Create an instance of {@link COCTMT090303UV01Device }
     * 
     */
    public COCTMT090303UV01Device createCOCTMT090303UV01Device() {
        return new COCTMT090303UV01Device();
    }

    /**
     * Create an instance of {@link COCTMT530000UVCriterion }
     * 
     */
    public COCTMT530000UVCriterion createCOCTMT530000UVCriterion() {
        return new COCTMT530000UVCriterion();
    }

    /**
     * Create an instance of {@link COCTMT710007UVPlace }
     * 
     */
    public COCTMT710007UVPlace createCOCTMT710007UVPlace() {
        return new COCTMT710007UVPlace();
    }

    /**
     * Create an instance of {@link COCTMT030007UVMember }
     * 
     */
    public COCTMT030007UVMember createCOCTMT030007UVMember() {
        return new COCTMT030007UVMember();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Member }
     * 
     */
    public PRPAMT201303UV02Member createPRPAMT201303UV02Member() {
        return new PRPAMT201303UV02Member();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06DirectAuthorityOver3 }
     * 
     */
    public COCTMT510000UV06DirectAuthorityOver3 createCOCTMT510000UV06DirectAuthorityOver3() {
        return new COCTMT510000UV06DirectAuthorityOver3();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSourceOf3 }
     * 
     */
    public COCTMT530000UVSourceOf3 createCOCTMT530000UVSourceOf3() {
        return new COCTMT530000UVSourceOf3();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04PolicyHolderOrganization }
     * 
     */
    public COCTMT500000UV04PolicyHolderOrganization createCOCTMT500000UV04PolicyHolderOrganization() {
        return new COCTMT500000UV04PolicyHolderOrganization();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Destination }
     * 
     */
    public COCTMT300000UV04Destination createCOCTMT300000UV04Destination() {
        return new COCTMT300000UV04Destination();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04Account }
     * 
     */
    public COCTMT670000UV04Account createCOCTMT670000UV04Account() {
        return new COCTMT670000UV04Account();
    }

    /**
     * Create an instance of {@link ON }
     * 
     */
    public ON createON() {
        return new ON();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01Group }
     * 
     */
    public COCTMT090300UV01Group createCOCTMT090300UV01Group() {
        return new COCTMT090300UV01Group();
    }

    /**
     * Create an instance of {@link QUQIMT021001UV01AuthorOrPerformer }
     * 
     */
    public QUQIMT021001UV01AuthorOrPerformer createQUQIMT021001UV01AuthorOrPerformer() {
        return new QUQIMT021001UV01AuthorOrPerformer();
    }

    /**
     * Create an instance of {@link COCTMT530000UVActDefinition }
     * 
     */
    public COCTMT530000UVActDefinition createCOCTMT530000UVActDefinition() {
        return new COCTMT530000UVActDefinition();
    }

    /**
     * Create an instance of {@link COCTMT820000UVCareProvision }
     * 
     */
    public COCTMT820000UVCareProvision createCOCTMT820000UVCareProvision() {
        return new COCTMT820000UVCareProvision();
    }

    /**
     * Create an instance of {@link AdxpBuildingNumberSuffix }
     * 
     */
    public AdxpBuildingNumberSuffix createAdxpBuildingNumberSuffix() {
        return new AdxpBuildingNumberSuffix();
    }

    /**
     * Create an instance of {@link POCDMT000040RecordTarget }
     * 
     */
    public POCDMT000040RecordTarget createPOCDMT000040RecordTarget() {
        return new POCDMT000040RecordTarget();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Limitation }
     * 
     */
    public COCTMT510000UV06Limitation createCOCTMT510000UV06Limitation() {
        return new COCTMT510000UV06Limitation();
    }

    /**
     * Create an instance of {@link EnDelimiter }
     * 
     */
    public EnDelimiter createEnDelimiter() {
        return new EnDelimiter();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Organization }
     * 
     */
    public MCCIMT000100UV01Organization createMCCIMT000100UV01Organization() {
        return new MCCIMT000100UV01Organization();
    }

    /**
     * Create an instance of {@link CR }
     * 
     */
    public CR createCR() {
        return new CR();
    }

    /**
     * Create an instance of {@link COCTMT530000UVAdministerableMaterial }
     * 
     */
    public COCTMT530000UVAdministerableMaterial createCOCTMT530000UVAdministerableMaterial() {
        return new COCTMT530000UVAdministerableMaterial();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04Author }
     * 
     */
    public COCTMT500000UV04Author createCOCTMT500000UV04Author() {
        return new COCTMT500000UV04Author();
    }

    /**
     * Create an instance of {@link POCDMT000040InfrastructureRootTypeId }
     * 
     */
    public POCDMT000040InfrastructureRootTypeId createPOCDMT000040InfrastructureRootTypeId() {
        return new POCDMT000040InfrastructureRootTypeId();
    }

    /**
     * Create an instance of {@link COCTMT030007UVNonPersonLivingSubject }
     * 
     */
    public COCTMT030007UVNonPersonLivingSubject createCOCTMT030007UVNonPersonLivingSubject() {
        return new COCTMT030007UVNonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Student }
     * 
     */
    public PRPAMT201304UV02Student createPRPAMT201304UV02Student() {
        return new PRPAMT201304UV02Student();
    }

    /**
     * Create an instance of {@link PRPAIN201301UV02 }
     * 
     */
    public PRPAIN201301UV02 createPRPAIN201301UV02() {
        return new PRPAIN201301UV02();
    }

    /**
     * Create an instance of {@link PIXConsumerPRPAIN201304UVSecuredRequestType }
     * 
     */
    public PIXConsumerPRPAIN201304UVSecuredRequestType createPIXConsumerPRPAIN201304UVSecuredRequestType() {
        return new PIXConsumerPRPAIN201304UVSecuredRequestType();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Payor }
     * 
     */
    public COCTMT510000UV06Payor createCOCTMT510000UV06Payor() {
        return new COCTMT510000UV06Payor();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04PertinentInformation2 }
     * 
     */
    public COCTMT300000UV04PertinentInformation2 createCOCTMT300000UV04PertinentInformation2() {
        return new COCTMT300000UV04PertinentInformation2();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02AdministrativeObservation }
     * 
     */
    public PRPAMT201302UV02AdministrativeObservation createPRPAMT201302UV02AdministrativeObservation() {
        return new PRPAMT201302UV02AdministrativeObservation();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04ManufacturedProduct }
     * 
     */
    public COCTMT300000UV04ManufacturedProduct createCOCTMT300000UV04ManufacturedProduct() {
        return new COCTMT300000UV04ManufacturedProduct();
    }

    /**
     * Create an instance of {@link COCTMT260003UVDetectedMedicationIssue }
     * 
     */
    public COCTMT260003UVDetectedMedicationIssue createCOCTMT260003UVDetectedMedicationIssue() {
        return new COCTMT260003UVDetectedMedicationIssue();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02PersonalRelationship }
     * 
     */
    public PRPAMT201301UV02PersonalRelationship createPRPAMT201301UV02PersonalRelationship() {
        return new PRPAMT201301UV02PersonalRelationship();
    }

    /**
     * Create an instance of {@link SXCMINT }
     * 
     */
    public SXCMINT createSXCMINT() {
        return new SXCMINT();
    }

    /**
     * Create an instance of {@link BXITIVLPQ }
     * 
     */
    public BXITIVLPQ createBXITIVLPQ() {
        return new BXITIVLPQ();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02OtherIDs }
     * 
     */
    public PRPAMT201301UV02OtherIDs createPRPAMT201301UV02OtherIDs() {
        return new PRPAMT201301UV02OtherIDs();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoverageLimitObservation }
     * 
     */
    public COCTMT510000UV06CoverageLimitObservation createCOCTMT510000UV06CoverageLimitObservation() {
        return new COCTMT510000UV06CoverageLimitObservation();
    }

    /**
     * Create an instance of {@link POCDMT000040ManufacturedProduct }
     * 
     */
    public POCDMT000040ManufacturedProduct createPOCDMT000040ManufacturedProduct() {
        return new POCDMT000040ManufacturedProduct();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubIngredient }
     * 
     */
    public COCTMT230100UVSubIngredient createCOCTMT230100UVSubIngredient() {
        return new COCTMT230100UVSubIngredient();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Agent }
     * 
     */
    public MCCIMT000200UV01Agent createMCCIMT000200UV01Agent() {
        return new MCCIMT000200UV01Agent();
    }

    /**
     * Create an instance of {@link POCDMT000040Observation }
     * 
     */
    public POCDMT000040Observation createPOCDMT000040Observation() {
        return new POCDMT000040Observation();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02OtherIDs }
     * 
     */
    public PRPAMT201303UV02OtherIDs createPRPAMT201303UV02OtherIDs() {
        return new PRPAMT201303UV02OtherIDs();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Overseer }
     * 
     */
    public MFMIMT700701UV01Overseer createMFMIMT700701UV01Overseer() {
        return new MFMIMT700701UV01Overseer();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02AdministrativeObservation }
     * 
     */
    public PRPAMT201301UV02AdministrativeObservation createPRPAMT201301UV02AdministrativeObservation() {
        return new PRPAMT201301UV02AdministrativeObservation();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05PositionCoordinate }
     * 
     */
    public COCTMT960000UV05PositionCoordinate createCOCTMT960000UV05PositionCoordinate() {
        return new COCTMT960000UV05PositionCoordinate();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01AuthorOrPerformer }
     * 
     */
    public MFMIMT700701UV01AuthorOrPerformer createMFMIMT700701UV01AuthorOrPerformer() {
        return new MFMIMT700701UV01AuthorOrPerformer();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04Entity }
     * 
     */
    public COCTMT030000UV04Entity createCOCTMT030000UV04Entity() {
        return new COCTMT030000UV04Entity();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PersonalRelationshipId }
     * 
     */
    public PRPAMT201302UV02PersonalRelationshipId createPRPAMT201302UV02PersonalRelationshipId() {
        return new PRPAMT201302UV02PersonalRelationshipId();
    }

    /**
     * Create an instance of {@link COCTMT090303UV01AssignedDevice }
     * 
     */
    public COCTMT090303UV01AssignedDevice createCOCTMT090303UV01AssignedDevice() {
        return new COCTMT090303UV01AssignedDevice();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02MFMIMT700701UV01Subject2 }
     * 
     */
    public PRPAIN201304UV02MFMIMT700701UV01Subject2 createPRPAIN201304UV02MFMIMT700701UV01Subject2() {
        return new PRPAIN201304UV02MFMIMT700701UV01Subject2();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Employee }
     * 
     */
    public PRPAMT201310UV02Employee createPRPAMT201310UV02Employee() {
        return new PRPAMT201310UV02Employee();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04GuarantorLanguage }
     * 
     */
    public COCTMT670000UV04GuarantorLanguage createCOCTMT670000UV04GuarantorLanguage() {
        return new COCTMT670000UV04GuarantorLanguage();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Reference }
     * 
     */
    public COCTMT740000UV04Reference createCOCTMT740000UV04Reference() {
        return new COCTMT740000UV04Reference();
    }

    /**
     * Create an instance of {@link CDExplicit }
     * 
     */
    public CDExplicit createCDExplicit() {
        return new CDExplicit();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02CareGiver }
     * 
     */
    public PRPAMT201301UV02CareGiver createPRPAMT201301UV02CareGiver() {
        return new PRPAMT201301UV02CareGiver();
    }

    /**
     * Create an instance of {@link CE }
     * 
     */
    public CE createCE() {
        return new CE();
    }

    /**
     * Create an instance of {@link COCTMT070000UV01LocatedEntity }
     * 
     */
    public COCTMT070000UV01LocatedEntity createCOCTMT070000UV01LocatedEntity() {
        return new COCTMT070000UV01LocatedEntity();
    }

    /**
     * Create an instance of {@link AdxpExplicitState }
     * 
     */
    public AdxpExplicitState createAdxpExplicitState() {
        return new AdxpExplicitState();
    }

    /**
     * Create an instance of {@link PRPAMT201307UV02DataSource }
     * 
     */
    public PRPAMT201307UV02DataSource createPRPAMT201307UV02DataSource() {
        return new PRPAMT201307UV02DataSource();
    }

    /**
     * Create an instance of {@link COCTMT530000UVOrganizer }
     * 
     */
    public COCTMT530000UVOrganizer createCOCTMT530000UVOrganizer() {
        return new COCTMT530000UVOrganizer();
    }

    /**
     * Create an instance of {@link AdxpStreetNameBase }
     * 
     */
    public AdxpStreetNameBase createAdxpStreetNameBase() {
        return new AdxpStreetNameBase();
    }

    /**
     * Create an instance of {@link COCTMT230100UVRole }
     * 
     */
    public COCTMT230100UVRole createCOCTMT230100UVRole() {
        return new COCTMT230100UVRole();
    }

    /**
     * Create an instance of {@link COCTMT080000UVSubject2 }
     * 
     */
    public COCTMT080000UVSubject2 createCOCTMT080000UVSubject2() {
        return new COCTMT080000UVSubject2();
    }

    /**
     * Create an instance of {@link RTO }
     * 
     */
    public RTO createRTO() {
        return new RTO();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06DirectAuthorityOver4 }
     * 
     */
    public COCTMT510000UV06DirectAuthorityOver4 createCOCTMT510000UV06DirectAuthorityOver4() {
        return new COCTMT510000UV06DirectAuthorityOver4();
    }

    /**
     * Create an instance of {@link StrucDocTr }
     * 
     */
    public StrucDocTr createStrucDocTr() {
        return new StrucDocTr();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04Holder }
     * 
     */
    public COCTMT670000UV04Holder createCOCTMT670000UV04Holder() {
        return new COCTMT670000UV04Holder();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04GuarantorPerson }
     * 
     */
    public COCTMT670000UV04GuarantorPerson createCOCTMT670000UV04GuarantorPerson() {
        return new COCTMT670000UV04GuarantorPerson();
    }

    /**
     * Create an instance of {@link AdxpExplicitDeliveryModeIdentifier }
     * 
     */
    public AdxpExplicitDeliveryModeIdentifier createAdxpExplicitDeliveryModeIdentifier() {
        return new AdxpExplicitDeliveryModeIdentifier();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02OtherIDs }
     * 
     */
    public PRPAMT201310UV02OtherIDs createPRPAMT201310UV02OtherIDs() {
        return new PRPAMT201310UV02OtherIDs();
    }

    /**
     * Create an instance of {@link PIXConsumerPRPAIN201309UVResponseType }
     * 
     */
    public PIXConsumerPRPAIN201309UVResponseType createPIXConsumerPRPAIN201309UVResponseType() {
        return new PIXConsumerPRPAIN201309UVResponseType();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06NonPersonLivingSubject }
     * 
     */
    public COCTMT290000UV06NonPersonLivingSubject createCOCTMT290000UV06NonPersonLivingSubject() {
        return new COCTMT290000UV06NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link COCTMT230100UVMedicine }
     * 
     */
    public COCTMT230100UVMedicine createCOCTMT230100UVMedicine() {
        return new COCTMT230100UVMedicine();
    }

    /**
     * Create an instance of {@link IVXBINT }
     * 
     */
    public IVXBINT createIVXBINT() {
        return new IVXBINT();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04WarrantorOrganization }
     * 
     */
    public COCTMT490000UV04WarrantorOrganization createCOCTMT490000UV04WarrantorOrganization() {
        return new COCTMT490000UV04WarrantorOrganization();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04PertinentInformation1 }
     * 
     */
    public COCTMT310000UV04PertinentInformation1 createCOCTMT310000UV04PertinentInformation1() {
        return new COCTMT310000UV04PertinentInformation1();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Warrantor }
     * 
     */
    public COCTMT490000UV04Warrantor createCOCTMT490000UV04Warrantor() {
        return new COCTMT490000UV04Warrantor();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Student }
     * 
     */
    public PRPAMT201301UV02Student createPRPAMT201301UV02Student() {
        return new PRPAMT201301UV02Student();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Product2 }
     * 
     */
    public COCTMT600000UV06Product2 createCOCTMT600000UV06Product2() {
        return new COCTMT600000UV06Product2();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Group }
     * 
     */
    public PRPAMT201301UV02Group createPRPAMT201301UV02Group() {
        return new PRPAMT201301UV02Group();
    }

    /**
     * Create an instance of {@link PIXConsumerPRPAIN201301UVSecuredRequestType }
     * 
     */
    public PIXConsumerPRPAIN201301UVSecuredRequestType createPIXConsumerPRPAIN201301UVSecuredRequestType() {
        return new PIXConsumerPRPAIN201301UVSecuredRequestType();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01RespondTo }
     * 
     */
    public MCCIMT000200UV01RespondTo createMCCIMT000200UV01RespondTo() {
        return new MCCIMT000200UV01RespondTo();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04ContentPackagedProduct }
     * 
     */
    public COCTMT490000UV04ContentPackagedProduct createCOCTMT490000UV04ContentPackagedProduct() {
        return new COCTMT490000UV04ContentPackagedProduct();
    }

    /**
     * Create an instance of {@link POCDMT000040Informant12 }
     * 
     */
    public POCDMT000040Informant12 createPOCDMT000040Informant12() {
        return new POCDMT000040Informant12();
    }

    /**
     * Create an instance of {@link II }
     * 
     */
    public II createII() {
        return new II();
    }

    /**
     * Create an instance of {@link PIVLPPDTS }
     * 
     */
    public PIVLPPDTS createPIVLPPDTS() {
        return new PIVLPPDTS();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Sender }
     * 
     */
    public MCCIMT000300UV01Sender createMCCIMT000300UV01Sender() {
        return new MCCIMT000300UV01Sender();
    }

    /**
     * Create an instance of {@link COCTMT080000UVProduct }
     * 
     */
    public COCTMT080000UVProduct createCOCTMT080000UVProduct() {
        return new COCTMT080000UVProduct();
    }

    /**
     * Create an instance of {@link COCTMT230100UVObservationGoal }
     * 
     */
    public COCTMT230100UVObservationGoal createCOCTMT230100UVObservationGoal() {
        return new COCTMT230100UVObservationGoal();
    }

    /**
     * Create an instance of {@link EIVLEvent }
     * 
     */
    public EIVLEvent createEIVLEvent() {
        return new EIVLEvent();
    }

    /**
     * Create an instance of {@link COCTMT230100UVCharacteristic }
     * 
     */
    public COCTMT230100UVCharacteristic createCOCTMT230100UVCharacteristic() {
        return new COCTMT230100UVCharacteristic();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04Member }
     * 
     */
    public COCTMT030000UV04Member createCOCTMT030000UV04Member() {
        return new COCTMT030000UV04Member();
    }

    /**
     * Create an instance of {@link AdxpDeliveryInstallationType }
     * 
     */
    public AdxpDeliveryInstallationType createAdxpDeliveryInstallationType() {
        return new AdxpDeliveryInstallationType();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ManufacturedProduct }
     * 
     */
    public COCTMT290000UV06ManufacturedProduct createCOCTMT290000UV06ManufacturedProduct() {
        return new COCTMT290000UV06ManufacturedProduct();
    }

    /**
     * Create an instance of {@link StrucDocBr }
     * 
     */
    public StrucDocBr createStrucDocBr() {
        return new StrucDocBr();
    }

    /**
     * Create an instance of {@link CreateFault201310RequestType }
     * 
     */
    public CreateFault201310RequestType createCreateFault201310RequestType() {
        return new CreateFault201310RequestType();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSupply }
     * 
     */
    public COCTMT530000UVSupply createCOCTMT530000UVSupply() {
        return new COCTMT530000UVSupply();
    }

    /**
     * Create an instance of {@link COCTMT230100UVRelatedManufacturer }
     * 
     */
    public COCTMT230100UVRelatedManufacturer createCOCTMT230100UVRelatedManufacturer() {
        return new COCTMT230100UVRelatedManufacturer();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Person }
     * 
     */
    public COCTMT510000UV06Person createCOCTMT510000UV06Person() {
        return new COCTMT510000UV06Person();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01RoleOther }
     * 
     */
    public COCTMT090000UV01RoleOther createCOCTMT090000UV01RoleOther() {
        return new COCTMT090000UV01RoleOther();
    }

    /**
     * Create an instance of {@link POCDMT000040AssignedEntity }
     * 
     */
    public POCDMT000040AssignedEntity createPOCDMT000040AssignedEntity() {
        return new POCDMT000040AssignedEntity();
    }

    /**
     * Create an instance of {@link COCTMT530000UVRole }
     * 
     */
    public COCTMT530000UVRole createCOCTMT530000UVRole() {
        return new COCTMT530000UVRole();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02MatchAlgorithm }
     * 
     */
    public PRPAMT201306UV02MatchAlgorithm createPRPAMT201306UV02MatchAlgorithm() {
        return new PRPAMT201306UV02MatchAlgorithm();
    }

    /**
     * Create an instance of {@link COCTMT530000UVHealthCareFacility }
     * 
     */
    public COCTMT530000UVHealthCareFacility createCOCTMT530000UVHealthCareFacility() {
        return new COCTMT530000UVHealthCareFacility();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01LocatedEntity }
     * 
     */
    public MCCIMT000200UV01LocatedEntity createMCCIMT000200UV01LocatedEntity() {
        return new MCCIMT000200UV01LocatedEntity();
    }

    /**
     * Create an instance of {@link PRPAMT201307UV02QueryByParameter }
     * 
     */
    public PRPAMT201307UV02QueryByParameter createPRPAMT201307UV02QueryByParameter() {
        return new PRPAMT201307UV02QueryByParameter();
    }

    /**
     * Create an instance of {@link COCTMT090003UV01Person }
     * 
     */
    public COCTMT090003UV01Person createCOCTMT090003UV01Person() {
        return new COCTMT090003UV01Person();
    }

    /**
     * Create an instance of {@link SXCMMO }
     * 
     */
    public SXCMMO createSXCMMO() {
        return new SXCMMO();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01LicensedEntity }
     * 
     */
    public COCTMT090300UV01LicensedEntity createCOCTMT090300UV01LicensedEntity() {
        return new COCTMT090300UV01LicensedEntity();
    }

    /**
     * Create an instance of {@link COCTMT530000UVDefinition }
     * 
     */
    public COCTMT530000UVDefinition createCOCTMT530000UVDefinition() {
        return new COCTMT530000UVDefinition();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04CarrierRole }
     * 
     */
    public COCTMT500000UV04CarrierRole createCOCTMT500000UV04CarrierRole() {
        return new COCTMT500000UV04CarrierRole();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Author1 }
     * 
     */
    public MFMIMT700711UV01Author1 createMFMIMT700711UV01Author1() {
        return new MFMIMT700711UV01Author1();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Place }
     * 
     */
    public MCCIMT000200UV01Place createMCCIMT000200UV01Place() {
        return new MCCIMT000200UV01Place();
    }

    /**
     * Create an instance of {@link EN }
     * 
     */
    public EN createEN() {
        return new EN();
    }

    /**
     * Create an instance of {@link ADExplicit }
     * 
     */
    public ADExplicit createADExplicit() {
        return new ADExplicit();
    }

    /**
     * Create an instance of {@link COCTMT090003UV01Organization }
     * 
     */
    public COCTMT090003UV01Organization createCOCTMT090003UV01Organization() {
        return new COCTMT090003UV01Organization();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Part }
     * 
     */
    public COCTMT510000UV06Part createCOCTMT510000UV06Part() {
        return new COCTMT510000UV06Part();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Subject }
     * 
     */
    public PRPAMT201310UV02Subject createPRPAMT201310UV02Subject() {
        return new PRPAMT201310UV02Subject();
    }

    /**
     * Create an instance of {@link IVXBPPDPQ }
     * 
     */
    public IVXBPPDPQ createIVXBPPDPQ() {
        return new IVXBPPDPQ();
    }

    /**
     * Create an instance of {@link COCTMT080000UVSpecimenObservationEvent }
     * 
     */
    public COCTMT080000UVSpecimenObservationEvent createCOCTMT080000UVSpecimenObservationEvent() {
        return new COCTMT080000UVSpecimenObservationEvent();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Student }
     * 
     */
    public PRPAMT201302UV02Student createPRPAMT201302UV02Student() {
        return new PRPAMT201302UV02Student();
    }

    /**
     * Create an instance of {@link POCDMT000040Procedure }
     * 
     */
    public POCDMT000040Procedure createPOCDMT000040Procedure() {
        return new POCDMT000040Procedure();
    }

    /**
     * Create an instance of {@link SXCMPQ }
     * 
     */
    public SXCMPQ createSXCMPQ() {
        return new SXCMPQ();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02 }
     * 
     */
    public PRPAIN201304UV02 createPRPAIN201304UV02() {
        return new PRPAIN201304UV02();
    }

    /**
     * Create an instance of {@link StrucDocList }
     * 
     */
    public StrucDocList createStrucDocList() {
        return new StrucDocList();
    }

    /**
     * Create an instance of {@link AdxpExplicitStreetNameType1 }
     * 
     */
    public AdxpExplicitStreetNameType1 createAdxpExplicitStreetNameType1() {
        return new AdxpExplicitStreetNameType1();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02CoveredParty }
     * 
     */
    public PRPAMT201302UV02CoveredParty createPRPAMT201302UV02CoveredParty() {
        return new PRPAMT201302UV02CoveredParty();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04Person }
     * 
     */
    public COCTMT030000UV04Person createCOCTMT030000UV04Person() {
        return new COCTMT030000UV04Person();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PersonalRelationship }
     * 
     */
    public PRPAMT201302UV02PersonalRelationship createPRPAMT201302UV02PersonalRelationship() {
        return new PRPAMT201302UV02PersonalRelationship();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01AttentionLine }
     * 
     */
    public MCCIMT000100UV01AttentionLine createMCCIMT000100UV01AttentionLine() {
        return new MCCIMT000100UV01AttentionLine();
    }

    /**
     * Create an instance of {@link IVXBTS }
     * 
     */
    public IVXBTS createIVXBTS() {
        return new IVXBTS();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoverageChargePolicy }
     * 
     */
    public COCTMT510000UV06CoverageChargePolicy createCOCTMT510000UV06CoverageChargePolicy() {
        return new COCTMT510000UV06CoverageChargePolicy();
    }

    /**
     * Create an instance of {@link COCTMT080000UVAutomationSpecimenObservationEvent }
     * 
     */
    public COCTMT080000UVAutomationSpecimenObservationEvent createCOCTMT080000UVAutomationSpecimenObservationEvent() {
        return new COCTMT080000UVAutomationSpecimenObservationEvent();
    }

    /**
     * Create an instance of {@link POCDMT000040Precondition }
     * 
     */
    public POCDMT000040Precondition createPOCDMT000040Precondition() {
        return new POCDMT000040Precondition();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02ContactPartyId }
     * 
     */
    public PRPAMT201302UV02ContactPartyId createPRPAMT201302UV02ContactPartyId() {
        return new PRPAMT201302UV02ContactPartyId();
    }

    /**
     * Create an instance of {@link Thumbnail }
     * 
     */
    public Thumbnail createThumbnail() {
        return new Thumbnail();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04PertinentInformation2 }
     * 
     */
    public COCTMT310000UV04PertinentInformation2 createCOCTMT310000UV04PertinentInformation2() {
        return new COCTMT310000UV04PertinentInformation2();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Product1 }
     * 
     */
    public COCTMT290000UV06Product1 createCOCTMT290000UV06Product1() {
        return new COCTMT290000UV06Product1();
    }

    /**
     * Create an instance of {@link COCTMT150003UV03Person }
     * 
     */
    public COCTMT150003UV03Person createCOCTMT150003UV03Person() {
        return new COCTMT150003UV03Person();
    }

    /**
     * Create an instance of {@link POCDMT000040Consent }
     * 
     */
    public POCDMT000040Consent createPOCDMT000040Consent() {
        return new POCDMT000040Consent();
    }

    /**
     * Create an instance of {@link COCTMT230100UVPart }
     * 
     */
    public COCTMT230100UVPart createCOCTMT230100UVPart() {
        return new COCTMT230100UVPart();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01Member }
     * 
     */
    public COCTMT090000UV01Member createCOCTMT090000UV01Member() {
        return new COCTMT090000UV01Member();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Underwriter }
     * 
     */
    public COCTMT510000UV06Underwriter createCOCTMT510000UV06Underwriter() {
        return new COCTMT510000UV06Underwriter();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoverageRecord }
     * 
     */
    public COCTMT510000UV06CoverageRecord createCOCTMT510000UV06CoverageRecord() {
        return new COCTMT510000UV06CoverageRecord();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Author2 }
     * 
     */
    public MFMIMT700711UV01Author2 createMFMIMT700711UV01Author2() {
        return new MFMIMT700711UV01Author2();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02StudentId }
     * 
     */
    public PRPAMT201302UV02StudentId createPRPAMT201302UV02StudentId() {
        return new PRPAMT201302UV02StudentId();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Nation }
     * 
     */
    public PRPAMT201301UV02Nation createPRPAMT201301UV02Nation() {
        return new PRPAMT201301UV02Nation();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Consultant }
     * 
     */
    public COCTMT290000UV06Consultant createCOCTMT290000UV06Consultant() {
        return new COCTMT290000UV06Consultant();
    }

    /**
     * Create an instance of {@link COCTMT030007UVStudent }
     * 
     */
    public COCTMT030007UVStudent createCOCTMT030007UVStudent() {
        return new COCTMT030007UVStudent();
    }

    /**
     * Create an instance of {@link PNExplicit }
     * 
     */
    public PNExplicit createPNExplicit() {
        return new PNExplicit();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Organization }
     * 
     */
    public MCCIMT000200UV01Organization createMCCIMT000200UV01Organization() {
        return new MCCIMT000200UV01Organization();
    }

    /**
     * Create an instance of {@link COCTMT080000UVAdditive }
     * 
     */
    public COCTMT080000UVAdditive createCOCTMT080000UVAdditive() {
        return new COCTMT080000UVAdditive();
    }

    /**
     * Create an instance of {@link COCTMT030202UV01Birthplace }
     * 
     */
    public COCTMT030202UV01Birthplace createCOCTMT030202UV01Birthplace() {
        return new COCTMT030202UV01Birthplace();
    }

    /**
     * Create an instance of {@link COCTMT530000UVPerformer }
     * 
     */
    public COCTMT530000UVPerformer createCOCTMT530000UVPerformer() {
        return new COCTMT530000UVPerformer();
    }

    /**
     * Create an instance of {@link POCDMT000040ServiceEvent }
     * 
     */
    public POCDMT000040ServiceEvent createPOCDMT000040ServiceEvent() {
        return new POCDMT000040ServiceEvent();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01ActDefinition }
     * 
     */
    public MFMIMT700701UV01ActDefinition createMFMIMT700701UV01ActDefinition() {
        return new MFMIMT700701UV01ActDefinition();
    }

    /**
     * Create an instance of {@link COCTMT080000UVPrecondition }
     * 
     */
    public COCTMT080000UVPrecondition createCOCTMT080000UVPrecondition() {
        return new COCTMT080000UVPrecondition();
    }

    /**
     * Create an instance of {@link COCTMT150007UVContactParty }
     * 
     */
    public COCTMT150007UVContactParty createCOCTMT150007UVContactParty() {
        return new COCTMT150007UVContactParty();
    }

    /**
     * Create an instance of {@link COCTMT280000UV04CrossReference }
     * 
     */
    public COCTMT280000UV04CrossReference createCOCTMT280000UV04CrossReference() {
        return new COCTMT280000UV04CrossReference();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01PriorRegisteredAct }
     * 
     */
    public MFMIMT700711UV01PriorRegisteredAct createMFMIMT700711UV01PriorRegisteredAct() {
        return new MFMIMT700711UV01PriorRegisteredAct();
    }

    /**
     * Create an instance of {@link GLISTPQ }
     * 
     */
    public GLISTPQ createGLISTPQ() {
        return new GLISTPQ();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Holder }
     * 
     */
    public COCTMT510000UV06Holder createCOCTMT510000UV06Holder() {
        return new COCTMT510000UV06Holder();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04InFulfillmentOf }
     * 
     */
    public COCTMT300000UV04InFulfillmentOf createCOCTMT300000UV04InFulfillmentOf() {
        return new COCTMT300000UV04InFulfillmentOf();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01ActDefinition }
     * 
     */
    public MFMIMT700711UV01ActDefinition createMFMIMT700711UV01ActDefinition() {
        return new MFMIMT700711UV01ActDefinition();
    }

    /**
     * Create an instance of {@link RespondingGatewayPRPAIN201305UV02SecuredRequestType }
     * 
     */
    public RespondingGatewayPRPAIN201305UV02SecuredRequestType createRespondingGatewayPRPAIN201305UV02SecuredRequestType() {
        return new RespondingGatewayPRPAIN201305UV02SecuredRequestType();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Nation }
     * 
     */
    public PRPAMT201310UV02Nation createPRPAMT201310UV02Nation() {
        return new PRPAMT201310UV02Nation();
    }

    /**
     * Create an instance of {@link POCDMT000040ReferenceRange }
     * 
     */
    public POCDMT000040ReferenceRange createPOCDMT000040ReferenceRange() {
        return new POCDMT000040ReferenceRange();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04AccommodationRequested }
     * 
     */
    public COCTMT310000UV04AccommodationRequested createCOCTMT310000UV04AccommodationRequested() {
        return new COCTMT310000UV04AccommodationRequested();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoveragePolicy }
     * 
     */
    public COCTMT510000UV06CoveragePolicy createCOCTMT510000UV06CoveragePolicy() {
        return new COCTMT510000UV06CoveragePolicy();
    }

    /**
     * Create an instance of {@link COCTMT080000UVHolder }
     * 
     */
    public COCTMT080000UVHolder createCOCTMT080000UVHolder() {
        return new COCTMT080000UVHolder();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Subject5 }
     * 
     */
    public COCTMT290000UV06Subject5 createCOCTMT290000UV06Subject5() {
        return new COCTMT290000UV06Subject5();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Sponsor }
     * 
     */
    public COCTMT510000UV06Sponsor createCOCTMT510000UV06Sponsor() {
        return new COCTMT510000UV06Sponsor();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Reference }
     * 
     */
    public COCTMT510000UV06Reference createCOCTMT510000UV06Reference() {
        return new COCTMT510000UV06Reference();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06FinancialParticipationCharge }
     * 
     */
    public COCTMT510000UV06FinancialParticipationCharge createCOCTMT510000UV06FinancialParticipationCharge() {
        return new COCTMT510000UV06FinancialParticipationCharge();
    }

    /**
     * Create an instance of {@link ADXP }
     * 
     */
    public ADXP createADXP() {
        return new ADXP();
    }

    /**
     * Create an instance of {@link COCTMT230100UVPackagedMedicine }
     * 
     */
    public COCTMT230100UVPackagedMedicine createCOCTMT230100UVPackagedMedicine() {
        return new COCTMT230100UVPackagedMedicine();
    }

    /**
     * Create an instance of {@link COCTMT230100UVMedicineClass }
     * 
     */
    public COCTMT230100UVMedicineClass createCOCTMT230100UVMedicineClass() {
        return new COCTMT230100UVMedicineClass();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04LanguageCommunication }
     * 
     */
    public COCTMT030000UV04LanguageCommunication createCOCTMT030000UV04LanguageCommunication() {
        return new COCTMT030000UV04LanguageCommunication();
    }

    /**
     * Create an instance of {@link AdxpExplicitDeliveryInstallationArea }
     * 
     */
    public AdxpExplicitDeliveryInstallationArea createAdxpExplicitDeliveryInstallationArea() {
        return new AdxpExplicitDeliveryInstallationArea();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01Member }
     * 
     */
    public COCTMT090100UV01Member createCOCTMT090100UV01Member() {
        return new COCTMT090100UV01Member();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01LicensedEntity }
     * 
     */
    public COCTMT090100UV01LicensedEntity createCOCTMT090100UV01LicensedEntity() {
        return new COCTMT090100UV01LicensedEntity();
    }

    /**
     * Create an instance of {@link AdxpExplicitDirection }
     * 
     */
    public AdxpExplicitDirection createAdxpExplicitDirection() {
        return new AdxpExplicitDirection();
    }

    /**
     * Create an instance of {@link COCTMT150000UV02Person }
     * 
     */
    public COCTMT150000UV02Person createCOCTMT150000UV02Person() {
        return new COCTMT150000UV02Person();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01InFulfillmentOf }
     * 
     */
    public MFMIMT700711UV01InFulfillmentOf createMFMIMT700711UV01InFulfillmentOf() {
        return new MFMIMT700711UV01InFulfillmentOf();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PatientStatusCode }
     * 
     */
    public PRPAMT201302UV02PatientStatusCode createPRPAMT201302UV02PatientStatusCode() {
        return new PRPAMT201302UV02PatientStatusCode();
    }

    /**
     * Create an instance of {@link IVLTSExplicit }
     * 
     */
    public IVLTSExplicit createIVLTSExplicit() {
        return new IVLTSExplicit();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PrimaryPerformer }
     * 
     */
    public COCTMT510000UV06PrimaryPerformer createCOCTMT510000UV06PrimaryPerformer() {
        return new COCTMT510000UV06PrimaryPerformer();
    }

    /**
     * Create an instance of {@link COCTMT030207UVPerson }
     * 
     */
    public COCTMT030207UVPerson createCOCTMT030207UVPerson() {
        return new COCTMT030207UVPerson();
    }

    /**
     * Create an instance of {@link COCTMT810000UVPrimaryPerformer }
     * 
     */
    public COCTMT810000UVPrimaryPerformer createCOCTMT810000UVPrimaryPerformer() {
        return new COCTMT810000UVPrimaryPerformer();
    }

    /**
     * Create an instance of {@link PRPAIN201309UV02QUQIMT021001UV01ControlActProcess }
     * 
     */
    public PRPAIN201309UV02QUQIMT021001UV01ControlActProcess createPRPAIN201309UV02QUQIMT021001UV01ControlActProcess() {
        return new PRPAIN201309UV02QUQIMT021001UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PolicyOrProgram }
     * 
     */
    public COCTMT510000UV06PolicyOrProgram createCOCTMT510000UV06PolicyOrProgram() {
        return new COCTMT510000UV06PolicyOrProgram();
    }

    /**
     * Create an instance of {@link COCTMT150007UVPerson }
     * 
     */
    public COCTMT150007UVPerson createCOCTMT150007UVPerson() {
        return new COCTMT150007UVPerson();
    }

    /**
     * Create an instance of {@link POCDMT000040IntendedRecipient }
     * 
     */
    public POCDMT000040IntendedRecipient createPOCDMT000040IntendedRecipient() {
        return new POCDMT000040IntendedRecipient();
    }

    /**
     * Create an instance of {@link ENExplicit }
     * 
     */
    public ENExplicit createENExplicit() {
        return new ENExplicit();
    }

    /**
     * Create an instance of {@link StrucDocThead }
     * 
     */
    public StrucDocThead createStrucDocThead() {
        return new StrucDocThead();
    }

    /**
     * Create an instance of {@link EnExplicitSuffix }
     * 
     */
    public EnExplicitSuffix createEnExplicitSuffix() {
        return new EnExplicitSuffix();
    }

    /**
     * Create an instance of {@link POCDMT000040HealthCareFacility }
     * 
     */
    public POCDMT000040HealthCareFacility createPOCDMT000040HealthCareFacility() {
        return new POCDMT000040HealthCareFacility();
    }

    /**
     * Create an instance of {@link ThumbnailExplicit }
     * 
     */
    public ThumbnailExplicit createThumbnailExplicit() {
        return new ThumbnailExplicit();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Position }
     * 
     */
    public COCTMT960000UV05Position createCOCTMT960000UV05Position() {
        return new COCTMT960000UV05Position();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Subject3 }
     * 
     */
    public COCTMT510000UV06Subject3 createCOCTMT510000UV06Subject3() {
        return new COCTMT510000UV06Subject3();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06ReplacementOf }
     * 
     */
    public COCTMT510000UV06ReplacementOf createCOCTMT510000UV06ReplacementOf() {
        return new COCTMT510000UV06ReplacementOf();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02NonPersonLivingSubject }
     * 
     */
    public PRPAMT201310UV02NonPersonLivingSubject createPRPAMT201310UV02NonPersonLivingSubject() {
        return new PRPAMT201310UV02NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link Create201302RequestType }
     * 
     */
    public Create201302RequestType createCreate201302RequestType() {
        return new Create201302RequestType();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01AttentionLine }
     * 
     */
    public MCCIMT000300UV01AttentionLine createMCCIMT000300UV01AttentionLine() {
        return new MCCIMT000300UV01AttentionLine();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Device }
     * 
     */
    public MCCIMT000200UV01Device createMCCIMT000200UV01Device() {
        return new MCCIMT000200UV01Device();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04AccomodationSupplied }
     * 
     */
    public COCTMT310000UV04AccomodationSupplied createCOCTMT310000UV04AccomodationSupplied() {
        return new COCTMT310000UV04AccomodationSupplied();
    }

    /**
     * Create an instance of {@link POCDMT000040Criterion }
     * 
     */
    public POCDMT000040Criterion createPOCDMT000040Criterion() {
        return new POCDMT000040Criterion();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Patient }
     * 
     */
    public PRPAMT201310UV02Patient createPRPAMT201310UV02Patient() {
        return new PRPAMT201310UV02Patient();
    }

    /**
     * Create an instance of {@link POCDMT000040Consumable }
     * 
     */
    public POCDMT000040Consumable createPOCDMT000040Consumable() {
        return new POCDMT000040Consumable();
    }

    /**
     * Create an instance of {@link PIXConsumerPRPAIN201304UVRequestType }
     * 
     */
    public PIXConsumerPRPAIN201304UVRequestType createPIXConsumerPRPAIN201304UVRequestType() {
        return new PIXConsumerPRPAIN201304UVRequestType();
    }

    /**
     * Create an instance of {@link COCTMT080000UVManufactured }
     * 
     */
    public COCTMT080000UVManufactured createCOCTMT080000UVManufactured() {
        return new COCTMT080000UVManufactured();
    }

    /**
     * Create an instance of {@link POCDMT000040Component4 }
     * 
     */
    public POCDMT000040Component4 createPOCDMT000040Component4() {
        return new POCDMT000040Component4();
    }

    /**
     * Create an instance of {@link AdxpExplicitCareOf }
     * 
     */
    public AdxpExplicitCareOf createAdxpExplicitCareOf() {
        return new AdxpExplicitCareOf();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01LicensedEntity }
     * 
     */
    public COCTMT090000UV01LicensedEntity createCOCTMT090000UV01LicensedEntity() {
        return new COCTMT090000UV01LicensedEntity();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Subject4 }
     * 
     */
    public PRPAMT201302UV02Subject4 createPRPAMT201302UV02Subject4() {
        return new PRPAMT201302UV02Subject4();
    }

    /**
     * Create an instance of {@link BXITCD }
     * 
     */
    public BXITCD createBXITCD() {
        return new BXITCD();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06IndirectAuthorithyOver2 }
     * 
     */
    public COCTMT510000UV06IndirectAuthorithyOver2 createCOCTMT510000UV06IndirectAuthorithyOver2() {
        return new COCTMT510000UV06IndirectAuthorithyOver2();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02MFMIMT700701UV01Subject1 }
     * 
     */
    public PRPAIN201304UV02MFMIMT700701UV01Subject1 createPRPAIN201304UV02MFMIMT700701UV01Subject1() {
        return new PRPAIN201304UV02MFMIMT700701UV01Subject1();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Custodian }
     * 
     */
    public MFMIMT700701UV01Custodian createMFMIMT700701UV01Custodian() {
        return new MFMIMT700701UV01Custodian();
    }

    /**
     * Create an instance of {@link COCTMT230100UVDistributedProduct }
     * 
     */
    public COCTMT230100UVDistributedProduct createCOCTMT230100UVDistributedProduct() {
        return new COCTMT230100UVDistributedProduct();
    }

    /**
     * Create an instance of {@link AdxpExplicitDelimiter }
     * 
     */
    public AdxpExplicitDelimiter createAdxpExplicitDelimiter() {
        return new AdxpExplicitDelimiter();
    }

    /**
     * Create an instance of {@link POCDMT000040SubjectPerson }
     * 
     */
    public POCDMT000040SubjectPerson createPOCDMT000040SubjectPerson() {
        return new POCDMT000040SubjectPerson();
    }

    /**
     * Create an instance of {@link COCTMT080000UVSubject3 }
     * 
     */
    public COCTMT080000UVSubject3 createCOCTMT080000UVSubject3() {
        return new COCTMT080000UVSubject3();
    }

    /**
     * Create an instance of {@link AdxpCensusTract }
     * 
     */
    public AdxpCensusTract createAdxpCensusTract() {
        return new AdxpCensusTract();
    }

    /**
     * Create an instance of {@link COCTMT090003UV01Device }
     * 
     */
    public COCTMT090003UV01Device createCOCTMT090003UV01Device() {
        return new COCTMT090003UV01Device();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01ReplacementOf }
     * 
     */
    public MFMIMT700701UV01ReplacementOf createMFMIMT700701UV01ReplacementOf() {
        return new MFMIMT700701UV01ReplacementOf();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ManufacturedProductOrganization }
     * 
     */
    public COCTMT290000UV06ManufacturedProductOrganization createCOCTMT290000UV06ManufacturedProductOrganization() {
        return new COCTMT290000UV06ManufacturedProductOrganization();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject25 }
     * 
     */
    public COCTMT230100UVSubject25 createCOCTMT230100UVSubject25() {
        return new COCTMT230100UVSubject25();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06VisionPrescriptionObservationEvent }
     * 
     */
    public COCTMT600000UV06VisionPrescriptionObservationEvent createCOCTMT600000UV06VisionPrescriptionObservationEvent() {
        return new COCTMT600000UV06VisionPrescriptionObservationEvent();
    }

    /**
     * Create an instance of {@link PIXConsumerPRPAIN201310UVSecuredRequestType }
     * 
     */
    public PIXConsumerPRPAIN201310UVSecuredRequestType createPIXConsumerPRPAIN201310UVSecuredRequestType() {
        return new PIXConsumerPRPAIN201310UVSecuredRequestType();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01Group }
     * 
     */
    public COCTMT090000UV01Group createCOCTMT090000UV01Group() {
        return new COCTMT090000UV01Group();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01RoleOther }
     * 
     */
    public COCTMT090300UV01RoleOther createCOCTMT090300UV01RoleOther() {
        return new COCTMT090300UV01RoleOther();
    }

    /**
     * Create an instance of {@link PQ }
     * 
     */
    public PQ createPQ() {
        return new PQ();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Subject }
     * 
     */
    public COCTMT290000UV06Subject createCOCTMT290000UV06Subject() {
        return new COCTMT290000UV06Subject();
    }

    /**
     * Create an instance of {@link COCTMT230100UVMedicineManufacturer }
     * 
     */
    public COCTMT230100UVMedicineManufacturer createCOCTMT230100UVMedicineManufacturer() {
        return new COCTMT230100UVMedicineManufacturer();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01Sender }
     * 
     */
    public MCCIMT000100UV01Sender createMCCIMT000100UV01Sender() {
        return new MCCIMT000100UV01Sender();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Subject3 }
     * 
     */
    public COCTMT290000UV06Subject3 createCOCTMT290000UV06Subject3() {
        return new COCTMT290000UV06Subject3();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Diagnosis }
     * 
     */
    public COCTMT490000UV04Diagnosis createCOCTMT490000UV04Diagnosis() {
        return new COCTMT490000UV04Diagnosis();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04Citizen }
     * 
     */
    public COCTMT030000UV04Citizen createCOCTMT030000UV04Citizen() {
        return new COCTMT030000UV04Citizen();
    }

    /**
     * Create an instance of {@link POCDMT000040Birthplace }
     * 
     */
    public POCDMT000040Birthplace createPOCDMT000040Birthplace() {
        return new POCDMT000040Birthplace();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ProviderPerson }
     * 
     */
    public COCTMT290000UV06ProviderPerson createCOCTMT290000UV06ProviderPerson() {
        return new COCTMT290000UV06ProviderPerson();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Patient }
     * 
     */
    public PRPAMT201303UV02Patient createPRPAMT201303UV02Patient() {
        return new PRPAMT201303UV02Patient();
    }

    /**
     * Create an instance of {@link StrucDocCol }
     * 
     */
    public StrucDocCol createStrucDocCol() {
        return new StrucDocCol();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02LanguageCommunication }
     * 
     */
    public PRPAMT201303UV02LanguageCommunication createPRPAMT201303UV02LanguageCommunication() {
        return new PRPAMT201303UV02LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT530000UVAuthor }
     * 
     */
    public COCTMT530000UVAuthor createCOCTMT530000UVAuthor() {
        return new COCTMT530000UVAuthor();
    }

    /**
     * Create an instance of {@link COCTMT260003UVAuthor }
     * 
     */
    public COCTMT260003UVAuthor createCOCTMT260003UVAuthor() {
        return new COCTMT260003UVAuthor();
    }

    /**
     * Create an instance of {@link SXCMTSExplicit }
     * 
     */
    public SXCMTSExplicit createSXCMTSExplicit() {
        return new SXCMTSExplicit();
    }

    /**
     * Create an instance of {@link RespondingGatewayPRPAIN201305UV02RequestType }
     * 
     */
    public RespondingGatewayPRPAIN201305UV02RequestType createRespondingGatewayPRPAIN201305UV02RequestType() {
        return new RespondingGatewayPRPAIN201305UV02RequestType();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject4 }
     * 
     */
    public COCTMT230100UVSubject4 createCOCTMT230100UVSubject4() {
        return new COCTMT230100UVSubject4();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01Device }
     * 
     */
    public COCTMT090300UV01Device createCOCTMT090300UV01Device() {
        return new COCTMT090300UV01Device();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Transportation }
     * 
     */
    public COCTMT060000UV01Transportation createCOCTMT060000UV01Transportation() {
        return new COCTMT060000UV01Transportation();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Consultant }
     * 
     */
    public COCTMT490000UV04Consultant createCOCTMT490000UV04Consultant() {
        return new COCTMT490000UV04Consultant();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04AccommodationRequestorRole }
     * 
     */
    public COCTMT310000UV04AccommodationRequestorRole createCOCTMT310000UV04AccommodationRequestorRole() {
        return new COCTMT310000UV04AccommodationRequestorRole();
    }

    /**
     * Create an instance of {@link COCTMT080000UVAdditiveMaterial }
     * 
     */
    public COCTMT080000UVAdditiveMaterial createCOCTMT080000UVAdditiveMaterial() {
        return new COCTMT080000UVAdditiveMaterial();
    }

    /**
     * Create an instance of {@link PRPAIN201302UV02MFMIMT700701UV01RegistrationEvent }
     * 
     */
    public PRPAIN201302UV02MFMIMT700701UV01RegistrationEvent createPRPAIN201302UV02MFMIMT700701UV01RegistrationEvent() {
        return new PRPAIN201302UV02MFMIMT700701UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06PertinentInformation }
     * 
     */
    public COCTMT600000UV06PertinentInformation createCOCTMT600000UV06PertinentInformation() {
        return new COCTMT600000UV06PertinentInformation();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject14 }
     * 
     */
    public COCTMT230100UVSubject14 createCOCTMT230100UVSubject14() {
        return new COCTMT230100UVSubject14();
    }

    /**
     * Create an instance of {@link Create201310RequestType }
     * 
     */
    public Create201310RequestType createCreate201310RequestType() {
        return new Create201310RequestType();
    }

    /**
     * Create an instance of {@link COCTMT530000UVDevice }
     * 
     */
    public COCTMT530000UVDevice createCOCTMT530000UVDevice() {
        return new COCTMT530000UVDevice();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01DetectedIssueEvent }
     * 
     */
    public MCAIMT900001UV01DetectedIssueEvent createMCAIMT900001UV01DetectedIssueEvent() {
        return new MCAIMT900001UV01DetectedIssueEvent();
    }

    /**
     * Create an instance of {@link POCDMT000040ParticipantRole }
     * 
     */
    public POCDMT000040ParticipantRole createPOCDMT000040ParticipantRole() {
        return new POCDMT000040ParticipantRole();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PatientPatientNonPersonLivingSubject }
     * 
     */
    public PRPAMT201302UV02PatientPatientNonPersonLivingSubject createPRPAMT201302UV02PatientPatientNonPersonLivingSubject() {
        return new PRPAMT201302UV02PatientPatientNonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02PatientAddress }
     * 
     */
    public PRPAMT201306UV02PatientAddress createPRPAMT201306UV02PatientAddress() {
        return new PRPAMT201306UV02PatientAddress();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Member }
     * 
     */
    public PRPAMT201301UV02Member createPRPAMT201301UV02Member() {
        return new PRPAMT201301UV02Member();
    }

    /**
     * Create an instance of {@link COCTMT090003UV01AssignedEntity }
     * 
     */
    public COCTMT090003UV01AssignedEntity createCOCTMT090003UV01AssignedEntity() {
        return new COCTMT090003UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link COCTMT240003UV02ServiceDeliveryLocation }
     * 
     */
    public COCTMT240003UV02ServiceDeliveryLocation createCOCTMT240003UV02ServiceDeliveryLocation() {
        return new COCTMT240003UV02ServiceDeliveryLocation();
    }

    /**
     * Create an instance of {@link COCTMT090108UVPerson }
     * 
     */
    public COCTMT090108UVPerson createCOCTMT090108UVPerson() {
        return new COCTMT090108UVPerson();
    }

    /**
     * Create an instance of {@link COCTMT080000UVProcessStep }
     * 
     */
    public COCTMT080000UVProcessStep createCOCTMT080000UVProcessStep() {
        return new COCTMT080000UVProcessStep();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Product }
     * 
     */
    public COCTMT300000UV04Product createCOCTMT300000UV04Product() {
        return new COCTMT300000UV04Product();
    }

    /**
     * Create an instance of {@link COCTMT080000UVPerson }
     * 
     */
    public COCTMT080000UVPerson createCOCTMT080000UVPerson() {
        return new COCTMT080000UVPerson();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Subject4 }
     * 
     */
    public PRPAMT201310UV02Subject4 createPRPAMT201310UV02Subject4() {
        return new PRPAMT201310UV02Subject4();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Subject }
     * 
     */
    public COCTMT300000UV04Subject createCOCTMT300000UV04Subject() {
        return new COCTMT300000UV04Subject();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Subject2 }
     * 
     */
    public PRPAMT201310UV02Subject2 createPRPAMT201310UV02Subject2() {
        return new PRPAMT201310UV02Subject2();
    }

    /**
     * Create an instance of {@link AdxpDeliveryAddressLine }
     * 
     */
    public AdxpDeliveryAddressLine createAdxpDeliveryAddressLine() {
        return new AdxpDeliveryAddressLine();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Citizen }
     * 
     */
    public PRPAMT201302UV02Citizen createPRPAMT201302UV02Citizen() {
        return new PRPAMT201302UV02Citizen();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04ManufacturedProduct }
     * 
     */
    public COCTMT490000UV04ManufacturedProduct createCOCTMT490000UV04ManufacturedProduct() {
        return new COCTMT490000UV04ManufacturedProduct();
    }

    /**
     * Create an instance of {@link POCDMT000040Component2 }
     * 
     */
    public POCDMT000040Component2 createPOCDMT000040Component2() {
        return new POCDMT000040Component2();
    }

    /**
     * Create an instance of {@link COCTMT530000UVProduct2 }
     * 
     */
    public COCTMT530000UVProduct2 createCOCTMT530000UVProduct2() {
        return new COCTMT530000UVProduct2();
    }

    /**
     * Create an instance of {@link COCTMT260003UVManagement }
     * 
     */
    public COCTMT260003UVManagement createCOCTMT260003UVManagement() {
        return new COCTMT260003UVManagement();
    }

    /**
     * Create an instance of {@link POCDMT000040MaintainedEntity }
     * 
     */
    public POCDMT000040MaintainedEntity createPOCDMT000040MaintainedEntity() {
        return new POCDMT000040MaintainedEntity();
    }

    /**
     * Create an instance of {@link StrucDocFootnote }
     * 
     */
    public StrucDocFootnote createStrucDocFootnote() {
        return new StrucDocFootnote();
    }

    /**
     * Create an instance of {@link IVLPPDPQ }
     * 
     */
    public IVLPPDPQ createIVLPPDPQ() {
        return new IVLPPDPQ();
    }

    /**
     * Create an instance of {@link IVXBPQ }
     * 
     */
    public IVXBPQ createIVXBPQ() {
        return new IVXBPQ();
    }

    /**
     * Create an instance of {@link COCTMT230100UVApproval }
     * 
     */
    public COCTMT230100UVApproval createCOCTMT230100UVApproval() {
        return new COCTMT230100UVApproval();
    }

    /**
     * Create an instance of {@link StrucDocTitleContent }
     * 
     */
    public StrucDocTitleContent createStrucDocTitleContent() {
        return new StrucDocTitleContent();
    }

    /**
     * Create an instance of {@link PQExplicit }
     * 
     */
    public PQExplicit createPQExplicit() {
        return new PQExplicit();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Device }
     * 
     */
    public COCTMT290000UV06Device createCOCTMT290000UV06Device() {
        return new COCTMT290000UV06Device();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02MFMIMT700711UV01ControlActProcess }
     * 
     */
    public PRPAIN201306UV02MFMIMT700711UV01ControlActProcess createPRPAIN201306UV02MFMIMT700711UV01ControlActProcess() {
        return new PRPAIN201306UV02MFMIMT700711UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link POCDMT000040LegalAuthenticator }
     * 
     */
    public POCDMT000040LegalAuthenticator createPOCDMT000040LegalAuthenticator() {
        return new POCDMT000040LegalAuthenticator();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05PositionAccuracy }
     * 
     */
    public COCTMT960000UV05PositionAccuracy createCOCTMT960000UV05PositionAccuracy() {
        return new COCTMT960000UV05PositionAccuracy();
    }

    /**
     * Create an instance of {@link AdxpExplicitDeliveryAddressLine }
     * 
     */
    public AdxpExplicitDeliveryAddressLine createAdxpExplicitDeliveryAddressLine() {
        return new AdxpExplicitDeliveryAddressLine();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Group }
     * 
     */
    public PRPAMT201304UV02Group createPRPAMT201304UV02Group() {
        return new PRPAMT201304UV02Group();
    }

    /**
     * Create an instance of {@link POCDMT000040Location }
     * 
     */
    public POCDMT000040Location createPOCDMT000040Location() {
        return new POCDMT000040Location();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01InFulfillmentOf }
     * 
     */
    public MFMIMT700701UV01InFulfillmentOf createMFMIMT700701UV01InFulfillmentOf() {
        return new MFMIMT700701UV01InFulfillmentOf();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02CareGiverId }
     * 
     */
    public PRPAMT201302UV02CareGiverId createPRPAMT201302UV02CareGiverId() {
        return new PRPAMT201302UV02CareGiverId();
    }

    /**
     * Create an instance of {@link POCDMT000040Component1 }
     * 
     */
    public POCDMT000040Component1 createPOCDMT000040Component1() {
        return new POCDMT000040Component1();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06IndirectAuthorithyOver }
     * 
     */
    public COCTMT290000UV06IndirectAuthorithyOver createCOCTMT290000UV06IndirectAuthorithyOver() {
        return new COCTMT290000UV06IndirectAuthorithyOver();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04OralHealthService }
     * 
     */
    public COCTMT740000UV04OralHealthService createCOCTMT740000UV04OralHealthService() {
        return new COCTMT740000UV04OralHealthService();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Subject3 }
     * 
     */
    public PRPAMT201303UV02Subject3 createPRPAMT201303UV02Subject3() {
        return new PRPAMT201303UV02Subject3();
    }

    /**
     * Create an instance of {@link COCTMT810000UVVerificationRequest }
     * 
     */
    public COCTMT810000UVVerificationRequest createCOCTMT810000UVVerificationRequest() {
        return new COCTMT810000UVVerificationRequest();
    }

    /**
     * Create an instance of {@link UVPTS }
     * 
     */
    public UVPTS createUVPTS() {
        return new UVPTS();
    }

    /**
     * Create an instance of {@link SLISTTS }
     * 
     */
    public SLISTTS createSLISTTS() {
        return new SLISTTS();
    }

    /**
     * Create an instance of {@link COCTMT230100UVContent }
     * 
     */
    public COCTMT230100UVContent createCOCTMT230100UVContent() {
        return new COCTMT230100UVContent();
    }

    /**
     * Create an instance of {@link COCTMT530000UVPerson }
     * 
     */
    public COCTMT530000UVPerson createCOCTMT530000UVPerson() {
        return new COCTMT530000UVPerson();
    }

    /**
     * Create an instance of {@link AdxpExplicitBuildingNumberSuffix }
     * 
     */
    public AdxpExplicitBuildingNumberSuffix createAdxpExplicitBuildingNumberSuffix() {
        return new AdxpExplicitBuildingNumberSuffix();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Performer2 }
     * 
     */
    public COCTMT300000UV04Performer2 createCOCTMT300000UV04Performer2() {
        return new COCTMT300000UV04Performer2();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01Subject }
     * 
     */
    public MCAIMT900001UV01Subject createMCAIMT900001UV01Subject() {
        return new MCAIMT900001UV01Subject();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Destination }
     * 
     */
    public COCTMT490000UV04Destination createCOCTMT490000UV04Destination() {
        return new COCTMT490000UV04Destination();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Member }
     * 
     */
    public PRPAMT201302UV02Member createPRPAMT201302UV02Member() {
        return new PRPAMT201302UV02Member();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Origin }
     * 
     */
    public COCTMT290000UV06Origin createCOCTMT290000UV06Origin() {
        return new COCTMT290000UV06Origin();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Device2 }
     * 
     */
    public COCTMT960000UV05Device2 createCOCTMT960000UV05Device2() {
        return new COCTMT960000UV05Device2();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06PatientCareProvisionRequest }
     * 
     */
    public COCTMT290000UV06PatientCareProvisionRequest createCOCTMT290000UV06PatientCareProvisionRequest() {
        return new COCTMT290000UV06PatientCareProvisionRequest();
    }

    /**
     * Create an instance of {@link COCTMT530000UVManufacturedProduct }
     * 
     */
    public COCTMT530000UVManufacturedProduct createCOCTMT530000UVManufacturedProduct() {
        return new COCTMT530000UVManufacturedProduct();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Member }
     * 
     */
    public PRPAMT201304UV02Member createPRPAMT201304UV02Member() {
        return new PRPAMT201304UV02Member();
    }

    /**
     * Create an instance of {@link AdxpUnitType }
     * 
     */
    public AdxpUnitType createAdxpUnitType() {
        return new AdxpUnitType();
    }

    /**
     * Create an instance of {@link COCTMT230100UVManufacturedProduct }
     * 
     */
    public COCTMT230100UVManufacturedProduct createCOCTMT230100UVManufacturedProduct() {
        return new COCTMT230100UVManufacturedProduct();
    }

    /**
     * Create an instance of {@link COCTMT530000UVMaterialKind }
     * 
     */
    public COCTMT530000UVMaterialKind createCOCTMT530000UVMaterialKind() {
        return new COCTMT530000UVMaterialKind();
    }

    /**
     * Create an instance of {@link POCDMT000040InformationRecipient }
     * 
     */
    public POCDMT000040InformationRecipient createPOCDMT000040InformationRecipient() {
        return new POCDMT000040InformationRecipient();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Component }
     * 
     */
    public COCTMT510000UV06Component createCOCTMT510000UV06Component() {
        return new COCTMT510000UV06Component();
    }

    /**
     * Create an instance of {@link ST }
     * 
     */
    public ST createST() {
        return new ST();
    }

    /**
     * Create an instance of {@link StrucDocContent }
     * 
     */
    public StrucDocContent createStrucDocContent() {
        return new StrucDocContent();
    }

    /**
     * Create an instance of {@link COCTMT080000UVSubject1 }
     * 
     */
    public COCTMT080000UVSubject1 createCOCTMT080000UVSubject1() {
        return new COCTMT080000UVSubject1();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06InFulfillmentOf }
     * 
     */
    public COCTMT600000UV06InFulfillmentOf createCOCTMT600000UV06InFulfillmentOf() {
        return new COCTMT600000UV06InFulfillmentOf();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06DirectAuthorityOver2 }
     * 
     */
    public COCTMT510000UV06DirectAuthorityOver2 createCOCTMT510000UV06DirectAuthorityOver2() {
        return new COCTMT510000UV06DirectAuthorityOver2();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01TargetMessage }
     * 
     */
    public MCCIMT000200UV01TargetMessage createMCCIMT000200UV01TargetMessage() {
        return new MCCIMT000200UV01TargetMessage();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02BirthPlace }
     * 
     */
    public PRPAMT201310UV02BirthPlace createPRPAMT201310UV02BirthPlace() {
        return new PRPAMT201310UV02BirthPlace();
    }

    /**
     * Create an instance of {@link COCTMT080000UVAuthorOrPerformer }
     * 
     */
    public COCTMT080000UVAuthorOrPerformer createCOCTMT080000UVAuthorOrPerformer() {
        return new COCTMT080000UVAuthorOrPerformer();
    }

    /**
     * Create an instance of {@link CV }
     * 
     */
    public CV createCV() {
        return new CV();
    }

    /**
     * Create an instance of {@link COCTMT080000UVIdentifiedHolder }
     * 
     */
    public COCTMT080000UVIdentifiedHolder createCOCTMT080000UVIdentifiedHolder() {
        return new COCTMT080000UVIdentifiedHolder();
    }

    /**
     * Create an instance of {@link AdxpPostalCode }
     * 
     */
    public AdxpPostalCode createAdxpPostalCode() {
        return new AdxpPostalCode();
    }

    /**
     * Create an instance of {@link StrucDocRenderMultiMedia }
     * 
     */
    public StrucDocRenderMultiMedia createStrucDocRenderMultiMedia() {
        return new StrucDocRenderMultiMedia();
    }

    /**
     * Create an instance of {@link POCDMT000040Material }
     * 
     */
    public POCDMT000040Material createPOCDMT000040Material() {
        return new POCDMT000040Material();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectName }
     * 
     */
    public PRPAMT201306UV02LivingSubjectName createPRPAMT201306UV02LivingSubjectName() {
        return new PRPAMT201306UV02LivingSubjectName();
    }

    /**
     * Create an instance of {@link COCTMT260003UVPharmacy }
     * 
     */
    public COCTMT260003UVPharmacy createCOCTMT260003UVPharmacy() {
        return new COCTMT260003UVPharmacy();
    }

    /**
     * Create an instance of {@link IVLREAL }
     * 
     */
    public IVLREAL createIVLREAL() {
        return new IVLREAL();
    }

    /**
     * Create an instance of {@link COCTMT260003UVManufacturedProduct }
     * 
     */
    public COCTMT260003UVManufacturedProduct createCOCTMT260003UVManufacturedProduct() {
        return new COCTMT260003UVManufacturedProduct();
    }

    /**
     * Create an instance of {@link POCDMT000040OrganizationPartOf }
     * 
     */
    public POCDMT000040OrganizationPartOf createPOCDMT000040OrganizationPartOf() {
        return new POCDMT000040OrganizationPartOf();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Benefit }
     * 
     */
    public COCTMT510000UV06Benefit createCOCTMT510000UV06Benefit() {
        return new COCTMT510000UV06Benefit();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01TargetMessage }
     * 
     */
    public MCCIMT000300UV01TargetMessage createMCCIMT000300UV01TargetMessage() {
        return new MCCIMT000300UV01TargetMessage();
    }

    /**
     * Create an instance of {@link COCTMT530000UVProduct1 }
     * 
     */
    public COCTMT530000UVProduct1 createCOCTMT530000UVProduct1() {
        return new COCTMT530000UVProduct1();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01InformationRecipient }
     * 
     */
    public MFMIMT700711UV01InformationRecipient createMFMIMT700711UV01InformationRecipient() {
        return new MFMIMT700711UV01InformationRecipient();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Citizen }
     * 
     */
    public PRPAMT201304UV02Citizen createPRPAMT201304UV02Citizen() {
        return new PRPAMT201304UV02Citizen();
    }

    /**
     * Create an instance of {@link PRPAIN201305UV02MCCIMT000100UV01Message }
     * 
     */
    public PRPAIN201305UV02MCCIMT000100UV01Message createPRPAIN201305UV02MCCIMT000100UV01Message() {
        return new PRPAIN201305UV02MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02OtherIDsId }
     * 
     */
    public PRPAMT201302UV02OtherIDsId createPRPAMT201302UV02OtherIDsId() {
        return new PRPAMT201302UV02OtherIDsId();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject1 }
     * 
     */
    public COCTMT230100UVSubject1 createCOCTMT230100UVSubject1() {
        return new COCTMT230100UVSubject1();
    }

    /**
     * Create an instance of {@link COCTMT080000UVIdentifiedContainer }
     * 
     */
    public COCTMT080000UVIdentifiedContainer createCOCTMT080000UVIdentifiedContainer() {
        return new COCTMT080000UVIdentifiedContainer();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Definition }
     * 
     */
    public COCTMT510000UV06Definition createCOCTMT510000UV06Definition() {
        return new COCTMT510000UV06Definition();
    }

    /**
     * Create an instance of {@link StrucDocTbody }
     * 
     */
    public StrucDocTbody createStrucDocTbody() {
        return new StrucDocTbody();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Author2 }
     * 
     */
    public COCTMT510000UV06Author2 createCOCTMT510000UV06Author2() {
        return new COCTMT510000UV06Author2();
    }

    /**
     * Create an instance of {@link TS }
     * 
     */
    public TS createTS() {
        return new TS();
    }

    /**
     * Create an instance of {@link POCDMT000040SubstanceAdministration }
     * 
     */
    public POCDMT000040SubstanceAdministration createPOCDMT000040SubstanceAdministration() {
        return new POCDMT000040SubstanceAdministration();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06HealthCareProvider }
     * 
     */
    public COCTMT600000UV06HealthCareProvider createCOCTMT600000UV06HealthCareProvider() {
        return new COCTMT600000UV06HealthCareProvider();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PersonId }
     * 
     */
    public PRPAMT201302UV02PersonId createPRPAMT201302UV02PersonId() {
        return new PRPAMT201302UV02PersonId();
    }

    /**
     * Create an instance of {@link COCTMT710000UV01LocatedEntityHasParts }
     * 
     */
    public COCTMT710000UV01LocatedEntityHasParts createCOCTMT710000UV01LocatedEntityHasParts() {
        return new COCTMT710000UV01LocatedEntityHasParts();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Origin }
     * 
     */
    public COCTMT490000UV04Origin createCOCTMT490000UV04Origin() {
        return new COCTMT490000UV04Origin();
    }

    /**
     * Create an instance of {@link COCTMT080000UVContent1 }
     * 
     */
    public COCTMT080000UVContent1 createCOCTMT080000UVContent1() {
        return new COCTMT080000UVContent1();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01AcknowledgementDetail }
     * 
     */
    public MCCIMT000300UV01AcknowledgementDetail createMCCIMT000300UV01AcknowledgementDetail() {
        return new MCCIMT000300UV01AcknowledgementDetail();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Citizen }
     * 
     */
    public PRPAMT201301UV02Citizen createPRPAMT201301UV02Citizen() {
        return new PRPAMT201301UV02Citizen();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubContent }
     * 
     */
    public COCTMT230100UVSubContent createCOCTMT230100UVSubContent() {
        return new COCTMT230100UVSubContent();
    }

    /**
     * Create an instance of {@link COCTMT530000UVReferenceRange }
     * 
     */
    public COCTMT530000UVReferenceRange createCOCTMT530000UVReferenceRange() {
        return new COCTMT530000UVReferenceRange();
    }

    /**
     * Create an instance of {@link COCTMT150002UV01Organization }
     * 
     */
    public COCTMT150002UV01Organization createCOCTMT150002UV01Organization() {
        return new COCTMT150002UV01Organization();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04GuarantorOrganization }
     * 
     */
    public COCTMT670000UV04GuarantorOrganization createCOCTMT670000UV04GuarantorOrganization() {
        return new COCTMT670000UV04GuarantorOrganization();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06PertinentInformation1 }
     * 
     */
    public COCTMT600000UV06PertinentInformation1 createCOCTMT600000UV06PertinentInformation1() {
        return new COCTMT600000UV06PertinentInformation1();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02MFMIMT700701UV01RegistrationEvent }
     * 
     */
    public PRPAIN201304UV02MFMIMT700701UV01RegistrationEvent createPRPAIN201304UV02MFMIMT700701UV01RegistrationEvent() {
        return new PRPAIN201304UV02MFMIMT700701UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link COCTMT530000UVPrecondition2 }
     * 
     */
    public COCTMT530000UVPrecondition2 createCOCTMT530000UVPrecondition2() {
        return new COCTMT530000UVPrecondition2();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02MemberId }
     * 
     */
    public PRPAMT201302UV02MemberId createPRPAMT201302UV02MemberId() {
        return new PRPAMT201302UV02MemberId();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02SortControl }
     * 
     */
    public PRPAMT201306UV02SortControl createPRPAMT201306UV02SortControl() {
        return new PRPAMT201306UV02SortControl();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04Employment }
     * 
     */
    public COCTMT030000UV04Employment createCOCTMT030000UV04Employment() {
        return new COCTMT030000UV04Employment();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Receiver }
     * 
     */
    public MCCIMT000300UV01Receiver createMCCIMT000300UV01Receiver() {
        return new MCCIMT000300UV01Receiver();
    }

    /**
     * Create an instance of {@link COCTMT530000UVConditions }
     * 
     */
    public COCTMT530000UVConditions createCOCTMT530000UVConditions() {
        return new COCTMT530000UVConditions();
    }

    /**
     * Create an instance of {@link PQRExplicit }
     * 
     */
    public PQRExplicit createPQRExplicit() {
        return new PQRExplicit();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06PertinentInformation2 }
     * 
     */
    public COCTMT600000UV06PertinentInformation2 createCOCTMT600000UV06PertinentInformation2() {
        return new COCTMT600000UV06PertinentInformation2();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04PolicyOrAccount }
     * 
     */
    public COCTMT500000UV04PolicyOrAccount createCOCTMT500000UV04PolicyOrAccount() {
        return new COCTMT500000UV04PolicyOrAccount();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04GuarantorRole }
     * 
     */
    public COCTMT670000UV04GuarantorRole createCOCTMT670000UV04GuarantorRole() {
        return new COCTMT670000UV04GuarantorRole();
    }

    /**
     * Create an instance of {@link AdxpExplicitHouseNumber }
     * 
     */
    public AdxpExplicitHouseNumber createAdxpExplicitHouseNumber() {
        return new AdxpExplicitHouseNumber();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Performer }
     * 
     */
    public COCTMT060000UV01Performer createCOCTMT060000UV01Performer() {
        return new COCTMT060000UV01Performer();
    }

    /**
     * Create an instance of {@link PRPAIN201302UV02MFMIMT700701UV01Subject2 }
     * 
     */
    public PRPAIN201302UV02MFMIMT700701UV01Subject2 createPRPAIN201302UV02MFMIMT700701UV01Subject2() {
        return new PRPAIN201302UV02MFMIMT700701UV01Subject2();
    }

    /**
     * Create an instance of {@link POCDMT000040Person }
     * 
     */
    public POCDMT000040Person createPOCDMT000040Person() {
        return new POCDMT000040Person();
    }

    /**
     * Create an instance of {@link AD }
     * 
     */
    public AD createAD() {
        return new AD();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02MFMIMT700711UV01Subject1 }
     * 
     */
    public PRPAIN201306UV02MFMIMT700711UV01Subject1 createPRPAIN201306UV02MFMIMT700711UV01Subject1() {
        return new PRPAIN201306UV02MFMIMT700711UV01Subject1();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01LocatedEntity }
     * 
     */
    public MCCIMT000100UV01LocatedEntity createMCCIMT000100UV01LocatedEntity() {
        return new MCCIMT000100UV01LocatedEntity();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Performer1 }
     * 
     */
    public COCTMT300000UV04Performer1 createCOCTMT300000UV04Performer1() {
        return new COCTMT300000UV04Performer1();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Precondition }
     * 
     */
    public COCTMT510000UV06Precondition createCOCTMT510000UV06Precondition() {
        return new COCTMT510000UV06Precondition();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Definition }
     * 
     */
    public MFMIMT700711UV01Definition createMFMIMT700711UV01Definition() {
        return new MFMIMT700711UV01Definition();
    }

    /**
     * Create an instance of {@link COCTMT080000UVContainer }
     * 
     */
    public COCTMT080000UVContainer createCOCTMT080000UVContainer() {
        return new COCTMT080000UVContainer();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSubject2 }
     * 
     */
    public COCTMT530000UVSubject2 createCOCTMT530000UVSubject2() {
        return new COCTMT530000UVSubject2();
    }

    /**
     * Create an instance of {@link StrucDocTh }
     * 
     */
    public StrucDocTh createStrucDocTh() {
        return new StrucDocTh();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01InformationRecipient }
     * 
     */
    public MFMIMT700701UV01InformationRecipient createMFMIMT700701UV01InformationRecipient() {
        return new MFMIMT700701UV01InformationRecipient();
    }

    /**
     * Create an instance of {@link COCTMT230100UVHolder }
     * 
     */
    public COCTMT230100UVHolder createCOCTMT230100UVHolder() {
        return new COCTMT230100UVHolder();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04EmployerOrganization }
     * 
     */
    public COCTMT500000UV04EmployerOrganization createCOCTMT500000UV04EmployerOrganization() {
        return new COCTMT500000UV04EmployerOrganization();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01PriorRegisteredRole }
     * 
     */
    public MFMIMT700711UV01PriorRegisteredRole createMFMIMT700711UV01PriorRegisteredRole() {
        return new MFMIMT700711UV01PriorRegisteredRole();
    }

    /**
     * Create an instance of {@link SXPRTS }
     * 
     */
    public SXPRTS createSXPRTS() {
        return new SXPRTS();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Author }
     * 
     */
    public COCTMT600000UV06Author createCOCTMT600000UV06Author() {
        return new COCTMT600000UV06Author();
    }

    /**
     * Create an instance of {@link StrucDocItem }
     * 
     */
    public StrucDocItem createStrucDocItem() {
        return new StrucDocItem();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01AuthorOrPerformer }
     * 
     */
    public MFMIMT700711UV01AuthorOrPerformer createMFMIMT700711UV01AuthorOrPerformer() {
        return new MFMIMT700711UV01AuthorOrPerformer();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Component1 }
     * 
     */
    public COCTMT960000UV05Component1 createCOCTMT960000UV05Component1() {
        return new COCTMT960000UV05Component1();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Subject2 }
     * 
     */
    public PRPAMT201302UV02Subject2 createPRPAMT201302UV02Subject2() {
        return new PRPAMT201302UV02Subject2();
    }

    /**
     * Create an instance of {@link COCTMT150003UV03ContactParty }
     * 
     */
    public COCTMT150003UV03ContactParty createCOCTMT150003UV03ContactParty() {
        return new COCTMT150003UV03ContactParty();
    }

    /**
     * Create an instance of {@link COCTMT230100UVMedication }
     * 
     */
    public COCTMT230100UVMedication createCOCTMT230100UVMedication() {
        return new COCTMT230100UVMedication();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04SubstanceAdministrationOrder }
     * 
     */
    public COCTMT300000UV04SubstanceAdministrationOrder createCOCTMT300000UV04SubstanceAdministrationOrder() {
        return new COCTMT300000UV04SubstanceAdministrationOrder();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04Author }
     * 
     */
    public COCTMT310000UV04Author createCOCTMT310000UV04Author() {
        return new COCTMT310000UV04Author();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubstanceManufacturer }
     * 
     */
    public COCTMT230100UVSubstanceManufacturer createCOCTMT230100UVSubstanceManufacturer() {
        return new COCTMT230100UVSubstanceManufacturer();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject15 }
     * 
     */
    public COCTMT230100UVSubject15 createCOCTMT230100UVSubject15() {
        return new COCTMT230100UVSubject15();
    }

    /**
     * Create an instance of {@link POCDMT000040Act }
     * 
     */
    public POCDMT000040Act createPOCDMT000040Act() {
        return new POCDMT000040Act();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSourceOf1 }
     * 
     */
    public COCTMT530000UVSourceOf1 createCOCTMT530000UVSourceOf1() {
        return new COCTMT530000UVSourceOf1();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Employee }
     * 
     */
    public PRPAMT201301UV02Employee createPRPAMT201301UV02Employee() {
        return new PRPAMT201301UV02Employee();
    }

    /**
     * Create an instance of {@link POCDMT000040Author }
     * 
     */
    public POCDMT000040Author createPOCDMT000040Author() {
        return new POCDMT000040Author();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02PrincipalCareProviderId }
     * 
     */
    public PRPAMT201306UV02PrincipalCareProviderId createPRPAMT201306UV02PrincipalCareProviderId() {
        return new PRPAMT201306UV02PrincipalCareProviderId();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02NonPersonLivingSubjectId }
     * 
     */
    public PRPAMT201302UV02NonPersonLivingSubjectId createPRPAMT201302UV02NonPersonLivingSubjectId() {
        return new PRPAMT201302UV02NonPersonLivingSubjectId();
    }

    /**
     * Create an instance of {@link POCDMT000040Custodian }
     * 
     */
    public POCDMT000040Custodian createPOCDMT000040Custodian() {
        return new POCDMT000040Custodian();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Student }
     * 
     */
    public PRPAMT201310UV02Student createPRPAMT201310UV02Student() {
        return new PRPAMT201310UV02Student();
    }

    /**
     * Create an instance of {@link COCTMT230100UVTerritorialAuthority }
     * 
     */
    public COCTMT230100UVTerritorialAuthority createCOCTMT230100UVTerritorialAuthority() {
        return new COCTMT230100UVTerritorialAuthority();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Subject3 }
     * 
     */
    public PRPAMT201301UV02Subject3 createPRPAMT201301UV02Subject3() {
        return new PRPAMT201301UV02Subject3();
    }

    /**
     * Create an instance of {@link AdxpDeliveryInstallationQualifier }
     * 
     */
    public AdxpDeliveryInstallationQualifier createAdxpDeliveryInstallationQualifier() {
        return new AdxpDeliveryInstallationQualifier();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Subject }
     * 
     */
    public COCTMT510000UV06Subject createCOCTMT510000UV06Subject() {
        return new COCTMT510000UV06Subject();
    }

    /**
     * Create an instance of {@link AdxpHouseNumberNumeric }
     * 
     */
    public AdxpHouseNumberNumeric createAdxpHouseNumberNumeric() {
        return new AdxpHouseNumberNumeric();
    }

    /**
     * Create an instance of {@link POCDMT000040PlayingEntity }
     * 
     */
    public POCDMT000040PlayingEntity createPOCDMT000040PlayingEntity() {
        return new POCDMT000040PlayingEntity();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06BillableClinicalService }
     * 
     */
    public COCTMT290000UV06BillableClinicalService createCOCTMT290000UV06BillableClinicalService() {
        return new COCTMT290000UV06BillableClinicalService();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04ProviderPerson }
     * 
     */
    public COCTMT490000UV04ProviderPerson createCOCTMT490000UV04ProviderPerson() {
        return new COCTMT490000UV04ProviderPerson();
    }

    /**
     * Create an instance of {@link POCDMT000040Place }
     * 
     */
    public POCDMT000040Place createPOCDMT000040Place() {
        return new POCDMT000040Place();
    }

    /**
     * Create an instance of {@link AdxpStreetAddressLine }
     * 
     */
    public AdxpStreetAddressLine createAdxpStreetAddressLine() {
        return new AdxpStreetAddressLine();
    }

    /**
     * Create an instance of {@link POCDMT000040Organizer }
     * 
     */
    public POCDMT000040Organizer createPOCDMT000040Organizer() {
        return new POCDMT000040Organizer();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Location }
     * 
     */
    public COCTMT300000UV04Location createCOCTMT300000UV04Location() {
        return new COCTMT300000UV04Location();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04PertinentInformation3 }
     * 
     */
    public COCTMT310000UV04PertinentInformation3 createCOCTMT310000UV04PertinentInformation3() {
        return new COCTMT310000UV04PertinentInformation3();
    }

    /**
     * Create an instance of {@link EnExplicitPrefix }
     * 
     */
    public EnExplicitPrefix createEnExplicitPrefix() {
        return new EnExplicitPrefix();
    }

    /**
     * Create an instance of {@link PRPAIN201309UV02 }
     * 
     */
    public PRPAIN201309UV02 createPRPAIN201309UV02() {
        return new PRPAIN201309UV02();
    }

    /**
     * Create an instance of {@link EnExplicitFamily }
     * 
     */
    public EnExplicitFamily createEnExplicitFamily() {
        return new EnExplicitFamily();
    }

    /**
     * Create an instance of {@link StrucDocColgroup }
     * 
     */
    public StrucDocColgroup createStrucDocColgroup() {
        return new StrucDocColgroup();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Substitution }
     * 
     */
    public COCTMT290000UV06Substitution createCOCTMT290000UV06Substitution() {
        return new COCTMT290000UV06Substitution();
    }

    /**
     * Create an instance of {@link AdxpExplicitPostBox }
     * 
     */
    public AdxpExplicitPostBox createAdxpExplicitPostBox() {
        return new AdxpExplicitPostBox();
    }

    /**
     * Create an instance of {@link POCDMT000040EncounterParticipant }
     * 
     */
    public POCDMT000040EncounterParticipant createPOCDMT000040EncounterParticipant() {
        return new POCDMT000040EncounterParticipant();
    }

    /**
     * Create an instance of {@link AdxpExplicitStreetNameBase }
     * 
     */
    public AdxpExplicitStreetNameBase createAdxpExplicitStreetNameBase() {
        return new AdxpExplicitStreetNameBase();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Subject2 }
     * 
     */
    public PRPAMT201301UV02Subject2 createPRPAMT201301UV02Subject2() {
        return new PRPAMT201301UV02Subject2();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Performer }
     * 
     */
    public COCTMT290000UV06Performer createCOCTMT290000UV06Performer() {
        return new COCTMT290000UV06Performer();
    }

    /**
     * Create an instance of {@link TN }
     * 
     */
    public TN createTN() {
        return new TN();
    }

    /**
     * Create an instance of {@link StrucDocTd }
     * 
     */
    public StrucDocTd createStrucDocTd() {
        return new StrucDocTd();
    }

    /**
     * Create an instance of {@link SXCMCD }
     * 
     */
    public SXCMCD createSXCMCD() {
        return new SXCMCD();
    }

    /**
     * Create an instance of {@link PQR }
     * 
     */
    public PQR createPQR() {
        return new PQR();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Location }
     * 
     */
    public COCTMT290000UV06Location createCOCTMT290000UV06Location() {
        return new COCTMT290000UV06Location();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ResponsibleParty }
     * 
     */
    public COCTMT290000UV06ResponsibleParty createCOCTMT290000UV06ResponsibleParty() {
        return new COCTMT290000UV06ResponsibleParty();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Person }
     * 
     */
    public PRPAMT201302UV02Person createPRPAMT201302UV02Person() {
        return new PRPAMT201302UV02Person();
    }

    /**
     * Create an instance of {@link COCTMT080000UVSpecimen }
     * 
     */
    public COCTMT080000UVSpecimen createCOCTMT080000UVSpecimen() {
        return new COCTMT080000UVSpecimen();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04Guarantor }
     * 
     */
    public COCTMT030000UV04Guarantor createCOCTMT030000UV04Guarantor() {
        return new COCTMT030000UV04Guarantor();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PersonalRelationship }
     * 
     */
    public COCTMT510000UV06PersonalRelationship createCOCTMT510000UV06PersonalRelationship() {
        return new COCTMT510000UV06PersonalRelationship();
    }

    /**
     * Create an instance of {@link POCDMT000040Encounter }
     * 
     */
    public POCDMT000040Encounter createPOCDMT000040Encounter() {
        return new POCDMT000040Encounter();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02CoveredParty }
     * 
     */
    public PRPAMT201310UV02CoveredParty createPRPAMT201310UV02CoveredParty() {
        return new PRPAMT201310UV02CoveredParty();
    }

    /**
     * Create an instance of {@link COCTMT260003UVSubject2 }
     * 
     */
    public COCTMT260003UVSubject2 createCOCTMT260003UVSubject2() {
        return new COCTMT260003UVSubject2();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Author }
     * 
     */
    public COCTMT960000UV05Author createCOCTMT960000UV05Author() {
        return new COCTMT960000UV05Author();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject7 }
     * 
     */
    public COCTMT230100UVSubject7 createCOCTMT230100UVSubject7() {
        return new COCTMT230100UVSubject7();
    }

    /**
     * Create an instance of {@link COCTMT710000UV01LocatedEntityPartOf }
     * 
     */
    public COCTMT710000UV01LocatedEntityPartOf createCOCTMT710000UV01LocatedEntityPartOf() {
        return new COCTMT710000UV01LocatedEntityPartOf();
    }

    /**
     * Create an instance of {@link COCTMT670000UV04PersonalRelationship }
     * 
     */
    public COCTMT670000UV04PersonalRelationship createCOCTMT670000UV04PersonalRelationship() {
        return new COCTMT670000UV04PersonalRelationship();
    }

    /**
     * Create an instance of {@link COCTMT810000UVPerformer }
     * 
     */
    public COCTMT810000UVPerformer createCOCTMT810000UVPerformer() {
        return new COCTMT810000UVPerformer();
    }

    /**
     * Create an instance of {@link PRPAIN201305UV02 }
     * 
     */
    public PRPAIN201305UV02 createPRPAIN201305UV02() {
        return new PRPAIN201305UV02();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Limitation3 }
     * 
     */
    public COCTMT510000UV06Limitation3 createCOCTMT510000UV06Limitation3() {
        return new COCTMT510000UV06Limitation3();
    }

    /**
     * Create an instance of {@link AdxpExplicitUnitType }
     * 
     */
    public AdxpExplicitUnitType createAdxpExplicitUnitType() {
        return new AdxpExplicitUnitType();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02NonPersonLivingSubject }
     * 
     */
    public PRPAMT201303UV02NonPersonLivingSubject createPRPAMT201303UV02NonPersonLivingSubject() {
        return new PRPAMT201303UV02NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link COCTMT530000UVRecordTarget }
     * 
     */
    public COCTMT530000UVRecordTarget createCOCTMT530000UVRecordTarget() {
        return new COCTMT530000UVRecordTarget();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Author2 }
     * 
     */
    public MFMIMT700701UV01Author2 createMFMIMT700701UV01Author2() {
        return new MFMIMT700701UV01Author2();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02OtherIDsScopingOrganization }
     * 
     */
    public PRPAMT201306UV02OtherIDsScopingOrganization createPRPAMT201306UV02OtherIDsScopingOrganization() {
        return new PRPAMT201306UV02OtherIDsScopingOrganization();
    }

    /**
     * Create an instance of {@link POCDMT000040Organization }
     * 
     */
    public POCDMT000040Organization createPOCDMT000040Organization() {
        return new POCDMT000040Organization();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04PolicyHolder }
     * 
     */
    public COCTMT500000UV04PolicyHolder createCOCTMT500000UV04PolicyHolder() {
        return new COCTMT500000UV04PolicyHolder();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Sender }
     * 
     */
    public MCCIMT000200UV01Sender createMCCIMT000200UV01Sender() {
        return new MCCIMT000200UV01Sender();
    }

    /**
     * Create an instance of {@link AdxpExplicitAdditionalLocator }
     * 
     */
    public AdxpExplicitAdditionalLocator createAdxpExplicitAdditionalLocator() {
        return new AdxpExplicitAdditionalLocator();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04PertinentInformation1 }
     * 
     */
    public COCTMT740000UV04PertinentInformation1 createCOCTMT740000UV04PertinentInformation1() {
        return new COCTMT740000UV04PertinentInformation1();
    }

    /**
     * Create an instance of {@link SXCMPPDTS }
     * 
     */
    public SXCMPPDTS createSXCMPPDTS() {
        return new SXCMPPDTS();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01ActOrderRequired }
     * 
     */
    public MCAIMT900001UV01ActOrderRequired createMCAIMT900001UV01ActOrderRequired() {
        return new MCAIMT900001UV01ActOrderRequired();
    }

    /**
     * Create an instance of {@link COCTMT530000UVLabeledDrug }
     * 
     */
    public COCTMT530000UVLabeledDrug createCOCTMT530000UVLabeledDrug() {
        return new COCTMT530000UVLabeledDrug();
    }

    /**
     * Create an instance of {@link COCTMT530000UVMaterialKind2 }
     * 
     */
    public COCTMT530000UVMaterialKind2 createCOCTMT530000UVMaterialKind2() {
        return new COCTMT530000UVMaterialKind2();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01AttentionLine }
     * 
     */
    public MCCIMT000200UV01AttentionLine createMCCIMT000200UV01AttentionLine() {
        return new MCCIMT000200UV01AttentionLine();
    }

    /**
     * Create an instance of {@link COCTMT530000UVDataEnterer }
     * 
     */
    public COCTMT530000UVDataEnterer createCOCTMT530000UVDataEnterer() {
        return new COCTMT530000UVDataEnterer();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Component2 }
     * 
     */
    public COCTMT290000UV06Component2 createCOCTMT290000UV06Component2() {
        return new COCTMT290000UV06Component2();
    }

    /**
     * Create an instance of {@link COCTMT090002UV01Person }
     * 
     */
    public COCTMT090002UV01Person createCOCTMT090002UV01Person() {
        return new COCTMT090002UV01Person();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01LanguageCommunication }
     * 
     */
    public COCTMT090100UV01LanguageCommunication createCOCTMT090100UV01LanguageCommunication() {
        return new COCTMT090100UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02MCCIMT000100UV01Message }
     * 
     */
    public PRPAIN201304UV02MCCIMT000100UV01Message createPRPAIN201304UV02MCCIMT000100UV01Message() {
        return new PRPAIN201304UV02MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link StrucDocSup }
     * 
     */
    public StrucDocSup createStrucDocSup() {
        return new StrucDocSup();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PolicyOrProgramFinancialLimit }
     * 
     */
    public COCTMT510000UV06PolicyOrProgramFinancialLimit createCOCTMT510000UV06PolicyOrProgramFinancialLimit() {
        return new COCTMT510000UV06PolicyOrProgramFinancialLimit();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02MCCIMT000300UV01Message }
     * 
     */
    public PRPAIN201310UV02MCCIMT000300UV01Message createPRPAIN201310UV02MCCIMT000300UV01Message() {
        return new PRPAIN201310UV02MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04PrescriberPerson }
     * 
     */
    public COCTMT300000UV04PrescriberPerson createCOCTMT300000UV04PrescriberPerson() {
        return new COCTMT300000UV04PrescriberPerson();
    }

    /**
     * Create an instance of {@link POCDMT000040Guardian }
     * 
     */
    public POCDMT000040Guardian createPOCDMT000040Guardian() {
        return new POCDMT000040Guardian();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04PertinentInformation2 }
     * 
     */
    public COCTMT740000UV04PertinentInformation2 createCOCTMT740000UV04PertinentInformation2() {
        return new COCTMT740000UV04PertinentInformation2();
    }

    /**
     * Create an instance of {@link EnPrefix }
     * 
     */
    public EnPrefix createEnPrefix() {
        return new EnPrefix();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Author2 }
     * 
     */
    public COCTMT290000UV06Author2 createCOCTMT290000UV06Author2() {
        return new COCTMT290000UV06Author2();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Citizen }
     * 
     */
    public PRPAMT201303UV02Citizen createPRPAMT201303UV02Citizen() {
        return new PRPAMT201303UV02Citizen();
    }

    /**
     * Create an instance of {@link COCTMT080000UVPerformer }
     * 
     */
    public COCTMT080000UVPerformer createCOCTMT080000UVPerformer() {
        return new COCTMT080000UVPerformer();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02PersonalRelationship }
     * 
     */
    public PRPAMT201310UV02PersonalRelationship createPRPAMT201310UV02PersonalRelationship() {
        return new PRPAMT201310UV02PersonalRelationship();
    }

    /**
     * Create an instance of {@link COCTMT040008UVResponsible }
     * 
     */
    public COCTMT040008UVResponsible createCOCTMT040008UVResponsible() {
        return new COCTMT040008UVResponsible();
    }

    /**
     * Create an instance of {@link COCTMT080000UVSubject4 }
     * 
     */
    public COCTMT080000UVSubject4 createCOCTMT080000UVSubject4() {
        return new COCTMT080000UVSubject4();
    }

    /**
     * Create an instance of {@link COCTMT260003UVDefinition }
     * 
     */
    public COCTMT260003UVDefinition createCOCTMT260003UVDefinition() {
        return new COCTMT260003UVDefinition();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02NonPersonLivingSubject }
     * 
     */
    public PRPAMT201302UV02NonPersonLivingSubject createPRPAMT201302UV02NonPersonLivingSubject() {
        return new PRPAMT201302UV02NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link COCTMT080000UVContent3 }
     * 
     */
    public COCTMT080000UVContent3 createCOCTMT080000UVContent3() {
        return new COCTMT080000UVContent3();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Diagnosis }
     * 
     */
    public COCTMT740000UV04Diagnosis createCOCTMT740000UV04Diagnosis() {
        return new COCTMT740000UV04Diagnosis();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Device }
     * 
     */
    public MCCIMT000300UV01Device createMCCIMT000300UV01Device() {
        return new MCCIMT000300UV01Device();
    }

    /**
     * Create an instance of {@link RTOQTYQTY }
     * 
     */
    public RTOQTYQTY createRTOQTYQTY() {
        return new RTOQTYQTY();
    }

    /**
     * Create an instance of {@link COCTMT530000UVOrganization }
     * 
     */
    public COCTMT530000UVOrganization createCOCTMT530000UVOrganization() {
        return new COCTMT530000UVOrganization();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PatientOfOtherProvider }
     * 
     */
    public PRPAMT201302UV02PatientOfOtherProvider createPRPAMT201302UV02PatientOfOtherProvider() {
        return new PRPAMT201302UV02PatientOfOtherProvider();
    }

    /**
     * Create an instance of {@link COCTMT080000UVSpecimenStub }
     * 
     */
    public COCTMT080000UVSpecimenStub createCOCTMT080000UVSpecimenStub() {
        return new COCTMT080000UVSpecimenStub();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04NonPersonLivingSubject }
     * 
     */
    public COCTMT030000UV04NonPersonLivingSubject createCOCTMT030000UV04NonPersonLivingSubject() {
        return new COCTMT030000UV04NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Patient }
     * 
     */
    public PRPAMT201304UV02Patient createPRPAMT201304UV02Patient() {
        return new PRPAMT201304UV02Patient();
    }

    /**
     * Create an instance of {@link StrucDocSub }
     * 
     */
    public StrucDocSub createStrucDocSub() {
        return new StrucDocSub();
    }

    /**
     * Create an instance of {@link POCDMT000040ClinicalDocument }
     * 
     */
    public POCDMT000040ClinicalDocument createPOCDMT000040ClinicalDocument() {
        return new POCDMT000040ClinicalDocument();
    }

    /**
     * Create an instance of {@link PRPAMT201307UV02ParameterList }
     * 
     */
    public PRPAMT201307UV02ParameterList createPRPAMT201307UV02ParameterList() {
        return new PRPAMT201307UV02ParameterList();
    }

    /**
     * Create an instance of {@link POCDMT000040Reference }
     * 
     */
    public POCDMT000040Reference createPOCDMT000040Reference() {
        return new POCDMT000040Reference();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04SupplyEvent }
     * 
     */
    public COCTMT300000UV04SupplyEvent createCOCTMT300000UV04SupplyEvent() {
        return new COCTMT300000UV04SupplyEvent();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Limitation2 }
     * 
     */
    public COCTMT510000UV06Limitation2 createCOCTMT510000UV06Limitation2() {
        return new COCTMT510000UV06Limitation2();
    }

    /**
     * Create an instance of {@link EIVLTS }
     * 
     */
    public EIVLTS createEIVLTS() {
        return new EIVLTS();
    }

    /**
     * Create an instance of {@link COCTMT080000UVActRef }
     * 
     */
    public COCTMT080000UVActRef createCOCTMT080000UVActRef() {
        return new COCTMT080000UVActRef();
    }

    /**
     * Create an instance of {@link COCTMT530000UVPrecondition1 }
     * 
     */
    public COCTMT530000UVPrecondition1 createCOCTMT530000UVPrecondition1() {
        return new COCTMT530000UVPrecondition1();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoverageCharge }
     * 
     */
    public COCTMT510000UV06CoverageCharge createCOCTMT510000UV06CoverageCharge() {
        return new COCTMT510000UV06CoverageCharge();
    }

    /**
     * Create an instance of {@link POCDMT000040ObservationMedia }
     * 
     */
    public POCDMT000040ObservationMedia createPOCDMT000040ObservationMedia() {
        return new POCDMT000040ObservationMedia();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04SubstitutionRole }
     * 
     */
    public COCTMT300000UV04SubstitutionRole createCOCTMT300000UV04SubstitutionRole() {
        return new COCTMT300000UV04SubstitutionRole();
    }

    /**
     * Create an instance of {@link COCTMT150000UV02ContactParty }
     * 
     */
    public COCTMT150000UV02ContactParty createCOCTMT150000UV02ContactParty() {
        return new COCTMT150000UV02ContactParty();
    }

    /**
     * Create an instance of {@link AdxpExplicitCountry }
     * 
     */
    public AdxpExplicitCountry createAdxpExplicitCountry() {
        return new AdxpExplicitCountry();
    }

    /**
     * Create an instance of {@link COCTMT230100UVPolicy }
     * 
     */
    public COCTMT230100UVPolicy createCOCTMT230100UVPolicy() {
        return new COCTMT230100UVPolicy();
    }

    /**
     * Create an instance of {@link AdxpDeliveryInstallationArea }
     * 
     */
    public AdxpDeliveryInstallationArea createAdxpDeliveryInstallationArea() {
        return new AdxpDeliveryInstallationArea();
    }

    /**
     * Create an instance of {@link PRPAIN201301UV02MCCIMT000100UV01Message }
     * 
     */
    public PRPAIN201301UV02MCCIMT000100UV01Message createPRPAIN201301UV02MCCIMT000100UV01Message() {
        return new PRPAIN201301UV02MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject2 }
     * 
     */
    public COCTMT230100UVSubject2 createCOCTMT230100UVSubject2() {
        return new COCTMT230100UVSubject2();
    }

    /**
     * Create an instance of {@link ADXPExplicit }
     * 
     */
    public ADXPExplicit createADXPExplicit() {
        return new ADXPExplicit();
    }

    /**
     * Create an instance of {@link COCTMT090102UV02Person }
     * 
     */
    public COCTMT090102UV02Person createCOCTMT090102UV02Person() {
        return new COCTMT090102UV02Person();
    }

    /**
     * Create an instance of {@link POCDMT000040DataEnterer }
     * 
     */
    public POCDMT000040DataEnterer createPOCDMT000040DataEnterer() {
        return new POCDMT000040DataEnterer();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04CarrierOrganization }
     * 
     */
    public COCTMT500000UV04CarrierOrganization createCOCTMT500000UV04CarrierOrganization() {
        return new COCTMT500000UV04CarrierOrganization();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04CoveredParty }
     * 
     */
    public COCTMT500000UV04CoveredParty createCOCTMT500000UV04CoveredParty() {
        return new COCTMT500000UV04CoveredParty();
    }

    /**
     * Create an instance of {@link PRPAIN201302UV02MFMIMT700701UV01ControlActProcess }
     * 
     */
    public PRPAIN201302UV02MFMIMT700701UV01ControlActProcess createPRPAIN201302UV02MFMIMT700701UV01ControlActProcess() {
        return new PRPAIN201302UV02MFMIMT700701UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04Guardian }
     * 
     */
    public COCTMT030000UV04Guardian createCOCTMT030000UV04Guardian() {
        return new COCTMT030000UV04Guardian();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06PrescriptionIntent }
     * 
     */
    public COCTMT600000UV06PrescriptionIntent createCOCTMT600000UV06PrescriptionIntent() {
        return new COCTMT600000UV06PrescriptionIntent();
    }

    /**
     * Create an instance of {@link POCDMT000040RegionOfInterestValue }
     * 
     */
    public POCDMT000040RegionOfInterestValue createPOCDMT000040RegionOfInterestValue() {
        return new POCDMT000040RegionOfInterestValue();
    }

    /**
     * Create an instance of {@link SXCMPPDPQ }
     * 
     */
    public SXCMPPDPQ createSXCMPPDPQ() {
        return new SXCMPPDPQ();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06ManufacturedProduct }
     * 
     */
    public COCTMT600000UV06ManufacturedProduct createCOCTMT600000UV06ManufacturedProduct() {
        return new COCTMT600000UV06ManufacturedProduct();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSpecializedKind }
     * 
     */
    public COCTMT230100UVSpecializedKind createCOCTMT230100UVSpecializedKind() {
        return new COCTMT230100UVSpecializedKind();
    }

    /**
     * Create an instance of {@link AdxpUnitID }
     * 
     */
    public AdxpUnitID createAdxpUnitID() {
        return new AdxpUnitID();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Origin }
     * 
     */
    public COCTMT300000UV04Origin createCOCTMT300000UV04Origin() {
        return new COCTMT300000UV04Origin();
    }

    /**
     * Create an instance of {@link ENXP }
     * 
     */
    public ENXP createENXP() {
        return new ENXP();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Patient }
     * 
     */
    public PRPAMT201302UV02Patient createPRPAMT201302UV02Patient() {
        return new PRPAMT201302UV02Patient();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01Organization }
     * 
     */
    public COCTMT090000UV01Organization createCOCTMT090000UV01Organization() {
        return new COCTMT090000UV01Organization();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01Requires }
     * 
     */
    public MCAIMT900001UV01Requires createMCAIMT900001UV01Requires() {
        return new MCAIMT900001UV01Requires();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01EntityRsp }
     * 
     */
    public MCCIMT000300UV01EntityRsp createMCCIMT000300UV01EntityRsp() {
        return new MCCIMT000300UV01EntityRsp();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04Limitation }
     * 
     */
    public COCTMT500000UV04Limitation createCOCTMT500000UV04Limitation() {
        return new COCTMT500000UV04Limitation();
    }

    /**
     * Create an instance of {@link COCTMT050000UV01Patient }
     * 
     */
    public COCTMT050000UV01Patient createCOCTMT050000UV01Patient() {
        return new COCTMT050000UV01Patient();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Group }
     * 
     */
    public PRPAMT201302UV02Group createPRPAMT201302UV02Group() {
        return new PRPAMT201302UV02Group();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06EligibilityStatusObservation }
     * 
     */
    public COCTMT510000UV06EligibilityStatusObservation createCOCTMT510000UV06EligibilityStatusObservation() {
        return new COCTMT510000UV06EligibilityStatusObservation();
    }

    /**
     * Create an instance of {@link COCTMT030007UVBirthPlace }
     * 
     */
    public COCTMT030007UVBirthPlace createCOCTMT030007UVBirthPlace() {
        return new COCTMT030007UVBirthPlace();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02MFMIMT700711UV01RegistrationEvent }
     * 
     */
    public PRPAIN201310UV02MFMIMT700711UV01RegistrationEvent createPRPAIN201310UV02MFMIMT700711UV01RegistrationEvent() {
        return new PRPAIN201310UV02MFMIMT700711UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link AdxpStreetNameType }
     * 
     */
    public AdxpStreetNameType createAdxpStreetNameType() {
        return new AdxpStreetNameType();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Employee }
     * 
     */
    public PRPAMT201304UV02Employee createPRPAMT201304UV02Employee() {
        return new PRPAMT201304UV02Employee();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject11 }
     * 
     */
    public COCTMT230100UVSubject11 createCOCTMT230100UVSubject11() {
        return new COCTMT230100UVSubject11();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02AdministrativeObservation }
     * 
     */
    public PRPAMT201303UV02AdministrativeObservation createPRPAMT201303UV02AdministrativeObservation() {
        return new PRPAMT201303UV02AdministrativeObservation();
    }

    /**
     * Create an instance of {@link COCTMT030007UVGuardian }
     * 
     */
    public COCTMT030007UVGuardian createCOCTMT030007UVGuardian() {
        return new COCTMT030007UVGuardian();
    }

    /**
     * Create an instance of {@link POCDMT000040RelatedDocument }
     * 
     */
    public POCDMT000040RelatedDocument createPOCDMT000040RelatedDocument() {
        return new POCDMT000040RelatedDocument();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02AdministrativeObservation }
     * 
     */
    public PRPAMT201310UV02AdministrativeObservation createPRPAMT201310UV02AdministrativeObservation() {
        return new PRPAMT201310UV02AdministrativeObservation();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectBirthTime }
     * 
     */
    public PRPAMT201306UV02LivingSubjectBirthTime createPRPAMT201306UV02LivingSubjectBirthTime() {
        return new PRPAMT201306UV02LivingSubjectBirthTime();
    }

    /**
     * Create an instance of {@link CEExplicit }
     * 
     */
    public CEExplicit createCEExplicit() {
        return new CEExplicit();
    }

    /**
     * Create an instance of {@link COCTMT030203UV02LanguageCommunication }
     * 
     */
    public COCTMT030203UV02LanguageCommunication createCOCTMT030203UV02LanguageCommunication() {
        return new COCTMT030203UV02LanguageCommunication();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02PatientOfOtherProvider }
     * 
     */
    public PRPAMT201303UV02PatientOfOtherProvider createPRPAMT201303UV02PatientOfOtherProvider() {
        return new PRPAMT201303UV02PatientOfOtherProvider();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Organization }
     * 
     */
    public MCCIMT000300UV01Organization createMCCIMT000300UV01Organization() {
        return new MCCIMT000300UV01Organization();
    }

    /**
     * Create an instance of {@link StrucDocLinkHtml }
     * 
     */
    public StrucDocLinkHtml createStrucDocLinkHtml() {
        return new StrucDocLinkHtml();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01AssignedDevice }
     * 
     */
    public COCTMT090300UV01AssignedDevice createCOCTMT090300UV01AssignedDevice() {
        return new COCTMT090300UV01AssignedDevice();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04HealthCareProvider }
     * 
     */
    public COCTMT740000UV04HealthCareProvider createCOCTMT740000UV04HealthCareProvider() {
        return new COCTMT740000UV04HealthCareProvider();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Location }
     * 
     */
    public COCTMT490000UV04Location createCOCTMT490000UV04Location() {
        return new COCTMT490000UV04Location();
    }

    /**
     * Create an instance of {@link POCDMT000040LanguageCommunication }
     * 
     */
    public POCDMT000040LanguageCommunication createPOCDMT000040LanguageCommunication() {
        return new POCDMT000040LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04PolicyHolderPerson }
     * 
     */
    public COCTMT500000UV04PolicyHolderPerson createCOCTMT500000UV04PolicyHolderPerson() {
        return new COCTMT500000UV04PolicyHolderPerson();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01RoleTransport }
     * 
     */
    public COCTMT060000UV01RoleTransport createCOCTMT060000UV01RoleTransport() {
        return new COCTMT060000UV01RoleTransport();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06ProviderPerson }
     * 
     */
    public COCTMT600000UV06ProviderPerson createCOCTMT600000UV06ProviderPerson() {
        return new COCTMT600000UV06ProviderPerson();
    }

    /**
     * Create an instance of {@link POCDMT000040EncompassingEncounter }
     * 
     */
    public POCDMT000040EncompassingEncounter createPOCDMT000040EncompassingEncounter() {
        return new POCDMT000040EncompassingEncounter();
    }

    /**
     * Create an instance of {@link AdxpExplicitStreetName }
     * 
     */
    public AdxpExplicitStreetName createAdxpExplicitStreetName() {
        return new AdxpExplicitStreetName();
    }

    /**
     * Create an instance of {@link PIXConsumerPRPAIN201302UVRequestType }
     * 
     */
    public PIXConsumerPRPAIN201302UVRequestType createPIXConsumerPRPAIN201302UVRequestType() {
        return new PIXConsumerPRPAIN201302UVRequestType();
    }

    /**
     * Create an instance of {@link AdxpHouseNumber }
     * 
     */
    public AdxpHouseNumber createAdxpHouseNumber() {
        return new AdxpHouseNumber();
    }

    /**
     * Create an instance of {@link AdxpExplicitCity }
     * 
     */
    public AdxpExplicitCity createAdxpExplicitCity() {
        return new AdxpExplicitCity();
    }

    /**
     * Create an instance of {@link COCTMT810000UVInformationProvision }
     * 
     */
    public COCTMT810000UVInformationProvision createCOCTMT810000UVInformationProvision() {
        return new COCTMT810000UVInformationProvision();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Reason3 }
     * 
     */
    public COCTMT290000UV06Reason3 createCOCTMT290000UV06Reason3() {
        return new COCTMT290000UV06Reason3();
    }

    /**
     * Create an instance of {@link COCTMT080000UVProcess }
     * 
     */
    public COCTMT080000UVProcess createCOCTMT080000UVProcess() {
        return new COCTMT080000UVProcess();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04OralHealthSubstanceAdministration }
     * 
     */
    public COCTMT740000UV04OralHealthSubstanceAdministration createCOCTMT740000UV04OralHealthSubstanceAdministration() {
        return new COCTMT740000UV04OralHealthSubstanceAdministration();
    }

    /**
     * Create an instance of {@link BN }
     * 
     */
    public BN createBN() {
        return new BN();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02MFMIMT700711UV01RegistrationEvent }
     * 
     */
    public PRPAIN201306UV02MFMIMT700711UV01RegistrationEvent createPRPAIN201306UV02MFMIMT700711UV01RegistrationEvent() {
        return new PRPAIN201306UV02MFMIMT700711UV01RegistrationEvent();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02ParameterList }
     * 
     */
    public PRPAMT201306UV02ParameterList createPRPAMT201306UV02ParameterList() {
        return new PRPAMT201306UV02ParameterList();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02OtherIDs }
     * 
     */
    public PRPAMT201302UV02OtherIDs createPRPAMT201302UV02OtherIDs() {
        return new PRPAMT201302UV02OtherIDs();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Agent }
     * 
     */
    public MCCIMT000300UV01Agent createMCCIMT000300UV01Agent() {
        return new MCCIMT000300UV01Agent();
    }

    /**
     * Create an instance of {@link COCTMT030207UVLanguageCommunication }
     * 
     */
    public COCTMT030207UVLanguageCommunication createCOCTMT030207UVLanguageCommunication() {
        return new COCTMT030207UVLanguageCommunication();
    }

    /**
     * Create an instance of {@link EnExplicitGiven }
     * 
     */
    public EnExplicitGiven createEnExplicitGiven() {
        return new EnExplicitGiven();
    }

    /**
     * Create an instance of {@link RTOPQPQ }
     * 
     */
    public RTOPQPQ createRTOPQPQ() {
        return new RTOPQPQ();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01PriorRegisteredAct }
     * 
     */
    public MFMIMT700701UV01PriorRegisteredAct createMFMIMT700701UV01PriorRegisteredAct() {
        return new MFMIMT700701UV01PriorRegisteredAct();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Referrer }
     * 
     */
    public COCTMT740000UV04Referrer createCOCTMT740000UV04Referrer() {
        return new COCTMT740000UV04Referrer();
    }

    /**
     * Create an instance of {@link HXITCE }
     * 
     */
    public HXITCE createHXITCE() {
        return new HXITCE();
    }

    /**
     * Create an instance of {@link COCTMT810000UVSupport }
     * 
     */
    public COCTMT810000UVSupport createCOCTMT810000UVSupport() {
        return new COCTMT810000UVSupport();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Injury }
     * 
     */
    public COCTMT290000UV06Injury createCOCTMT290000UV06Injury() {
        return new COCTMT290000UV06Injury();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectBirthPlaceAddress }
     * 
     */
    public PRPAMT201306UV02LivingSubjectBirthPlaceAddress createPRPAMT201306UV02LivingSubjectBirthPlaceAddress() {
        return new PRPAMT201306UV02LivingSubjectBirthPlaceAddress();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02MatchCriterionList }
     * 
     */
    public PRPAMT201306UV02MatchCriterionList createPRPAMT201306UV02MatchCriterionList() {
        return new PRPAMT201306UV02MatchCriterionList();
    }

    /**
     * Create an instance of {@link COCTMT060000UV01Entity }
     * 
     */
    public COCTMT060000UV01Entity createCOCTMT060000UV01Entity() {
        return new COCTMT060000UV01Entity();
    }

    /**
     * Create an instance of {@link POCDMT000040Product }
     * 
     */
    public POCDMT000040Product createPOCDMT000040Product() {
        return new POCDMT000040Product();
    }

    /**
     * Create an instance of {@link COCTMT030007UVEntity }
     * 
     */
    public COCTMT030007UVEntity createCOCTMT030007UVEntity() {
        return new COCTMT030007UVEntity();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Author1 }
     * 
     */
    public MFMIMT700701UV01Author1 createMFMIMT700701UV01Author1() {
        return new MFMIMT700701UV01Author1();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06PreviousPolicyOrProgram }
     * 
     */
    public COCTMT510000UV06PreviousPolicyOrProgram createCOCTMT510000UV06PreviousPolicyOrProgram() {
        return new COCTMT510000UV06PreviousPolicyOrProgram();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04Employment }
     * 
     */
    public COCTMT500000UV04Employment createCOCTMT500000UV04Employment() {
        return new COCTMT500000UV04Employment();
    }

    /**
     * Create an instance of {@link COCTMT530000UVAnimal }
     * 
     */
    public COCTMT530000UVAnimal createCOCTMT530000UVAnimal() {
        return new COCTMT530000UVAnimal();
    }

    /**
     * Create an instance of {@link PRPAIN201310UV02MFMIMT700711UV01Subject1 }
     * 
     */
    public PRPAIN201310UV02MFMIMT700711UV01Subject1 createPRPAIN201310UV02MFMIMT700711UV01Subject1() {
        return new PRPAIN201310UV02MFMIMT700711UV01Subject1();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Location }
     * 
     */
    public COCTMT600000UV06Location createCOCTMT600000UV06Location() {
        return new COCTMT600000UV06Location();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Receiver }
     * 
     */
    public MCCIMT000200UV01Receiver createMCCIMT000200UV01Receiver() {
        return new MCCIMT000200UV01Receiver();
    }

    /**
     * Create an instance of {@link CO }
     * 
     */
    public CO createCO() {
        return new CO();
    }

    /**
     * Create an instance of {@link COCTMT530000UVVerifier }
     * 
     */
    public COCTMT530000UVVerifier createCOCTMT530000UVVerifier() {
        return new COCTMT530000UVVerifier();
    }

    /**
     * Create an instance of {@link AdxpCareOf }
     * 
     */
    public AdxpCareOf createAdxpCareOf() {
        return new AdxpCareOf();
    }

    /**
     * Create an instance of {@link EnExplicitDelimiter }
     * 
     */
    public EnExplicitDelimiter createEnExplicitDelimiter() {
        return new EnExplicitDelimiter();
    }

    /**
     * Create an instance of {@link POCDMT000040ExternalProcedure }
     * 
     */
    public POCDMT000040ExternalProcedure createPOCDMT000040ExternalProcedure() {
        return new POCDMT000040ExternalProcedure();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04PertinentInformation }
     * 
     */
    public COCTMT300000UV04PertinentInformation createCOCTMT300000UV04PertinentInformation() {
        return new COCTMT300000UV04PertinentInformation();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04SupplyOrder }
     * 
     */
    public COCTMT300000UV04SupplyOrder createCOCTMT300000UV04SupplyOrder() {
        return new COCTMT300000UV04SupplyOrder();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Product }
     * 
     */
    public COCTMT600000UV06Product createCOCTMT600000UV06Product() {
        return new COCTMT600000UV06Product();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01Person }
     * 
     */
    public COCTMT090000UV01Person createCOCTMT090000UV01Person() {
        return new COCTMT090000UV01Person();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Definition3 }
     * 
     */
    public COCTMT510000UV06Definition3 createCOCTMT510000UV06Definition3() {
        return new COCTMT510000UV06Definition3();
    }

    /**
     * Create an instance of {@link GLISTTS }
     * 
     */
    public GLISTTS createGLISTTS() {
        return new GLISTTS();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02AdministrativeObservationId }
     * 
     */
    public PRPAMT201302UV02AdministrativeObservationId createPRPAMT201302UV02AdministrativeObservationId() {
        return new PRPAMT201302UV02AdministrativeObservationId();
    }

    /**
     * Create an instance of {@link COCTMT530000UVInformant }
     * 
     */
    public COCTMT530000UVInformant createCOCTMT530000UVInformant() {
        return new COCTMT530000UVInformant();
    }

    /**
     * Create an instance of {@link COCTMT820000UVPerformer }
     * 
     */
    public COCTMT820000UVPerformer createCOCTMT820000UVPerformer() {
        return new COCTMT820000UVPerformer();
    }

    /**
     * Create an instance of {@link COCTMT080000UVNonPersonLivingSubject }
     * 
     */
    public COCTMT080000UVNonPersonLivingSubject createCOCTMT080000UVNonPersonLivingSubject() {
        return new COCTMT080000UVNonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link POCDMT000040NonXMLBody }
     * 
     */
    public POCDMT000040NonXMLBody createPOCDMT000040NonXMLBody() {
        return new POCDMT000040NonXMLBody();
    }

    /**
     * Create an instance of {@link COCTMT090102UV02AssignedPerson }
     * 
     */
    public COCTMT090102UV02AssignedPerson createCOCTMT090102UV02AssignedPerson() {
        return new COCTMT090102UV02AssignedPerson();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Location1 }
     * 
     */
    public COCTMT290000UV06Location1 createCOCTMT290000UV06Location1() {
        return new COCTMT290000UV06Location1();
    }

    /**
     * Create an instance of {@link POCDMT000040ExternalAct }
     * 
     */
    public POCDMT000040ExternalAct createPOCDMT000040ExternalAct() {
        return new POCDMT000040ExternalAct();
    }

    /**
     * Create an instance of {@link COCTMT150003UV03Organization }
     * 
     */
    public COCTMT150003UV03Organization createCOCTMT150003UV03Organization() {
        return new COCTMT150003UV03Organization();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSuperContent }
     * 
     */
    public COCTMT230100UVSuperContent createCOCTMT230100UVSuperContent() {
        return new COCTMT230100UVSuperContent();
    }

    /**
     * Create an instance of {@link COCTMT810000UVVerification }
     * 
     */
    public COCTMT810000UVVerification createCOCTMT810000UVVerification() {
        return new COCTMT810000UVVerification();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Message }
     * 
     */
    public MCCIMT000200UV01Message createMCCIMT000200UV01Message() {
        return new MCCIMT000200UV01Message();
    }

    /**
     * Create an instance of {@link IVLINT }
     * 
     */
    public IVLINT createIVLINT() {
        return new IVLINT();
    }

    /**
     * Create an instance of {@link AdxpStreetName }
     * 
     */
    public AdxpStreetName createAdxpStreetName() {
        return new AdxpStreetName();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Product }
     * 
     */
    public COCTMT490000UV04Product createCOCTMT490000UV04Product() {
        return new COCTMT490000UV04Product();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Destination }
     * 
     */
    public COCTMT600000UV06Destination createCOCTMT600000UV06Destination() {
        return new COCTMT600000UV06Destination();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Reason }
     * 
     */
    public MFMIMT700711UV01Reason createMFMIMT700711UV01Reason() {
        return new MFMIMT700711UV01Reason();
    }

    /**
     * Create an instance of {@link POCDMT000040ObservationRange }
     * 
     */
    public POCDMT000040ObservationRange createPOCDMT000040ObservationRange() {
        return new POCDMT000040ObservationRange();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02NonPersonLivingSubject }
     * 
     */
    public PRPAMT201304UV02NonPersonLivingSubject createPRPAMT201304UV02NonPersonLivingSubject() {
        return new PRPAMT201304UV02NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link COCTMT230100UVIngredient }
     * 
     */
    public COCTMT230100UVIngredient createCOCTMT230100UVIngredient() {
        return new COCTMT230100UVIngredient();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ManufacturedMaterial }
     * 
     */
    public COCTMT290000UV06ManufacturedMaterial createCOCTMT290000UV06ManufacturedMaterial() {
        return new COCTMT290000UV06ManufacturedMaterial();
    }

    /**
     * Create an instance of {@link COCTMT530000UVPlace }
     * 
     */
    public COCTMT530000UVPlace createCOCTMT530000UVPlace() {
        return new COCTMT530000UVPlace();
    }

    /**
     * Create an instance of {@link POCDMT000040ParentDocument }
     * 
     */
    public POCDMT000040ParentDocument createPOCDMT000040ParentDocument() {
        return new POCDMT000040ParentDocument();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Group }
     * 
     */
    public PRPAMT201310UV02Group createPRPAMT201310UV02Group() {
        return new PRPAMT201310UV02Group();
    }

    /**
     * Create an instance of {@link StrucDocFootnoteRef }
     * 
     */
    public StrucDocFootnoteRef createStrucDocFootnoteRef() {
        return new StrucDocFootnoteRef();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04Encounter }
     * 
     */
    public COCTMT310000UV04Encounter createCOCTMT310000UV04Encounter() {
        return new COCTMT310000UV04Encounter();
    }

    /**
     * Create an instance of {@link POCDMT000040Subject }
     * 
     */
    public POCDMT000040Subject createPOCDMT000040Subject() {
        return new POCDMT000040Subject();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06InFulfillmentOf }
     * 
     */
    public COCTMT290000UV06InFulfillmentOf createCOCTMT290000UV06InFulfillmentOf() {
        return new COCTMT290000UV06InFulfillmentOf();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSourceOf2 }
     * 
     */
    public COCTMT530000UVSourceOf2 createCOCTMT530000UVSourceOf2() {
        return new COCTMT530000UVSourceOf2();
    }

    /**
     * Create an instance of {@link TEL }
     * 
     */
    public TEL createTEL() {
        return new TEL();
    }

    /**
     * Create an instance of {@link ENXPExplicit }
     * 
     */
    public ENXPExplicit createENXPExplicit() {
        return new ENXPExplicit();
    }

    /**
     * Create an instance of {@link RespondingGatewayPRPAIN201306UV02ResponseType }
     * 
     */
    public RespondingGatewayPRPAIN201306UV02ResponseType createRespondingGatewayPRPAIN201306UV02ResponseType() {
        return new RespondingGatewayPRPAIN201306UV02ResponseType();
    }

    /**
     * Create an instance of {@link COCTMT530000UVObservation }
     * 
     */
    public COCTMT530000UVObservation createCOCTMT530000UVObservation() {
        return new COCTMT530000UVObservation();
    }

    /**
     * Create an instance of {@link CreateAckMsgRequestType }
     * 
     */
    public CreateAckMsgRequestType createCreateAckMsgRequestType() {
        return new CreateAckMsgRequestType();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01SourceOf }
     * 
     */
    public MCAIMT900001UV01SourceOf createMCAIMT900001UV01SourceOf() {
        return new MCAIMT900001UV01SourceOf();
    }

    /**
     * Create an instance of {@link MCCIMT000100UV01EntityRsp }
     * 
     */
    public MCCIMT000100UV01EntityRsp createMCCIMT000100UV01EntityRsp() {
        return new MCCIMT000100UV01EntityRsp();
    }

    /**
     * Create an instance of {@link AdxpExplicitStreetAddressLine }
     * 
     */
    public AdxpExplicitStreetAddressLine createAdxpExplicitStreetAddressLine() {
        return new AdxpExplicitStreetAddressLine();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Person }
     * 
     */
    public PRPAMT201310UV02Person createPRPAMT201310UV02Person() {
        return new PRPAMT201310UV02Person();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Beneficiary2 }
     * 
     */
    public COCTMT510000UV06Beneficiary2 createCOCTMT510000UV06Beneficiary2() {
        return new COCTMT510000UV06Beneficiary2();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Performer }
     * 
     */
    public COCTMT740000UV04Performer createCOCTMT740000UV04Performer() {
        return new COCTMT740000UV04Performer();
    }

    /**
     * Create an instance of {@link IVLPQ }
     * 
     */
    public IVLPQ createIVLPQ() {
        return new IVLPQ();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02CitizenId }
     * 
     */
    public PRPAMT201302UV02CitizenId createPRPAMT201302UV02CitizenId() {
        return new PRPAMT201302UV02CitizenId();
    }

    /**
     * Create an instance of {@link COCTMT030007UVPerson }
     * 
     */
    public COCTMT030007UVPerson createCOCTMT030007UVPerson() {
        return new COCTMT030007UVPerson();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Person }
     * 
     */
    public PRPAMT201304UV02Person createPRPAMT201304UV02Person() {
        return new PRPAMT201304UV02Person();
    }

    /**
     * Create an instance of {@link COCTMT150000UV02OrganizationContains }
     * 
     */
    public COCTMT150000UV02OrganizationContains createCOCTMT150000UV02OrganizationContains() {
        return new COCTMT150000UV02OrganizationContains();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Place }
     * 
     */
    public MCCIMT000300UV01Place createMCCIMT000300UV01Place() {
        return new MCCIMT000300UV01Place();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01Group }
     * 
     */
    public COCTMT090100UV01Group createCOCTMT090100UV01Group() {
        return new COCTMT090100UV01Group();
    }

    /**
     * Create an instance of {@link POCDMT000040LabeledDrug }
     * 
     */
    public POCDMT000040LabeledDrug createPOCDMT000040LabeledDrug() {
        return new POCDMT000040LabeledDrug();
    }

    /**
     * Create an instance of {@link POCDMT000040AuthoringDevice }
     * 
     */
    public POCDMT000040AuthoringDevice createPOCDMT000040AuthoringDevice() {
        return new POCDMT000040AuthoringDevice();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04AcommodationRequestor }
     * 
     */
    public COCTMT310000UV04AcommodationRequestor createCOCTMT310000UV04AcommodationRequestor() {
        return new COCTMT310000UV04AcommodationRequestor();
    }

    /**
     * Create an instance of {@link AdxpDeliveryModeIdentifier }
     * 
     */
    public AdxpDeliveryModeIdentifier createAdxpDeliveryModeIdentifier() {
        return new AdxpDeliveryModeIdentifier();
    }

    /**
     * Create an instance of {@link POCDMT000040DocumentationOf }
     * 
     */
    public POCDMT000040DocumentationOf createPOCDMT000040DocumentationOf() {
        return new POCDMT000040DocumentationOf();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02OtherIDs }
     * 
     */
    public PRPAMT201304UV02OtherIDs createPRPAMT201304UV02OtherIDs() {
        return new PRPAMT201304UV02OtherIDs();
    }

    /**
     * Create an instance of {@link AdxpExplicitDeliveryInstallationType }
     * 
     */
    public AdxpExplicitDeliveryInstallationType createAdxpExplicitDeliveryInstallationType() {
        return new AdxpExplicitDeliveryInstallationType();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Reason }
     * 
     */
    public COCTMT300000UV04Reason createCOCTMT300000UV04Reason() {
        return new COCTMT300000UV04Reason();
    }

    /**
     * Create an instance of {@link POCDMT000040Supply }
     * 
     */
    public POCDMT000040Supply createPOCDMT000040Supply() {
        return new POCDMT000040Supply();
    }

    /**
     * Create an instance of {@link EnFamily }
     * 
     */
    public EnFamily createEnFamily() {
        return new EnFamily();
    }

    /**
     * Create an instance of {@link AdxpPrecinct }
     * 
     */
    public AdxpPrecinct createAdxpPrecinct() {
        return new AdxpPrecinct();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06InjuryLocation }
     * 
     */
    public COCTMT290000UV06InjuryLocation createCOCTMT290000UV06InjuryLocation() {
        return new COCTMT290000UV06InjuryLocation();
    }

    /**
     * Create an instance of {@link AdxpDeliveryMode }
     * 
     */
    public AdxpDeliveryMode createAdxpDeliveryMode() {
        return new AdxpDeliveryMode();
    }

    /**
     * Create an instance of {@link COCTMT080000UVAdditive2 }
     * 
     */
    public COCTMT080000UVAdditive2 createCOCTMT080000UVAdditive2() {
        return new COCTMT080000UVAdditive2();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject3 }
     * 
     */
    public COCTMT230100UVSubject3 createCOCTMT230100UVSubject3() {
        return new COCTMT230100UVSubject3();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04Referrer }
     * 
     */
    public COCTMT490000UV04Referrer createCOCTMT490000UV04Referrer() {
        return new COCTMT490000UV04Referrer();
    }

    /**
     * Create an instance of {@link POCDMT000040CustodianOrganization }
     * 
     */
    public POCDMT000040CustodianOrganization createPOCDMT000040CustodianOrganization() {
        return new POCDMT000040CustodianOrganization();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Guardian }
     * 
     */
    public PRPAMT201303UV02Guardian createPRPAMT201303UV02Guardian() {
        return new PRPAMT201303UV02Guardian();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02LivingSubjectDeceasedTime }
     * 
     */
    public PRPAMT201306UV02LivingSubjectDeceasedTime createPRPAMT201306UV02LivingSubjectDeceasedTime() {
        return new PRPAMT201306UV02LivingSubjectDeceasedTime();
    }

    /**
     * Create an instance of {@link COCTMT530000UVConsumable }
     * 
     */
    public COCTMT530000UVConsumable createCOCTMT530000UVConsumable() {
        return new COCTMT530000UVConsumable();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04BillableClinicalProduct }
     * 
     */
    public COCTMT490000UV04BillableClinicalProduct createCOCTMT490000UV04BillableClinicalProduct() {
        return new COCTMT490000UV04BillableClinicalProduct();
    }

    /**
     * Create an instance of {@link POCDMT000040Authenticator }
     * 
     */
    public POCDMT000040Authenticator createPOCDMT000040Authenticator() {
        return new POCDMT000040Authenticator();
    }

    /**
     * Create an instance of {@link MCAIMT900001UV01DetectedIssueManagement }
     * 
     */
    public MCAIMT900001UV01DetectedIssueManagement createMCAIMT900001UV01DetectedIssueManagement() {
        return new MCAIMT900001UV01DetectedIssueManagement();
    }

    /**
     * Create an instance of {@link Create201305RequestType }
     * 
     */
    public Create201305RequestType createCreate201305RequestType() {
        return new Create201305RequestType();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Citizen }
     * 
     */
    public PRPAMT201310UV02Citizen createPRPAMT201310UV02Citizen() {
        return new PRPAMT201310UV02Citizen();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01Acknowledgement }
     * 
     */
    public MCCIMT000300UV01Acknowledgement createMCCIMT000300UV01Acknowledgement() {
        return new MCCIMT000300UV01Acknowledgement();
    }

    /**
     * Create an instance of {@link COCTMT080000UVSpecimenAlternateIdentifier }
     * 
     */
    public COCTMT080000UVSpecimenAlternateIdentifier createCOCTMT080000UVSpecimenAlternateIdentifier() {
        return new COCTMT080000UVSpecimenAlternateIdentifier();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Subject4 }
     * 
     */
    public PRPAMT201303UV02Subject4 createPRPAMT201303UV02Subject4() {
        return new PRPAMT201303UV02Subject4();
    }

    /**
     * Create an instance of {@link PRPAIN201302UV02MFMIMT700701UV01Subject1 }
     * 
     */
    public PRPAIN201302UV02MFMIMT700701UV01Subject1 createPRPAIN201302UV02MFMIMT700701UV01Subject1() {
        return new PRPAIN201302UV02MFMIMT700701UV01Subject1();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02ContactParty }
     * 
     */
    public PRPAMT201302UV02ContactParty createPRPAMT201302UV02ContactParty() {
        return new PRPAMT201302UV02ContactParty();
    }

    /**
     * Create an instance of {@link EIVLPPDTS }
     * 
     */
    public EIVLPPDTS createEIVLPPDTS() {
        return new EIVLPPDTS();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06PresentingIndication }
     * 
     */
    public COCTMT290000UV06PresentingIndication createCOCTMT290000UV06PresentingIndication() {
        return new COCTMT290000UV06PresentingIndication();
    }

    /**
     * Create an instance of {@link COCTMT140007UVDevice }
     * 
     */
    public COCTMT140007UVDevice createCOCTMT140007UVDevice() {
        return new COCTMT140007UVDevice();
    }

    /**
     * Create an instance of {@link StrucDocTfoot }
     * 
     */
    public StrucDocTfoot createStrucDocTfoot() {
        return new StrucDocTfoot();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02CoveredParty }
     * 
     */
    public PRPAMT201301UV02CoveredParty createPRPAMT201301UV02CoveredParty() {
        return new PRPAMT201301UV02CoveredParty();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PatientPatientPerson }
     * 
     */
    public PRPAMT201302UV02PatientPatientPerson createPRPAMT201302UV02PatientPatientPerson() {
        return new PRPAMT201302UV02PatientPatientPerson();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02PatientOfOtherProvider }
     * 
     */
    public PRPAMT201310UV02PatientOfOtherProvider createPRPAMT201310UV02PatientOfOtherProvider() {
        return new PRPAMT201310UV02PatientOfOtherProvider();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubject22 }
     * 
     */
    public COCTMT230100UVSubject22 createCOCTMT230100UVSubject22() {
        return new COCTMT230100UVSubject22();
    }

    /**
     * Create an instance of {@link POCDMT000040Component3 }
     * 
     */
    public POCDMT000040Component3 createPOCDMT000040Component3() {
        return new POCDMT000040Component3();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01DataEnterer }
     * 
     */
    public MFMIMT700711UV01DataEnterer createMFMIMT700711UV01DataEnterer() {
        return new MFMIMT700711UV01DataEnterer();
    }

    /**
     * Create an instance of {@link QUQIMT021001UV01DataEnterer }
     * 
     */
    public QUQIMT021001UV01DataEnterer createQUQIMT021001UV01DataEnterer() {
        return new QUQIMT021001UV01DataEnterer();
    }

    /**
     * Create an instance of {@link POCDMT000040SpecimenRole }
     * 
     */
    public POCDMT000040SpecimenRole createPOCDMT000040SpecimenRole() {
        return new POCDMT000040SpecimenRole();
    }

    /**
     * Create an instance of {@link COCTMT030202UV01Place }
     * 
     */
    public COCTMT030202UV01Place createCOCTMT030202UV01Place() {
        return new COCTMT030202UV01Place();
    }

    /**
     * Create an instance of {@link COCTMT530000UVControlActEvent }
     * 
     */
    public COCTMT530000UVControlActEvent createCOCTMT530000UVControlActEvent() {
        return new COCTMT530000UVControlActEvent();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01PriorRegistration }
     * 
     */
    public MFMIMT700701UV01PriorRegistration createMFMIMT700701UV01PriorRegistration() {
        return new MFMIMT700701UV01PriorRegistration();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Origin }
     * 
     */
    public COCTMT600000UV06Origin createCOCTMT600000UV06Origin() {
        return new COCTMT600000UV06Origin();
    }

    /**
     * Create an instance of {@link QUQIMT021001UV01Overseer }
     * 
     */
    public QUQIMT021001UV01Overseer createQUQIMT021001UV01Overseer() {
        return new QUQIMT021001UV01Overseer();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Author }
     * 
     */
    public COCTMT290000UV06Author createCOCTMT290000UV06Author() {
        return new COCTMT290000UV06Author();
    }

    /**
     * Create an instance of {@link POCDMT000040ExternalDocument }
     * 
     */
    public POCDMT000040ExternalDocument createPOCDMT000040ExternalDocument() {
        return new POCDMT000040ExternalDocument();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02LanguageCommunication }
     * 
     */
    public PRPAMT201301UV02LanguageCommunication createPRPAMT201301UV02LanguageCommunication() {
        return new PRPAMT201301UV02LanguageCommunication();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01ReplacementOf }
     * 
     */
    public MFMIMT700711UV01ReplacementOf createMFMIMT700711UV01ReplacementOf() {
        return new MFMIMT700711UV01ReplacementOf();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02CareGiver }
     * 
     */
    public PRPAMT201310UV02CareGiver createPRPAMT201310UV02CareGiver() {
        return new PRPAMT201310UV02CareGiver();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01LanguageCommunication }
     * 
     */
    public COCTMT090000UV01LanguageCommunication createCOCTMT090000UV01LanguageCommunication() {
        return new COCTMT090000UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06ResponsibleParty2 }
     * 
     */
    public COCTMT510000UV06ResponsibleParty2 createCOCTMT510000UV06ResponsibleParty2() {
        return new COCTMT510000UV06ResponsibleParty2();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Reason5 }
     * 
     */
    public COCTMT290000UV06Reason5 createCOCTMT290000UV06Reason5() {
        return new COCTMT290000UV06Reason5();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04Holder }
     * 
     */
    public COCTMT500000UV04Holder createCOCTMT500000UV04Holder() {
        return new COCTMT500000UV04Holder();
    }

    /**
     * Create an instance of {@link COCTMT260003UVManufacturedMaterialKind }
     * 
     */
    public COCTMT260003UVManufacturedMaterialKind createCOCTMT260003UVManufacturedMaterialKind() {
        return new COCTMT260003UVManufacturedMaterialKind();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Subject3 }
     * 
     */
    public PRPAMT201310UV02Subject3 createPRPAMT201310UV02Subject3() {
        return new PRPAMT201310UV02Subject3();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02MFMIMT700711UV01Subject2 }
     * 
     */
    public PRPAIN201306UV02MFMIMT700711UV01Subject2 createPRPAIN201306UV02MFMIMT700711UV01Subject2() {
        return new PRPAIN201306UV02MFMIMT700711UV01Subject2();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Author }
     * 
     */
    public COCTMT300000UV04Author createCOCTMT300000UV04Author() {
        return new COCTMT300000UV04Author();
    }

    /**
     * Create an instance of {@link COCTMT500000UV04Beneficiary }
     * 
     */
    public COCTMT500000UV04Beneficiary createCOCTMT500000UV04Beneficiary() {
        return new COCTMT500000UV04Beneficiary();
    }

    /**
     * Create an instance of {@link EDExplicit }
     * 
     */
    public EDExplicit createEDExplicit() {
        return new EDExplicit();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoverageDefinition }
     * 
     */
    public COCTMT510000UV06CoverageDefinition createCOCTMT510000UV06CoverageDefinition() {
        return new COCTMT510000UV06CoverageDefinition();
    }

    /**
     * Create an instance of {@link COCTMT040203UV01NotificationParty }
     * 
     */
    public COCTMT040203UV01NotificationParty createCOCTMT040203UV01NotificationParty() {
        return new COCTMT040203UV01NotificationParty();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Subject4 }
     * 
     */
    public MFMIMT700711UV01Subject4 createMFMIMT700711UV01Subject4() {
        return new MFMIMT700711UV01Subject4();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02EmployeeId }
     * 
     */
    public PRPAMT201302UV02EmployeeId createPRPAMT201302UV02EmployeeId() {
        return new PRPAMT201302UV02EmployeeId();
    }

    /**
     * Create an instance of {@link MCCIMT000300UV01RespondTo }
     * 
     */
    public MCCIMT000300UV01RespondTo createMCCIMT000300UV01RespondTo() {
        return new MCCIMT000300UV01RespondTo();
    }

    /**
     * Create an instance of {@link AdxpCounty }
     * 
     */
    public AdxpCounty createAdxpCounty() {
        return new AdxpCounty();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02MCCIMT000300UV01Message }
     * 
     */
    public PRPAIN201306UV02MCCIMT000300UV01Message createPRPAIN201306UV02MCCIMT000300UV01Message() {
        return new PRPAIN201306UV02MCCIMT000300UV01Message();
    }

    /**
     * Create an instance of {@link COCTMT090002UV01AssignedEntity }
     * 
     */
    public COCTMT090002UV01AssignedEntity createCOCTMT090002UV01AssignedEntity() {
        return new COCTMT090002UV01AssignedEntity();
    }

    /**
     * Create an instance of {@link PRPAIN201301UV02MFMIMT700701UV01ControlActProcess }
     * 
     */
    public PRPAIN201301UV02MFMIMT700701UV01ControlActProcess createPRPAIN201301UV02MFMIMT700701UV01ControlActProcess() {
        return new PRPAIN201301UV02MFMIMT700701UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06ResponsibleParty }
     * 
     */
    public COCTMT510000UV06ResponsibleParty createCOCTMT510000UV06ResponsibleParty() {
        return new COCTMT510000UV06ResponsibleParty();
    }

    /**
     * Create an instance of {@link POCDMT000040EntryRelationship }
     * 
     */
    public POCDMT000040EntryRelationship createPOCDMT000040EntryRelationship() {
        return new POCDMT000040EntryRelationship();
    }

    /**
     * Create an instance of {@link INT }
     * 
     */
    public INT createINT() {
        return new INT();
    }

    /**
     * Create an instance of {@link StrucDocTable }
     * 
     */
    public StrucDocTable createStrucDocTable() {
        return new StrucDocTable();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06SupplyEvent }
     * 
     */
    public COCTMT600000UV06SupplyEvent createCOCTMT600000UV06SupplyEvent() {
        return new COCTMT600000UV06SupplyEvent();
    }

    /**
     * Create an instance of {@link POCDMT000040RelatedEntity }
     * 
     */
    public POCDMT000040RelatedEntity createPOCDMT000040RelatedEntity() {
        return new POCDMT000040RelatedEntity();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06SupplyObservationEvent }
     * 
     */
    public COCTMT600000UV06SupplyObservationEvent createCOCTMT600000UV06SupplyObservationEvent() {
        return new COCTMT600000UV06SupplyObservationEvent();
    }

    /**
     * Create an instance of {@link COCTMT230100UVCountry }
     * 
     */
    public COCTMT230100UVCountry createCOCTMT230100UVCountry() {
        return new COCTMT230100UVCountry();
    }

    /**
     * Create an instance of {@link COCTMT530000UVProcedure }
     * 
     */
    public COCTMT530000UVProcedure createCOCTMT530000UVProcedure() {
        return new COCTMT530000UVProcedure();
    }

    /**
     * Create an instance of {@link COCTMT090108UVAssignedPerson }
     * 
     */
    public COCTMT090108UVAssignedPerson createCOCTMT090108UVAssignedPerson() {
        return new COCTMT090108UVAssignedPerson();
    }

    /**
     * Create an instance of {@link COCTMT310000UV04Location }
     * 
     */
    public COCTMT310000UV04Location createCOCTMT310000UV04Location() {
        return new COCTMT310000UV04Location();
    }

    /**
     * Create an instance of {@link PRPAIN201306UV02 }
     * 
     */
    public PRPAIN201306UV02 createPRPAIN201306UV02() {
        return new PRPAIN201306UV02();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSubject1 }
     * 
     */
    public COCTMT530000UVSubject1 createCOCTMT530000UVSubject1() {
        return new COCTMT530000UVSubject1();
    }

    /**
     * Create an instance of {@link AdxpCity }
     * 
     */
    public AdxpCity createAdxpCity() {
        return new AdxpCity();
    }

    /**
     * Create an instance of {@link BL }
     * 
     */
    public BL createBL() {
        return new BL();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoveredParty }
     * 
     */
    public COCTMT510000UV06CoveredParty createCOCTMT510000UV06CoveredParty() {
        return new COCTMT510000UV06CoveredParty();
    }

    /**
     * Create an instance of {@link COCTMT030007UVOtherIDs }
     * 
     */
    public COCTMT030007UVOtherIDs createCOCTMT030007UVOtherIDs() {
        return new COCTMT030007UVOtherIDs();
    }

    /**
     * Create an instance of {@link ANYNonNull }
     * 
     */
    public ANYNonNull createANYNonNull() {
        return new ANYNonNull();
    }

    /**
     * Create an instance of {@link COCTMT260003UVSeverityObservation }
     * 
     */
    public COCTMT260003UVSeverityObservation createCOCTMT260003UVSeverityObservation() {
        return new COCTMT260003UVSeverityObservation();
    }

    /**
     * Create an instance of {@link QUQIMT021001UV01InformationRecipient }
     * 
     */
    public QUQIMT021001UV01InformationRecipient createQUQIMT021001UV01InformationRecipient() {
        return new QUQIMT021001UV01InformationRecipient();
    }

    /**
     * Create an instance of {@link IVXBTSExplicit }
     * 
     */
    public IVXBTSExplicit createIVXBTSExplicit() {
        return new IVXBTSExplicit();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02NonPersonLivingSubject }
     * 
     */
    public PRPAMT201301UV02NonPersonLivingSubject createPRPAMT201301UV02NonPersonLivingSubject() {
        return new PRPAMT201301UV02NonPersonLivingSubject();
    }

    /**
     * Create an instance of {@link HXITPQ }
     * 
     */
    public HXITPQ createHXITPQ() {
        return new HXITPQ();
    }

    /**
     * Create an instance of {@link StrucDocTitleFootnote }
     * 
     */
    public StrucDocTitleFootnote createStrucDocTitleFootnote() {
        return new StrucDocTitleFootnote();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01Acknowledgement }
     * 
     */
    public MCCIMT000200UV01Acknowledgement createMCCIMT000200UV01Acknowledgement() {
        return new MCCIMT000200UV01Acknowledgement();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02PatientId }
     * 
     */
    public PRPAMT201302UV02PatientId createPRPAMT201302UV02PatientId() {
        return new PRPAMT201302UV02PatientId();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ServiceRequest }
     * 
     */
    public COCTMT290000UV06ServiceRequest createCOCTMT290000UV06ServiceRequest() {
        return new COCTMT290000UV06ServiceRequest();
    }

    /**
     * Create an instance of {@link MO }
     * 
     */
    public MO createMO() {
        return new MO();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02LanguageCommunication }
     * 
     */
    public PRPAMT201310UV02LanguageCommunication createPRPAMT201310UV02LanguageCommunication() {
        return new PRPAMT201310UV02LanguageCommunication();
    }

    /**
     * Create an instance of {@link AdxpDirection }
     * 
     */
    public AdxpDirection createAdxpDirection() {
        return new AdxpDirection();
    }

    /**
     * Create an instance of {@link PRPAIN201302UV02MCCIMT000100UV01Message }
     * 
     */
    public PRPAIN201302UV02MCCIMT000100UV01Message createPRPAIN201302UV02MCCIMT000100UV01Message() {
        return new PRPAIN201302UV02MCCIMT000100UV01Message();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04ManufacturedProductOrganization }
     * 
     */
    public COCTMT490000UV04ManufacturedProductOrganization createCOCTMT490000UV04ManufacturedProductOrganization() {
        return new COCTMT490000UV04ManufacturedProductOrganization();
    }

    /**
     * Create an instance of {@link POCDMT000040Participant2 }
     * 
     */
    public POCDMT000040Participant2 createPOCDMT000040Participant2() {
        return new POCDMT000040Participant2();
    }

    /**
     * Create an instance of {@link EnGiven }
     * 
     */
    public EnGiven createEnGiven() {
        return new EnGiven();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Nation }
     * 
     */
    public PRPAMT201304UV02Nation createPRPAMT201304UV02Nation() {
        return new PRPAMT201304UV02Nation();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04Referral }
     * 
     */
    public COCTMT740000UV04Referral createCOCTMT740000UV04Referral() {
        return new COCTMT740000UV04Referral();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02PatientTelecom }
     * 
     */
    public PRPAMT201306UV02PatientTelecom createPRPAMT201306UV02PatientTelecom() {
        return new PRPAMT201306UV02PatientTelecom();
    }

    /**
     * Create an instance of {@link COCTMT080000UVCriterion }
     * 
     */
    public COCTMT080000UVCriterion createCOCTMT080000UVCriterion() {
        return new COCTMT080000UVCriterion();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04ManufacturedMaterialKind }
     * 
     */
    public COCTMT300000UV04ManufacturedMaterialKind createCOCTMT300000UV04ManufacturedMaterialKind() {
        return new COCTMT300000UV04ManufacturedMaterialKind();
    }

    /**
     * Create an instance of {@link COCTMT810000UVInFulfillmentOf }
     * 
     */
    public COCTMT810000UVInFulfillmentOf createCOCTMT810000UVInFulfillmentOf() {
        return new COCTMT810000UVInFulfillmentOf();
    }

    /**
     * Create an instance of {@link COCTMT030203UV02Person }
     * 
     */
    public COCTMT030203UV02Person createCOCTMT030203UV02Person() {
        return new COCTMT030203UV02Person();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Reason1 }
     * 
     */
    public COCTMT290000UV06Reason1 createCOCTMT290000UV06Reason1() {
        return new COCTMT290000UV06Reason1();
    }

    /**
     * Create an instance of {@link COCTMT820000UVPerson }
     * 
     */
    public COCTMT820000UVPerson createCOCTMT820000UVPerson() {
        return new COCTMT820000UVPerson();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02MatchWeight }
     * 
     */
    public PRPAMT201306UV02MatchWeight createPRPAMT201306UV02MatchWeight() {
        return new PRPAMT201306UV02MatchWeight();
    }

    /**
     * Create an instance of {@link CommunityPRPAIN201306UV02ResponseType }
     * 
     */
    public CommunityPRPAIN201306UV02ResponseType createCommunityPRPAIN201306UV02ResponseType() {
        return new CommunityPRPAIN201306UV02ResponseType();
    }

    /**
     * Create an instance of {@link PRPAIN201302UV02 }
     * 
     */
    public PRPAIN201302UV02 createPRPAIN201302UV02() {
        return new PRPAIN201302UV02();
    }

    /**
     * Create an instance of {@link COCTMT260003UVDetectedMedicationIssueDefinition }
     * 
     */
    public COCTMT260003UVDetectedMedicationIssueDefinition createCOCTMT260003UVDetectedMedicationIssueDefinition() {
        return new COCTMT260003UVDetectedMedicationIssueDefinition();
    }

    /**
     * Create an instance of {@link AdxpExplicitDeliveryMode }
     * 
     */
    public AdxpExplicitDeliveryMode createAdxpExplicitDeliveryMode() {
        return new AdxpExplicitDeliveryMode();
    }

    /**
     * Create an instance of {@link COCTMT530000UVAct }
     * 
     */
    public COCTMT530000UVAct createCOCTMT530000UVAct() {
        return new COCTMT530000UVAct();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Subject2 }
     * 
     */
    public COCTMT290000UV06Subject2 createCOCTMT290000UV06Subject2() {
        return new COCTMT290000UV06Subject2();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Specimen }
     * 
     */
    public COCTMT290000UV06Specimen createCOCTMT290000UV06Specimen() {
        return new COCTMT290000UV06Specimen();
    }

    /**
     * Create an instance of {@link COCTMT260003UVConsumable }
     * 
     */
    public COCTMT260003UVConsumable createCOCTMT260003UVConsumable() {
        return new COCTMT260003UVConsumable();
    }

    /**
     * Create an instance of {@link AdxpExplicitCounty }
     * 
     */
    public AdxpExplicitCounty createAdxpExplicitCounty() {
        return new AdxpExplicitCounty();
    }

    /**
     * Create an instance of {@link COCTMT530000UVEncounter }
     * 
     */
    public COCTMT530000UVEncounter createCOCTMT530000UVEncounter() {
        return new COCTMT530000UVEncounter();
    }

    /**
     * Create an instance of {@link COCTMT230100UVSubstance }
     * 
     */
    public COCTMT230100UVSubstance createCOCTMT230100UVSubstance() {
        return new COCTMT230100UVSubstance();
    }

    /**
     * Create an instance of {@link MCCIIN000002UV01 }
     * 
     */
    public MCCIIN000002UV01 createMCCIIN000002UV01() {
        return new MCCIIN000002UV01();
    }

    /**
     * Create an instance of {@link COCTMT260003UVOtherSupply }
     * 
     */
    public COCTMT260003UVOtherSupply createCOCTMT260003UVOtherSupply() {
        return new COCTMT260003UVOtherSupply();
    }

    /**
     * Create an instance of {@link COCTMT090100UV01RoleOther }
     * 
     */
    public COCTMT090100UV01RoleOther createCOCTMT090100UV01RoleOther() {
        return new COCTMT090100UV01RoleOther();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Subject3 }
     * 
     */
    public PRPAMT201302UV02Subject3 createPRPAMT201302UV02Subject3() {
        return new PRPAMT201302UV02Subject3();
    }

    /**
     * Create an instance of {@link COCTMT260003UVOtherMedication }
     * 
     */
    public COCTMT260003UVOtherMedication createCOCTMT260003UVOtherMedication() {
        return new COCTMT260003UVOtherMedication();
    }

    /**
     * Create an instance of {@link POCDMT000040InFulfillmentOf }
     * 
     */
    public POCDMT000040InFulfillmentOf createPOCDMT000040InFulfillmentOf() {
        return new POCDMT000040InFulfillmentOf();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Guardian }
     * 
     */
    public PRPAMT201302UV02Guardian createPRPAMT201302UV02Guardian() {
        return new PRPAMT201302UV02Guardian();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Performer }
     * 
     */
    public COCTMT600000UV06Performer createCOCTMT600000UV06Performer() {
        return new COCTMT600000UV06Performer();
    }

    /**
     * Create an instance of {@link COCTMT530000UVComponent }
     * 
     */
    public COCTMT530000UVComponent createCOCTMT530000UVComponent() {
        return new COCTMT530000UVComponent();
    }

    /**
     * Create an instance of {@link POCDMT000040PatientRole }
     * 
     */
    public POCDMT000040PatientRole createPOCDMT000040PatientRole() {
        return new POCDMT000040PatientRole();
    }

    /**
     * Create an instance of {@link COCTMT740000UV04ProviderPerson }
     * 
     */
    public COCTMT740000UV04ProviderPerson createCOCTMT740000UV04ProviderPerson() {
        return new COCTMT740000UV04ProviderPerson();
    }

    /**
     * Create an instance of {@link COCTMT260003UVMitigates }
     * 
     */
    public COCTMT260003UVMitigates createCOCTMT260003UVMitigates() {
        return new COCTMT260003UVMitigates();
    }

    /**
     * Create an instance of {@link COCTMT530000UVRelatedEntity }
     * 
     */
    public COCTMT530000UVRelatedEntity createCOCTMT530000UVRelatedEntity() {
        return new COCTMT530000UVRelatedEntity();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Subject4 }
     * 
     */
    public MFMIMT700701UV01Subject4 createMFMIMT700701UV01Subject4() {
        return new MFMIMT700701UV01Subject4();
    }

    /**
     * Create an instance of {@link AdxpDelimiter }
     * 
     */
    public AdxpDelimiter createAdxpDelimiter() {
        return new AdxpDelimiter();
    }

    /**
     * Create an instance of {@link PRPAMT201301UV02Subject4 }
     * 
     */
    public PRPAMT201301UV02Subject4 createPRPAMT201301UV02Subject4() {
        return new PRPAMT201301UV02Subject4();
    }

    /**
     * Create an instance of {@link PIXConsumerPRPAIN201302UVSecuredRequestType }
     * 
     */
    public PIXConsumerPRPAIN201302UVSecuredRequestType createPIXConsumerPRPAIN201302UVSecuredRequestType() {
        return new PIXConsumerPRPAIN201302UVSecuredRequestType();
    }

    /**
     * Create an instance of {@link IVXBPPDTS }
     * 
     */
    public IVXBPPDTS createIVXBPPDTS() {
        return new IVXBPPDTS();
    }

    /**
     * Create an instance of {@link PIXConsumerPRPAIN201309UVRequestType }
     * 
     */
    public PIXConsumerPRPAIN201309UVRequestType createPIXConsumerPRPAIN201309UVRequestType() {
        return new PIXConsumerPRPAIN201309UVRequestType();
    }

    /**
     * Create an instance of {@link COCTMT260003UVLocation }
     * 
     */
    public COCTMT260003UVLocation createCOCTMT260003UVLocation() {
        return new COCTMT260003UVLocation();
    }

    /**
     * Create an instance of {@link COCTMT440001UVValuedItem }
     * 
     */
    public COCTMT440001UVValuedItem createCOCTMT440001UVValuedItem() {
        return new COCTMT440001UVValuedItem();
    }

    /**
     * Create an instance of {@link COCTMT090002UV01Device }
     * 
     */
    public COCTMT090002UV01Device createCOCTMT090002UV01Device() {
        return new COCTMT090002UV01Device();
    }

    /**
     * Create an instance of {@link AdxpPostBox }
     * 
     */
    public AdxpPostBox createAdxpPostBox() {
        return new AdxpPostBox();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01Member }
     * 
     */
    public COCTMT090300UV01Member createCOCTMT090300UV01Member() {
        return new COCTMT090300UV01Member();
    }

    /**
     * Create an instance of {@link POCDMT000040Order }
     * 
     */
    public POCDMT000040Order createPOCDMT000040Order() {
        return new POCDMT000040Order();
    }

    /**
     * Create an instance of {@link COCTMT490000UV04ManufacturedMaterial }
     * 
     */
    public COCTMT490000UV04ManufacturedMaterial createCOCTMT490000UV04ManufacturedMaterial() {
        return new COCTMT490000UV04ManufacturedMaterial();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02Guardian }
     * 
     */
    public PRPAMT201310UV02Guardian createPRPAMT201310UV02Guardian() {
        return new PRPAMT201310UV02Guardian();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06InjuryPlace }
     * 
     */
    public COCTMT290000UV06InjuryPlace createCOCTMT290000UV06InjuryPlace() {
        return new COCTMT290000UV06InjuryPlace();
    }

    /**
     * Create an instance of {@link ONExplicit }
     * 
     */
    public ONExplicit createONExplicit() {
        return new ONExplicit();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02Employee }
     * 
     */
    public PRPAMT201302UV02Employee createPRPAMT201302UV02Employee() {
        return new PRPAMT201302UV02Employee();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06Reason4 }
     * 
     */
    public COCTMT290000UV06Reason4 createCOCTMT290000UV06Reason4() {
        return new COCTMT290000UV06Reason4();
    }

    /**
     * Create an instance of {@link PRPAIN201304UV02MFMIMT700701UV01ControlActProcess }
     * 
     */
    public PRPAIN201304UV02MFMIMT700701UV01ControlActProcess createPRPAIN201304UV02MFMIMT700701UV01ControlActProcess() {
        return new PRPAIN201304UV02MFMIMT700701UV01ControlActProcess();
    }

    /**
     * Create an instance of {@link POCDMT000040RelatedSubject }
     * 
     */
    public POCDMT000040RelatedSubject createPOCDMT000040RelatedSubject() {
        return new POCDMT000040RelatedSubject();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01RegistrationRequest }
     * 
     */
    public MFMIMT700711UV01RegistrationRequest createMFMIMT700711UV01RegistrationRequest() {
        return new MFMIMT700711UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link COCTMT960000UV05Component2 }
     * 
     */
    public COCTMT960000UV05Component2 createCOCTMT960000UV05Component2() {
        return new COCTMT960000UV05Component2();
    }

    /**
     * Create an instance of {@link IVLMO }
     * 
     */
    public IVLMO createIVLMO() {
        return new IVLMO();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06AdministrativeDiagnosis }
     * 
     */
    public COCTMT290000UV06AdministrativeDiagnosis createCOCTMT290000UV06AdministrativeDiagnosis() {
        return new COCTMT290000UV06AdministrativeDiagnosis();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Reference2 }
     * 
     */
    public COCTMT510000UV06Reference2 createCOCTMT510000UV06Reference2() {
        return new COCTMT510000UV06Reference2();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01PriorRegistration }
     * 
     */
    public MFMIMT700711UV01PriorRegistration createMFMIMT700711UV01PriorRegistration() {
        return new MFMIMT700711UV01PriorRegistration();
    }

    /**
     * Create an instance of {@link IVXBREAL }
     * 
     */
    public IVXBREAL createIVXBREAL() {
        return new IVXBREAL();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06Beneficiary }
     * 
     */
    public COCTMT510000UV06Beneficiary createCOCTMT510000UV06Beneficiary() {
        return new COCTMT510000UV06Beneficiary();
    }

    /**
     * Create an instance of {@link POCDMT000040ExternalObservation }
     * 
     */
    public POCDMT000040ExternalObservation createPOCDMT000040ExternalObservation() {
        return new POCDMT000040ExternalObservation();
    }

    /**
     * Create an instance of {@link COCTMT090300UV01LanguageCommunication }
     * 
     */
    public COCTMT090300UV01LanguageCommunication createCOCTMT090300UV01LanguageCommunication() {
        return new COCTMT090300UV01LanguageCommunication();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04SubstanceAdministrationIntent }
     * 
     */
    public COCTMT300000UV04SubstanceAdministrationIntent createCOCTMT300000UV04SubstanceAdministrationIntent() {
        return new COCTMT300000UV04SubstanceAdministrationIntent();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01Subject3 }
     * 
     */
    public MFMIMT700701UV01Subject3 createMFMIMT700701UV01Subject3() {
        return new MFMIMT700701UV01Subject3();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Custodian }
     * 
     */
    public MFMIMT700711UV01Custodian createMFMIMT700711UV01Custodian() {
        return new MFMIMT700711UV01Custodian();
    }

    /**
     * Create an instance of {@link COCTMT150007UVOrganization }
     * 
     */
    public COCTMT150007UVOrganization createCOCTMT150007UVOrganization() {
        return new COCTMT150007UVOrganization();
    }

    /**
     * Create an instance of {@link COCTMT530000UVResponsibleParty1 }
     * 
     */
    public COCTMT530000UVResponsibleParty1 createCOCTMT530000UVResponsibleParty1() {
        return new COCTMT530000UVResponsibleParty1();
    }

    /**
     * Create an instance of {@link COCTMT530000UVObservationRange }
     * 
     */
    public COCTMT530000UVObservationRange createCOCTMT530000UVObservationRange() {
        return new COCTMT530000UVObservationRange();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06CoveredParty2 }
     * 
     */
    public COCTMT510000UV06CoveredParty2 createCOCTMT510000UV06CoveredParty2() {
        return new COCTMT510000UV06CoveredParty2();
    }

    /**
     * Create an instance of {@link COCTMT510000UV06IndirectAuthorithyOver }
     * 
     */
    public COCTMT510000UV06IndirectAuthorithyOver createCOCTMT510000UV06IndirectAuthorithyOver() {
        return new COCTMT510000UV06IndirectAuthorithyOver();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02PrincipalCareProvisionId }
     * 
     */
    public PRPAMT201306UV02PrincipalCareProvisionId createPRPAMT201306UV02PrincipalCareProvisionId() {
        return new PRPAMT201306UV02PrincipalCareProvisionId();
    }

    /**
     * Create an instance of {@link COCTMT030007UVContactParty }
     * 
     */
    public COCTMT030007UVContactParty createCOCTMT030007UVContactParty() {
        return new COCTMT030007UVContactParty();
    }

    /**
     * Create an instance of {@link POCDMT000040Performer1 }
     * 
     */
    public POCDMT000040Performer1 createPOCDMT000040Performer1() {
        return new POCDMT000040Performer1();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01Overseer }
     * 
     */
    public MFMIMT700711UV01Overseer createMFMIMT700711UV01Overseer() {
        return new MFMIMT700711UV01Overseer();
    }

    /**
     * Create an instance of {@link AdxpExplicitPostalCode }
     * 
     */
    public AdxpExplicitPostalCode createAdxpExplicitPostalCode() {
        return new AdxpExplicitPostalCode();
    }

    /**
     * Create an instance of {@link REAL }
     * 
     */
    public REAL createREAL() {
        return new REAL();
    }

    /**
     * Create an instance of {@link PRPAIN201301UV02MFMIMT700701UV01Subject1 }
     * 
     */
    public PRPAIN201301UV02MFMIMT700701UV01Subject1 createPRPAIN201301UV02MFMIMT700701UV01Subject1() {
        return new PRPAIN201301UV02MFMIMT700701UV01Subject1();
    }

    /**
     * Create an instance of {@link QUQIMT021001UV01Reason }
     * 
     */
    public QUQIMT021001UV01Reason createQUQIMT021001UV01Reason() {
        return new QUQIMT021001UV01Reason();
    }

    /**
     * Create an instance of {@link MFMIMT700711UV01QueryAck }
     * 
     */
    public MFMIMT700711UV01QueryAck createMFMIMT700711UV01QueryAck() {
        return new MFMIMT700711UV01QueryAck();
    }

    /**
     * Create an instance of {@link MCCIMT000200UV01AcknowledgementDetail }
     * 
     */
    public MCCIMT000200UV01AcknowledgementDetail createMCCIMT000200UV01AcknowledgementDetail() {
        return new MCCIMT000200UV01AcknowledgementDetail();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Nation }
     * 
     */
    public PRPAMT201303UV02Nation createPRPAMT201303UV02Nation() {
        return new PRPAMT201303UV02Nation();
    }

    /**
     * Create an instance of {@link COCTMT090000UV01Device }
     * 
     */
    public COCTMT090000UV01Device createCOCTMT090000UV01Device() {
        return new COCTMT090000UV01Device();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02ContactParty }
     * 
     */
    public PRPAMT201310UV02ContactParty createPRPAMT201310UV02ContactParty() {
        return new PRPAMT201310UV02ContactParty();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Student }
     * 
     */
    public PRPAMT201303UV02Student createPRPAMT201303UV02Student() {
        return new PRPAMT201303UV02Student();
    }

    /**
     * Create an instance of {@link POCDMT000040Specimen }
     * 
     */
    public POCDMT000040Specimen createPOCDMT000040Specimen() {
        return new POCDMT000040Specimen();
    }

    /**
     * Create an instance of {@link COCTMT230100UVAgency }
     * 
     */
    public COCTMT230100UVAgency createCOCTMT230100UVAgency() {
        return new COCTMT230100UVAgency();
    }

    /**
     * Create an instance of {@link PRPAMT201306UV02PatientStatusCode }
     * 
     */
    public PRPAMT201306UV02PatientStatusCode createPRPAMT201306UV02PatientStatusCode() {
        return new PRPAMT201306UV02PatientStatusCode();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02Subject2 }
     * 
     */
    public PRPAMT201303UV02Subject2 createPRPAMT201303UV02Subject2() {
        return new PRPAMT201303UV02Subject2();
    }

    /**
     * Create an instance of {@link COCTMT290000UV06ReusableDevice }
     * 
     */
    public COCTMT290000UV06ReusableDevice createCOCTMT290000UV06ReusableDevice() {
        return new COCTMT290000UV06ReusableDevice();
    }

    /**
     * Create an instance of {@link PIXConsumerMCCIIN000002UV01RequestType }
     * 
     */
    public PIXConsumerMCCIIN000002UV01RequestType createPIXConsumerMCCIIN000002UV01RequestType() {
        return new PIXConsumerMCCIIN000002UV01RequestType();
    }

    /**
     * Create an instance of {@link POCDMT000040Participant1 }
     * 
     */
    public POCDMT000040Participant1 createPOCDMT000040Participant1() {
        return new POCDMT000040Participant1();
    }

    /**
     * Create an instance of {@link PRPAMT201310UV02QueryMatchObservation }
     * 
     */
    public PRPAMT201310UV02QueryMatchObservation createPRPAMT201310UV02QueryMatchObservation() {
        return new PRPAMT201310UV02QueryMatchObservation();
    }

    /**
     * Create an instance of {@link POCDMT000040AssignedCustodian }
     * 
     */
    public POCDMT000040AssignedCustodian createPOCDMT000040AssignedCustodian() {
        return new POCDMT000040AssignedCustodian();
    }

    /**
     * Create an instance of {@link COCTMT530000UVSubstanceAdministration }
     * 
     */
    public COCTMT530000UVSubstanceAdministration createCOCTMT530000UVSubstanceAdministration() {
        return new COCTMT530000UVSubstanceAdministration();
    }

    /**
     * Create an instance of {@link PRPAMT201303UV02BirthPlace }
     * 
     */
    public PRPAMT201303UV02BirthPlace createPRPAMT201303UV02BirthPlace() {
        return new PRPAMT201303UV02BirthPlace();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01PriorRegisteredRole }
     * 
     */
    public MFMIMT700701UV01PriorRegisteredRole createMFMIMT700701UV01PriorRegisteredRole() {
        return new MFMIMT700701UV01PriorRegisteredRole();
    }

    /**
     * Create an instance of {@link COCTMT600000UV06Diagnosis }
     * 
     */
    public COCTMT600000UV06Diagnosis createCOCTMT600000UV06Diagnosis() {
        return new COCTMT600000UV06Diagnosis();
    }

    /**
     * Create an instance of {@link PRPAMT201302UV02CareGiver }
     * 
     */
    public PRPAMT201302UV02CareGiver createPRPAMT201302UV02CareGiver() {
        return new PRPAMT201302UV02CareGiver();
    }

    /**
     * Create an instance of {@link SXCMREAL }
     * 
     */
    public SXCMREAL createSXCMREAL() {
        return new SXCMREAL();
    }

    /**
     * Create an instance of {@link IVXBMO }
     * 
     */
    public IVXBMO createIVXBMO() {
        return new IVXBMO();
    }

    /**
     * Create an instance of {@link MFMIMT700701UV01RegistrationRequest }
     * 
     */
    public MFMIMT700701UV01RegistrationRequest createMFMIMT700701UV01RegistrationRequest() {
        return new MFMIMT700701UV01RegistrationRequest();
    }

    /**
     * Create an instance of {@link COCTMT150000UV02OrganizationPartOf }
     * 
     */
    public COCTMT150000UV02OrganizationPartOf createCOCTMT150000UV02OrganizationPartOf() {
        return new COCTMT150000UV02OrganizationPartOf();
    }

    /**
     * Create an instance of {@link COCTMT030000UV04BirthPlace }
     * 
     */
    public COCTMT030000UV04BirthPlace createCOCTMT030000UV04BirthPlace() {
        return new COCTMT030000UV04BirthPlace();
    }

    /**
     * Create an instance of {@link StrucDocCaption }
     * 
     */
    public StrucDocCaption createStrucDocCaption() {
        return new StrucDocCaption();
    }

    /**
     * Create an instance of {@link PRPAMT201304UV02Subject }
     * 
     */
    public PRPAMT201304UV02Subject createPRPAMT201304UV02Subject() {
        return new PRPAMT201304UV02Subject();
    }

    /**
     * Create an instance of {@link EnSuffix }
     * 
     */
    public EnSuffix createEnSuffix() {
        return new EnSuffix();
    }

    /**
     * Create an instance of {@link PIXConsumerPRPAIN201309UVSecuredRequestType }
     * 
     */
    public PIXConsumerPRPAIN201309UVSecuredRequestType createPIXConsumerPRPAIN201309UVSecuredRequestType() {
        return new PIXConsumerPRPAIN201309UVSecuredRequestType();
    }

    /**
     * Create an instance of {@link COCTMT300000UV04Substitution }
     * 
     */
    public COCTMT300000UV04Substitution createCOCTMT300000UV04Substitution() {
        return new COCTMT300000UV04Substitution();
    }

    /**
     * Create an instance of {@link COCTMT030007UVLanguageCommunication }
     * 
     */
    public COCTMT030007UVLanguageCommunication createCOCTMT030007UVLanguageCommunication() {
        return new COCTMT030007UVLanguageCommunication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFault201310RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "CreateFault201310Request")
    public JAXBElement<CreateFault201310RequestType> createCreateFault201310Request(CreateFault201310RequestType value) {
        return new JAXBElement<CreateFault201310RequestType>(_CreateFault201310Request_QNAME, CreateFault201310RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create201310RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "Create201310Request")
    public JAXBElement<Create201310RequestType> createCreate201310Request(Create201310RequestType value) {
        return new JAXBElement<Create201310RequestType>(_Create201310Request_QNAME, Create201310RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerPRPAIN201310UVRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_PRPA_IN201310UVRequest")
    public JAXBElement<PIXConsumerPRPAIN201310UVRequestType> createPIXConsumerPRPAIN201310UVRequest(PIXConsumerPRPAIN201310UVRequestType value) {
        return new JAXBElement<PIXConsumerPRPAIN201310UVRequestType>(_PIXConsumerPRPAIN201310UVRequest_QNAME, PIXConsumerPRPAIN201310UVRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerPRPAIN201309UVSecuredRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_PRPA_IN201309UVSecuredRequest")
    public JAXBElement<PIXConsumerPRPAIN201309UVSecuredRequestType> createPIXConsumerPRPAIN201309UVSecuredRequest(PIXConsumerPRPAIN201309UVSecuredRequestType value) {
        return new JAXBElement<PIXConsumerPRPAIN201309UVSecuredRequestType>(_PIXConsumerPRPAIN201309UVSecuredRequest_QNAME, PIXConsumerPRPAIN201309UVSecuredRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerPRPAIN201309UVRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_PRPA_IN201309UVRequest")
    public JAXBElement<PIXConsumerPRPAIN201309UVRequestType> createPIXConsumerPRPAIN201309UVRequest(PIXConsumerPRPAIN201309UVRequestType value) {
        return new JAXBElement<PIXConsumerPRPAIN201309UVRequestType>(_PIXConsumerPRPAIN201309UVRequest_QNAME, PIXConsumerPRPAIN201309UVRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerMCCIIN000002UV01RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_MCCI_IN000002UV01Request")
    public JAXBElement<PIXConsumerMCCIIN000002UV01RequestType> createPIXConsumerMCCIIN000002UV01Request(PIXConsumerMCCIIN000002UV01RequestType value) {
        return new JAXBElement<PIXConsumerMCCIIN000002UV01RequestType>(_PIXConsumerMCCIIN000002UV01Request_QNAME, PIXConsumerMCCIIN000002UV01RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerPRPAIN201301UVSecuredRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_PRPA_IN201301UVSecuredRequest")
    public JAXBElement<PIXConsumerPRPAIN201301UVSecuredRequestType> createPIXConsumerPRPAIN201301UVSecuredRequest(PIXConsumerPRPAIN201301UVSecuredRequestType value) {
        return new JAXBElement<PIXConsumerPRPAIN201301UVSecuredRequestType>(_PIXConsumerPRPAIN201301UVSecuredRequest_QNAME, PIXConsumerPRPAIN201301UVSecuredRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespondingGatewayPRPAIN201305UV02RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "RespondingGateway_PRPA_IN201305UV02Request")
    public JAXBElement<RespondingGatewayPRPAIN201305UV02RequestType> createRespondingGatewayPRPAIN201305UV02Request(RespondingGatewayPRPAIN201305UV02RequestType value) {
        return new JAXBElement<RespondingGatewayPRPAIN201305UV02RequestType>(_RespondingGatewayPRPAIN201305UV02Request_QNAME, RespondingGatewayPRPAIN201305UV02RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerPRPAIN201304UVRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_PRPA_IN201304UVRequest")
    public JAXBElement<PIXConsumerPRPAIN201304UVRequestType> createPIXConsumerPRPAIN201304UVRequest(PIXConsumerPRPAIN201304UVRequestType value) {
        return new JAXBElement<PIXConsumerPRPAIN201304UVRequestType>(_PIXConsumerPRPAIN201304UVRequest_QNAME, PIXConsumerPRPAIN201304UVRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create201302RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "Create201302Request")
    public JAXBElement<Create201302RequestType> createCreate201302Request(Create201302RequestType value) {
        return new JAXBElement<Create201302RequestType>(_Create201302Request_QNAME, Create201302RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerPRPAIN201302UVSecuredRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_PRPA_IN201302UVSecuredRequest")
    public JAXBElement<PIXConsumerPRPAIN201302UVSecuredRequestType> createPIXConsumerPRPAIN201302UVSecuredRequest(PIXConsumerPRPAIN201302UVSecuredRequestType value) {
        return new JAXBElement<PIXConsumerPRPAIN201302UVSecuredRequestType>(_PIXConsumerPRPAIN201302UVSecuredRequest_QNAME, PIXConsumerPRPAIN201302UVSecuredRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerPRPAIN201302UVRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_PRPA_IN201302UVRequest")
    public JAXBElement<PIXConsumerPRPAIN201302UVRequestType> createPIXConsumerPRPAIN201302UVRequest(PIXConsumerPRPAIN201302UVRequestType value) {
        return new JAXBElement<PIXConsumerPRPAIN201302UVRequestType>(_PIXConsumerPRPAIN201302UVRequest_QNAME, PIXConsumerPRPAIN201302UVRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create201305RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "Create201305Request")
    public JAXBElement<Create201305RequestType> createCreate201305Request(Create201305RequestType value) {
        return new JAXBElement<Create201305RequestType>(_Create201305Request_QNAME, Create201305RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerPRPAIN201309UVResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_PRPA_IN201309UVResponse")
    public JAXBElement<PIXConsumerPRPAIN201309UVResponseType> createPIXConsumerPRPAIN201309UVResponse(PIXConsumerPRPAIN201309UVResponseType value) {
        return new JAXBElement<PIXConsumerPRPAIN201309UVResponseType>(_PIXConsumerPRPAIN201309UVResponse_QNAME, PIXConsumerPRPAIN201309UVResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespondingGatewayPRPAIN201305UV02SecuredRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "RespondingGateway_PRPA_IN201305UV02SecuredRequest")
    public JAXBElement<RespondingGatewayPRPAIN201305UV02SecuredRequestType> createRespondingGatewayPRPAIN201305UV02SecuredRequest(RespondingGatewayPRPAIN201305UV02SecuredRequestType value) {
        return new JAXBElement<RespondingGatewayPRPAIN201305UV02SecuredRequestType>(_RespondingGatewayPRPAIN201305UV02SecuredRequest_QNAME, RespondingGatewayPRPAIN201305UV02SecuredRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespondingGatewayPRPAIN201306UV02ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "RespondingGateway_PRPA_IN201306UV02Response")
    public JAXBElement<RespondingGatewayPRPAIN201306UV02ResponseType> createRespondingGatewayPRPAIN201306UV02Response(RespondingGatewayPRPAIN201306UV02ResponseType value) {
        return new JAXBElement<RespondingGatewayPRPAIN201306UV02ResponseType>(_RespondingGatewayPRPAIN201306UV02Response_QNAME, RespondingGatewayPRPAIN201306UV02ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POCDMT000040ClinicalDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "ClinicalDocument")
    public JAXBElement<POCDMT000040ClinicalDocument> createClinicalDocument(POCDMT000040ClinicalDocument value) {
        return new JAXBElement<POCDMT000040ClinicalDocument>(_ClinicalDocument_QNAME, POCDMT000040ClinicalDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAckMsgRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "CreateAckMsgRequest")
    public JAXBElement<CreateAckMsgRequestType> createCreateAckMsgRequest(CreateAckMsgRequestType value) {
        return new JAXBElement<CreateAckMsgRequestType>(_CreateAckMsgRequest_QNAME, CreateAckMsgRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerPRPAIN201301UVRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_PRPA_IN201301UVRequest")
    public JAXBElement<PIXConsumerPRPAIN201301UVRequestType> createPIXConsumerPRPAIN201301UVRequest(PIXConsumerPRPAIN201301UVRequestType value) {
        return new JAXBElement<PIXConsumerPRPAIN201301UVRequestType>(_PIXConsumerPRPAIN201301UVRequest_QNAME, PIXConsumerPRPAIN201301UVRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerPRPAIN201310UVSecuredRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_PRPA_IN201310UVSecuredRequest")
    public JAXBElement<PIXConsumerPRPAIN201310UVSecuredRequestType> createPIXConsumerPRPAIN201310UVSecuredRequest(PIXConsumerPRPAIN201310UVSecuredRequestType value) {
        return new JAXBElement<PIXConsumerPRPAIN201310UVSecuredRequestType>(_PIXConsumerPRPAIN201310UVSecuredRequest_QNAME, PIXConsumerPRPAIN201310UVSecuredRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIXConsumerPRPAIN201304UVSecuredRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "PIXConsumer_PRPA_IN201304UVSecuredRequest")
    public JAXBElement<PIXConsumerPRPAIN201304UVSecuredRequestType> createPIXConsumerPRPAIN201304UVSecuredRequest(PIXConsumerPRPAIN201304UVSecuredRequestType value) {
        return new JAXBElement<PIXConsumerPRPAIN201304UVSecuredRequestType>(_PIXConsumerPRPAIN201304UVSecuredRequest_QNAME, PIXConsumerPRPAIN201304UVSecuredRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVContent1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asContent", scope = COCTMT080000UVNonPersonLivingSubject.class)
    public JAXBElement<COCTMT080000UVContent1> createCOCTMT080000UVNonPersonLivingSubjectAsContent(COCTMT080000UVContent1 value) {
        return new JAXBElement<COCTMT080000UVContent1>(_COCTMT080000UVNonPersonLivingSubjectAsContent_QNAME, COCTMT080000UVContent1 .class, COCTMT080000UVNonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090102UV02AssignedPerson.class)
    public JAXBElement<COCTMT150002UV01Organization> createCOCTMT090102UV02AssignedPersonRepresentedOrganization(COCTMT150002UV01Organization value) {
        return new JAXBElement<COCTMT150002UV01Organization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, COCTMT150002UV01Organization.class, COCTMT090102UV02AssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090102UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090102UV02AssignedPerson.class)
    public JAXBElement<COCTMT090102UV02Person> createCOCTMT090102UV02AssignedPersonAssignedPerson(COCTMT090102UV02Person value) {
        return new JAXBElement<COCTMT090102UV02Person>(_COCTMT090102UV02AssignedPersonAssignedPerson_QNAME, COCTMT090102UV02Person.class, COCTMT090102UV02AssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVManufacturer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedManufacturer", scope = COCTMT230100UVRelatedManufacturer.class)
    public JAXBElement<COCTMT230100UVManufacturer> createCOCTMT230100UVRelatedManufacturerRepresentedManufacturer(COCTMT230100UVManufacturer value) {
        return new JAXBElement<COCTMT230100UVManufacturer>(_COCTMT230100UVRelatedManufacturerRepresentedManufacturer_QNAME, COCTMT230100UVManufacturer.class, COCTMT230100UVRelatedManufacturer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT090100UV01Person.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT090100UV01PersonAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090100UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT090100UV01Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVPackagedMedicine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "containedPackagedMedicine", scope = COCTMT230100UVSubContent.class)
    public JAXBElement<COCTMT230100UVPackagedMedicine> createCOCTMT230100UVSubContentContainedPackagedMedicine(COCTMT230100UVPackagedMedicine value) {
        return new JAXBElement<COCTMT230100UVPackagedMedicine>(_COCTMT230100UVSubContentContainedPackagedMedicine_QNAME, COCTMT230100UVPackagedMedicine.class, COCTMT230100UVSubContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201301UV02NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = PRPAMT201301UV02Patient.class)
    public JAXBElement<PRPAMT201301UV02NonPersonLivingSubject> createPRPAMT201301UV02PatientPatientNonPersonLivingSubject(PRPAMT201301UV02NonPersonLivingSubject value) {
        return new JAXBElement<PRPAMT201301UV02NonPersonLivingSubject>(_PRPAMT201301UV02PatientPatientNonPersonLivingSubject_QNAME, PRPAMT201301UV02NonPersonLivingSubject.class, PRPAMT201301UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201301UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = PRPAMT201301UV02Patient.class)
    public JAXBElement<PRPAMT201301UV02Person> createPRPAMT201301UV02PatientPatientPerson(PRPAMT201301UV02Person value) {
        return new JAXBElement<PRPAMT201301UV02Person>(_PRPAMT201301UV02PatientPatientPerson_QNAME, PRPAMT201301UV02Person.class, PRPAMT201301UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT090000UV01RoleOther.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090000UV01RoleOtherScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090000UV01RoleOther.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBINT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLINT.class)
    public JAXBElement<IVXBINT> createIVLINTHigh(IVXBINT value) {
        return new JAXBElement<IVXBINT>(_IVLINTHigh_QNAME, IVXBINT.class, IVLINT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBINT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLINT.class)
    public JAXBElement<IVXBINT> createIVLINTLow(IVXBINT value) {
        return new JAXBElement<IVXBINT>(_IVLINTLow_QNAME, IVXBINT.class, IVLINT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLINT.class)
    public JAXBElement<INT> createIVLINTCenter(INT value) {
        return new JAXBElement<INT>(_IVLINTCenter_QNAME, INT.class, IVLINT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLINT.class)
    public JAXBElement<INT> createIVLINTWidth(INT value) {
        return new JAXBElement<INT>(_IVLINTWidth_QNAME, INT.class, IVLINT.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT530000UVRole.class)
    public JAXBElement<COCTMT530000UVOrganization> createCOCTMT530000UVRoleScopingOrganization(COCTMT530000UVOrganization value) {
        return new JAXBElement<COCTMT530000UVOrganization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT530000UVOrganization.class, COCTMT530000UVRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201301UV02Subject2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = PRPAMT201301UV02BirthPlace.class)
    public JAXBElement<PRPAMT201301UV02Subject2> createPRPAMT201301UV02BirthPlaceSubjectOf(PRPAMT201301UV02Subject2 value) {
        return new JAXBElement<PRPAMT201301UV02Subject2>(_PRPAMT201301UV02BirthPlaceSubjectOf_QNAME, PRPAMT201301UV02Subject2 .class, PRPAMT201301UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710007UVPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = PRPAMT201301UV02BirthPlace.class)
    public JAXBElement<COCTMT710007UVPlace> createPRPAMT201301UV02BirthPlaceBirthplace(COCTMT710007UVPlace value) {
        return new JAXBElement<COCTMT710007UVPlace>(_PRPAMT201301UV02BirthPlaceBirthplace_QNAME, COCTMT710007UVPlace.class, PRPAMT201301UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "serviceProviderOrganization", scope = COCTMT530000UVHealthCareFacility.class)
    public JAXBElement<COCTMT530000UVOrganization> createCOCTMT530000UVHealthCareFacilityServiceProviderOrganization(COCTMT530000UVOrganization value) {
        return new JAXBElement<COCTMT530000UVOrganization>(_COCTMT530000UVHealthCareFacilityServiceProviderOrganization_QNAME, COCTMT530000UVOrganization.class, COCTMT530000UVHealthCareFacility.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT530000UVHealthCareFacility.class)
    public JAXBElement<COCTMT530000UVPlace> createCOCTMT530000UVHealthCareFacilityLocation(COCTMT530000UVPlace value) {
        return new JAXBElement<COCTMT530000UVPlace>(_COCTMT530000UVHealthCareFacilityLocation_QNAME, COCTMT530000UVPlace.class, COCTMT530000UVHealthCareFacility.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700701UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPAIN201304UV02MFMIMT700701UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700701UV01Author2> createPRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor(MFMIMT700701UV01Author2 value) {
        return new JAXBElement<MFMIMT700701UV01Author2>(_PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME, MFMIMT700701UV01Author2 .class, PRPAIN201304UV02MFMIMT700701UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000200UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = MCCIMT000200UV01LocatedEntity.class)
    public JAXBElement<MCCIMT000200UV01Place> createMCCIMT000200UV01LocatedEntityLocation(MCCIMT000200UV01Place value) {
        return new JAXBElement<MCCIMT000200UV01Place>(_COCTMT530000UVHealthCareFacilityLocation_QNAME, MCCIMT000200UV01Place.class, MCCIMT000200UV01LocatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "employerOrganization", scope = COCTMT030000UV04Employment.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT030000UV04EmploymentEmployerOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT030000UV04EmploymentEmployerOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT030000UV04Employment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = COCTMT090300UV01LicensedEntity.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT090300UV01LicensedEntityIssuingOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_COCTMT090300UV01LicensedEntityIssuingOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT090300UV01LicensedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201302UV02Subject2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = PRPAMT201302UV02BirthPlace.class)
    public JAXBElement<PRPAMT201302UV02Subject2> createPRPAMT201302UV02BirthPlaceSubjectOf(PRPAMT201302UV02Subject2 value) {
        return new JAXBElement<PRPAMT201302UV02Subject2>(_PRPAMT201301UV02BirthPlaceSubjectOf_QNAME, PRPAMT201302UV02Subject2 .class, PRPAMT201302UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710007UVPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = PRPAMT201302UV02BirthPlace.class)
    public JAXBElement<COCTMT710007UVPlace> createPRPAMT201302UV02BirthPlaceBirthplace(COCTMT710007UVPlace value) {
        return new JAXBElement<COCTMT710007UVPlace>(_PRPAMT201301UV02BirthPlaceBirthplace_QNAME, COCTMT710007UVPlace.class, PRPAMT201302UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT500000UV04CarrierOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "underwritingCarrierOrganization", scope = COCTMT500000UV04CarrierRole.class)
    public JAXBElement<COCTMT500000UV04CarrierOrganization> createCOCTMT500000UV04CarrierRoleUnderwritingCarrierOrganization(COCTMT500000UV04CarrierOrganization value) {
        return new JAXBElement<COCTMT500000UV04CarrierOrganization>(_COCTMT500000UV04CarrierRoleUnderwritingCarrierOrganization_QNAME, COCTMT500000UV04CarrierOrganization.class, COCTMT500000UV04CarrierRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04ProviderPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProviderPerson", scope = COCTMT490000UV04HealthCareProvider.class)
    public JAXBElement<COCTMT490000UV04ProviderPerson> createCOCTMT490000UV04HealthCareProviderHealthCareProviderPerson(COCTMT490000UV04ProviderPerson value) {
        return new JAXBElement<COCTMT490000UV04ProviderPerson>(_COCTMT490000UV04HealthCareProviderHealthCareProviderPerson_QNAME, COCTMT490000UV04ProviderPerson.class, COCTMT490000UV04HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "ingredient", scope = COCTMT230100UVIngredient.class)
    public JAXBElement<COCTMT230100UVSubstance> createCOCTMT230100UVIngredientIngredient(COCTMT230100UVSubstance value) {
        return new JAXBElement<COCTMT230100UVSubstance>(_COCTMT230100UVIngredientIngredient_QNAME, COCTMT230100UVSubstance.class, COCTMT230100UVIngredient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT670000UV04GuarantorPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guarantorPerson", scope = COCTMT670000UV04GuarantorRole.class)
    public JAXBElement<COCTMT670000UV04GuarantorPerson> createCOCTMT670000UV04GuarantorRoleGuarantorPerson(COCTMT670000UV04GuarantorPerson value) {
        return new JAXBElement<COCTMT670000UV04GuarantorPerson>(_COCTMT670000UV04GuarantorRoleGuarantorPerson_QNAME, COCTMT670000UV04GuarantorPerson.class, COCTMT670000UV04GuarantorRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT670000UV04GuarantorOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guarantorOrganization", scope = COCTMT670000UV04GuarantorRole.class)
    public JAXBElement<COCTMT670000UV04GuarantorOrganization> createCOCTMT670000UV04GuarantorRoleGuarantorOrganization(COCTMT670000UV04GuarantorOrganization value) {
        return new JAXBElement<COCTMT670000UV04GuarantorOrganization>(_COCTMT670000UV04GuarantorRoleGuarantorOrganization_QNAME, COCTMT670000UV04GuarantorOrganization.class, COCTMT670000UV04GuarantorRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "serviceProviderOrganization", scope = COCTMT240000UV01ServiceDeliveryLocation.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT240000UV01ServiceDeliveryLocationServiceProviderOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT530000UVHealthCareFacilityServiceProviderOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT240000UV01ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710000UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT240000UV01ServiceDeliveryLocation.class)
    public JAXBElement<COCTMT710000UV01Place> createCOCTMT240000UV01ServiceDeliveryLocationLocation(COCTMT710000UV01Place value) {
        return new JAXBElement<COCTMT710000UV01Place>(_COCTMT530000UVHealthCareFacilityLocation_QNAME, COCTMT710000UV01Place.class, COCTMT240000UV01ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT500000UV04Limitation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "limitation", scope = COCTMT500000UV04PolicyOrAccount.class)
    public JAXBElement<COCTMT500000UV04Limitation> createCOCTMT500000UV04PolicyOrAccountLimitation(COCTMT500000UV04Limitation value) {
        return new JAXBElement<COCTMT500000UV04Limitation>(_COCTMT500000UV04PolicyOrAccountLimitation_QNAME, COCTMT500000UV04Limitation.class, COCTMT500000UV04PolicyOrAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT500000UV04Holder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "holder", scope = COCTMT500000UV04PolicyOrAccount.class)
    public JAXBElement<COCTMT500000UV04Holder> createCOCTMT500000UV04PolicyOrAccountHolder(COCTMT500000UV04Holder value) {
        return new JAXBElement<COCTMT500000UV04Holder>(_COCTMT500000UV04PolicyOrAccountHolder_QNAME, COCTMT500000UV04Holder.class, COCTMT500000UV04PolicyOrAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090100UV01AssignedPerson.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090100UV01AssignedPersonRepresentedOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090100UV01AssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090100UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090100UV01AssignedPerson.class)
    public JAXBElement<COCTMT090100UV01Person> createCOCTMT090100UV01AssignedPersonAssignedPerson(COCTMT090100UV01Person value) {
        return new JAXBElement<COCTMT090100UV01Person>(_COCTMT090102UV02AssignedPersonAssignedPerson_QNAME, COCTMT090100UV01Person.class, COCTMT090100UV01AssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = PRPAMT201301UV02ContactParty.class)
    public JAXBElement<COCTMT030207UVPerson> createPRPAMT201301UV02ContactPartyContactPerson(COCTMT030207UVPerson value) {
        return new JAXBElement<COCTMT030207UVPerson>(_PRPAMT201301UV02ContactPartyContactPerson_QNAME, COCTMT030207UVPerson.class, PRPAMT201301UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = PRPAMT201301UV02ContactParty.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201301UV02ContactPartyContactOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201301UV02ContactPartyContactOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201301UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "suffix", scope = EN.class)
    public JAXBElement<EnSuffix> createENSuffix(EnSuffix value) {
        return new JAXBElement<EnSuffix>(_ENSuffix_QNAME, EnSuffix.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnDelimiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "delimiter", scope = EN.class)
    public JAXBElement<EnDelimiter> createENDelimiter(EnDelimiter value) {
        return new JAXBElement<EnDelimiter>(_ENDelimiter_QNAME, EnDelimiter.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVLTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "validTime", scope = EN.class)
    public JAXBElement<IVLTS> createENValidTime(IVLTS value) {
        return new JAXBElement<IVLTS>(_ENValidTime_QNAME, IVLTS.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnPrefix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "prefix", scope = EN.class)
    public JAXBElement<EnPrefix> createENPrefix(EnPrefix value) {
        return new JAXBElement<EnPrefix>(_ENPrefix_QNAME, EnPrefix.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnFamily }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "family", scope = EN.class)
    public JAXBElement<EnFamily> createENFamily(EnFamily value) {
        return new JAXBElement<EnFamily>(_ENFamily_QNAME, EnFamily.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnGiven }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "given", scope = EN.class)
    public JAXBElement<EnGiven> createENGiven(EnGiven value) {
        return new JAXBElement<EnGiven>(_ENGiven_QNAME, EnGiven.class, EN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitDeliveryModeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryModeIdentifier", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitDeliveryModeIdentifier> createADExplicitDeliveryModeIdentifier(AdxpExplicitDeliveryModeIdentifier value) {
        return new JAXBElement<AdxpExplicitDeliveryModeIdentifier>(_ADExplicitDeliveryModeIdentifier_QNAME, AdxpExplicitDeliveryModeIdentifier.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitHouseNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "houseNumber", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitHouseNumber> createADExplicitHouseNumber(AdxpExplicitHouseNumber value) {
        return new JAXBElement<AdxpExplicitHouseNumber>(_ADExplicitHouseNumber_QNAME, AdxpExplicitHouseNumber.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "state", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitState> createADExplicitState(AdxpExplicitState value) {
        return new JAXBElement<AdxpExplicitState>(_ADExplicitState_QNAME, AdxpExplicitState.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "city", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitCity> createADExplicitCity(AdxpExplicitCity value) {
        return new JAXBElement<AdxpExplicitCity>(_ADExplicitCity_QNAME, AdxpExplicitCity.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitAdditionalLocator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "additionalLocator", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitAdditionalLocator> createADExplicitAdditionalLocator(AdxpExplicitAdditionalLocator value) {
        return new JAXBElement<AdxpExplicitAdditionalLocator>(_ADExplicitAdditionalLocator_QNAME, AdxpExplicitAdditionalLocator.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitStreetAddressLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetAddressLine", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitStreetAddressLine> createADExplicitStreetAddressLine(AdxpExplicitStreetAddressLine value) {
        return new JAXBElement<AdxpExplicitStreetAddressLine>(_ADExplicitStreetAddressLine_QNAME, AdxpExplicitStreetAddressLine.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitDeliveryInstallationArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryInstallationArea", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitDeliveryInstallationArea> createADExplicitDeliveryInstallationArea(AdxpExplicitDeliveryInstallationArea value) {
        return new JAXBElement<AdxpExplicitDeliveryInstallationArea>(_ADExplicitDeliveryInstallationArea_QNAME, AdxpExplicitDeliveryInstallationArea.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitDeliveryInstallationQualifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryInstallationQualifier", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitDeliveryInstallationQualifier> createADExplicitDeliveryInstallationQualifier(AdxpExplicitDeliveryInstallationQualifier value) {
        return new JAXBElement<AdxpExplicitDeliveryInstallationQualifier>(_ADExplicitDeliveryInstallationQualifier_QNAME, AdxpExplicitDeliveryInstallationQualifier.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitStreetNameType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetNameType", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitStreetNameType1> createADExplicitStreetNameType(AdxpExplicitStreetNameType1 value) {
        return new JAXBElement<AdxpExplicitStreetNameType1>(_ADExplicitStreetNameType_QNAME, AdxpExplicitStreetNameType1 .class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitDirection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "direction", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitDirection> createADExplicitDirection(AdxpExplicitDirection value) {
        return new JAXBElement<AdxpExplicitDirection>(_ADExplicitDirection_QNAME, AdxpExplicitDirection.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitCensusTract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "censusTract", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitCensusTract> createADExplicitCensusTract(AdxpExplicitCensusTract value) {
        return new JAXBElement<AdxpExplicitCensusTract>(_ADExplicitCensusTract_QNAME, AdxpExplicitCensusTract.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitUnitID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "unitID", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitUnitID> createADExplicitUnitID(AdxpExplicitUnitID value) {
        return new JAXBElement<AdxpExplicitUnitID>(_ADExplicitUnitID_QNAME, AdxpExplicitUnitID.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitPostalCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "postalCode", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitPostalCode> createADExplicitPostalCode(AdxpExplicitPostalCode value) {
        return new JAXBElement<AdxpExplicitPostalCode>(_ADExplicitPostalCode_QNAME, AdxpExplicitPostalCode.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitStreetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetName", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitStreetName> createADExplicitStreetName(AdxpExplicitStreetName value) {
        return new JAXBElement<AdxpExplicitStreetName>(_ADExplicitStreetName_QNAME, AdxpExplicitStreetName.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitDeliveryInstallationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryInstallationType", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitDeliveryInstallationType> createADExplicitDeliveryInstallationType(AdxpExplicitDeliveryInstallationType value) {
        return new JAXBElement<AdxpExplicitDeliveryInstallationType>(_ADExplicitDeliveryInstallationType_QNAME, AdxpExplicitDeliveryInstallationType.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitStreetNameBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetNameBase", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitStreetNameBase> createADExplicitStreetNameBase(AdxpExplicitStreetNameBase value) {
        return new JAXBElement<AdxpExplicitStreetNameBase>(_ADExplicitStreetNameBase_QNAME, AdxpExplicitStreetNameBase.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitDeliveryMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryMode", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitDeliveryMode> createADExplicitDeliveryMode(AdxpExplicitDeliveryMode value) {
        return new JAXBElement<AdxpExplicitDeliveryMode>(_ADExplicitDeliveryMode_QNAME, AdxpExplicitDeliveryMode.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "country", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitCountry> createADExplicitCountry(AdxpExplicitCountry value) {
        return new JAXBElement<AdxpExplicitCountry>(_ADExplicitCountry_QNAME, AdxpExplicitCountry.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitPostBox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "postBox", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitPostBox> createADExplicitPostBox(AdxpExplicitPostBox value) {
        return new JAXBElement<AdxpExplicitPostBox>(_ADExplicitPostBox_QNAME, AdxpExplicitPostBox.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitDeliveryAddressLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryAddressLine", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitDeliveryAddressLine> createADExplicitDeliveryAddressLine(AdxpExplicitDeliveryAddressLine value) {
        return new JAXBElement<AdxpExplicitDeliveryAddressLine>(_ADExplicitDeliveryAddressLine_QNAME, AdxpExplicitDeliveryAddressLine.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SXCMTSExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "useablePeriod", scope = ADExplicit.class)
    public JAXBElement<SXCMTSExplicit> createADExplicitUseablePeriod(SXCMTSExplicit value) {
        return new JAXBElement<SXCMTSExplicit>(_ADExplicitUseablePeriod_QNAME, SXCMTSExplicit.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitCareOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "careOf", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitCareOf> createADExplicitCareOf(AdxpExplicitCareOf value) {
        return new JAXBElement<AdxpExplicitCareOf>(_ADExplicitCareOf_QNAME, AdxpExplicitCareOf.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "unitType", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitUnitType> createADExplicitUnitType(AdxpExplicitUnitType value) {
        return new JAXBElement<AdxpExplicitUnitType>(_ADExplicitUnitType_QNAME, AdxpExplicitUnitType.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitDelimiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "delimiter", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitDelimiter> createADExplicitDelimiter(AdxpExplicitDelimiter value) {
        return new JAXBElement<AdxpExplicitDelimiter>(_ENDelimiter_QNAME, AdxpExplicitDelimiter.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitPrecinct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "precinct", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitPrecinct> createADExplicitPrecinct(AdxpExplicitPrecinct value) {
        return new JAXBElement<AdxpExplicitPrecinct>(_ADExplicitPrecinct_QNAME, AdxpExplicitPrecinct.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitBuildingNumberSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "buildingNumberSuffix", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitBuildingNumberSuffix> createADExplicitBuildingNumberSuffix(AdxpExplicitBuildingNumberSuffix value) {
        return new JAXBElement<AdxpExplicitBuildingNumberSuffix>(_ADExplicitBuildingNumberSuffix_QNAME, AdxpExplicitBuildingNumberSuffix.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitHouseNumberNumeric }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "houseNumberNumeric", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitHouseNumberNumeric> createADExplicitHouseNumberNumeric(AdxpExplicitHouseNumberNumeric value) {
        return new JAXBElement<AdxpExplicitHouseNumberNumeric>(_ADExplicitHouseNumberNumeric_QNAME, AdxpExplicitHouseNumberNumeric.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpExplicitCounty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "county", scope = ADExplicit.class)
    public JAXBElement<AdxpExplicitCounty> createADExplicitCounty(AdxpExplicitCounty value) {
        return new JAXBElement<AdxpExplicitCounty>(_ADExplicitCounty_QNAME, AdxpExplicitCounty.class, ADExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "underwritingOrganization", scope = COCTMT510000UV06PolicyHolder.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06PolicyHolderUnderwritingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PolicyHolderUnderwritingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06PolicyHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "policyHolderPerson", scope = COCTMT510000UV06PolicyHolder.class)
    public JAXBElement<COCTMT510000UV06Person> createCOCTMT510000UV06PolicyHolderPolicyHolderPerson(COCTMT510000UV06Person value) {
        return new JAXBElement<COCTMT510000UV06Person>(_COCTMT510000UV06PolicyHolderPolicyHolderPerson_QNAME, COCTMT510000UV06Person.class, COCTMT510000UV06PolicyHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "policyHolderOrganization", scope = COCTMT510000UV06PolicyHolder.class)
    public JAXBElement<COCTMT510000UV06Organization> createCOCTMT510000UV06PolicyHolderPolicyHolderOrganization(COCTMT510000UV06Organization value) {
        return new JAXBElement<COCTMT510000UV06Organization>(_COCTMT510000UV06PolicyHolderPolicyHolderOrganization_QNAME, COCTMT510000UV06Organization.class, COCTMT510000UV06PolicyHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201303UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201303UV02Person.class)
    public JAXBElement<PRPAMT201303UV02BirthPlace> createPRPAMT201303UV02PersonBirthPlace(PRPAMT201303UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201303UV02BirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, PRPAMT201303UV02BirthPlace.class, PRPAMT201303UV02Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryModeIdentifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryModeIdentifier", scope = AD.class)
    public JAXBElement<AdxpDeliveryModeIdentifier> createADDeliveryModeIdentifier(AdxpDeliveryModeIdentifier value) {
        return new JAXBElement<AdxpDeliveryModeIdentifier>(_ADExplicitDeliveryModeIdentifier_QNAME, AdxpDeliveryModeIdentifier.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpHouseNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "houseNumber", scope = AD.class)
    public JAXBElement<AdxpHouseNumber> createADHouseNumber(AdxpHouseNumber value) {
        return new JAXBElement<AdxpHouseNumber>(_ADExplicitHouseNumber_QNAME, AdxpHouseNumber.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "state", scope = AD.class)
    public JAXBElement<AdxpState> createADState(AdxpState value) {
        return new JAXBElement<AdxpState>(_ADExplicitState_QNAME, AdxpState.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "city", scope = AD.class)
    public JAXBElement<AdxpCity> createADCity(AdxpCity value) {
        return new JAXBElement<AdxpCity>(_ADExplicitCity_QNAME, AdxpCity.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpAdditionalLocator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "additionalLocator", scope = AD.class)
    public JAXBElement<AdxpAdditionalLocator> createADAdditionalLocator(AdxpAdditionalLocator value) {
        return new JAXBElement<AdxpAdditionalLocator>(_ADExplicitAdditionalLocator_QNAME, AdxpAdditionalLocator.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetAddressLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetAddressLine", scope = AD.class)
    public JAXBElement<AdxpStreetAddressLine> createADStreetAddressLine(AdxpStreetAddressLine value) {
        return new JAXBElement<AdxpStreetAddressLine>(_ADExplicitStreetAddressLine_QNAME, AdxpStreetAddressLine.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryInstallationArea", scope = AD.class)
    public JAXBElement<AdxpDeliveryInstallationArea> createADDeliveryInstallationArea(AdxpDeliveryInstallationArea value) {
        return new JAXBElement<AdxpDeliveryInstallationArea>(_ADExplicitDeliveryInstallationArea_QNAME, AdxpDeliveryInstallationArea.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationQualifier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryInstallationQualifier", scope = AD.class)
    public JAXBElement<AdxpDeliveryInstallationQualifier> createADDeliveryInstallationQualifier(AdxpDeliveryInstallationQualifier value) {
        return new JAXBElement<AdxpDeliveryInstallationQualifier>(_ADExplicitDeliveryInstallationQualifier_QNAME, AdxpDeliveryInstallationQualifier.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetNameType", scope = AD.class)
    public JAXBElement<AdxpStreetNameType> createADStreetNameType(AdxpStreetNameType value) {
        return new JAXBElement<AdxpStreetNameType>(_ADExplicitStreetNameType_QNAME, AdxpStreetNameType.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDirection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "direction", scope = AD.class)
    public JAXBElement<AdxpDirection> createADDirection(AdxpDirection value) {
        return new JAXBElement<AdxpDirection>(_ADExplicitDirection_QNAME, AdxpDirection.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCensusTract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "censusTract", scope = AD.class)
    public JAXBElement<AdxpCensusTract> createADCensusTract(AdxpCensusTract value) {
        return new JAXBElement<AdxpCensusTract>(_ADExplicitCensusTract_QNAME, AdxpCensusTract.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpUnitID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "unitID", scope = AD.class)
    public JAXBElement<AdxpUnitID> createADUnitID(AdxpUnitID value) {
        return new JAXBElement<AdxpUnitID>(_ADExplicitUnitID_QNAME, AdxpUnitID.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpPostalCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "postalCode", scope = AD.class)
    public JAXBElement<AdxpPostalCode> createADPostalCode(AdxpPostalCode value) {
        return new JAXBElement<AdxpPostalCode>(_ADExplicitPostalCode_QNAME, AdxpPostalCode.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetName", scope = AD.class)
    public JAXBElement<AdxpStreetName> createADStreetName(AdxpStreetName value) {
        return new JAXBElement<AdxpStreetName>(_ADExplicitStreetName_QNAME, AdxpStreetName.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryInstallationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryInstallationType", scope = AD.class)
    public JAXBElement<AdxpDeliveryInstallationType> createADDeliveryInstallationType(AdxpDeliveryInstallationType value) {
        return new JAXBElement<AdxpDeliveryInstallationType>(_ADExplicitDeliveryInstallationType_QNAME, AdxpDeliveryInstallationType.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryMode", scope = AD.class)
    public JAXBElement<AdxpDeliveryMode> createADDeliveryMode(AdxpDeliveryMode value) {
        return new JAXBElement<AdxpDeliveryMode>(_ADExplicitDeliveryMode_QNAME, AdxpDeliveryMode.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpStreetNameBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "streetNameBase", scope = AD.class)
    public JAXBElement<AdxpStreetNameBase> createADStreetNameBase(AdxpStreetNameBase value) {
        return new JAXBElement<AdxpStreetNameBase>(_ADExplicitStreetNameBase_QNAME, AdxpStreetNameBase.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "country", scope = AD.class)
    public JAXBElement<AdxpCountry> createADCountry(AdxpCountry value) {
        return new JAXBElement<AdxpCountry>(_ADExplicitCountry_QNAME, AdxpCountry.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpPostBox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "postBox", scope = AD.class)
    public JAXBElement<AdxpPostBox> createADPostBox(AdxpPostBox value) {
        return new JAXBElement<AdxpPostBox>(_ADExplicitPostBox_QNAME, AdxpPostBox.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDeliveryAddressLine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "deliveryAddressLine", scope = AD.class)
    public JAXBElement<AdxpDeliveryAddressLine> createADDeliveryAddressLine(AdxpDeliveryAddressLine value) {
        return new JAXBElement<AdxpDeliveryAddressLine>(_ADExplicitDeliveryAddressLine_QNAME, AdxpDeliveryAddressLine.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SXCMTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "useablePeriod", scope = AD.class)
    public JAXBElement<SXCMTS> createADUseablePeriod(SXCMTS value) {
        return new JAXBElement<SXCMTS>(_ADExplicitUseablePeriod_QNAME, SXCMTS.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCareOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "careOf", scope = AD.class)
    public JAXBElement<AdxpCareOf> createADCareOf(AdxpCareOf value) {
        return new JAXBElement<AdxpCareOf>(_ADExplicitCareOf_QNAME, AdxpCareOf.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "unitType", scope = AD.class)
    public JAXBElement<AdxpUnitType> createADUnitType(AdxpUnitType value) {
        return new JAXBElement<AdxpUnitType>(_ADExplicitUnitType_QNAME, AdxpUnitType.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpPrecinct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "precinct", scope = AD.class)
    public JAXBElement<AdxpPrecinct> createADPrecinct(AdxpPrecinct value) {
        return new JAXBElement<AdxpPrecinct>(_ADExplicitPrecinct_QNAME, AdxpPrecinct.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpDelimiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "delimiter", scope = AD.class)
    public JAXBElement<AdxpDelimiter> createADDelimiter(AdxpDelimiter value) {
        return new JAXBElement<AdxpDelimiter>(_ENDelimiter_QNAME, AdxpDelimiter.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpBuildingNumberSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "buildingNumberSuffix", scope = AD.class)
    public JAXBElement<AdxpBuildingNumberSuffix> createADBuildingNumberSuffix(AdxpBuildingNumberSuffix value) {
        return new JAXBElement<AdxpBuildingNumberSuffix>(_ADExplicitBuildingNumberSuffix_QNAME, AdxpBuildingNumberSuffix.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpHouseNumberNumeric }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "houseNumberNumeric", scope = AD.class)
    public JAXBElement<AdxpHouseNumberNumeric> createADHouseNumberNumeric(AdxpHouseNumberNumeric value) {
        return new JAXBElement<AdxpHouseNumberNumeric>(_ADExplicitHouseNumberNumeric_QNAME, AdxpHouseNumberNumeric.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdxpCounty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "county", scope = AD.class)
    public JAXBElement<AdxpCounty> createADCounty(AdxpCounty value) {
        return new JAXBElement<AdxpCounty>(_ADExplicitCounty_QNAME, AdxpCounty.class, AD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "encounter", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVEncounter> createCOCTMT530000UVSourceOf2Encounter(COCTMT530000UVEncounter value) {
        return new JAXBElement<COCTMT530000UVEncounter>(_COCTMT530000UVSourceOf2Encounter_QNAME, COCTMT530000UVEncounter.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supply", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVSupply> createCOCTMT530000UVSourceOf2Supply(COCTMT530000UVSupply value) {
        return new JAXBElement<COCTMT530000UVSupply>(_COCTMT530000UVSourceOf2Supply_QNAME, COCTMT530000UVSupply.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "procedure", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVProcedure> createCOCTMT530000UVSourceOf2Procedure(COCTMT530000UVProcedure value) {
        return new JAXBElement<COCTMT530000UVProcedure>(_COCTMT530000UVSourceOf2Procedure_QNAME, COCTMT530000UVProcedure.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "act", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVAct> createCOCTMT530000UVSourceOf2Act(COCTMT530000UVAct value) {
        return new JAXBElement<COCTMT530000UVAct>(_COCTMT530000UVSourceOf2Act_QNAME, COCTMT530000UVAct.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observation", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVObservation> createCOCTMT530000UVSourceOf2Observation(COCTMT530000UVObservation value) {
        return new JAXBElement<COCTMT530000UVObservation>(_COCTMT530000UVSourceOf2Observation_QNAME, COCTMT530000UVObservation.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "substanceAdministration", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVSubstanceAdministration> createCOCTMT530000UVSourceOf2SubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        return new JAXBElement<COCTMT530000UVSubstanceAdministration>(_COCTMT530000UVSourceOf2SubstanceAdministration_QNAME, COCTMT530000UVSubstanceAdministration.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "organizer", scope = COCTMT530000UVSourceOf2 .class)
    public JAXBElement<COCTMT530000UVOrganizer> createCOCTMT530000UVSourceOf2Organizer(COCTMT530000UVOrganizer value) {
        return new JAXBElement<COCTMT530000UVOrganizer>(_COCTMT530000UVSourceOf2Organizer_QNAME, COCTMT530000UVOrganizer.class, COCTMT530000UVSourceOf2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = PRPAMT201302UV02Student.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201302UV02StudentSchoolOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201302UV02StudentSchoolOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201302UV02Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000100UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = MCCIMT000100UV01LocatedEntity.class)
    public JAXBElement<MCCIMT000100UV01Place> createMCCIMT000100UV01LocatedEntityLocation(MCCIMT000100UV01Place value) {
        return new JAXBElement<MCCIMT000100UV01Place>(_COCTMT530000UVHealthCareFacilityLocation_QNAME, MCCIMT000100UV01Place.class, MCCIMT000100UV01LocatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TELExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "reference", scope = STExplicit.class)
    public JAXBElement<TELExplicit> createSTExplicitReference(TELExplicit value) {
        return new JAXBElement<TELExplicit>(_STExplicitReference_QNAME, TELExplicit.class, STExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThumbnailExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "thumbnail", scope = STExplicit.class)
    public JAXBElement<ThumbnailExplicit> createSTExplicitThumbnail(ThumbnailExplicit value) {
        return new JAXBElement<ThumbnailExplicit>(_STExplicitThumbnail_QNAME, ThumbnailExplicit.class, STExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVObservation.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVObservationSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_PRPAMT201301UV02BirthPlaceSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVObservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVObservation.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVObservationDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVObservationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVObservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVObservation.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVObservationRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVObservationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVObservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVObservation.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVObservationDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT530000UVObservationDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVObservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "encounter", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVEncounter> createCOCTMT510000UV06PreconditionEncounter(COCTMT530000UVEncounter value) {
        return new JAXBElement<COCTMT530000UVEncounter>(_COCTMT530000UVSourceOf2Encounter_QNAME, COCTMT530000UVEncounter.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supply", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVSupply> createCOCTMT510000UV06PreconditionSupply(COCTMT530000UVSupply value) {
        return new JAXBElement<COCTMT530000UVSupply>(_COCTMT530000UVSourceOf2Supply_QNAME, COCTMT530000UVSupply.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "procedure", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVProcedure> createCOCTMT510000UV06PreconditionProcedure(COCTMT530000UVProcedure value) {
        return new JAXBElement<COCTMT530000UVProcedure>(_COCTMT530000UVSourceOf2Procedure_QNAME, COCTMT530000UVProcedure.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "act", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVAct> createCOCTMT510000UV06PreconditionAct(COCTMT530000UVAct value) {
        return new JAXBElement<COCTMT530000UVAct>(_COCTMT530000UVSourceOf2Act_QNAME, COCTMT530000UVAct.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVActReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "actReference", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVActReference> createCOCTMT510000UV06PreconditionActReference(COCTMT530000UVActReference value) {
        return new JAXBElement<COCTMT530000UVActReference>(_COCTMT510000UV06PreconditionActReference_QNAME, COCTMT530000UVActReference.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observation", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVObservation> createCOCTMT510000UV06PreconditionObservation(COCTMT530000UVObservation value) {
        return new JAXBElement<COCTMT530000UVObservation>(_COCTMT530000UVSourceOf2Observation_QNAME, COCTMT530000UVObservation.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "substanceAdministration", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVSubstanceAdministration> createCOCTMT510000UV06PreconditionSubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        return new JAXBElement<COCTMT530000UVSubstanceAdministration>(_COCTMT530000UVSourceOf2SubstanceAdministration_QNAME, COCTMT530000UVSubstanceAdministration.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "organizer", scope = COCTMT510000UV06Precondition.class)
    public JAXBElement<COCTMT530000UVOrganizer> createCOCTMT510000UV06PreconditionOrganizer(COCTMT530000UVOrganizer value) {
        return new JAXBElement<COCTMT530000UVOrganizer>(_COCTMT530000UVSourceOf2Organizer_QNAME, COCTMT530000UVOrganizer.class, COCTMT510000UV06Precondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = COCTMT030000UV04Student.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT030000UV04StudentSchoolOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_PRPAMT201302UV02StudentSchoolOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT030000UV04Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVIdentifiedContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asIdentifiedContainer", scope = COCTMT080000UVContainer.class)
    public JAXBElement<COCTMT080000UVIdentifiedContainer> createCOCTMT080000UVContainerAsIdentifiedContainer(COCTMT080000UVIdentifiedContainer value) {
        return new JAXBElement<COCTMT080000UVIdentifiedContainer>(_COCTMT080000UVContainerAsIdentifiedContainer_QNAME, COCTMT080000UVIdentifiedContainer.class, COCTMT080000UVContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVContent3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asContent", scope = COCTMT080000UVContainer.class)
    public JAXBElement<COCTMT080000UVContent3> createCOCTMT080000UVContainerAsContent(COCTMT080000UVContent3 value) {
        return new JAXBElement<COCTMT080000UVContent3>(_COCTMT080000UVNonPersonLivingSubjectAsContent_QNAME, COCTMT080000UVContent3 .class, COCTMT080000UVContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT080000UVContainer.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT080000UVContainerAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090100UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT080000UVContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patient", scope = COCTMT530000UVSubject2 .class)
    public JAXBElement<COCTMT050000UV01Patient> createCOCTMT530000UVSubject2Patient(COCTMT050000UV01Patient value) {
        return new JAXBElement<COCTMT050000UV01Patient>(_COCTMT530000UVSubject2Patient_QNAME, COCTMT050000UV01Patient.class, COCTMT530000UVSubject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVSpecimen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimen", scope = COCTMT530000UVSubject2 .class)
    public JAXBElement<COCTMT080000UVSpecimen> createCOCTMT530000UVSubject2Specimen(COCTMT080000UVSpecimen value) {
        return new JAXBElement<COCTMT080000UVSpecimen>(_COCTMT530000UVSubject2Specimen_QNAME, COCTMT080000UVSpecimen.class, COCTMT530000UVSubject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRelatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedEntity", scope = COCTMT530000UVSubject2 .class)
    public JAXBElement<COCTMT530000UVRelatedEntity> createCOCTMT530000UVSubject2RelatedEntity(COCTMT530000UVRelatedEntity value) {
        return new JAXBElement<COCTMT530000UVRelatedEntity>(_COCTMT530000UVSubject2RelatedEntity_QNAME, COCTMT530000UVRelatedEntity.class, COCTMT530000UVSubject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocTh.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocThRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocThRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocTh.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocThLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocThLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTh.class)
    public JAXBElement<StrucDocBr> createStrucDocThBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocThBr_QNAME, StrucDocBr.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTh.class)
    public JAXBElement<StrucDocSup> createStrucDocThSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocThSup_QNAME, StrucDocSup.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTh.class)
    public JAXBElement<StrucDocSub> createStrucDocThSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocThSub_QNAME, StrucDocSub.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTh.class)
    public JAXBElement<StrucDocContent> createStrucDocThContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocThContent_QNAME, StrucDocContent.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocTh.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocThFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocThFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocTh.class)
    public JAXBElement<StrucDocFootnote> createStrucDocThFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocThFootnote_QNAME, StrucDocFootnote.class, StrucDocTh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201310UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201310UV02Person.class)
    public JAXBElement<PRPAMT201310UV02BirthPlace> createPRPAMT201310UV02PersonBirthPlace(PRPAMT201310UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201310UV02BirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, PRPAMT201310UV02BirthPlace.class, PRPAMT201310UV02Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Beneficiary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "beneficiary", scope = COCTMT510000UV06Beneficiary2 .class)
    public JAXBElement<COCTMT510000UV06Beneficiary> createCOCTMT510000UV06Beneficiary2Beneficiary(COCTMT510000UV06Beneficiary value) {
        return new JAXBElement<COCTMT510000UV06Beneficiary>(_COCTMT510000UV06Beneficiary2Beneficiary_QNAME, COCTMT510000UV06Beneficiary.class, COCTMT510000UV06Beneficiary2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patient", scope = COCTMT510000UV06Beneficiary2 .class)
    public JAXBElement<COCTMT050000UV01Patient> createCOCTMT510000UV06Beneficiary2Patient(COCTMT050000UV01Patient value) {
        return new JAXBElement<COCTMT050000UV01Patient>(_COCTMT530000UVSubject2Patient_QNAME, COCTMT050000UV01Patient.class, COCTMT510000UV06Beneficiary2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "table", scope = StrucDocItem.class)
    public JAXBElement<StrucDocTable> createStrucDocItemTable(StrucDocTable value) {
        return new JAXBElement<StrucDocTable>(_StrucDocItemTable_QNAME, StrucDocTable.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocCaption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "caption", scope = StrucDocItem.class)
    public JAXBElement<StrucDocCaption> createStrucDocItemCaption(StrucDocCaption value) {
        return new JAXBElement<StrucDocCaption>(_StrucDocItemCaption_QNAME, StrucDocCaption.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "list", scope = StrucDocItem.class)
    public JAXBElement<StrucDocList> createStrucDocItemList(StrucDocList value) {
        return new JAXBElement<StrucDocList>(_StrucDocItemList_QNAME, StrucDocList.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocItem.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocItemRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocThRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocItem.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocItemLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocThLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocItem.class)
    public JAXBElement<StrucDocBr> createStrucDocItemBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocThBr_QNAME, StrucDocBr.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocItem.class)
    public JAXBElement<StrucDocSup> createStrucDocItemSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocThSup_QNAME, StrucDocSup.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocItem.class)
    public JAXBElement<StrucDocSub> createStrucDocItemSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocThSub_QNAME, StrucDocSub.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocItem.class)
    public JAXBElement<StrucDocContent> createStrucDocItemContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocThContent_QNAME, StrucDocContent.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocItem.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocItemFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocThFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocItem.class)
    public JAXBElement<StrucDocFootnote> createStrucDocItemFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocThFootnote_QNAME, StrucDocFootnote.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "paragraph", scope = StrucDocItem.class)
    public JAXBElement<StrucDocParagraph> createStrucDocItemParagraph(StrucDocParagraph value) {
        return new JAXBElement<StrucDocParagraph>(_StrucDocItemParagraph_QNAME, StrucDocParagraph.class, StrucDocItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090300UV01AssignedDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = MFMIMT700711UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090300UV01AssignedDevice> createMFMIMT700711UV01AuthorOrPerformerAssignedDevice(COCTMT090300UV01AssignedDevice value) {
        return new JAXBElement<COCTMT090300UV01AssignedDevice>(_MFMIMT700711UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090300UV01AssignedDevice.class, MFMIMT700711UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090100UV01AssignedPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = MFMIMT700711UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090100UV01AssignedPerson> createMFMIMT700711UV01AuthorOrPerformerAssignedPerson(COCTMT090100UV01AssignedPerson value) {
        return new JAXBElement<COCTMT090100UV01AssignedPerson>(_COCTMT090102UV02AssignedPersonAssignedPerson_QNAME, COCTMT090100UV01AssignedPerson.class, MFMIMT700711UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLPQ.class)
    public JAXBElement<IVXBPQ> createIVLPQHigh(IVXBPQ value) {
        return new JAXBElement<IVXBPQ>(_IVLINTHigh_QNAME, IVXBPQ.class, IVLPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLPQ.class)
    public JAXBElement<IVXBPQ> createIVLPQLow(IVXBPQ value) {
        return new JAXBElement<IVXBPQ>(_IVLINTLow_QNAME, IVXBPQ.class, IVLPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLPQ.class)
    public JAXBElement<PQ> createIVLPQCenter(PQ value) {
        return new JAXBElement<PQ>(_IVLINTCenter_QNAME, PQ.class, IVLPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLPQ.class)
    public JAXBElement<PQ> createIVLPQWidth(PQ value) {
        return new JAXBElement<PQ>(_IVLINTWidth_QNAME, PQ.class, IVLPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVBirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = COCTMT030007UVPerson.class)
    public JAXBElement<COCTMT030007UVBirthPlace> createCOCTMT030007UVPersonBirthPlace(COCTMT030007UVBirthPlace value) {
        return new JAXBElement<COCTMT030007UVBirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, COCTMT030007UVBirthPlace.class, COCTMT030007UVPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "employerOrganization", scope = COCTMT030007UVEmployment.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT030007UVEmploymentEmployerOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT030000UV04EmploymentEmployerOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT030007UVEmployment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT500000UV04CoveredParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asCoveredParty", scope = COCTMT030000UV04Person.class)
    public JAXBElement<COCTMT500000UV04CoveredParty> createCOCTMT030000UV04PersonAsCoveredParty(COCTMT500000UV04CoveredParty value) {
        return new JAXBElement<COCTMT500000UV04CoveredParty>(_COCTMT030000UV04PersonAsCoveredParty_QNAME, COCTMT500000UV04CoveredParty.class, COCTMT030000UV04Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030000UV04BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = COCTMT030000UV04Person.class)
    public JAXBElement<COCTMT030000UV04BirthPlace> createCOCTMT030000UV04PersonBirthPlace(COCTMT030000UV04BirthPlace value) {
        return new JAXBElement<COCTMT030000UV04BirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, COCTMT030000UV04BirthPlace.class, COCTMT030000UV04Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder2", scope = PRPAMT201302UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createPRPAMT201302UV02PersonalRelationshipRelationshipHolder2(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_PRPAMT201302UV02PersonalRelationshipRelationshipHolder2_QNAME, COCTMT030007UVNonPersonLivingSubject.class, PRPAMT201302UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder1", scope = PRPAMT201302UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVPerson> createPRPAMT201302UV02PersonalRelationshipRelationshipHolder1(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_PRPAMT201302UV02PersonalRelationshipRelationshipHolder1_QNAME, COCTMT030007UVPerson.class, PRPAMT201302UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT150003UV03ContactParty.class)
    public JAXBElement<COCTMT150003UV03Person> createCOCTMT150003UV03ContactPartyContactPerson(COCTMT150003UV03Person value) {
        return new JAXBElement<COCTMT150003UV03Person>(_PRPAMT201301UV02ContactPartyContactPerson_QNAME, COCTMT150003UV03Person.class, COCTMT150003UV03ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTitle.class)
    public JAXBElement<StrucDocBr> createStrucDocTitleBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocThBr_QNAME, StrucDocBr.class, StrucDocTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTitle.class)
    public JAXBElement<StrucDocSup> createStrucDocTitleSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocThSup_QNAME, StrucDocSup.class, StrucDocTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTitle.class)
    public JAXBElement<StrucDocSub> createStrucDocTitleSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocThSub_QNAME, StrucDocSub.class, StrucDocTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTitle.class)
    public JAXBElement<StrucDocTitleContent> createStrucDocTitleContent(StrucDocTitleContent value) {
        return new JAXBElement<StrucDocTitleContent>(_StrucDocThContent_QNAME, StrucDocTitleContent.class, StrucDocTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocTitle.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocTitleFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocThFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocTitle.class)
    public JAXBElement<StrucDocTitleFootnote> createStrucDocTitleFootnote(StrucDocTitleFootnote value) {
        return new JAXBElement<StrucDocTitleFootnote>(_StrucDocThFootnote_QNAME, StrucDocTitleFootnote.class, StrucDocTitle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000300UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = MCCIMT000300UV01LocatedEntity.class)
    public JAXBElement<MCCIMT000300UV01Place> createMCCIMT000300UV01LocatedEntityLocation(MCCIMT000300UV01Place value) {
        return new JAXBElement<MCCIMT000300UV01Place>(_COCTMT530000UVHealthCareFacilityLocation_QNAME, MCCIMT000300UV01Place.class, MCCIMT000300UV01LocatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "partOrganization", scope = COCTMT150000UV02OrganizationContains.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT150000UV02OrganizationContainsPartOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT150000UV02OrganizationContainsPartOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT150000UV02OrganizationContains.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubject7 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf5", scope = COCTMT230100UVMedication.class)
    public JAXBElement<COCTMT230100UVSubject7> createCOCTMT230100UVMedicationSubjectOf5(COCTMT230100UVSubject7 value) {
        return new JAXBElement<COCTMT230100UVSubject7>(_COCTMT230100UVMedicationSubjectOf5_QNAME, COCTMT230100UVSubject7 .class, COCTMT230100UVMedication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04PertinentInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "pertinentInformation", scope = COCTMT300000UV04SubstanceAdministrationOrder.class)
    public JAXBElement<COCTMT300000UV04PertinentInformation> createCOCTMT300000UV04SubstanceAdministrationOrderPertinentInformation(COCTMT300000UV04PertinentInformation value) {
        return new JAXBElement<COCTMT300000UV04PertinentInformation>(_COCTMT300000UV04SubstanceAdministrationOrderPertinentInformation_QNAME, COCTMT300000UV04PertinentInformation.class, COCTMT300000UV04SubstanceAdministrationOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04Reason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "reason", scope = COCTMT300000UV04SubstanceAdministrationOrder.class)
    public JAXBElement<COCTMT300000UV04Reason> createCOCTMT300000UV04SubstanceAdministrationOrderReason(COCTMT300000UV04Reason value) {
        return new JAXBElement<COCTMT300000UV04Reason>(_COCTMT300000UV04SubstanceAdministrationOrderReason_QNAME, COCTMT300000UV04Reason.class, COCTMT300000UV04SubstanceAdministrationOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder2", scope = PRPAMT201303UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createPRPAMT201303UV02PersonalRelationshipRelationshipHolder2(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_PRPAMT201302UV02PersonalRelationshipRelationshipHolder2_QNAME, COCTMT030007UVNonPersonLivingSubject.class, PRPAMT201303UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder1", scope = PRPAMT201303UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVPerson> createPRPAMT201303UV02PersonalRelationshipRelationshipHolder1(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_PRPAMT201302UV02PersonalRelationshipRelationshipHolder1_QNAME, COCTMT030007UVPerson.class, PRPAMT201303UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06InjuryPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "locatedInjuryPlace", scope = COCTMT290000UV06InjuryLocation.class)
    public JAXBElement<COCTMT290000UV06InjuryPlace> createCOCTMT290000UV06InjuryLocationLocatedInjuryPlace(COCTMT290000UV06InjuryPlace value) {
        return new JAXBElement<COCTMT290000UV06InjuryPlace>(_COCTMT290000UV06InjuryLocationLocatedInjuryPlace_QNAME, COCTMT290000UV06InjuryPlace.class, COCTMT290000UV06InjuryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030202UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT030000UV04ContactParty.class)
    public JAXBElement<COCTMT030202UV01Person> createCOCTMT030000UV04ContactPartyContactPerson(COCTMT030202UV01Person value) {
        return new JAXBElement<COCTMT030202UV01Person>(_PRPAMT201301UV02ContactPartyContactPerson_QNAME, COCTMT030202UV01Person.class, COCTMT030000UV04ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = COCTMT030000UV04ContactParty.class)
    public JAXBElement<COCTMT150002UV01Organization> createCOCTMT030000UV04ContactPartyContactOrganization(COCTMT150002UV01Organization value) {
        return new JAXBElement<COCTMT150002UV01Organization>(_PRPAMT201301UV02ContactPartyContactOrganization_QNAME, COCTMT150002UV01Organization.class, COCTMT030000UV04ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = PRPAMT201310UV02Student.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201310UV02StudentSchoolOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201302UV02StudentSchoolOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201310UV02Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = PRPAMT201303UV02Guardian.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201303UV02GuardianGuardianOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201303UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = PRPAMT201303UV02Guardian.class)
    public JAXBElement<COCTMT030207UVPerson> createPRPAMT201303UV02GuardianGuardianPerson(COCTMT030207UVPerson value) {
        return new JAXBElement<COCTMT030207UVPerson>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030207UVPerson.class, PRPAMT201303UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAdministerableMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "administerableMaterial", scope = COCTMT530000UVConsumable.class)
    public JAXBElement<COCTMT530000UVAdministerableMaterial> createCOCTMT530000UVConsumableAdministerableMaterial(COCTMT530000UVAdministerableMaterial value) {
        return new JAXBElement<COCTMT530000UVAdministerableMaterial>(_COCTMT530000UVConsumableAdministerableMaterial_QNAME, COCTMT530000UVAdministerableMaterial.class, COCTMT530000UVConsumable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVMedication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "medication", scope = COCTMT530000UVConsumable.class)
    public JAXBElement<COCTMT230100UVMedication> createCOCTMT530000UVConsumableMedication(COCTMT230100UVMedication value) {
        return new JAXBElement<COCTMT230100UVMedication>(_COCTMT530000UVConsumableMedication_QNAME, COCTMT230100UVMedication.class, COCTMT530000UVConsumable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04Origin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "origin", scope = COCTMT490000UV04BillableClinicalProduct.class)
    public JAXBElement<COCTMT490000UV04Origin> createCOCTMT490000UV04BillableClinicalProductOrigin(COCTMT490000UV04Origin value) {
        return new JAXBElement<COCTMT490000UV04Origin>(_COCTMT490000UV04BillableClinicalProductOrigin_QNAME, COCTMT490000UV04Origin.class, COCTMT490000UV04BillableClinicalProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04Consultant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "consultant", scope = COCTMT490000UV04BillableClinicalProduct.class)
    public JAXBElement<COCTMT490000UV04Consultant> createCOCTMT490000UV04BillableClinicalProductConsultant(COCTMT490000UV04Consultant value) {
        return new JAXBElement<COCTMT490000UV04Consultant>(_COCTMT490000UV04BillableClinicalProductConsultant_QNAME, COCTMT490000UV04Consultant.class, COCTMT490000UV04BillableClinicalProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "destination", scope = COCTMT490000UV04BillableClinicalProduct.class)
    public JAXBElement<COCTMT490000UV04Destination> createCOCTMT490000UV04BillableClinicalProductDestination(COCTMT490000UV04Destination value) {
        return new JAXBElement<COCTMT490000UV04Destination>(_COCTMT490000UV04BillableClinicalProductDestination_QNAME, COCTMT490000UV04Destination.class, COCTMT490000UV04BillableClinicalProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04Referrer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "referrer", scope = COCTMT490000UV04BillableClinicalProduct.class)
    public JAXBElement<COCTMT490000UV04Referrer> createCOCTMT490000UV04BillableClinicalProductReferrer(COCTMT490000UV04Referrer value) {
        return new JAXBElement<COCTMT490000UV04Referrer>(_COCTMT490000UV04BillableClinicalProductReferrer_QNAME, COCTMT490000UV04Referrer.class, COCTMT490000UV04BillableClinicalProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030202UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guarantorPerson", scope = COCTMT030007UVGuarantor.class)
    public JAXBElement<COCTMT030202UV01Person> createCOCTMT030007UVGuarantorGuarantorPerson(COCTMT030202UV01Person value) {
        return new JAXBElement<COCTMT030202UV01Person>(_COCTMT670000UV04GuarantorRoleGuarantorPerson_QNAME, COCTMT030202UV01Person.class, COCTMT030007UVGuarantor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guarantorOrganization", scope = COCTMT030007UVGuarantor.class)
    public JAXBElement<COCTMT150002UV01Organization> createCOCTMT030007UVGuarantorGuarantorOrganization(COCTMT150002UV01Organization value) {
        return new JAXBElement<COCTMT150002UV01Organization>(_COCTMT670000UV04GuarantorRoleGuarantorOrganization_QNAME, COCTMT150002UV01Organization.class, COCTMT030007UVGuarantor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT030000UV04OtherIDs.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT030000UV04OtherIDsScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT030000UV04OtherIDs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "governingCountry", scope = COCTMT230100UVTerritorialAuthority.class)
    public JAXBElement<COCTMT230100UVCountry> createCOCTMT230100UVTerritorialAuthorityGoverningCountry(COCTMT230100UVCountry value) {
        return new JAXBElement<COCTMT230100UVCountry>(_COCTMT230100UVTerritorialAuthorityGoverningCountry_QNAME, COCTMT230100UVCountry.class, COCTMT230100UVTerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVAgency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "territory", scope = COCTMT230100UVTerritorialAuthority.class)
    public JAXBElement<COCTMT230100UVAgency> createCOCTMT230100UVTerritorialAuthorityTerritory(COCTMT230100UVAgency value) {
        return new JAXBElement<COCTMT230100UVAgency>(_COCTMT230100UVTerritorialAuthorityTerritory_QNAME, COCTMT230100UVAgency.class, COCTMT230100UVTerritorialAuthority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scoperOrganization", scope = COCTMT510000UV06Underwriter.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06UnderwriterScoperOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06UnderwriterScoperOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Underwriter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "underwritingOrganization", scope = COCTMT510000UV06Underwriter.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06UnderwriterUnderwritingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PolicyHolderUnderwritingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Underwriter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201301UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201301UV02Person.class)
    public JAXBElement<PRPAMT201301UV02BirthPlace> createPRPAMT201301UV02PersonBirthPlace(PRPAMT201301UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201301UV02BirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, PRPAMT201301UV02BirthPlace.class, PRPAMT201301UV02Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Beneficiary2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "beneficiary", scope = COCTMT510000UV06CoverageRecord.class)
    public JAXBElement<COCTMT510000UV06Beneficiary2> createCOCTMT510000UV06CoverageRecordBeneficiary(COCTMT510000UV06Beneficiary2 value) {
        return new JAXBElement<COCTMT510000UV06Beneficiary2>(_COCTMT510000UV06Beneficiary2Beneficiary_QNAME, COCTMT510000UV06Beneficiary2 .class, COCTMT510000UV06CoverageRecord.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = PRPAMT201303UV02ContactParty.class)
    public JAXBElement<COCTMT030207UVPerson> createPRPAMT201303UV02ContactPartyContactPerson(COCTMT030207UVPerson value) {
        return new JAXBElement<COCTMT030207UVPerson>(_PRPAMT201301UV02ContactPartyContactPerson_QNAME, COCTMT030207UVPerson.class, PRPAMT201303UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = PRPAMT201303UV02ContactParty.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201303UV02ContactPartyContactOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201301UV02ContactPartyContactOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201303UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assigningOrganization", scope = COCTMT080000UVSpecimenAlternateIdentifier.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT080000UVSpecimenAlternateIdentifierAssigningOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT080000UVSpecimenAlternateIdentifierAssigningOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT080000UVSpecimenAlternateIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = PRPAMT201302UV02ContactParty.class)
    public JAXBElement<COCTMT030207UVPerson> createPRPAMT201302UV02ContactPartyContactPerson(COCTMT030207UVPerson value) {
        return new JAXBElement<COCTMT030207UVPerson>(_PRPAMT201301UV02ContactPartyContactPerson_QNAME, COCTMT030207UVPerson.class, PRPAMT201302UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = PRPAMT201302UV02ContactParty.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201302UV02ContactPartyContactOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201301UV02ContactPartyContactOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201302UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = COCTMT030007UVStudent.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT030007UVStudentSchoolOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_PRPAMT201302UV02StudentSchoolOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT030007UVStudent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "suffix", scope = PNExplicit.class)
    public JAXBElement<EnExplicitSuffix> createPNExplicitSuffix(EnExplicitSuffix value) {
        return new JAXBElement<EnExplicitSuffix>(_ENSuffix_QNAME, EnExplicitSuffix.class, PNExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitDelimiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "delimiter", scope = PNExplicit.class)
    public JAXBElement<EnExplicitDelimiter> createPNExplicitDelimiter(EnExplicitDelimiter value) {
        return new JAXBElement<EnExplicitDelimiter>(_ENDelimiter_QNAME, EnExplicitDelimiter.class, PNExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVLTSExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "validTime", scope = PNExplicit.class)
    public JAXBElement<IVLTSExplicit> createPNExplicitValidTime(IVLTSExplicit value) {
        return new JAXBElement<IVLTSExplicit>(_ENValidTime_QNAME, IVLTSExplicit.class, PNExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitPrefix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "prefix", scope = PNExplicit.class)
    public JAXBElement<EnExplicitPrefix> createPNExplicitPrefix(EnExplicitPrefix value) {
        return new JAXBElement<EnExplicitPrefix>(_ENPrefix_QNAME, EnExplicitPrefix.class, PNExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitFamily }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "family", scope = PNExplicit.class)
    public JAXBElement<EnExplicitFamily> createPNExplicitFamily(EnExplicitFamily value) {
        return new JAXBElement<EnExplicitFamily>(_ENFamily_QNAME, EnExplicitFamily.class, PNExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitGiven }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "given", scope = PNExplicit.class)
    public JAXBElement<EnExplicitGiven> createPNExplicitGiven(EnExplicitGiven value) {
        return new JAXBElement<EnExplicitGiven>(_ENGiven_QNAME, EnExplicitGiven.class, PNExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT040203UV01NotificationParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "notificationParty", scope = MCCIMT000200UV01Organization.class)
    public JAXBElement<COCTMT040203UV01NotificationParty> createMCCIMT000200UV01OrganizationNotificationParty(COCTMT040203UV01NotificationParty value) {
        return new JAXBElement<COCTMT040203UV01NotificationParty>(_MCCIMT000200UV01OrganizationNotificationParty_QNAME, COCTMT040203UV01NotificationParty.class, MCCIMT000200UV01Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ResponsibleParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "responsibleParty", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06ResponsibleParty> createCOCTMT290000UV06BillableClinicalServiceResponsibleParty(COCTMT290000UV06ResponsibleParty value) {
        return new JAXBElement<COCTMT290000UV06ResponsibleParty>(_COCTMT290000UV06BillableClinicalServiceResponsibleParty_QNAME, COCTMT290000UV06ResponsibleParty.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Performer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "performer", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06Performer> createCOCTMT290000UV06BillableClinicalServicePerformer(COCTMT290000UV06Performer value) {
        return new JAXBElement<COCTMT290000UV06Performer>(_COCTMT290000UV06BillableClinicalServicePerformer_QNAME, COCTMT290000UV06Performer.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Subject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf2", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06Subject> createCOCTMT290000UV06BillableClinicalServiceSubjectOf2(COCTMT290000UV06Subject value) {
        return new JAXBElement<COCTMT290000UV06Subject>(_COCTMT290000UV06BillableClinicalServiceSubjectOf2_QNAME, COCTMT290000UV06Subject.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ReusableDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "reusableDevice", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06ReusableDevice> createCOCTMT290000UV06BillableClinicalServiceReusableDevice(COCTMT290000UV06ReusableDevice value) {
        return new JAXBElement<COCTMT290000UV06ReusableDevice>(_COCTMT290000UV06BillableClinicalServiceReusableDevice_QNAME, COCTMT290000UV06ReusableDevice.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06Author> createCOCTMT290000UV06BillableClinicalServiceAuthor(COCTMT290000UV06Author value) {
        return new JAXBElement<COCTMT290000UV06Author>(_PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME, COCTMT290000UV06Author.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Component2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "component", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06Component2> createCOCTMT290000UV06BillableClinicalServiceComponent(COCTMT290000UV06Component2 value) {
        return new JAXBElement<COCTMT290000UV06Component2>(_COCTMT290000UV06BillableClinicalServiceComponent_QNAME, COCTMT290000UV06Component2 .class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT290000UV06BillableClinicalService.class)
    public JAXBElement<COCTMT290000UV06Location> createCOCTMT290000UV06BillableClinicalServiceLocation(COCTMT290000UV06Location value) {
        return new JAXBElement<COCTMT290000UV06Location>(_COCTMT530000UVHealthCareFacilityLocation_QNAME, COCTMT290000UV06Location.class, COCTMT290000UV06BillableClinicalService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = COCTMT530000UVPerformer.class)
    public JAXBElement<COCTMT090000UV01AssignedEntity> createCOCTMT530000UVPerformerAssignedEntity(COCTMT090000UV01AssignedEntity value) {
        return new JAXBElement<COCTMT090000UV01AssignedEntity>(_COCTMT530000UVPerformerAssignedEntity_QNAME, COCTMT090000UV01AssignedEntity.class, COCTMT530000UVPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patient", scope = COCTMT530000UVPerformer.class)
    public JAXBElement<COCTMT050000UV01Patient> createCOCTMT530000UVPerformerPatient(COCTMT050000UV01Patient value) {
        return new JAXBElement<COCTMT050000UV01Patient>(_COCTMT530000UVSubject2Patient_QNAME, COCTMT050000UV01Patient.class, COCTMT530000UVPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRelatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedEntity", scope = COCTMT530000UVPerformer.class)
    public JAXBElement<COCTMT530000UVRelatedEntity> createCOCTMT530000UVPerformerRelatedEntity(COCTMT530000UVRelatedEntity value) {
        return new JAXBElement<COCTMT530000UVRelatedEntity>(_COCTMT530000UVSubject2RelatedEntity_QNAME, COCTMT530000UVRelatedEntity.class, COCTMT530000UVPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT150007UVContactParty.class)
    public JAXBElement<COCTMT150007UVPerson> createCOCTMT150007UVContactPartyContactPerson(COCTMT150007UVPerson value) {
        return new JAXBElement<COCTMT150007UVPerson>(_PRPAMT201301UV02ContactPartyContactPerson_QNAME, COCTMT150007UVPerson.class, COCTMT150007UVContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02QueryByParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameter", scope = PRPAIN201305UV02QUQIMT021001UV01ControlActProcess.class)
    public JAXBElement<PRPAMT201306UV02QueryByParameter> createPRPAIN201305UV02QUQIMT021001UV01ControlActProcessQueryByParameter(PRPAMT201306UV02QueryByParameter value) {
        return new JAXBElement<PRPAMT201306UV02QueryByParameter>(_PRPAIN201305UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME, PRPAMT201306UV02QueryByParameter.class, PRPAIN201305UV02QUQIMT021001UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TELExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "reference", scope = SCExplicit.class)
    public JAXBElement<TELExplicit> createSCExplicitReference(TELExplicit value) {
        return new JAXBElement<TELExplicit>(_STExplicitReference_QNAME, TELExplicit.class, SCExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThumbnailExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "thumbnail", scope = SCExplicit.class)
    public JAXBElement<ThumbnailExplicit> createSCExplicitThumbnail(ThumbnailExplicit value) {
        return new JAXBElement<ThumbnailExplicit>(_STExplicitThumbnail_QNAME, ThumbnailExplicit.class, SCExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVResponsibleParty1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "responsibleParty", scope = COCTMT530000UVControlActEvent.class)
    public JAXBElement<COCTMT530000UVResponsibleParty1> createCOCTMT530000UVControlActEventResponsibleParty(COCTMT530000UVResponsibleParty1 value) {
        return new JAXBElement<COCTMT530000UVResponsibleParty1>(_COCTMT290000UV06BillableClinicalServiceResponsibleParty_QNAME, COCTMT530000UVResponsibleParty1 .class, COCTMT530000UVControlActEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700701UV01Subject3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject1", scope = MFMIMT700701UV01PriorRegistration.class)
    public JAXBElement<MFMIMT700701UV01Subject3> createMFMIMT700701UV01PriorRegistrationSubject1(MFMIMT700701UV01Subject3 value) {
        return new JAXBElement<MFMIMT700701UV01Subject3>(_MFMIMT700701UV01PriorRegistrationSubject1_QNAME, MFMIMT700701UV01Subject3 .class, MFMIMT700701UV01PriorRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700701UV01Subject4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject2", scope = MFMIMT700701UV01PriorRegistration.class)
    public JAXBElement<MFMIMT700701UV01Subject4> createMFMIMT700701UV01PriorRegistrationSubject2(MFMIMT700701UV01Subject4 value) {
        return new JAXBElement<MFMIMT700701UV01Subject4>(_MFMIMT700701UV01PriorRegistrationSubject2_QNAME, MFMIMT700701UV01Subject4 .class, MFMIMT700701UV01PriorRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = PRPAMT201301UV02Guardian.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201301UV02GuardianGuardianOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201301UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = PRPAMT201301UV02Guardian.class)
    public JAXBElement<COCTMT030207UVPerson> createPRPAMT201301UV02GuardianGuardianPerson(COCTMT030207UVPerson value) {
        return new JAXBElement<COCTMT030207UVPerson>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030207UVPerson.class, PRPAMT201301UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "list", scope = StrucDocTd.class)
    public JAXBElement<StrucDocList> createStrucDocTdList(StrucDocList value) {
        return new JAXBElement<StrucDocList>(_StrucDocItemList_QNAME, StrucDocList.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocTd.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocTdRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocThRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocTd.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocTdLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocThLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTd.class)
    public JAXBElement<StrucDocBr> createStrucDocTdBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocThBr_QNAME, StrucDocBr.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTd.class)
    public JAXBElement<StrucDocSup> createStrucDocTdSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocThSup_QNAME, StrucDocSup.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTd.class)
    public JAXBElement<StrucDocSub> createStrucDocTdSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocThSub_QNAME, StrucDocSub.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTd.class)
    public JAXBElement<StrucDocContent> createStrucDocTdContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocThContent_QNAME, StrucDocContent.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocTd.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocTdFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocThFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocTd.class)
    public JAXBElement<StrucDocFootnote> createStrucDocTdFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocThFootnote_QNAME, StrucDocFootnote.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "paragraph", scope = StrucDocTd.class)
    public JAXBElement<StrucDocParagraph> createStrucDocTdParagraph(StrucDocParagraph value) {
        return new JAXBElement<StrucDocParagraph>(_StrucDocItemParagraph_QNAME, StrucDocParagraph.class, StrucDocTd.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocCaption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "caption", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocCaption> createStrucDocParagraphCaption(StrucDocCaption value) {
        return new JAXBElement<StrucDocCaption>(_StrucDocItemCaption_QNAME, StrucDocCaption.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocParagraphRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocThRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocBr> createStrucDocParagraphBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocThBr_QNAME, StrucDocBr.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocParagraphLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocThLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocSup> createStrucDocParagraphSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocThSup_QNAME, StrucDocSup.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocSub> createStrucDocParagraphSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocThSub_QNAME, StrucDocSub.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocContent> createStrucDocParagraphContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocThContent_QNAME, StrucDocContent.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocParagraphFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocThFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocParagraph.class)
    public JAXBElement<StrucDocFootnote> createStrucDocParagraphFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocThFootnote_QNAME, StrucDocFootnote.class, StrucDocParagraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201302UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201302UV02Person.class)
    public JAXBElement<PRPAMT201302UV02BirthPlace> createPRPAMT201302UV02PersonBirthPlace(PRPAMT201302UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201302UV02BirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, PRPAMT201302UV02BirthPlace.class, PRPAMT201302UV02Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVContent4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asContent", scope = COCTMT080000UVHolder.class)
    public JAXBElement<COCTMT080000UVContent4> createCOCTMT080000UVHolderAsContent(COCTMT080000UVContent4 value) {
        return new JAXBElement<COCTMT080000UVContent4>(_COCTMT080000UVNonPersonLivingSubjectAsContent_QNAME, COCTMT080000UVContent4 .class, COCTMT080000UVHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT080000UVHolder.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT080000UVHolderAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090100UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT080000UVHolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sourcePerson", scope = COCTMT080000UVSpecimen.class)
    public JAXBElement<COCTMT080000UVPerson> createCOCTMT080000UVSpecimenSourcePerson(COCTMT080000UVPerson value) {
        return new JAXBElement<COCTMT080000UVPerson>(_COCTMT080000UVSpecimenSourcePerson_QNAME, COCTMT080000UVPerson.class, COCTMT080000UVSpecimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVManufactured }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sourceManufactured", scope = COCTMT080000UVSpecimen.class)
    public JAXBElement<COCTMT080000UVManufactured> createCOCTMT080000UVSpecimenSourceManufactured(COCTMT080000UVManufactured value) {
        return new JAXBElement<COCTMT080000UVManufactured>(_COCTMT080000UVSpecimenSourceManufactured_QNAME, COCTMT080000UVManufactured.class, COCTMT080000UVSpecimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVNatural }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sourceNatural", scope = COCTMT080000UVSpecimen.class)
    public JAXBElement<COCTMT080000UVNatural> createCOCTMT080000UVSpecimenSourceNatural(COCTMT080000UVNatural value) {
        return new JAXBElement<COCTMT080000UVNatural>(_COCTMT080000UVSpecimenSourceNatural_QNAME, COCTMT080000UVNatural.class, COCTMT080000UVSpecimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sourceNonPersonLivingSubject", scope = COCTMT080000UVSpecimen.class)
    public JAXBElement<COCTMT080000UVNonPersonLivingSubject> createCOCTMT080000UVSpecimenSourceNonPersonLivingSubject(COCTMT080000UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT080000UVNonPersonLivingSubject>(_COCTMT080000UVSpecimenSourceNonPersonLivingSubject_QNAME, COCTMT080000UVNonPersonLivingSubject.class, COCTMT080000UVSpecimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "productOf", scope = COCTMT080000UVSpecimen.class)
    public JAXBElement<COCTMT080000UVProduct> createCOCTMT080000UVSpecimenProductOf(COCTMT080000UVProduct value) {
        return new JAXBElement<COCTMT080000UVProduct>(_COCTMT080000UVSpecimenProductOf_QNAME, COCTMT080000UVProduct.class, COCTMT080000UVSpecimen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "underwritingOrganization", scope = COCTMT510000UV06Sponsor.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06SponsorUnderwritingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PolicyHolderUnderwritingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Sponsor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sponsorOrganization", scope = COCTMT510000UV06Sponsor.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06SponsorSponsorOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06SponsorSponsorOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Sponsor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT820000UVAssignedProvider.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT820000UVAssignedProviderRepresentedOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT820000UVAssignedProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT820000UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT820000UVAssignedProvider.class)
    public JAXBElement<COCTMT820000UVPerson> createCOCTMT820000UVAssignedProviderAssignedPerson(COCTMT820000UVPerson value) {
        return new JAXBElement<COCTMT820000UVPerson>(_COCTMT090102UV02AssignedPersonAssignedPerson_QNAME, COCTMT820000UVPerson.class, COCTMT820000UVAssignedProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder", scope = COCTMT510000UV06PersonalRelationship.class)
    public JAXBElement<COCTMT510000UV06Person> createCOCTMT510000UV06PersonalRelationshipRelationshipHolder(COCTMT510000UV06Person value) {
        return new JAXBElement<COCTMT510000UV06Person>(_COCTMT510000UV06PersonalRelationshipRelationshipHolder_QNAME, COCTMT510000UV06Person.class, COCTMT510000UV06PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "personalRelationshipWith", scope = COCTMT510000UV06PersonalRelationship.class)
    public JAXBElement<COCTMT510000UV06Person> createCOCTMT510000UV06PersonalRelationshipPersonalRelationshipWith(COCTMT510000UV06Person value) {
        return new JAXBElement<COCTMT510000UV06Person>(_COCTMT510000UV06PersonalRelationshipPersonalRelationshipWith_QNAME, COCTMT510000UV06Person.class, COCTMT510000UV06PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030202UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guarantorPerson", scope = COCTMT030000UV04Guarantor.class)
    public JAXBElement<COCTMT030202UV01Person> createCOCTMT030000UV04GuarantorGuarantorPerson(COCTMT030202UV01Person value) {
        return new JAXBElement<COCTMT030202UV01Person>(_COCTMT670000UV04GuarantorRoleGuarantorPerson_QNAME, COCTMT030202UV01Person.class, COCTMT030000UV04Guarantor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guarantorOrganization", scope = COCTMT030000UV04Guarantor.class)
    public JAXBElement<COCTMT150002UV01Organization> createCOCTMT030000UV04GuarantorGuarantorOrganization(COCTMT150002UV01Organization value) {
        return new JAXBElement<COCTMT150002UV01Organization>(_COCTMT670000UV04GuarantorRoleGuarantorOrganization_QNAME, COCTMT150002UV01Organization.class, COCTMT030000UV04Guarantor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subContent", scope = COCTMT230100UVPackagedMedicine.class)
    public JAXBElement<COCTMT230100UVSubContent> createCOCTMT230100UVPackagedMedicineSubContent(COCTMT230100UVSubContent value) {
        return new JAXBElement<COCTMT230100UVSubContent>(_COCTMT230100UVPackagedMedicineSubContent_QNAME, COCTMT230100UVSubContent.class, COCTMT230100UVPackagedMedicine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSuperContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asSuperContent", scope = COCTMT230100UVPackagedMedicine.class)
    public JAXBElement<COCTMT230100UVSuperContent> createCOCTMT230100UVPackagedMedicineAsSuperContent(COCTMT230100UVSuperContent value) {
        return new JAXBElement<COCTMT230100UVSuperContent>(_COCTMT230100UVPackagedMedicineAsSuperContent_QNAME, COCTMT230100UVSuperContent.class, COCTMT230100UVPackagedMedicine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030202UV01Birthplace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = COCTMT030202UV01Person.class)
    public JAXBElement<COCTMT030202UV01Birthplace> createCOCTMT030202UV01PersonBirthplace(COCTMT030202UV01Birthplace value) {
        return new JAXBElement<COCTMT030202UV01Birthplace>(_PRPAMT201301UV02BirthPlaceBirthplace_QNAME, COCTMT030202UV01Birthplace.class, COCTMT030202UV01Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT260003UVOtherMedication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "otherMedication", scope = COCTMT260003UVSubject2 .class)
    public JAXBElement<COCTMT260003UVOtherMedication> createCOCTMT260003UVSubject2OtherMedication(COCTMT260003UVOtherMedication value) {
        return new JAXBElement<COCTMT260003UVOtherMedication>(_COCTMT260003UVSubject2OtherMedication_QNAME, COCTMT260003UVOtherMedication.class, COCTMT260003UVSubject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT260003UVOtherSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "otherSupply", scope = COCTMT260003UVSubject2 .class)
    public JAXBElement<COCTMT260003UVOtherSupply> createCOCTMT260003UVSubject2OtherSupply(COCTMT260003UVOtherSupply value) {
        return new JAXBElement<COCTMT260003UVOtherSupply>(_COCTMT260003UVSubject2OtherSupply_QNAME, COCTMT260003UVOtherSupply.class, COCTMT260003UVSubject2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = COCTMT090100UV01LicensedEntity.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT090100UV01LicensedEntityIssuingOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_COCTMT090300UV01LicensedEntityIssuingOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT090100UV01LicensedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT600000UV06PrescriptionOrder.class)
    public JAXBElement<COCTMT600000UV06Author> createCOCTMT600000UV06PrescriptionOrderAuthor(COCTMT600000UV06Author value) {
        return new JAXBElement<COCTMT600000UV06Author>(_PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME, COCTMT600000UV06Author.class, COCTMT600000UV06PrescriptionOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVContent1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asContent", scope = COCTMT080000UVNatural.class)
    public JAXBElement<COCTMT080000UVContent1> createCOCTMT080000UVNaturalAsContent(COCTMT080000UVContent1 value) {
        return new JAXBElement<COCTMT080000UVContent1>(_COCTMT080000UVNonPersonLivingSubjectAsContent_QNAME, COCTMT080000UVContent1 .class, COCTMT080000UVNatural.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710000UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT710000UV01LocatedEntityPartOf.class)
    public JAXBElement<COCTMT710000UV01Place> createCOCTMT710000UV01LocatedEntityPartOfLocation(COCTMT710000UV01Place value) {
        return new JAXBElement<COCTMT710000UV01Place>(_COCTMT530000UVHealthCareFacilityLocation_QNAME, COCTMT710000UV01Place.class, COCTMT710000UV01LocatedEntityPartOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT150000UV02Person.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT150000UV02PersonAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090100UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT150000UV02Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TELExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "reference", scope = EDExplicit.class)
    public JAXBElement<TELExplicit> createEDExplicitReference(TELExplicit value) {
        return new JAXBElement<TELExplicit>(_STExplicitReference_QNAME, TELExplicit.class, EDExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThumbnailExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "thumbnail", scope = EDExplicit.class)
    public JAXBElement<ThumbnailExplicit> createEDExplicitThumbnail(ThumbnailExplicit value) {
        return new JAXBElement<ThumbnailExplicit>(_STExplicitThumbnail_QNAME, ThumbnailExplicit.class, EDExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBTSExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLTSExplicit.class)
    public JAXBElement<IVXBTSExplicit> createIVLTSExplicitHigh(IVXBTSExplicit value) {
        return new JAXBElement<IVXBTSExplicit>(_IVLINTHigh_QNAME, IVXBTSExplicit.class, IVLTSExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBTSExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLTSExplicit.class)
    public JAXBElement<IVXBTSExplicit> createIVLTSExplicitLow(IVXBTSExplicit value) {
        return new JAXBElement<IVXBTSExplicit>(_IVLINTLow_QNAME, IVXBTSExplicit.class, IVLTSExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLTSExplicit.class)
    public JAXBElement<TSExplicit> createIVLTSExplicitCenter(TSExplicit value) {
        return new JAXBElement<TSExplicit>(_IVLINTCenter_QNAME, TSExplicit.class, IVLTSExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PQExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLTSExplicit.class)
    public JAXBElement<PQExplicit> createIVLTSExplicitWidth(PQExplicit value) {
        return new JAXBElement<PQExplicit>(_IVLINTWidth_QNAME, PQExplicit.class, IVLTSExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201307UV02QueryByParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameter", scope = PRPAIN201309UV02QUQIMT021001UV01ControlActProcess.class)
    public JAXBElement<PRPAMT201307UV02QueryByParameter> createPRPAIN201309UV02QUQIMT021001UV01ControlActProcessQueryByParameter(PRPAMT201307UV02QueryByParameter value) {
        return new JAXBElement<PRPAMT201307UV02QueryByParameter>(_PRPAIN201305UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME, PRPAMT201307UV02QueryByParameter.class, PRPAIN201309UV02QUQIMT021001UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06ResponsibleParty2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "responsibleParty", scope = COCTMT510000UV06PolicyOrProgram.class)
    public JAXBElement<COCTMT510000UV06ResponsibleParty2> createCOCTMT510000UV06PolicyOrProgramResponsibleParty(COCTMT510000UV06ResponsibleParty2 value) {
        return new JAXBElement<COCTMT510000UV06ResponsibleParty2>(_COCTMT290000UV06BillableClinicalServiceResponsibleParty_QNAME, COCTMT510000UV06ResponsibleParty2 .class, COCTMT510000UV06PolicyOrProgram.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Holder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "holder", scope = COCTMT510000UV06PolicyOrProgram.class)
    public JAXBElement<COCTMT510000UV06Holder> createCOCTMT510000UV06PolicyOrProgramHolder(COCTMT510000UV06Holder value) {
        return new JAXBElement<COCTMT510000UV06Holder>(_COCTMT500000UV04PolicyOrAccountHolder_QNAME, COCTMT510000UV06Holder.class, COCTMT510000UV06PolicyOrProgram.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06ReplacementOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "replacementOf", scope = COCTMT510000UV06PolicyOrProgram.class)
    public JAXBElement<COCTMT510000UV06ReplacementOf> createCOCTMT510000UV06PolicyOrProgramReplacementOf(COCTMT510000UV06ReplacementOf value) {
        return new JAXBElement<COCTMT510000UV06ReplacementOf>(_COCTMT510000UV06PolicyOrProgramReplacementOf_QNAME, COCTMT510000UV06ReplacementOf.class, COCTMT510000UV06PolicyOrProgram.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Definition3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT510000UV06PolicyOrProgram.class)
    public JAXBElement<COCTMT510000UV06Definition3> createCOCTMT510000UV06PolicyOrProgramDefinition(COCTMT510000UV06Definition3 value) {
        return new JAXBElement<COCTMT510000UV06Definition3>(_COCTMT530000UVObservationDefinition_QNAME, COCTMT510000UV06Definition3 .class, COCTMT510000UV06PolicyOrProgram.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030203UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT040203UV01NotificationParty.class)
    public JAXBElement<COCTMT030203UV02Person> createCOCTMT040203UV01NotificationPartyContactPerson(COCTMT030203UV02Person value) {
        return new JAXBElement<COCTMT030203UV02Person>(_PRPAMT201301UV02ContactPartyContactPerson_QNAME, COCTMT030203UV02Person.class, COCTMT040203UV01NotificationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = COCTMT040203UV01NotificationParty.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT040203UV01NotificationPartyContactOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPAMT201301UV02ContactPartyContactOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT040203UV01NotificationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201303UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201303UV02NonPersonLivingSubject.class)
    public JAXBElement<PRPAMT201303UV02BirthPlace> createPRPAMT201303UV02NonPersonLivingSubjectBirthPlace(PRPAMT201303UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201303UV02BirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, PRPAMT201303UV02BirthPlace.class, PRPAMT201303UV02NonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ProviderPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProviderPerson", scope = COCTMT290000UV06HealthCareProvider.class)
    public JAXBElement<COCTMT290000UV06ProviderPerson> createCOCTMT290000UV06HealthCareProviderHealthCareProviderPerson(COCTMT290000UV06ProviderPerson value) {
        return new JAXBElement<COCTMT290000UV06ProviderPerson>(_COCTMT490000UV04HealthCareProviderHealthCareProviderPerson_QNAME, COCTMT290000UV06ProviderPerson.class, COCTMT290000UV06HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "suffix", scope = ENExplicit.class)
    public JAXBElement<EnExplicitSuffix> createENExplicitSuffix(EnExplicitSuffix value) {
        return new JAXBElement<EnExplicitSuffix>(_ENSuffix_QNAME, EnExplicitSuffix.class, ENExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitDelimiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "delimiter", scope = ENExplicit.class)
    public JAXBElement<EnExplicitDelimiter> createENExplicitDelimiter(EnExplicitDelimiter value) {
        return new JAXBElement<EnExplicitDelimiter>(_ENDelimiter_QNAME, EnExplicitDelimiter.class, ENExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitPrefix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "prefix", scope = ENExplicit.class)
    public JAXBElement<EnExplicitPrefix> createENExplicitPrefix(EnExplicitPrefix value) {
        return new JAXBElement<EnExplicitPrefix>(_ENPrefix_QNAME, EnExplicitPrefix.class, ENExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVLTSExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "validTime", scope = ENExplicit.class)
    public JAXBElement<IVLTSExplicit> createENExplicitValidTime(IVLTSExplicit value) {
        return new JAXBElement<IVLTSExplicit>(_ENValidTime_QNAME, IVLTSExplicit.class, ENExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitFamily }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "family", scope = ENExplicit.class)
    public JAXBElement<EnExplicitFamily> createENExplicitFamily(EnExplicitFamily value) {
        return new JAXBElement<EnExplicitFamily>(_ENFamily_QNAME, EnExplicitFamily.class, ENExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitGiven }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "given", scope = ENExplicit.class)
    public JAXBElement<EnExplicitGiven> createENExplicitGiven(EnExplicitGiven value) {
        return new JAXBElement<EnExplicitGiven>(_ENGiven_QNAME, EnExplicitGiven.class, ENExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLTS.class)
    public JAXBElement<IVXBTS> createIVLTSHigh(IVXBTS value) {
        return new JAXBElement<IVXBTS>(_IVLINTHigh_QNAME, IVXBTS.class, IVLTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLTS.class)
    public JAXBElement<IVXBTS> createIVLTSLow(IVXBTS value) {
        return new JAXBElement<IVXBTS>(_IVLINTLow_QNAME, IVXBTS.class, IVLTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLTS.class)
    public JAXBElement<TS> createIVLTSCenter(TS value) {
        return new JAXBElement<TS>(_IVLINTCenter_QNAME, TS.class, IVLTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLTS.class)
    public JAXBElement<PQ> createIVLTSWidth(PQ value) {
        return new JAXBElement<PQ>(_IVLINTWidth_QNAME, PQ.class, IVLTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedOrganization", scope = COCTMT090000UV01AssignedEntity.class)
    public JAXBElement<COCTMT090000UV01Organization> createCOCTMT090000UV01AssignedEntityAssignedOrganization(COCTMT090000UV01Organization value) {
        return new JAXBElement<COCTMT090000UV01Organization>(_COCTMT090000UV01AssignedEntityAssignedOrganization_QNAME, COCTMT090000UV01Organization.class, COCTMT090000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090000UV01AssignedEntity.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090000UV01AssignedEntityRepresentedOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT090000UV01AssignedEntity.class)
    public JAXBElement<COCTMT090000UV01Device> createCOCTMT090000UV01AssignedEntityAssignedDevice(COCTMT090000UV01Device value) {
        return new JAXBElement<COCTMT090000UV01Device>(_MFMIMT700711UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090000UV01Device.class, COCTMT090000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090000UV01AssignedEntity.class)
    public JAXBElement<COCTMT090000UV01Person> createCOCTMT090000UV01AssignedEntityAssignedPerson(COCTMT090000UV01Person value) {
        return new JAXBElement<COCTMT090000UV01Person>(_COCTMT090102UV02AssignedPersonAssignedPerson_QNAME, COCTMT090000UV01Person.class, COCTMT090000UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TELExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "reference", scope = ThumbnailExplicit.class)
    public JAXBElement<TELExplicit> createThumbnailExplicitReference(TELExplicit value) {
        return new JAXBElement<TELExplicit>(_STExplicitReference_QNAME, TELExplicit.class, ThumbnailExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedOrganization", scope = COCTMT090002UV01AssignedEntity.class)
    public JAXBElement<COCTMT090002UV01Organization> createCOCTMT090002UV01AssignedEntityAssignedOrganization(COCTMT090002UV01Organization value) {
        return new JAXBElement<COCTMT090002UV01Organization>(_COCTMT090000UV01AssignedEntityAssignedOrganization_QNAME, COCTMT090002UV01Organization.class, COCTMT090002UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090002UV01Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT090002UV01AssignedEntity.class)
    public JAXBElement<COCTMT090002UV01Device> createCOCTMT090002UV01AssignedEntityAssignedDevice(COCTMT090002UV01Device value) {
        return new JAXBElement<COCTMT090002UV01Device>(_MFMIMT700711UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090002UV01Device.class, COCTMT090002UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090002UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090002UV01AssignedEntity.class)
    public JAXBElement<COCTMT090002UV01Person> createCOCTMT090002UV01AssignedEntityAssignedPerson(COCTMT090002UV01Person value) {
        return new JAXBElement<COCTMT090002UV01Person>(_COCTMT090102UV02AssignedPersonAssignedPerson_QNAME, COCTMT090002UV01Person.class, COCTMT090002UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT960000UV05Author }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT960000UV05Position.class)
    public JAXBElement<COCTMT960000UV05Author> createCOCTMT960000UV05PositionAuthor(COCTMT960000UV05Author value) {
        return new JAXBElement<COCTMT960000UV05Author>(_PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME, COCTMT960000UV05Author.class, COCTMT960000UV05Position.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT960000UV05Component2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "component2", scope = COCTMT960000UV05Position.class)
    public JAXBElement<COCTMT960000UV05Component2> createCOCTMT960000UV05PositionComponent2(COCTMT960000UV05Component2 value) {
        return new JAXBElement<COCTMT960000UV05Component2>(_COCTMT960000UV05PositionComponent2_QNAME, COCTMT960000UV05Component2 .class, COCTMT960000UV05Position.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedPerson", scope = COCTMT510000UV06ResponsibleParty.class)
    public JAXBElement<COCTMT510000UV06Person> createCOCTMT510000UV06ResponsiblePartyRepresentedPerson(COCTMT510000UV06Person value) {
        return new JAXBElement<COCTMT510000UV06Person>(_COCTMT510000UV06ResponsiblePartyRepresentedPerson_QNAME, COCTMT510000UV06Person.class, COCTMT510000UV06ResponsibleParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT510000UV06ResponsibleParty.class)
    public JAXBElement<COCTMT510000UV06Organization> createCOCTMT510000UV06ResponsiblePartyRepresentedOrganization(COCTMT510000UV06Organization value) {
        return new JAXBElement<COCTMT510000UV06Organization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, COCTMT510000UV06Organization.class, COCTMT510000UV06ResponsibleParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "agentPerson", scope = COCTMT510000UV06ResponsibleParty.class)
    public JAXBElement<COCTMT510000UV06Person> createCOCTMT510000UV06ResponsiblePartyAgentPerson(COCTMT510000UV06Person value) {
        return new JAXBElement<COCTMT510000UV06Person>(_COCTMT510000UV06ResponsiblePartyAgentPerson_QNAME, COCTMT510000UV06Person.class, COCTMT510000UV06ResponsibleParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201310UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201310UV02NonPersonLivingSubject.class)
    public JAXBElement<PRPAMT201310UV02BirthPlace> createPRPAMT201310UV02NonPersonLivingSubjectBirthPlace(PRPAMT201310UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201310UV02BirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, PRPAMT201310UV02BirthPlace.class, PRPAMT201310UV02NonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPPDTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLPPDTS.class)
    public JAXBElement<IVXBPPDTS> createIVLPPDTSHigh(IVXBPPDTS value) {
        return new JAXBElement<IVXBPPDTS>(_IVLINTHigh_QNAME, IVXBPPDTS.class, IVLPPDTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPPDTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLPPDTS.class)
    public JAXBElement<IVXBPPDTS> createIVLPPDTSLow(IVXBPPDTS value) {
        return new JAXBElement<IVXBPPDTS>(_IVLINTLow_QNAME, IVXBPPDTS.class, IVLPPDTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PPDTS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLPPDTS.class)
    public JAXBElement<PPDTS> createIVLPPDTSCenter(PPDTS value) {
        return new JAXBElement<PPDTS>(_IVLINTCenter_QNAME, PPDTS.class, IVLPPDTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PPDPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLPPDTS.class)
    public JAXBElement<PPDPQ> createIVLPPDTSWidth(PPDPQ value) {
        return new JAXBElement<PPDPQ>(_IVLINTWidth_QNAME, PPDPQ.class, IVLPPDTS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000200UV01Agent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asAgent", scope = MCCIMT000200UV01Device.class)
    public JAXBElement<MCCIMT000200UV01Agent> createMCCIMT000200UV01DeviceAsAgent(MCCIMT000200UV01Agent value) {
        return new JAXBElement<MCCIMT000200UV01Agent>(_MCCIMT000200UV01DeviceAsAgent_QNAME, MCCIMT000200UV01Agent.class, MCCIMT000200UV01Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06Performer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "performer", scope = COCTMT600000UV06SupplyEvent.class)
    public JAXBElement<COCTMT600000UV06Performer> createCOCTMT600000UV06SupplyEventPerformer(COCTMT600000UV06Performer value) {
        return new JAXBElement<COCTMT600000UV06Performer>(_COCTMT290000UV06BillableClinicalServicePerformer_QNAME, COCTMT600000UV06Performer.class, COCTMT600000UV06SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06Origin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "origin", scope = COCTMT600000UV06SupplyEvent.class)
    public JAXBElement<COCTMT600000UV06Origin> createCOCTMT600000UV06SupplyEventOrigin(COCTMT600000UV06Origin value) {
        return new JAXBElement<COCTMT600000UV06Origin>(_COCTMT490000UV04BillableClinicalProductOrigin_QNAME, COCTMT600000UV06Origin.class, COCTMT600000UV06SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "destination", scope = COCTMT600000UV06SupplyEvent.class)
    public JAXBElement<COCTMT600000UV06Destination> createCOCTMT600000UV06SupplyEventDestination(COCTMT600000UV06Destination value) {
        return new JAXBElement<COCTMT600000UV06Destination>(_COCTMT490000UV04BillableClinicalProductDestination_QNAME, COCTMT600000UV06Destination.class, COCTMT600000UV06SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT310000UV04PertinentInformation1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "pertinentInformation1", scope = COCTMT310000UV04AccomodationSupplied.class)
    public JAXBElement<COCTMT310000UV04PertinentInformation1> createCOCTMT310000UV04AccomodationSuppliedPertinentInformation1(COCTMT310000UV04PertinentInformation1 value) {
        return new JAXBElement<COCTMT310000UV04PertinentInformation1>(_COCTMT310000UV04AccomodationSuppliedPertinentInformation1_QNAME, COCTMT310000UV04PertinentInformation1 .class, COCTMT310000UV04AccomodationSupplied.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "providerOrganization", scope = PRPAMT201310UV02Patient.class)
    public JAXBElement<COCTMT150003UV03Organization> createPRPAMT201310UV02PatientProviderOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPAMT201310UV02PatientProviderOrganization_QNAME, COCTMT150003UV03Organization.class, PRPAMT201310UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201310UV02NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = PRPAMT201310UV02Patient.class)
    public JAXBElement<PRPAMT201310UV02NonPersonLivingSubject> createPRPAMT201310UV02PatientPatientNonPersonLivingSubject(PRPAMT201310UV02NonPersonLivingSubject value) {
        return new JAXBElement<PRPAMT201310UV02NonPersonLivingSubject>(_PRPAMT201301UV02PatientPatientNonPersonLivingSubject_QNAME, PRPAMT201310UV02NonPersonLivingSubject.class, PRPAMT201310UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201310UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = PRPAMT201310UV02Patient.class)
    public JAXBElement<PRPAMT201310UV02Person> createPRPAMT201310UV02PatientPatientPerson(PRPAMT201310UV02Person value) {
        return new JAXBElement<PRPAMT201310UV02Person>(_PRPAMT201301UV02PatientPatientPerson_QNAME, PRPAMT201310UV02Person.class, PRPAMT201310UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02MatchCriterionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "matchCriterionList", scope = PRPAMT201306UV02QueryByParameter.class)
    public JAXBElement<PRPAMT201306UV02MatchCriterionList> createPRPAMT201306UV02QueryByParameterMatchCriterionList(PRPAMT201306UV02MatchCriterionList value) {
        return new JAXBElement<PRPAMT201306UV02MatchCriterionList>(_PRPAMT201306UV02QueryByParameterMatchCriterionList_QNAME, PRPAMT201306UV02MatchCriterionList.class, PRPAMT201306UV02QueryByParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVContent1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asContent", scope = COCTMT080000UVManufactured.class)
    public JAXBElement<COCTMT080000UVContent1> createCOCTMT080000UVManufacturedAsContent(COCTMT080000UVContent1 value) {
        return new JAXBElement<COCTMT080000UVContent1>(_COCTMT080000UVNonPersonLivingSubjectAsContent_QNAME, COCTMT080000UVContent1 .class, COCTMT080000UVManufactured.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVProcedure.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVProcedureSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_PRPAMT201301UV02BirthPlaceSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVProcedure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVProcedure.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVProcedureDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVObservationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVProcedure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVProcedure.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVProcedureRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVObservationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVProcedure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVProcedure.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVProcedureDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT530000UVObservationDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVProcedure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090108UVAssignedPerson.class)
    public JAXBElement<COCTMT150007UVOrganization> createCOCTMT090108UVAssignedPersonRepresentedOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, COCTMT150007UVOrganization.class, COCTMT090108UVAssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090108UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090108UVAssignedPerson.class)
    public JAXBElement<COCTMT090108UVPerson> createCOCTMT090108UVAssignedPersonAssignedPerson(COCTMT090108UVPerson value) {
        return new JAXBElement<COCTMT090108UVPerson>(_COCTMT090102UV02AssignedPersonAssignedPerson_QNAME, COCTMT090108UVPerson.class, COCTMT090108UVAssignedPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000100UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = MCCIMT000100UV01Agent.class)
    public JAXBElement<MCCIMT000100UV01Organization> createMCCIMT000100UV01AgentRepresentedOrganization(MCCIMT000100UV01Organization value) {
        return new JAXBElement<MCCIMT000100UV01Organization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, MCCIMT000100UV01Organization.class, MCCIMT000100UV01Agent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = COCTMT090000UV01LicensedEntity.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT090000UV01LicensedEntityIssuingOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_COCTMT090300UV01LicensedEntityIssuingOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT090000UV01LicensedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700701UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPAIN201301UV02MFMIMT700701UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700701UV01Author2> createPRPAIN201301UV02MFMIMT700701UV01RegistrationEventAuthor(MFMIMT700701UV01Author2 value) {
        return new JAXBElement<MFMIMT700701UV01Author2>(_PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME, MFMIMT700701UV01Author2 .class, PRPAIN201301UV02MFMIMT700701UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "coveredOrganization1", scope = COCTMT510000UV06CoveredParty.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06CoveredPartyCoveredOrganization1(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06CoveredPartyCoveredOrganization1_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06CoveredParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "coveredPerson", scope = COCTMT510000UV06CoveredParty.class)
    public JAXBElement<COCTMT030007UVPerson> createCOCTMT510000UV06CoveredPartyCoveredPerson(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_COCTMT510000UV06CoveredPartyCoveredPerson_QNAME, COCTMT030007UVPerson.class, COCTMT510000UV06CoveredParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "underwritingOrganization", scope = COCTMT510000UV06CoveredParty.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06CoveredPartyUnderwritingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PolicyHolderUnderwritingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06CoveredParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "coveredNonPersonLivingSubject", scope = COCTMT510000UV06CoveredParty.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createCOCTMT510000UV06CoveredPartyCoveredNonPersonLivingSubject(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_COCTMT510000UV06CoveredPartyCoveredNonPersonLivingSubject_QNAME, COCTMT030007UVNonPersonLivingSubject.class, COCTMT510000UV06CoveredParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06IndirectAuthorithyOver2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "indirectAuthority2", scope = COCTMT510000UV06CoveredParty.class)
    public JAXBElement<COCTMT510000UV06IndirectAuthorithyOver2> createCOCTMT510000UV06CoveredPartyIndirectAuthority2(COCTMT510000UV06IndirectAuthorithyOver2 value) {
        return new JAXBElement<COCTMT510000UV06IndirectAuthorithyOver2>(_COCTMT510000UV06CoveredPartyIndirectAuthority2_QNAME, COCTMT510000UV06IndirectAuthorithyOver2 .class, COCTMT510000UV06CoveredParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT030007UVOtherIDs.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT030007UVOtherIDsScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT030007UVOtherIDs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201301UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201301UV02NonPersonLivingSubject.class)
    public JAXBElement<PRPAMT201301UV02BirthPlace> createPRPAMT201301UV02NonPersonLivingSubjectBirthPlace(PRPAMT201301UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201301UV02BirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, PRPAMT201301UV02BirthPlace.class, PRPAMT201301UV02NonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "issuingOrganization", scope = COCTMT820000UVHealthCareProvider.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT820000UVHealthCareProviderIssuingOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_COCTMT090300UV01LicensedEntityIssuingOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT820000UVHealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocBr> createStrucDocTitleFootnoteBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocThBr_QNAME, StrucDocBr.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocSup> createStrucDocTitleFootnoteSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocThSup_QNAME, StrucDocSup.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocSub> createStrucDocTitleFootnoteSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocThSub_QNAME, StrucDocSub.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTitleFootnote.class)
    public JAXBElement<StrucDocTitleContent> createStrucDocTitleFootnoteContent(StrucDocTitleContent value) {
        return new JAXBElement<StrucDocTitleContent>(_StrucDocThContent_QNAME, StrucDocTitleContent.class, StrucDocTitleFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201307UV02QueryByParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameter", scope = PRPAIN201310UV02MFMIMT700711UV01ControlActProcess.class)
    public JAXBElement<PRPAMT201307UV02QueryByParameter> createPRPAIN201310UV02MFMIMT700711UV01ControlActProcessQueryByParameter(PRPAMT201307UV02QueryByParameter value) {
        return new JAXBElement<PRPAMT201307UV02QueryByParameter>(_PRPAIN201305UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME, PRPAMT201307UV02QueryByParameter.class, PRPAIN201310UV02MFMIMT700711UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Author1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT290000UV06ServiceRequest.class)
    public JAXBElement<COCTMT290000UV06Author1> createCOCTMT290000UV06ServiceRequestAuthor(COCTMT290000UV06Author1 value) {
        return new JAXBElement<COCTMT290000UV06Author1>(_PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME, COCTMT290000UV06Author1 .class, COCTMT290000UV06ServiceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Device2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT290000UV06AssignedEntity.class)
    public JAXBElement<COCTMT290000UV06Device2> createCOCTMT290000UV06AssignedEntityAssignedDevice(COCTMT290000UV06Device2 value) {
        return new JAXBElement<COCTMT290000UV06Device2>(_MFMIMT700711UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT290000UV06Device2 .class, COCTMT290000UV06AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedNonPersonLivingSubject", scope = COCTMT290000UV06AssignedEntity.class)
    public JAXBElement<COCTMT290000UV06NonPersonLivingSubject> createCOCTMT290000UV06AssignedEntityAssignedNonPersonLivingSubject(COCTMT290000UV06NonPersonLivingSubject value) {
        return new JAXBElement<COCTMT290000UV06NonPersonLivingSubject>(_COCTMT290000UV06AssignedEntityAssignedNonPersonLivingSubject_QNAME, COCTMT290000UV06NonPersonLivingSubject.class, COCTMT290000UV06AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ProviderPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedProviderPerson", scope = COCTMT290000UV06AssignedEntity.class)
    public JAXBElement<COCTMT290000UV06ProviderPerson> createCOCTMT290000UV06AssignedEntityAssignedProviderPerson(COCTMT290000UV06ProviderPerson value) {
        return new JAXBElement<COCTMT290000UV06ProviderPerson>(_COCTMT290000UV06AssignedEntityAssignedProviderPerson_QNAME, COCTMT290000UV06ProviderPerson.class, COCTMT290000UV06AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder2", scope = PRPAMT201310UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createPRPAMT201310UV02PersonalRelationshipRelationshipHolder2(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_PRPAMT201302UV02PersonalRelationshipRelationshipHolder2_QNAME, COCTMT030007UVNonPersonLivingSubject.class, PRPAMT201310UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder1", scope = PRPAMT201310UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVPerson> createPRPAMT201310UV02PersonalRelationshipRelationshipHolder1(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_PRPAMT201302UV02PersonalRelationshipRelationshipHolder1_QNAME, COCTMT030007UVPerson.class, PRPAMT201310UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT090300UV01RoleOther.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090300UV01RoleOtherScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090300UV01RoleOther.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "agentOrganization", scope = COCTMT040008UVResponsible.class)
    public JAXBElement<COCTMT150007UVOrganization> createCOCTMT040008UVResponsibleAgentOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_COCTMT040008UVResponsibleAgentOrganization_QNAME, COCTMT150007UVOrganization.class, COCTMT040008UVResponsible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedPerson", scope = COCTMT040008UVResponsible.class)
    public JAXBElement<COCTMT030207UVPerson> createCOCTMT040008UVResponsibleRepresentedPerson(COCTMT030207UVPerson value) {
        return new JAXBElement<COCTMT030207UVPerson>(_COCTMT510000UV06ResponsiblePartyRepresentedPerson_QNAME, COCTMT030207UVPerson.class, COCTMT040008UVResponsible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT040008UVResponsible.class)
    public JAXBElement<COCTMT150007UVOrganization> createCOCTMT040008UVResponsibleRepresentedOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, COCTMT150007UVOrganization.class, COCTMT040008UVResponsible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT140007UVDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "agentDevice", scope = COCTMT040008UVResponsible.class)
    public JAXBElement<COCTMT140007UVDevice> createCOCTMT040008UVResponsibleAgentDevice(COCTMT140007UVDevice value) {
        return new JAXBElement<COCTMT140007UVDevice>(_COCTMT040008UVResponsibleAgentDevice_QNAME, COCTMT140007UVDevice.class, COCTMT040008UVResponsible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "agentPerson", scope = COCTMT040008UVResponsible.class)
    public JAXBElement<COCTMT030207UVPerson> createCOCTMT040008UVResponsibleAgentPerson(COCTMT030207UVPerson value) {
        return new JAXBElement<COCTMT030207UVPerson>(_COCTMT510000UV06ResponsiblePartyAgentPerson_QNAME, COCTMT030207UVPerson.class, COCTMT040008UVResponsible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVSpecimenObservationEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "specimenObservationEvent", scope = COCTMT080000UVSubject4 .class)
    public JAXBElement<COCTMT080000UVSpecimenObservationEvent> createCOCTMT080000UVSubject4SpecimenObservationEvent(COCTMT080000UVSpecimenObservationEvent value) {
        return new JAXBElement<COCTMT080000UVSpecimenObservationEvent>(_COCTMT080000UVSubject4SpecimenObservationEvent_QNAME, COCTMT080000UVSpecimenObservationEvent.class, COCTMT080000UVSubject4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVAutomationSpecimenObservationEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "automationSpecimenObservationEvent", scope = COCTMT080000UVSubject4 .class)
    public JAXBElement<COCTMT080000UVAutomationSpecimenObservationEvent> createCOCTMT080000UVSubject4AutomationSpecimenObservationEvent(COCTMT080000UVAutomationSpecimenObservationEvent value) {
        return new JAXBElement<COCTMT080000UVAutomationSpecimenObservationEvent>(_COCTMT080000UVSubject4AutomationSpecimenObservationEvent_QNAME, COCTMT080000UVAutomationSpecimenObservationEvent.class, COCTMT080000UVSubject4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201302UV02BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = PRPAMT201302UV02NonPersonLivingSubject.class)
    public JAXBElement<PRPAMT201302UV02BirthPlace> createPRPAMT201302UV02NonPersonLivingSubjectBirthPlace(PRPAMT201302UV02BirthPlace value) {
        return new JAXBElement<PRPAMT201302UV02BirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, PRPAMT201302UV02BirthPlace.class, PRPAMT201302UV02NonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04Referrer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "referrer", scope = COCTMT740000UV04Referral.class)
    public JAXBElement<COCTMT740000UV04Referrer> createCOCTMT740000UV04ReferralReferrer(COCTMT740000UV04Referrer value) {
        return new JAXBElement<COCTMT740000UV04Referrer>(_COCTMT490000UV04BillableClinicalProductReferrer_QNAME, COCTMT740000UV04Referrer.class, COCTMT740000UV04Referral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000300UV01Agent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asAgent", scope = MCCIMT000300UV01Device.class)
    public JAXBElement<MCCIMT000300UV01Agent> createMCCIMT000300UV01DeviceAsAgent(MCCIMT000300UV01Agent value) {
        return new JAXBElement<MCCIMT000300UV01Agent>(_MCCIMT000200UV01DeviceAsAgent_QNAME, MCCIMT000300UV01Agent.class, MCCIMT000300UV01Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT820000UVRoleOther.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT820000UVRoleOtherScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT820000UVRoleOther.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000100UV01Agent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asAgent", scope = MCCIMT000100UV01Device.class)
    public JAXBElement<MCCIMT000100UV01Agent> createMCCIMT000100UV01DeviceAsAgent(MCCIMT000100UV01Agent value) {
        return new JAXBElement<MCCIMT000100UV01Agent>(_MCCIMT000200UV01DeviceAsAgent_QNAME, MCCIMT000100UV01Agent.class, MCCIMT000100UV01Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "table", scope = StrucDocText.class)
    public JAXBElement<StrucDocTable> createStrucDocTextTable(StrucDocTable value) {
        return new JAXBElement<StrucDocTable>(_StrucDocItemTable_QNAME, StrucDocTable.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "list", scope = StrucDocText.class)
    public JAXBElement<StrucDocList> createStrucDocTextList(StrucDocList value) {
        return new JAXBElement<StrucDocList>(_StrucDocItemList_QNAME, StrucDocList.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocText.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocTextRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocThRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocText.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocTextLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocThLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocText.class)
    public JAXBElement<StrucDocBr> createStrucDocTextBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocThBr_QNAME, StrucDocBr.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocText.class)
    public JAXBElement<StrucDocSup> createStrucDocTextSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocThSup_QNAME, StrucDocSup.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocText.class)
    public JAXBElement<StrucDocSub> createStrucDocTextSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocThSub_QNAME, StrucDocSub.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocText.class)
    public JAXBElement<StrucDocContent> createStrucDocTextContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocThContent_QNAME, StrucDocContent.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocText.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocTextFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocThFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocText.class)
    public JAXBElement<StrucDocFootnote> createStrucDocTextFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocThFootnote_QNAME, StrucDocFootnote.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "paragraph", scope = StrucDocText.class)
    public JAXBElement<StrucDocParagraph> createStrucDocTextParagraph(StrucDocParagraph value) {
        return new JAXBElement<StrucDocParagraph>(_StrucDocItemParagraph_QNAME, StrucDocParagraph.class, StrucDocText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "providerOrganization", scope = PRPAMT201303UV02Patient.class)
    public JAXBElement<COCTMT150003UV03Organization> createPRPAMT201303UV02PatientProviderOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPAMT201310UV02PatientProviderOrganization_QNAME, COCTMT150003UV03Organization.class, PRPAMT201303UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201303UV02NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = PRPAMT201303UV02Patient.class)
    public JAXBElement<PRPAMT201303UV02NonPersonLivingSubject> createPRPAMT201303UV02PatientPatientNonPersonLivingSubject(PRPAMT201303UV02NonPersonLivingSubject value) {
        return new JAXBElement<PRPAMT201303UV02NonPersonLivingSubject>(_PRPAMT201301UV02PatientPatientNonPersonLivingSubject_QNAME, PRPAMT201303UV02NonPersonLivingSubject.class, PRPAMT201303UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201303UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = PRPAMT201303UV02Patient.class)
    public JAXBElement<PRPAMT201303UV02Person> createPRPAMT201303UV02PatientPatientPerson(PRPAMT201303UV02Person value) {
        return new JAXBElement<PRPAMT201303UV02Person>(_PRPAMT201301UV02PatientPatientPerson_QNAME, PRPAMT201303UV02Person.class, PRPAMT201303UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT500000UV04CoveredParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asCoveredParty", scope = COCTMT030000UV04NonPersonLivingSubject.class)
    public JAXBElement<COCTMT500000UV04CoveredParty> createCOCTMT030000UV04NonPersonLivingSubjectAsCoveredParty(COCTMT500000UV04CoveredParty value) {
        return new JAXBElement<COCTMT500000UV04CoveredParty>(_COCTMT030000UV04PersonAsCoveredParty_QNAME, COCTMT500000UV04CoveredParty.class, COCTMT030000UV04NonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030000UV04BirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = COCTMT030000UV04NonPersonLivingSubject.class)
    public JAXBElement<COCTMT030000UV04BirthPlace> createCOCTMT030000UV04NonPersonLivingSubjectBirthPlace(COCTMT030000UV04BirthPlace value) {
        return new JAXBElement<COCTMT030000UV04BirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, COCTMT030000UV04BirthPlace.class, COCTMT030000UV04NonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710007UVLocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "locatedEntity", scope = COCTMT710007UVPlace.class)
    public JAXBElement<COCTMT710007UVLocatedEntity> createCOCTMT710007UVPlaceLocatedEntity(COCTMT710007UVLocatedEntity value) {
        return new JAXBElement<COCTMT710007UVLocatedEntity>(_COCTMT710007UVPlaceLocatedEntity_QNAME, COCTMT710007UVLocatedEntity.class, COCTMT710007UVPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "providerOrganization", scope = PRPAMT201304UV02Patient.class)
    public JAXBElement<COCTMT150003UV03Organization> createPRPAMT201304UV02PatientProviderOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPAMT201310UV02PatientProviderOrganization_QNAME, COCTMT150003UV03Organization.class, PRPAMT201304UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201304UV02NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = PRPAMT201304UV02Patient.class)
    public JAXBElement<PRPAMT201304UV02NonPersonLivingSubject> createPRPAMT201304UV02PatientPatientNonPersonLivingSubject(PRPAMT201304UV02NonPersonLivingSubject value) {
        return new JAXBElement<PRPAMT201304UV02NonPersonLivingSubject>(_PRPAMT201301UV02PatientPatientNonPersonLivingSubject_QNAME, PRPAMT201304UV02NonPersonLivingSubject.class, PRPAMT201304UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201304UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = PRPAMT201304UV02Patient.class)
    public JAXBElement<PRPAMT201304UV02Person> createPRPAMT201304UV02PatientPatientPerson(PRPAMT201304UV02Person value) {
        return new JAXBElement<PRPAMT201304UV02Person>(_PRPAMT201301UV02PatientPatientPerson_QNAME, PRPAMT201304UV02Person.class, PRPAMT201304UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVAct.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVActSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_PRPAMT201301UV02BirthPlaceSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVAct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVAct.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVActDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVObservationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVAct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVAct.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVActRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVObservationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVAct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVAct.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVActDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT530000UVObservationDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVAct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "encounter", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVEncounter> createCOCTMT530000UVSourceOf3Encounter(COCTMT530000UVEncounter value) {
        return new JAXBElement<COCTMT530000UVEncounter>(_COCTMT530000UVSourceOf2Encounter_QNAME, COCTMT530000UVEncounter.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supply", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVSupply> createCOCTMT530000UVSourceOf3Supply(COCTMT530000UVSupply value) {
        return new JAXBElement<COCTMT530000UVSupply>(_COCTMT530000UVSourceOf2Supply_QNAME, COCTMT530000UVSupply.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "procedure", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVProcedure> createCOCTMT530000UVSourceOf3Procedure(COCTMT530000UVProcedure value) {
        return new JAXBElement<COCTMT530000UVProcedure>(_COCTMT530000UVSourceOf2Procedure_QNAME, COCTMT530000UVProcedure.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "act", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVAct> createCOCTMT530000UVSourceOf3Act(COCTMT530000UVAct value) {
        return new JAXBElement<COCTMT530000UVAct>(_COCTMT530000UVSourceOf2Act_QNAME, COCTMT530000UVAct.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observation", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVObservation> createCOCTMT530000UVSourceOf3Observation(COCTMT530000UVObservation value) {
        return new JAXBElement<COCTMT530000UVObservation>(_COCTMT530000UVSourceOf2Observation_QNAME, COCTMT530000UVObservation.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "substanceAdministration", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVSubstanceAdministration> createCOCTMT530000UVSourceOf3SubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        return new JAXBElement<COCTMT530000UVSubstanceAdministration>(_COCTMT530000UVSourceOf2SubstanceAdministration_QNAME, COCTMT530000UVSubstanceAdministration.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "organizer", scope = COCTMT530000UVSourceOf3 .class)
    public JAXBElement<COCTMT530000UVOrganizer> createCOCTMT530000UVSourceOf3Organizer(COCTMT530000UVOrganizer value) {
        return new JAXBElement<COCTMT530000UVOrganizer>(_COCTMT530000UVSourceOf2Organizer_QNAME, COCTMT530000UVOrganizer.class, COCTMT530000UVSourceOf3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04Performer1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "performer", scope = COCTMT300000UV04SupplyEvent.class)
    public JAXBElement<COCTMT300000UV04Performer1> createCOCTMT300000UV04SupplyEventPerformer(COCTMT300000UV04Performer1 value) {
        return new JAXBElement<COCTMT300000UV04Performer1>(_COCTMT290000UV06BillableClinicalServicePerformer_QNAME, COCTMT300000UV04Performer1 .class, COCTMT300000UV04SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04Origin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "origin", scope = COCTMT300000UV04SupplyEvent.class)
    public JAXBElement<COCTMT300000UV04Origin> createCOCTMT300000UV04SupplyEventOrigin(COCTMT300000UV04Origin value) {
        return new JAXBElement<COCTMT300000UV04Origin>(_COCTMT490000UV04BillableClinicalProductOrigin_QNAME, COCTMT300000UV04Origin.class, COCTMT300000UV04SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "destination", scope = COCTMT300000UV04SupplyEvent.class)
    public JAXBElement<COCTMT300000UV04Destination> createCOCTMT300000UV04SupplyEventDestination(COCTMT300000UV04Destination value) {
        return new JAXBElement<COCTMT300000UV04Destination>(_COCTMT490000UV04BillableClinicalProductDestination_QNAME, COCTMT300000UV04Destination.class, COCTMT300000UV04SupplyEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06CoverageCharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "coverageCharge", scope = COCTMT510000UV06Limitation2 .class)
    public JAXBElement<COCTMT510000UV06CoverageCharge> createCOCTMT510000UV06Limitation2CoverageCharge(COCTMT510000UV06CoverageCharge value) {
        return new JAXBElement<COCTMT510000UV06CoverageCharge>(_COCTMT510000UV06Limitation2CoverageCharge_QNAME, COCTMT510000UV06CoverageCharge.class, COCTMT510000UV06Limitation2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06FinancialParticipationCharge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "financialParticipationCharge", scope = COCTMT510000UV06Limitation2 .class)
    public JAXBElement<COCTMT510000UV06FinancialParticipationCharge> createCOCTMT510000UV06Limitation2FinancialParticipationCharge(COCTMT510000UV06FinancialParticipationCharge value) {
        return new JAXBElement<COCTMT510000UV06FinancialParticipationCharge>(_COCTMT510000UV06Limitation2FinancialParticipationCharge_QNAME, COCTMT510000UV06FinancialParticipationCharge.class, COCTMT510000UV06Limitation2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVEncounter.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVEncounterSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_PRPAMT201301UV02BirthPlaceSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVEncounter.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVEncounterDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVObservationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVEncounter.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVEncounterRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVObservationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVEncounter.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVEncounterDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT530000UVObservationDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = COCTMT530000UVAuthor.class)
    public JAXBElement<COCTMT090000UV01AssignedEntity> createCOCTMT530000UVAuthorAssignedEntity(COCTMT090000UV01AssignedEntity value) {
        return new JAXBElement<COCTMT090000UV01AssignedEntity>(_COCTMT530000UVPerformerAssignedEntity_QNAME, COCTMT090000UV01AssignedEntity.class, COCTMT530000UVAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patient", scope = COCTMT530000UVAuthor.class)
    public JAXBElement<COCTMT050000UV01Patient> createCOCTMT530000UVAuthorPatient(COCTMT050000UV01Patient value) {
        return new JAXBElement<COCTMT050000UV01Patient>(_COCTMT530000UVSubject2Patient_QNAME, COCTMT050000UV01Patient.class, COCTMT530000UVAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRelatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedEntity", scope = COCTMT530000UVAuthor.class)
    public JAXBElement<COCTMT530000UVRelatedEntity> createCOCTMT530000UVAuthorRelatedEntity(COCTMT530000UVRelatedEntity value) {
        return new JAXBElement<COCTMT530000UVRelatedEntity>(_COCTMT530000UVSubject2RelatedEntity_QNAME, COCTMT530000UVRelatedEntity.class, COCTMT530000UVAuthor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT260003UVLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT260003UVOtherSupply.class)
    public JAXBElement<COCTMT260003UVLocation> createCOCTMT260003UVOtherSupplyLocation(COCTMT260003UVLocation value) {
        return new JAXBElement<COCTMT260003UVLocation>(_COCTMT530000UVHealthCareFacilityLocation_QNAME, COCTMT260003UVLocation.class, COCTMT260003UVOtherSupply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT150000UV02ContactParty.class)
    public JAXBElement<COCTMT150000UV02Person> createCOCTMT150000UV02ContactPartyContactPerson(COCTMT150000UV02Person value) {
        return new JAXBElement<COCTMT150000UV02Person>(_PRPAMT201301UV02ContactPartyContactPerson_QNAME, COCTMT150000UV02Person.class, COCTMT150000UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingOrganization", scope = COCTMT090100UV01RoleOther.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090100UV01RoleOtherScopingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090000UV01RoleOtherScopingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090100UV01RoleOther.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT090300UV01Device.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT090300UV01DeviceAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090100UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT090300UV01Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = PRPAMT201302UV02Guardian.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201302UV02GuardianGuardianOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201302UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = PRPAMT201302UV02Guardian.class)
    public JAXBElement<COCTMT030207UVPerson> createPRPAMT201302UV02GuardianGuardianPerson(COCTMT030207UVPerson value) {
        return new JAXBElement<COCTMT030207UVPerson>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030207UVPerson.class, PRPAMT201302UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "encounter", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVEncounter> createCOCTMT530000UVComponentEncounter(COCTMT530000UVEncounter value) {
        return new JAXBElement<COCTMT530000UVEncounter>(_COCTMT530000UVSourceOf2Encounter_QNAME, COCTMT530000UVEncounter.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supply", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVSupply> createCOCTMT530000UVComponentSupply(COCTMT530000UVSupply value) {
        return new JAXBElement<COCTMT530000UVSupply>(_COCTMT530000UVSourceOf2Supply_QNAME, COCTMT530000UVSupply.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "procedure", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVProcedure> createCOCTMT530000UVComponentProcedure(COCTMT530000UVProcedure value) {
        return new JAXBElement<COCTMT530000UVProcedure>(_COCTMT530000UVSourceOf2Procedure_QNAME, COCTMT530000UVProcedure.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "act", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVAct> createCOCTMT530000UVComponentAct(COCTMT530000UVAct value) {
        return new JAXBElement<COCTMT530000UVAct>(_COCTMT530000UVSourceOf2Act_QNAME, COCTMT530000UVAct.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVActReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "actReference", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVActReference> createCOCTMT530000UVComponentActReference(COCTMT530000UVActReference value) {
        return new JAXBElement<COCTMT530000UVActReference>(_COCTMT510000UV06PreconditionActReference_QNAME, COCTMT530000UVActReference.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observation", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVObservation> createCOCTMT530000UVComponentObservation(COCTMT530000UVObservation value) {
        return new JAXBElement<COCTMT530000UVObservation>(_COCTMT530000UVSourceOf2Observation_QNAME, COCTMT530000UVObservation.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "substanceAdministration", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVSubstanceAdministration> createCOCTMT530000UVComponentSubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        return new JAXBElement<COCTMT530000UVSubstanceAdministration>(_COCTMT530000UVSourceOf2SubstanceAdministration_QNAME, COCTMT530000UVSubstanceAdministration.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "organizer", scope = COCTMT530000UVComponent.class)
    public JAXBElement<COCTMT530000UVOrganizer> createCOCTMT530000UVComponentOrganizer(COCTMT530000UVOrganizer value) {
        return new JAXBElement<COCTMT530000UVOrganizer>(_COCTMT530000UVSourceOf2Organizer_QNAME, COCTMT530000UVOrganizer.class, COCTMT530000UVComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT310000UV04AcommodationRequestor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "accommodationRequestor", scope = COCTMT310000UV04AccommodationRequestorRole.class)
    public JAXBElement<COCTMT310000UV04AcommodationRequestor> createCOCTMT310000UV04AccommodationRequestorRoleAccommodationRequestor(COCTMT310000UV04AcommodationRequestor value) {
        return new JAXBElement<COCTMT310000UV04AcommodationRequestor>(_COCTMT310000UV04AccommodationRequestorRoleAccommodationRequestor_QNAME, COCTMT310000UV04AcommodationRequestor.class, COCTMT310000UV04AccommodationRequestorRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090300UV01AssignedDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = QUQIMT021001UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090300UV01AssignedDevice> createQUQIMT021001UV01AuthorOrPerformerAssignedDevice(COCTMT090300UV01AssignedDevice value) {
        return new JAXBElement<COCTMT090300UV01AssignedDevice>(_MFMIMT700711UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090300UV01AssignedDevice.class, QUQIMT021001UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090100UV01AssignedPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = QUQIMT021001UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090100UV01AssignedPerson> createQUQIMT021001UV01AuthorOrPerformerAssignedPerson(COCTMT090100UV01AssignedPerson value) {
        return new JAXBElement<COCTMT090100UV01AssignedPerson>(_COCTMT090102UV02AssignedPersonAssignedPerson_QNAME, COCTMT090100UV01AssignedPerson.class, QUQIMT021001UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700701UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPAIN201302UV02MFMIMT700701UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700701UV01Author2> createPRPAIN201302UV02MFMIMT700701UV01RegistrationEventAuthor(MFMIMT700701UV01Author2 value) {
        return new JAXBElement<MFMIMT700701UV01Author2>(_PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME, MFMIMT700701UV01Author2 .class, PRPAIN201302UV02MFMIMT700701UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAnimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedAnimal", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVAnimal> createCOCTMT530000UVRelatedEntityRelatedAnimal(COCTMT530000UVAnimal value) {
        return new JAXBElement<COCTMT530000UVAnimal>(_COCTMT530000UVRelatedEntityRelatedAnimal_QNAME, COCTMT530000UVAnimal.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingEntity", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVEntity> createCOCTMT530000UVRelatedEntityScopingEntity(COCTMT530000UVEntity value) {
        return new JAXBElement<COCTMT530000UVEntity>(_COCTMT530000UVRelatedEntityScopingEntity_QNAME, COCTMT530000UVEntity.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAnimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingAnimal", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVAnimal> createCOCTMT530000UVRelatedEntityScopingAnimal(COCTMT530000UVAnimal value) {
        return new JAXBElement<COCTMT530000UVAnimal>(_COCTMT530000UVRelatedEntityScopingAnimal_QNAME, COCTMT530000UVAnimal.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "scopingPerson", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVPerson> createCOCTMT530000UVRelatedEntityScopingPerson(COCTMT530000UVPerson value) {
        return new JAXBElement<COCTMT530000UVPerson>(_COCTMT530000UVRelatedEntityScopingPerson_QNAME, COCTMT530000UVPerson.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedPerson", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVPerson> createCOCTMT530000UVRelatedEntityRelatedPerson(COCTMT530000UVPerson value) {
        return new JAXBElement<COCTMT530000UVPerson>(_COCTMT530000UVRelatedEntityRelatedPerson_QNAME, COCTMT530000UVPerson.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedEntity", scope = COCTMT530000UVRelatedEntity.class)
    public JAXBElement<COCTMT530000UVEntity> createCOCTMT530000UVRelatedEntityRelatedEntity(COCTMT530000UVEntity value) {
        return new JAXBElement<COCTMT530000UVEntity>(_COCTMT530000UVSubject2RelatedEntity_QNAME, COCTMT530000UVEntity.class, COCTMT530000UVRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT040203UV01NotificationParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "notificationParty", scope = MCCIMT000100UV01Organization.class)
    public JAXBElement<COCTMT040203UV01NotificationParty> createMCCIMT000100UV01OrganizationNotificationParty(COCTMT040203UV01NotificationParty value) {
        return new JAXBElement<COCTMT040203UV01NotificationParty>(_MCCIMT000200UV01OrganizationNotificationParty_QNAME, COCTMT040203UV01NotificationParty.class, MCCIMT000100UV01Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = COCTMT030000UV04Guardian.class)
    public JAXBElement<COCTMT150002UV01Organization> createCOCTMT030000UV04GuardianGuardianOrganization(COCTMT150002UV01Organization value) {
        return new JAXBElement<COCTMT150002UV01Organization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150002UV01Organization.class, COCTMT030000UV04Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030202UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = COCTMT030000UV04Guardian.class)
    public JAXBElement<COCTMT030202UV01Person> createCOCTMT030000UV04GuardianGuardianPerson(COCTMT030202UV01Person value) {
        return new JAXBElement<COCTMT030202UV01Person>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030202UV01Person.class, COCTMT030000UV04Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06VisionProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturedVisionProduct", scope = COCTMT600000UV06ManufacturedProduct.class)
    public JAXBElement<COCTMT600000UV06VisionProduct> createCOCTMT600000UV06ManufacturedProductManufacturedVisionProduct(COCTMT600000UV06VisionProduct value) {
        return new JAXBElement<COCTMT600000UV06VisionProduct>(_COCTMT600000UV06ManufacturedProductManufacturedVisionProduct_QNAME, COCTMT600000UV06VisionProduct.class, COCTMT600000UV06ManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVMedicineClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "generalizedMedicineClass", scope = COCTMT230100UVSpecializedKind.class)
    public JAXBElement<COCTMT230100UVMedicineClass> createCOCTMT230100UVSpecializedKindGeneralizedMedicineClass(COCTMT230100UVMedicineClass value) {
        return new JAXBElement<COCTMT230100UVMedicineClass>(_COCTMT230100UVSpecializedKindGeneralizedMedicineClass_QNAME, COCTMT230100UVMedicineClass.class, COCTMT230100UVSpecializedKind.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090003UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedOrganization", scope = COCTMT090003UV01AssignedEntity.class)
    public JAXBElement<COCTMT090003UV01Organization> createCOCTMT090003UV01AssignedEntityAssignedOrganization(COCTMT090003UV01Organization value) {
        return new JAXBElement<COCTMT090003UV01Organization>(_COCTMT090000UV01AssignedEntityAssignedOrganization_QNAME, COCTMT090003UV01Organization.class, COCTMT090003UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090003UV01AssignedEntity.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT090003UV01AssignedEntityRepresentedOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT090003UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090003UV01Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT090003UV01AssignedEntity.class)
    public JAXBElement<COCTMT090003UV01Device> createCOCTMT090003UV01AssignedEntityAssignedDevice(COCTMT090003UV01Device value) {
        return new JAXBElement<COCTMT090003UV01Device>(_MFMIMT700711UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090003UV01Device.class, COCTMT090003UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090003UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = COCTMT090003UV01AssignedEntity.class)
    public JAXBElement<COCTMT090003UV01Person> createCOCTMT090003UV01AssignedEntityAssignedPerson(COCTMT090003UV01Person value) {
        return new JAXBElement<COCTMT090003UV01Person>(_COCTMT090102UV02AssignedPersonAssignedPerson_QNAME, COCTMT090003UV01Person.class, COCTMT090003UV01AssignedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "serviceProviderOrganization", scope = COCTMT240003UV02ServiceDeliveryLocation.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT240003UV02ServiceDeliveryLocationServiceProviderOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_COCTMT530000UVHealthCareFacilityServiceProviderOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT240003UV02ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710000UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT240003UV02ServiceDeliveryLocation.class)
    public JAXBElement<COCTMT710000UV01Place> createCOCTMT240003UV02ServiceDeliveryLocationLocation(COCTMT710000UV01Place value) {
        return new JAXBElement<COCTMT710000UV01Place>(_COCTMT530000UVHealthCareFacilityLocation_QNAME, COCTMT710000UV01Place.class, COCTMT240003UV02ServiceDeliveryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVBirthPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthPlace", scope = COCTMT030007UVNonPersonLivingSubject.class)
    public JAXBElement<COCTMT030007UVBirthPlace> createCOCTMT030007UVNonPersonLivingSubjectBirthPlace(COCTMT030007UVBirthPlace value) {
        return new JAXBElement<COCTMT030007UVBirthPlace>(_PRPAMT201303UV02PersonBirthPlace_QNAME, COCTMT030007UVBirthPlace.class, COCTMT030007UVNonPersonLivingSubject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = PRPAMT201304UV02Student.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201304UV02StudentSchoolOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201302UV02StudentSchoolOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201304UV02Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = PRPAMT201310UV02Guardian.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201310UV02GuardianGuardianOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201310UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = PRPAMT201310UV02Guardian.class)
    public JAXBElement<COCTMT030207UVPerson> createPRPAMT201310UV02GuardianGuardianPerson(COCTMT030207UVPerson value) {
        return new JAXBElement<COCTMT030207UVPerson>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030207UVPerson.class, PRPAMT201310UV02Guardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "underwritingOrganization", scope = COCTMT510000UV06Payor.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06PayorUnderwritingOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PolicyHolderUnderwritingOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Payor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "invoicePayorOrganization", scope = COCTMT510000UV06Payor.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06PayorInvoicePayorOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06PayorInvoicePayorOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Payor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitSuffix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "suffix", scope = ONExplicit.class)
    public JAXBElement<EnExplicitSuffix> createONExplicitSuffix(EnExplicitSuffix value) {
        return new JAXBElement<EnExplicitSuffix>(_ENSuffix_QNAME, EnExplicitSuffix.class, ONExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitDelimiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "delimiter", scope = ONExplicit.class)
    public JAXBElement<EnExplicitDelimiter> createONExplicitDelimiter(EnExplicitDelimiter value) {
        return new JAXBElement<EnExplicitDelimiter>(_ENDelimiter_QNAME, EnExplicitDelimiter.class, ONExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnExplicitPrefix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "prefix", scope = ONExplicit.class)
    public JAXBElement<EnExplicitPrefix> createONExplicitPrefix(EnExplicitPrefix value) {
        return new JAXBElement<EnExplicitPrefix>(_ENPrefix_QNAME, EnExplicitPrefix.class, ONExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVLTSExplicit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "validTime", scope = ONExplicit.class)
    public JAXBElement<IVLTSExplicit> createONExplicitValidTime(IVLTSExplicit value) {
        return new JAXBElement<IVLTSExplicit>(_ENValidTime_QNAME, IVLTSExplicit.class, ONExplicit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVContent1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asContent", scope = COCTMT080000UVPerson.class)
    public JAXBElement<COCTMT080000UVContent1> createCOCTMT080000UVPersonAsContent(COCTMT080000UVContent1 value) {
        return new JAXBElement<COCTMT080000UVContent1>(_COCTMT080000UVNonPersonLivingSubjectAsContent_QNAME, COCTMT080000UVContent1 .class, COCTMT080000UVPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT090000UV01Organization.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT090000UV01OrganizationAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090100UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT090000UV01Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "providerOrganization", scope = PRPAMT201302UV02Patient.class)
    public JAXBElement<COCTMT150003UV03Organization> createPRPAMT201302UV02PatientProviderOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_PRPAMT201310UV02PatientProviderOrganization_QNAME, COCTMT150003UV03Organization.class, PRPAMT201302UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201302UV02PatientPatientNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = PRPAMT201302UV02Patient.class)
    public JAXBElement<PRPAMT201302UV02PatientPatientNonPersonLivingSubject> createPRPAMT201302UV02PatientPatientNonPersonLivingSubject(PRPAMT201302UV02PatientPatientNonPersonLivingSubject value) {
        return new JAXBElement<PRPAMT201302UV02PatientPatientNonPersonLivingSubject>(_PRPAMT201301UV02PatientPatientNonPersonLivingSubject_QNAME, PRPAMT201302UV02PatientPatientNonPersonLivingSubject.class, PRPAMT201302UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201302UV02PatientPatientPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = PRPAMT201302UV02Patient.class)
    public JAXBElement<PRPAMT201302UV02PatientPatientPerson> createPRPAMT201302UV02PatientPatientPerson(PRPAMT201302UV02PatientPatientPerson value) {
        return new JAXBElement<PRPAMT201302UV02PatientPatientPerson>(_PRPAMT201301UV02PatientPatientPerson_QNAME, PRPAMT201302UV02PatientPatientPerson.class, PRPAMT201302UV02Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "providerOrganization", scope = COCTMT050000UV01Patient.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT050000UV01PatientProviderOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_PRPAMT201310UV02PatientProviderOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT050000UV01Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030000UV04NonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientNonPersonLivingSubject", scope = COCTMT050000UV01Patient.class)
    public JAXBElement<COCTMT030000UV04NonPersonLivingSubject> createCOCTMT050000UV01PatientPatientNonPersonLivingSubject(COCTMT030000UV04NonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030000UV04NonPersonLivingSubject>(_PRPAMT201301UV02PatientPatientNonPersonLivingSubject_QNAME, COCTMT030000UV04NonPersonLivingSubject.class, COCTMT050000UV01Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030000UV04Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patientPerson", scope = COCTMT050000UV01Patient.class)
    public JAXBElement<COCTMT030000UV04Person> createCOCTMT050000UV01PatientPatientPerson(COCTMT030000UV04Person value) {
        return new JAXBElement<COCTMT030000UV04Person>(_PRPAMT201301UV02PatientPatientPerson_QNAME, COCTMT030000UV04Person.class, COCTMT050000UV01Patient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04ManufacturedProductOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturerManufacturedProductOrganization", scope = COCTMT490000UV04ManufacturedProduct.class)
    public JAXBElement<COCTMT490000UV04ManufacturedProductOrganization> createCOCTMT490000UV04ManufacturedProductManufacturerManufacturedProductOrganization(COCTMT490000UV04ManufacturedProductOrganization value) {
        return new JAXBElement<COCTMT490000UV04ManufacturedProductOrganization>(_COCTMT490000UV04ManufacturedProductManufacturerManufacturedProductOrganization_QNAME, COCTMT490000UV04ManufacturedProductOrganization.class, COCTMT490000UV04ManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPAIN201310UV02MFMIMT700711UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700711UV01Author2> createPRPAIN201310UV02MFMIMT700711UV01RegistrationEventAuthor(MFMIMT700711UV01Author2 value) {
        return new JAXBElement<MFMIMT700711UV01Author2>(_PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME, MFMIMT700711UV01Author2 .class, PRPAIN201310UV02MFMIMT700711UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT260003UVAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT260003UVManagement.class)
    public JAXBElement<COCTMT260003UVAuthor> createCOCTMT260003UVManagementAuthor(COCTMT260003UVAuthor value) {
        return new JAXBElement<COCTMT260003UVAuthor>(_PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME, COCTMT260003UVAuthor.class, COCTMT260003UVManagement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "table", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocTable> createStrucDocFootnoteTable(StrucDocTable value) {
        return new JAXBElement<StrucDocTable>(_StrucDocItemTable_QNAME, StrucDocTable.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "list", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocList> createStrucDocFootnoteList(StrucDocList value) {
        return new JAXBElement<StrucDocList>(_StrucDocItemList_QNAME, StrucDocList.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocFootnoteRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocThRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocBr> createStrucDocFootnoteBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocThBr_QNAME, StrucDocBr.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocFootnoteLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocThLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocSup> createStrucDocFootnoteSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocThSup_QNAME, StrucDocSup.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocSub> createStrucDocFootnoteSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocThSub_QNAME, StrucDocSub.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocContent> createStrucDocFootnoteContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocThContent_QNAME, StrucDocContent.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocParagraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "paragraph", scope = StrucDocFootnote.class)
    public JAXBElement<StrucDocParagraph> createStrucDocFootnoteParagraph(StrucDocParagraph value) {
        return new JAXBElement<StrucDocParagraph>(_StrucDocItemParagraph_QNAME, StrucDocParagraph.class, StrucDocFootnote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder2", scope = PRPAMT201301UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createPRPAMT201301UV02PersonalRelationshipRelationshipHolder2(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_PRPAMT201302UV02PersonalRelationshipRelationshipHolder2_QNAME, COCTMT030007UVNonPersonLivingSubject.class, PRPAMT201301UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relationshipHolder1", scope = PRPAMT201301UV02PersonalRelationship.class)
    public JAXBElement<COCTMT030007UVPerson> createPRPAMT201301UV02PersonalRelationshipRelationshipHolder1(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_PRPAMT201302UV02PersonalRelationshipRelationshipHolder1_QNAME, COCTMT030007UVPerson.class, PRPAMT201301UV02PersonalRelationship.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPPDPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLPPDPQ.class)
    public JAXBElement<IVXBPPDPQ> createIVLPPDPQHigh(IVXBPPDPQ value) {
        return new JAXBElement<IVXBPPDPQ>(_IVLINTHigh_QNAME, IVXBPPDPQ.class, IVLPPDPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBPPDPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLPPDPQ.class)
    public JAXBElement<IVXBPPDPQ> createIVLPPDPQLow(IVXBPPDPQ value) {
        return new JAXBElement<IVXBPPDPQ>(_IVLINTLow_QNAME, IVXBPPDPQ.class, IVLPPDPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PPDPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLPPDPQ.class)
    public JAXBElement<PPDPQ> createIVLPPDPQCenter(PPDPQ value) {
        return new JAXBElement<PPDPQ>(_IVLINTCenter_QNAME, PPDPQ.class, IVLPPDPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PPDPQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLPPDPQ.class)
    public JAXBElement<PPDPQ> createIVLPPDPQWidth(PPDPQ value) {
        return new JAXBElement<PPDPQ>(_IVLINTWidth_QNAME, PPDPQ.class, IVLPPDPQ.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBMO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLMO.class)
    public JAXBElement<IVXBMO> createIVLMOHigh(IVXBMO value) {
        return new JAXBElement<IVXBMO>(_IVLINTHigh_QNAME, IVXBMO.class, IVLMO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBMO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLMO.class)
    public JAXBElement<IVXBMO> createIVLMOLow(IVXBMO value) {
        return new JAXBElement<IVXBMO>(_IVLINTLow_QNAME, IVXBMO.class, IVLMO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLMO.class)
    public JAXBElement<MO> createIVLMOCenter(MO value) {
        return new JAXBElement<MO>(_IVLINTCenter_QNAME, MO.class, IVLMO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLMO.class)
    public JAXBElement<MO> createIVLMOWidth(MO value) {
        return new JAXBElement<MO>(_IVLINTWidth_QNAME, MO.class, IVLMO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocTitleContent.class)
    public JAXBElement<StrucDocBr> createStrucDocTitleContentBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocThBr_QNAME, StrucDocBr.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocTitleContent.class)
    public JAXBElement<StrucDocSup> createStrucDocTitleContentSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocThSup_QNAME, StrucDocSup.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocTitleContent.class)
    public JAXBElement<StrucDocSub> createStrucDocTitleContentSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocThSub_QNAME, StrucDocSub.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocTitleContent.class)
    public JAXBElement<StrucDocTitleContent> createStrucDocTitleContentContent(StrucDocTitleContent value) {
        return new JAXBElement<StrucDocTitleContent>(_StrucDocThContent_QNAME, StrucDocTitleContent.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocTitleContent.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocTitleContentFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocThFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocTitleFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocTitleContent.class)
    public JAXBElement<StrucDocTitleFootnote> createStrucDocTitleContentFootnote(StrucDocTitleFootnote value) {
        return new JAXBElement<StrucDocTitleFootnote>(_StrucDocThFootnote_QNAME, StrucDocTitleFootnote.class, StrucDocTitleContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVHolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "holder", scope = COCTMT230100UVApproval.class)
    public JAXBElement<COCTMT230100UVHolder> createCOCTMT230100UVApprovalHolder(COCTMT230100UVHolder value) {
        return new JAXBElement<COCTMT230100UVHolder>(_COCTMT500000UV04PolicyOrAccountHolder_QNAME, COCTMT230100UVHolder.class, COCTMT230100UVApproval.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02QueryByParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "queryByParameter", scope = PRPAIN201306UV02MFMIMT700711UV01ControlActProcess.class)
    public JAXBElement<PRPAMT201306UV02QueryByParameter> createPRPAIN201306UV02MFMIMT700711UV01ControlActProcessQueryByParameter(PRPAMT201306UV02QueryByParameter value) {
        return new JAXBElement<PRPAMT201306UV02QueryByParameter>(_PRPAIN201305UV02QUQIMT021001UV01ControlActProcessQueryByParameter_QNAME, PRPAMT201306UV02QueryByParameter.class, PRPAIN201306UV02MFMIMT700711UV01ControlActProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Subject3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject1", scope = MFMIMT700711UV01PriorRegistration.class)
    public JAXBElement<MFMIMT700711UV01Subject3> createMFMIMT700711UV01PriorRegistrationSubject1(MFMIMT700711UV01Subject3 value) {
        return new JAXBElement<MFMIMT700711UV01Subject3>(_MFMIMT700701UV01PriorRegistrationSubject1_QNAME, MFMIMT700711UV01Subject3 .class, MFMIMT700711UV01PriorRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Subject4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subject2", scope = MFMIMT700711UV01PriorRegistration.class)
    public JAXBElement<MFMIMT700711UV01Subject4> createMFMIMT700711UV01PriorRegistrationSubject2(MFMIMT700711UV01Subject4 value) {
        return new JAXBElement<MFMIMT700711UV01Subject4>(_MFMIMT700701UV01PriorRegistrationSubject2_QNAME, MFMIMT700711UV01Subject4 .class, MFMIMT700711UV01PriorRegistration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVSubstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "ingredient", scope = COCTMT230100UVSubIngredient.class)
    public JAXBElement<COCTMT230100UVSubstance> createCOCTMT230100UVSubIngredientIngredient(COCTMT230100UVSubstance value) {
        return new JAXBElement<COCTMT230100UVSubstance>(_COCTMT230100UVIngredientIngredient_QNAME, COCTMT230100UVSubstance.class, COCTMT230100UVSubIngredient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianOrganization", scope = COCTMT030007UVGuardian.class)
    public JAXBElement<COCTMT150002UV01Organization> createCOCTMT030007UVGuardianGuardianOrganization(COCTMT150002UV01Organization value) {
        return new JAXBElement<COCTMT150002UV01Organization>(_PRPAMT201303UV02GuardianGuardianOrganization_QNAME, COCTMT150002UV01Organization.class, COCTMT030007UVGuardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030202UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "guardianPerson", scope = COCTMT030007UVGuardian.class)
    public JAXBElement<COCTMT030202UV01Person> createCOCTMT030007UVGuardianGuardianPerson(COCTMT030202UV01Person value) {
        return new JAXBElement<COCTMT030202UV01Person>(_PRPAMT201303UV02GuardianGuardianPerson_QNAME, COCTMT030202UV01Person.class, COCTMT030007UVGuardian.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000200UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = MCCIMT000200UV01Agent.class)
    public JAXBElement<MCCIMT000200UV01Organization> createMCCIMT000200UV01AgentRepresentedOrganization(MCCIMT000200UV01Organization value) {
        return new JAXBElement<MCCIMT000200UV01Organization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, MCCIMT000200UV01Organization.class, MCCIMT000200UV01Agent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "groupOrganization", scope = COCTMT510000UV06Beneficiary.class)
    public JAXBElement<COCTMT510000UV06Organization> createCOCTMT510000UV06BeneficiaryGroupOrganization(COCTMT510000UV06Organization value) {
        return new JAXBElement<COCTMT510000UV06Organization>(_COCTMT510000UV06BeneficiaryGroupOrganization_QNAME, COCTMT510000UV06Organization.class, COCTMT510000UV06Beneficiary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "memberPerson", scope = COCTMT510000UV06Beneficiary.class)
    public JAXBElement<COCTMT030007UVPerson> createCOCTMT510000UV06BeneficiaryMemberPerson(COCTMT030007UVPerson value) {
        return new JAXBElement<COCTMT030007UVPerson>(_COCTMT510000UV06BeneficiaryMemberPerson_QNAME, COCTMT030007UVPerson.class, COCTMT510000UV06Beneficiary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030007UVNonPersonLivingSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "memberNonPersonLivingSubject", scope = COCTMT510000UV06Beneficiary.class)
    public JAXBElement<COCTMT030007UVNonPersonLivingSubject> createCOCTMT510000UV06BeneficiaryMemberNonPersonLivingSubject(COCTMT030007UVNonPersonLivingSubject value) {
        return new JAXBElement<COCTMT030007UVNonPersonLivingSubject>(_COCTMT510000UV06BeneficiaryMemberNonPersonLivingSubject_QNAME, COCTMT030007UVNonPersonLivingSubject.class, COCTMT510000UV06Beneficiary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "memberOrganization1", scope = COCTMT510000UV06Beneficiary.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT510000UV06BeneficiaryMemberOrganization1(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT510000UV06BeneficiaryMemberOrganization1_QNAME, COCTMT150000UV02Organization.class, COCTMT510000UV06Beneficiary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04ResponsibleParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "responsibleParty", scope = COCTMT740000UV04OralHealthService.class)
    public JAXBElement<COCTMT740000UV04ResponsibleParty> createCOCTMT740000UV04OralHealthServiceResponsibleParty(COCTMT740000UV04ResponsibleParty value) {
        return new JAXBElement<COCTMT740000UV04ResponsibleParty>(_COCTMT290000UV06BillableClinicalServiceResponsibleParty_QNAME, COCTMT740000UV04ResponsibleParty.class, COCTMT740000UV04OralHealthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04Performer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "performer", scope = COCTMT740000UV04OralHealthService.class)
    public JAXBElement<COCTMT740000UV04Performer> createCOCTMT740000UV04OralHealthServicePerformer(COCTMT740000UV04Performer value) {
        return new JAXBElement<COCTMT740000UV04Performer>(_COCTMT290000UV06BillableClinicalServicePerformer_QNAME, COCTMT740000UV04Performer.class, COCTMT740000UV04OralHealthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04Reference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "referencedBy", scope = COCTMT740000UV04OralHealthService.class)
    public JAXBElement<COCTMT740000UV04Reference> createCOCTMT740000UV04OralHealthServiceReferencedBy(COCTMT740000UV04Reference value) {
        return new JAXBElement<COCTMT740000UV04Reference>(_COCTMT740000UV04OralHealthServiceReferencedBy_QNAME, COCTMT740000UV04Reference.class, COCTMT740000UV04OralHealthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04PertinentInformation2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "pertinentInformation", scope = COCTMT300000UV04SubstanceAdministrationIntent.class)
    public JAXBElement<COCTMT300000UV04PertinentInformation2> createCOCTMT300000UV04SubstanceAdministrationIntentPertinentInformation(COCTMT300000UV04PertinentInformation2 value) {
        return new JAXBElement<COCTMT300000UV04PertinentInformation2>(_COCTMT300000UV04SubstanceAdministrationOrderPertinentInformation_QNAME, COCTMT300000UV04PertinentInformation2 .class, COCTMT300000UV04SubstanceAdministrationIntent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090300UV01AssignedDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = MFMIMT700701UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090300UV01AssignedDevice> createMFMIMT700701UV01AuthorOrPerformerAssignedDevice(COCTMT090300UV01AssignedDevice value) {
        return new JAXBElement<COCTMT090300UV01AssignedDevice>(_MFMIMT700711UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090300UV01AssignedDevice.class, MFMIMT700701UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090100UV01AssignedPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedPerson", scope = MFMIMT700701UV01AuthorOrPerformer.class)
    public JAXBElement<COCTMT090100UV01AssignedPerson> createMFMIMT700701UV01AuthorOrPerformerAssignedPerson(COCTMT090100UV01AssignedPerson value) {
        return new JAXBElement<COCTMT090100UV01AssignedPerson>(_COCTMT090102UV02AssignedPersonAssignedPerson_QNAME, COCTMT090100UV01AssignedPerson.class, MFMIMT700701UV01AuthorOrPerformer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocLinkHtml.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocLinkHtmlFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocThFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocLinkHtml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocLinkHtml.class)
    public JAXBElement<StrucDocFootnote> createStrucDocLinkHtmlFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocThFootnote_QNAME, StrucDocFootnote.class, StrucDocLinkHtml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT040203UV01NotificationParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "notificationParty", scope = MCCIMT000300UV01Organization.class)
    public JAXBElement<COCTMT040203UV01NotificationParty> createMCCIMT000300UV01OrganizationNotificationParty(COCTMT040203UV01NotificationParty value) {
        return new JAXBElement<COCTMT040203UV01NotificationParty>(_MCCIMT000200UV01OrganizationNotificationParty_QNAME, COCTMT040203UV01NotificationParty.class, MCCIMT000300UV01Organization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVBirthplace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = COCTMT530000UVPerson.class)
    public JAXBElement<COCTMT530000UVBirthplace> createCOCTMT530000UVPersonBirthplace(COCTMT530000UVBirthplace value) {
        return new JAXBElement<COCTMT530000UVBirthplace>(_PRPAMT201301UV02BirthPlaceBirthplace_QNAME, COCTMT530000UVBirthplace.class, COCTMT530000UVPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090300UV01AssignedDevice.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT090300UV01AssignedDeviceRepresentedOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT090300UV01AssignedDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090300UV01Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT090300UV01AssignedDevice.class)
    public JAXBElement<COCTMT090300UV01Device> createCOCTMT090300UV01AssignedDeviceAssignedDevice(COCTMT090300UV01Device value) {
        return new JAXBElement<COCTMT090300UV01Device>(_MFMIMT700711UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090300UV01Device.class, COCTMT090300UV01AssignedDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150003UV03Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = COCTMT090303UV01AssignedDevice.class)
    public JAXBElement<COCTMT150003UV03Organization> createCOCTMT090303UV01AssignedDeviceRepresentedOrganization(COCTMT150003UV03Organization value) {
        return new JAXBElement<COCTMT150003UV03Organization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, COCTMT150003UV03Organization.class, COCTMT090303UV01AssignedDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090303UV01Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedDevice", scope = COCTMT090303UV01AssignedDevice.class)
    public JAXBElement<COCTMT090303UV01Device> createCOCTMT090303UV01AssignedDeviceAssignedDevice(COCTMT090303UV01Device value) {
        return new JAXBElement<COCTMT090303UV01Device>(_MFMIMT700711UV01AuthorOrPerformerAssignedDevice_QNAME, COCTMT090303UV01Device.class, COCTMT090303UV01AssignedDevice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = COCTMT290000UV06PatientCareProvisionRequest.class)
    public JAXBElement<COCTMT290000UV06Author2> createCOCTMT290000UV06PatientCareProvisionRequestAuthor(COCTMT290000UV06Author2 value) {
        return new JAXBElement<COCTMT290000UV06Author2>(_PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME, COCTMT290000UV06Author2 .class, COCTMT290000UV06PatientCareProvisionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04ProviderPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProviderPerson", scope = COCTMT740000UV04HealthCareProvider.class)
    public JAXBElement<COCTMT740000UV04ProviderPerson> createCOCTMT740000UV04HealthCareProviderHealthCareProviderPerson(COCTMT740000UV04ProviderPerson value) {
        return new JAXBElement<COCTMT740000UV04ProviderPerson>(_COCTMT490000UV04HealthCareProviderHealthCareProviderPerson_QNAME, COCTMT740000UV04ProviderPerson.class, COCTMT740000UV04HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturedMaterial", scope = COCTMT530000UVManufacturedProduct.class)
    public JAXBElement<COCTMT530000UVMaterial> createCOCTMT530000UVManufacturedProductManufacturedMaterial(COCTMT530000UVMaterial value) {
        return new JAXBElement<COCTMT530000UVMaterial>(_COCTMT530000UVManufacturedProductManufacturedMaterial_QNAME, COCTMT530000UVMaterial.class, COCTMT530000UVManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturerOrganization", scope = COCTMT530000UVManufacturedProduct.class)
    public JAXBElement<COCTMT530000UVOrganization> createCOCTMT530000UVManufacturedProductManufacturerOrganization(COCTMT530000UVOrganization value) {
        return new JAXBElement<COCTMT530000UVOrganization>(_COCTMT530000UVManufacturedProductManufacturerOrganization_QNAME, COCTMT530000UVOrganization.class, COCTMT530000UVManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVLabeledDrug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturedLabeledDrug", scope = COCTMT530000UVManufacturedProduct.class)
    public JAXBElement<COCTMT530000UVLabeledDrug> createCOCTMT530000UVManufacturedProductManufacturedLabeledDrug(COCTMT530000UVLabeledDrug value) {
        return new JAXBElement<COCTMT530000UVLabeledDrug>(_COCTMT530000UVManufacturedProductManufacturedLabeledDrug_QNAME, COCTMT530000UVLabeledDrug.class, COCTMT530000UVManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030202UV01Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = COCTMT030007UVContactParty.class)
    public JAXBElement<COCTMT030202UV01Person> createCOCTMT030007UVContactPartyContactPerson(COCTMT030202UV01Person value) {
        return new JAXBElement<COCTMT030202UV01Person>(_PRPAMT201301UV02ContactPartyContactPerson_QNAME, COCTMT030202UV01Person.class, COCTMT030007UVContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150002UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = COCTMT030007UVContactParty.class)
    public JAXBElement<COCTMT150002UV01Organization> createCOCTMT030007UVContactPartyContactOrganization(COCTMT150002UV01Organization value) {
        return new JAXBElement<COCTMT150002UV01Organization>(_PRPAMT201301UV02ContactPartyContactOrganization_QNAME, COCTMT150002UV01Organization.class, COCTMT030007UVContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT060000UV01Entity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "playingEntity", scope = COCTMT060000UV01RoleTransport.class)
    public JAXBElement<COCTMT060000UV01Entity> createCOCTMT060000UV01RoleTransportPlayingEntity(COCTMT060000UV01Entity value) {
        return new JAXBElement<COCTMT060000UV01Entity>(_COCTMT060000UV01RoleTransportPlayingEntity_QNAME, COCTMT060000UV01Entity.class, COCTMT060000UV01RoleTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocRenderMultiMedia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "renderMultiMedia", scope = StrucDocContent.class)
    public JAXBElement<StrucDocRenderMultiMedia> createStrucDocContentRenderMultiMedia(StrucDocRenderMultiMedia value) {
        return new JAXBElement<StrucDocRenderMultiMedia>(_StrucDocThRenderMultiMedia_QNAME, StrucDocRenderMultiMedia.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocContent.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocContentLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocThLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocBr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "br", scope = StrucDocContent.class)
    public JAXBElement<StrucDocBr> createStrucDocContentBr(StrucDocBr value) {
        return new JAXBElement<StrucDocBr>(_StrucDocThBr_QNAME, StrucDocBr.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocContent.class)
    public JAXBElement<StrucDocSup> createStrucDocContentSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocThSup_QNAME, StrucDocSup.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocContent.class)
    public JAXBElement<StrucDocSub> createStrucDocContentSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocThSub_QNAME, StrucDocSub.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "content", scope = StrucDocContent.class)
    public JAXBElement<StrucDocContent> createStrucDocContentContent(StrucDocContent value) {
        return new JAXBElement<StrucDocContent>(_StrucDocThContent_QNAME, StrucDocContent.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocContent.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocContentFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocThFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocContent.class)
    public JAXBElement<StrucDocFootnote> createStrucDocContentFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocThFootnote_QNAME, StrucDocFootnote.class, StrucDocContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201310UV02Subject2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = PRPAMT201310UV02BirthPlace.class)
    public JAXBElement<PRPAMT201310UV02Subject2> createPRPAMT201310UV02BirthPlaceSubjectOf(PRPAMT201310UV02Subject2 value) {
        return new JAXBElement<PRPAMT201310UV02Subject2>(_PRPAMT201301UV02BirthPlaceSubjectOf_QNAME, PRPAMT201310UV02Subject2 .class, PRPAMT201310UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710007UVPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = PRPAMT201310UV02BirthPlace.class)
    public JAXBElement<COCTMT710007UVPlace> createPRPAMT201310UV02BirthPlaceBirthplace(COCTMT710007UVPlace value) {
        return new JAXBElement<COCTMT710007UVPlace>(_PRPAMT201301UV02BirthPlaceBirthplace_QNAME, COCTMT710007UVPlace.class, PRPAMT201310UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710000UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "location", scope = COCTMT070000UV01LocatedEntity.class)
    public JAXBElement<COCTMT710000UV01Place> createCOCTMT070000UV01LocatedEntityLocation(COCTMT710000UV01Place value) {
        return new JAXBElement<COCTMT710000UV01Place>(_COCTMT530000UVHealthCareFacilityLocation_QNAME, COCTMT710000UV01Place.class, COCTMT070000UV01LocatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVOrganizer.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVOrganizerSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_PRPAMT201301UV02BirthPlaceSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVOrganizer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVOrganizer.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVOrganizerDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVObservationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVOrganizer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVOrganizer.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVOrganizerRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVObservationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVOrganizer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVOrganizer.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVOrganizerDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT530000UVObservationDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVOrganizer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT090000UV01Device.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT090000UV01DeviceAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090100UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT090000UV01Device.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFMIMT700711UV01Author2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "author", scope = PRPAIN201306UV02MFMIMT700711UV01RegistrationEvent.class)
    public JAXBElement<MFMIMT700711UV01Author2> createPRPAIN201306UV02MFMIMT700711UV01RegistrationEventAuthor(MFMIMT700711UV01Author2 value) {
        return new JAXBElement<MFMIMT700711UV01Author2>(_PRPAIN201304UV02MFMIMT700701UV01RegistrationEventAuthor_QNAME, MFMIMT700711UV01Author2 .class, PRPAIN201306UV02MFMIMT700711UV01RegistrationEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MCCIMT000300UV01Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "representedOrganization", scope = MCCIMT000300UV01Agent.class)
    public JAXBElement<MCCIMT000300UV01Organization> createMCCIMT000300UV01AgentRepresentedOrganization(MCCIMT000300UV01Organization value) {
        return new JAXBElement<MCCIMT000300UV01Organization>(_COCTMT090102UV02AssignedPersonRepresentedOrganization_QNAME, MCCIMT000300UV01Organization.class, MCCIMT000300UV01Agent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = PRPAMT201303UV02Student.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201303UV02StudentSchoolOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201302UV02StudentSchoolOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201303UV02Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT030207UVPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactPerson", scope = PRPAMT201310UV02ContactParty.class)
    public JAXBElement<COCTMT030207UVPerson> createPRPAMT201310UV02ContactPartyContactPerson(COCTMT030207UVPerson value) {
        return new JAXBElement<COCTMT030207UVPerson>(_PRPAMT201301UV02ContactPartyContactPerson_QNAME, COCTMT030207UVPerson.class, PRPAMT201310UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contactOrganization", scope = PRPAMT201310UV02ContactParty.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201310UV02ContactPartyContactOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201301UV02ContactPartyContactOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201310UV02ContactParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBREAL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "high", scope = IVLREAL.class)
    public JAXBElement<IVXBREAL> createIVLREALHigh(IVXBREAL value) {
        return new JAXBElement<IVXBREAL>(_IVLINTHigh_QNAME, IVXBREAL.class, IVLREAL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IVXBREAL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "low", scope = IVLREAL.class)
    public JAXBElement<IVXBREAL> createIVLREALLow(IVXBREAL value) {
        return new JAXBElement<IVXBREAL>(_IVLINTLow_QNAME, IVXBREAL.class, IVLREAL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REAL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "center", scope = IVLREAL.class)
    public JAXBElement<REAL> createIVLREALCenter(REAL value) {
        return new JAXBElement<REAL>(_IVLINTCenter_QNAME, REAL.class, IVLREAL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link REAL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "width", scope = IVLREAL.class)
    public JAXBElement<REAL> createIVLREALWidth(REAL value) {
        return new JAXBElement<REAL>(_IVLINTWidth_QNAME, REAL.class, IVLREAL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT260003UVManufacturedMaterialKind }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturedMaterialKind", scope = COCTMT260003UVManufacturedProduct.class)
    public JAXBElement<COCTMT260003UVManufacturedMaterialKind> createCOCTMT260003UVManufacturedProductManufacturedMaterialKind(COCTMT260003UVManufacturedMaterialKind value) {
        return new JAXBElement<COCTMT260003UVManufacturedMaterialKind>(_COCTMT260003UVManufacturedProductManufacturedMaterialKind_QNAME, COCTMT260003UVManufacturedMaterialKind.class, COCTMT260003UVManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT230100UVContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asContent", scope = COCTMT230100UVMedicine.class)
    public JAXBElement<COCTMT230100UVContent> createCOCTMT230100UVMedicineAsContent(COCTMT230100UVContent value) {
        return new JAXBElement<COCTMT230100UVContent>(_COCTMT080000UVNonPersonLivingSubjectAsContent_QNAME, COCTMT230100UVContent.class, COCTMT230100UVMedicine.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04WarrantorOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "warrantingWarrantorOrganization", scope = COCTMT490000UV04Warrantor.class)
    public JAXBElement<COCTMT490000UV04WarrantorOrganization> createCOCTMT490000UV04WarrantorWarrantingWarrantorOrganization(COCTMT490000UV04WarrantorOrganization value) {
        return new JAXBElement<COCTMT490000UV04WarrantorOrganization>(_COCTMT490000UV04WarrantorWarrantingWarrantorOrganization_QNAME, COCTMT490000UV04WarrantorOrganization.class, COCTMT490000UV04Warrantor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02MatchAlgorithm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "matchAlgorithm", scope = PRPAMT201306UV02MatchCriterionList.class)
    public JAXBElement<PRPAMT201306UV02MatchAlgorithm> createPRPAMT201306UV02MatchCriterionListMatchAlgorithm(PRPAMT201306UV02MatchAlgorithm value) {
        return new JAXBElement<PRPAMT201306UV02MatchAlgorithm>(_PRPAMT201306UV02MatchCriterionListMatchAlgorithm_QNAME, PRPAMT201306UV02MatchAlgorithm.class, PRPAMT201306UV02MatchCriterionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02MinimumDegreeMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "minimumDegreeMatch", scope = PRPAMT201306UV02MatchCriterionList.class)
    public JAXBElement<PRPAMT201306UV02MinimumDegreeMatch> createPRPAMT201306UV02MatchCriterionListMinimumDegreeMatch(PRPAMT201306UV02MinimumDegreeMatch value) {
        return new JAXBElement<PRPAMT201306UV02MinimumDegreeMatch>(_PRPAMT201306UV02MatchCriterionListMinimumDegreeMatch_QNAME, PRPAMT201306UV02MinimumDegreeMatch.class, PRPAMT201306UV02MatchCriterionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201306UV02MatchWeight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "matchWeight", scope = PRPAMT201306UV02MatchCriterionList.class)
    public JAXBElement<PRPAMT201306UV02MatchWeight> createPRPAMT201306UV02MatchCriterionListMatchWeight(PRPAMT201306UV02MatchWeight value) {
        return new JAXBElement<PRPAMT201306UV02MatchWeight>(_PRPAMT201306UV02MatchCriterionListMatchWeight_QNAME, PRPAMT201306UV02MatchWeight.class, PRPAMT201306UV02MatchCriterionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150007UVOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "schoolOrganization", scope = PRPAMT201301UV02Student.class)
    public JAXBElement<COCTMT150007UVOrganization> createPRPAMT201301UV02StudentSchoolOrganization(COCTMT150007UVOrganization value) {
        return new JAXBElement<COCTMT150007UVOrganization>(_PRPAMT201302UV02StudentSchoolOrganization_QNAME, COCTMT150007UVOrganization.class, PRPAMT201301UV02Student.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVSubstanceAdministration.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVSubstanceAdministrationSubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_PRPAMT201301UV02BirthPlaceSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVSubstanceAdministration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVSubstanceAdministration.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVSubstanceAdministrationDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVObservationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVSubstanceAdministration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVConsumable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "consumable", scope = COCTMT530000UVSubstanceAdministration.class)
    public JAXBElement<COCTMT530000UVConsumable> createCOCTMT530000UVSubstanceAdministrationConsumable(COCTMT530000UVConsumable value) {
        return new JAXBElement<COCTMT530000UVConsumable>(_COCTMT530000UVSubstanceAdministrationConsumable_QNAME, COCTMT530000UVConsumable.class, COCTMT530000UVSubstanceAdministration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVSubstanceAdministration.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVSubstanceAdministrationRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVObservationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVSubstanceAdministration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVSubstanceAdministration.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVSubstanceAdministrationDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT530000UVObservationDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVSubstanceAdministration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PRPAMT201303UV02Subject2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = PRPAMT201303UV02BirthPlace.class)
    public JAXBElement<PRPAMT201303UV02Subject2> createPRPAMT201303UV02BirthPlaceSubjectOf(PRPAMT201303UV02Subject2 value) {
        return new JAXBElement<PRPAMT201303UV02Subject2>(_PRPAMT201301UV02BirthPlaceSubjectOf_QNAME, PRPAMT201303UV02Subject2 .class, PRPAMT201303UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710007UVPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = PRPAMT201303UV02BirthPlace.class)
    public JAXBElement<COCTMT710007UVPlace> createPRPAMT201303UV02BirthPlaceBirthplace(COCTMT710007UVPlace value) {
        return new JAXBElement<COCTMT710007UVPlace>(_PRPAMT201301UV02BirthPlaceBirthplace_QNAME, COCTMT710007UVPlace.class, PRPAMT201303UV02BirthPlace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04ManufacturedMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "contained", scope = COCTMT490000UV04ContentPackagedProduct.class)
    public JAXBElement<COCTMT490000UV04ManufacturedMaterial> createCOCTMT490000UV04ContentPackagedProductContained(COCTMT490000UV04ManufacturedMaterial value) {
        return new JAXBElement<COCTMT490000UV04ManufacturedMaterial>(_COCTMT490000UV04ContentPackagedProductContained_QNAME, COCTMT490000UV04ManufacturedMaterial.class, COCTMT490000UV04ContentPackagedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT060000UV01Transportation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "transportation", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT060000UV01Transportation> createCOCTMT510000UV06DefinitionTransportation(COCTMT060000UV01Transportation value) {
        return new JAXBElement<COCTMT060000UV01Transportation>(_COCTMT510000UV06DefinitionTransportation_QNAME, COCTMT060000UV01Transportation.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT490000UV04BillableClinicalProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "billableClinicalProduct1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT490000UV04BillableClinicalProduct> createCOCTMT510000UV06DefinitionBillableClinicalProduct1(COCTMT490000UV04BillableClinicalProduct value) {
        return new JAXBElement<COCTMT490000UV04BillableClinicalProduct>(_COCTMT510000UV06DefinitionBillableClinicalProduct1_QNAME, COCTMT490000UV04BillableClinicalProduct.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT280000UV04CrossReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "crossReference1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT280000UV04CrossReference> createCOCTMT510000UV06DefinitionCrossReference1(COCTMT280000UV04CrossReference value) {
        return new JAXBElement<COCTMT280000UV04CrossReference>(_COCTMT510000UV06DefinitionCrossReference1_QNAME, COCTMT280000UV04CrossReference.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVEncounter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "encounter", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVEncounter> createCOCTMT510000UV06DefinitionEncounter(COCTMT530000UVEncounter value) {
        return new JAXBElement<COCTMT530000UVEncounter>(_COCTMT530000UVSourceOf2Encounter_QNAME, COCTMT530000UVEncounter.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVObservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "observation", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVObservation> createCOCTMT510000UV06DefinitionObservation(COCTMT530000UVObservation value) {
        return new JAXBElement<COCTMT530000UVObservation>(_COCTMT530000UVSourceOf2Observation_QNAME, COCTMT530000UVObservation.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVOrganizer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "organizer", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVOrganizer> createCOCTMT510000UV06DefinitionOrganizer(COCTMT530000UVOrganizer value) {
        return new JAXBElement<COCTMT530000UVOrganizer>(_COCTMT530000UVSourceOf2Organizer_QNAME, COCTMT530000UVOrganizer.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT740000UV04OralHealthService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "oralHealthService1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT740000UV04OralHealthService> createCOCTMT510000UV06DefinitionOralHealthService1(COCTMT740000UV04OralHealthService value) {
        return new JAXBElement<COCTMT740000UV04OralHealthService>(_COCTMT510000UV06DefinitionOralHealthService1_QNAME, COCTMT740000UV04OralHealthService.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSupply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supply", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVSupply> createCOCTMT510000UV06DefinitionSupply(COCTMT530000UVSupply value) {
        return new JAXBElement<COCTMT530000UVSupply>(_COCTMT530000UVSourceOf2Supply_QNAME, COCTMT530000UVSupply.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06BillableClinicalService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "billableClinicalService1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT290000UV06BillableClinicalService> createCOCTMT510000UV06DefinitionBillableClinicalService1(COCTMT290000UV06BillableClinicalService value) {
        return new JAXBElement<COCTMT290000UV06BillableClinicalService>(_COCTMT510000UV06DefinitionBillableClinicalService1_QNAME, COCTMT290000UV06BillableClinicalService.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04SupplyEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supplyEvent1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT300000UV04SupplyEvent> createCOCTMT510000UV06DefinitionSupplyEvent1(COCTMT300000UV04SupplyEvent value) {
        return new JAXBElement<COCTMT300000UV04SupplyEvent>(_COCTMT510000UV06DefinitionSupplyEvent1_QNAME, COCTMT300000UV04SupplyEvent.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06SupplyEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "supplyEvent2", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT600000UV06SupplyEvent> createCOCTMT510000UV06DefinitionSupplyEvent2(COCTMT600000UV06SupplyEvent value) {
        return new JAXBElement<COCTMT600000UV06SupplyEvent>(_COCTMT510000UV06DefinitionSupplyEvent2_QNAME, COCTMT600000UV06SupplyEvent.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVProcedure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "procedure", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVProcedure> createCOCTMT510000UV06DefinitionProcedure(COCTMT530000UVProcedure value) {
        return new JAXBElement<COCTMT530000UVProcedure>(_COCTMT530000UVSourceOf2Procedure_QNAME, COCTMT530000UVProcedure.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT310000UV04AccomodationSupplied }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "accomodationSupplied1", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT310000UV04AccomodationSupplied> createCOCTMT510000UV06DefinitionAccomodationSupplied1(COCTMT310000UV04AccomodationSupplied value) {
        return new JAXBElement<COCTMT310000UV04AccomodationSupplied>(_COCTMT510000UV06DefinitionAccomodationSupplied1_QNAME, COCTMT310000UV04AccomodationSupplied.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT510000UV06ServiceDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "serviceDefinition", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT510000UV06ServiceDefinition> createCOCTMT510000UV06DefinitionServiceDefinition(COCTMT510000UV06ServiceDefinition value) {
        return new JAXBElement<COCTMT510000UV06ServiceDefinition>(_COCTMT510000UV06DefinitionServiceDefinition_QNAME, COCTMT510000UV06ServiceDefinition.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVAct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "act", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVAct> createCOCTMT510000UV06DefinitionAct(COCTMT530000UVAct value) {
        return new JAXBElement<COCTMT530000UVAct>(_COCTMT530000UVSourceOf2Act_QNAME, COCTMT530000UVAct.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVActReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "actReference", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVActReference> createCOCTMT510000UV06DefinitionActReference(COCTMT530000UVActReference value) {
        return new JAXBElement<COCTMT530000UVActReference>(_COCTMT510000UV06PreconditionActReference_QNAME, COCTMT530000UVActReference.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubstanceAdministration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "substanceAdministration", scope = COCTMT510000UV06Definition.class)
    public JAXBElement<COCTMT530000UVSubstanceAdministration> createCOCTMT510000UV06DefinitionSubstanceAdministration(COCTMT530000UVSubstanceAdministration value) {
        return new JAXBElement<COCTMT530000UVSubstanceAdministration>(_COCTMT530000UVSourceOf2SubstanceAdministration_QNAME, COCTMT530000UVSubstanceAdministration.class, COCTMT510000UV06Definition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVBirthplace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "birthplace", scope = COCTMT530000UVAnimal.class)
    public JAXBElement<COCTMT530000UVBirthplace> createCOCTMT530000UVAnimalBirthplace(COCTMT530000UVBirthplace value) {
        return new JAXBElement<COCTMT530000UVBirthplace>(_PRPAMT201301UV02BirthPlaceBirthplace_QNAME, COCTMT530000UVBirthplace.class, COCTMT530000UVAnimal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT500000UV04EmployerOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "employerOrganization", scope = COCTMT500000UV04Employment.class)
    public JAXBElement<COCTMT500000UV04EmployerOrganization> createCOCTMT500000UV04EmploymentEmployerOrganization(COCTMT500000UV04EmployerOrganization value) {
        return new JAXBElement<COCTMT500000UV04EmployerOrganization>(_COCTMT030000UV04EmploymentEmployerOrganization_QNAME, COCTMT500000UV04EmployerOrganization.class, COCTMT500000UV04Employment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT600000UV06ProviderPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "healthCareProviderPerson", scope = COCTMT600000UV06HealthCareProvider.class)
    public JAXBElement<COCTMT600000UV06ProviderPerson> createCOCTMT600000UV06HealthCareProviderHealthCareProviderPerson(COCTMT600000UV06ProviderPerson value) {
        return new JAXBElement<COCTMT600000UV06ProviderPerson>(_COCTMT490000UV04HealthCareProviderHealthCareProviderPerson_QNAME, COCTMT600000UV06ProviderPerson.class, COCTMT600000UV06HealthCareProvider.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT150000UV02Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "wholeOrganization", scope = COCTMT150000UV02OrganizationPartOf.class)
    public JAXBElement<COCTMT150000UV02Organization> createCOCTMT150000UV02OrganizationPartOfWholeOrganization(COCTMT150000UV02Organization value) {
        return new JAXBElement<COCTMT150000UV02Organization>(_COCTMT150000UV02OrganizationPartOfWholeOrganization_QNAME, COCTMT150000UV02Organization.class, COCTMT150000UV02OrganizationPartOf.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT710000UV01Place }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "locatedPlace", scope = COCTMT710000UV01LocatedEntityHasParts.class)
    public JAXBElement<COCTMT710000UV01Place> createCOCTMT710000UV01LocatedEntityHasPartsLocatedPlace(COCTMT710000UV01Place value) {
        return new JAXBElement<COCTMT710000UV01Place>(_COCTMT710000UV01LocatedEntityHasPartsLocatedPlace_QNAME, COCTMT710000UV01Place.class, COCTMT710000UV01LocatedEntityHasParts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVActRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "actRef", scope = COCTMT080000UVProduct.class)
    public JAXBElement<COCTMT080000UVActRef> createCOCTMT080000UVProductActRef(COCTMT080000UVActRef value) {
        return new JAXBElement<COCTMT080000UVActRef>(_COCTMT080000UVProductActRef_QNAME, COCTMT080000UVActRef.class, COCTMT080000UVProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT080000UVProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "process", scope = COCTMT080000UVProduct.class)
    public JAXBElement<COCTMT080000UVProcess> createCOCTMT080000UVProductProcess(COCTMT080000UVProcess value) {
        return new JAXBElement<COCTMT080000UVProcess>(_COCTMT080000UVProductProcess_QNAME, COCTMT080000UVProcess.class, COCTMT080000UVProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocLinkHtml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "linkHtml", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocLinkHtml> createStrucDocCaptionLinkHtml(StrucDocLinkHtml value) {
        return new JAXBElement<StrucDocLinkHtml>(_StrucDocThLinkHtml_QNAME, StrucDocLinkHtml.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sup", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocSup> createStrucDocCaptionSup(StrucDocSup value) {
        return new JAXBElement<StrucDocSup>(_StrucDocThSup_QNAME, StrucDocSup.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "sub", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocSub> createStrucDocCaptionSub(StrucDocSub value) {
        return new JAXBElement<StrucDocSub>(_StrucDocThSub_QNAME, StrucDocSub.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnoteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnoteRef", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocFootnoteRef> createStrucDocCaptionFootnoteRef(StrucDocFootnoteRef value) {
        return new JAXBElement<StrucDocFootnoteRef>(_StrucDocThFootnoteRef_QNAME, StrucDocFootnoteRef.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrucDocFootnote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "footnote", scope = StrucDocCaption.class)
    public JAXBElement<StrucDocFootnote> createStrucDocCaptionFootnote(StrucDocFootnote value) {
        return new JAXBElement<StrucDocFootnote>(_StrucDocThFootnote_QNAME, StrucDocFootnote.class, StrucDocCaption.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT070000UV01LocatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "asLocatedEntity", scope = COCTMT090000UV01Person.class)
    public JAXBElement<COCTMT070000UV01LocatedEntity> createCOCTMT090000UV01PersonAsLocatedEntity(COCTMT070000UV01LocatedEntity value) {
        return new JAXBElement<COCTMT070000UV01LocatedEntity>(_COCTMT090100UV01PersonAsLocatedEntity_QNAME, COCTMT070000UV01LocatedEntity.class, COCTMT090000UV01Person.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT300000UV04Performer2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "performer", scope = COCTMT300000UV04Substitution.class)
    public JAXBElement<COCTMT300000UV04Performer2> createCOCTMT300000UV04SubstitutionPerformer(COCTMT300000UV04Performer2 value) {
        return new JAXBElement<COCTMT300000UV04Performer2>(_COCTMT290000UV06BillableClinicalServicePerformer_QNAME, COCTMT300000UV04Performer2 .class, COCTMT300000UV04Substitution.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT090000UV01AssignedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "assignedEntity", scope = COCTMT530000UVInformant.class)
    public JAXBElement<COCTMT090000UV01AssignedEntity> createCOCTMT530000UVInformantAssignedEntity(COCTMT090000UV01AssignedEntity value) {
        return new JAXBElement<COCTMT090000UV01AssignedEntity>(_COCTMT530000UVPerformerAssignedEntity_QNAME, COCTMT090000UV01AssignedEntity.class, COCTMT530000UVInformant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT050000UV01Patient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "patient", scope = COCTMT530000UVInformant.class)
    public JAXBElement<COCTMT050000UV01Patient> createCOCTMT530000UVInformantPatient(COCTMT050000UV01Patient value) {
        return new JAXBElement<COCTMT050000UV01Patient>(_COCTMT530000UVSubject2Patient_QNAME, COCTMT050000UV01Patient.class, COCTMT530000UVInformant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRelatedEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "relatedEntity", scope = COCTMT530000UVInformant.class)
    public JAXBElement<COCTMT530000UVRelatedEntity> createCOCTMT530000UVInformantRelatedEntity(COCTMT530000UVRelatedEntity value) {
        return new JAXBElement<COCTMT530000UVRelatedEntity>(_COCTMT530000UVSubject2RelatedEntity_QNAME, COCTMT530000UVRelatedEntity.class, COCTMT530000UVInformant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ManufacturedMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturedMaterial", scope = COCTMT290000UV06ManufacturedProduct.class)
    public JAXBElement<COCTMT290000UV06ManufacturedMaterial> createCOCTMT290000UV06ManufacturedProductManufacturedMaterial(COCTMT290000UV06ManufacturedMaterial value) {
        return new JAXBElement<COCTMT290000UV06ManufacturedMaterial>(_COCTMT530000UVManufacturedProductManufacturedMaterial_QNAME, COCTMT290000UV06ManufacturedMaterial.class, COCTMT290000UV06ManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT290000UV06ManufacturedProductOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "manufacturerManufacturedProductOrganization", scope = COCTMT290000UV06ManufacturedProduct.class)
    public JAXBElement<COCTMT290000UV06ManufacturedProductOrganization> createCOCTMT290000UV06ManufacturedProductManufacturerManufacturedProductOrganization(COCTMT290000UV06ManufacturedProductOrganization value) {
        return new JAXBElement<COCTMT290000UV06ManufacturedProductOrganization>(_COCTMT490000UV04ManufacturedProductManufacturerManufacturedProductOrganization_QNAME, COCTMT290000UV06ManufacturedProductOrganization.class, COCTMT290000UV06ManufacturedProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVSubject1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "subjectOf", scope = COCTMT530000UVSupply.class)
    public JAXBElement<COCTMT530000UVSubject1> createCOCTMT530000UVSupplySubjectOf(COCTMT530000UVSubject1 value) {
        return new JAXBElement<COCTMT530000UVSubject1>(_PRPAMT201301UV02BirthPlaceSubjectOf_QNAME, COCTMT530000UVSubject1 .class, COCTMT530000UVSupply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDataEnterer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "dataEnterer", scope = COCTMT530000UVSupply.class)
    public JAXBElement<COCTMT530000UVDataEnterer> createCOCTMT530000UVSupplyDataEnterer(COCTMT530000UVDataEnterer value) {
        return new JAXBElement<COCTMT530000UVDataEnterer>(_COCTMT530000UVObservationDataEnterer_QNAME, COCTMT530000UVDataEnterer.class, COCTMT530000UVSupply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVRecordTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "recordTarget", scope = COCTMT530000UVSupply.class)
    public JAXBElement<COCTMT530000UVRecordTarget> createCOCTMT530000UVSupplyRecordTarget(COCTMT530000UVRecordTarget value) {
        return new JAXBElement<COCTMT530000UVRecordTarget>(_COCTMT530000UVObservationRecordTarget_QNAME, COCTMT530000UVRecordTarget.class, COCTMT530000UVSupply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COCTMT530000UVDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "definition", scope = COCTMT530000UVSupply.class)
    public JAXBElement<COCTMT530000UVDefinition> createCOCTMT530000UVSupplyDefinition(COCTMT530000UVDefinition value) {
        return new JAXBElement<COCTMT530000UVDefinition>(_COCTMT530000UVObservationDefinition_QNAME, COCTMT530000UVDefinition.class, COCTMT530000UVSupply.class, value);
    }

}
