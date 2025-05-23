/*     */ package feedback;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
/*     */ import kotlinx.serialization.json.JsonArrayBuilder;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementBuildersKt;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import kotlinx.serialization.json.JsonObjectBuilder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\013\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\032\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BM\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\b\022\f\020\t\032\b\022\004\022\0020\0030\n\022\006\020\013\032\0020\003\022\006\020\f\032\0020\r¢\006\004\b\016\020\017J\b\020\034\032\0020\rH\026J\t\020\035\032\0020\003HÆ\003J\t\020\036\032\0020\003HÆ\003J\t\020\037\032\0020\003HÆ\003J\t\020 \032\0020\003HÆ\003J\t\020!\032\0020\bHÆ\003J\017\020\"\032\b\022\004\022\0020\0030\nHÆ\003J\t\020#\032\0020\003HÆ\003J\t\020$\032\0020\rHÆ\003J_\020%\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\b2\016\b\002\020\t\032\b\022\004\022\0020\0030\n2\b\b\002\020\013\032\0020\0032\b\b\002\020\f\032\0020\rHÆ\001J\023\020&\032\0020\b2\b\020'\032\004\030\0010(HÖ\003J\t\020)\032\0020*HÖ\001J\t\020+\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\022\020\021R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\023\020\021R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\024\020\021R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\025\020\026R\027\020\t\032\b\022\004\022\0020\0030\n¢\006\b\n\000\032\004\b\027\020\030R\024\020\013\032\0020\003X\004¢\006\b\n\000\032\004\b\031\020\021R\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\032\020\033¨\006,"}, d2 = {"Lfeedback/FeedbackRequestDataWithDetailedAnswer;", "Lfeedback/FeedbackRequestDataHolder;", "email", "", "title", "description", "privacyConsentType", "autoSolveTicket", "", "ticketTags", "", "feedbackType", "collectedData", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "getEmail", "()Ljava/lang/String;", "getTitle", "getDescription", "getPrivacyConsentType", "getAutoSolveTicket", "()Z", "getTicketTags", "()Ljava/util/List;", "getFeedbackType", "getCollectedData", "()Lkotlinx/serialization/json/JsonObject;", "toJsonObject", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nGeneralFeedbackSubmit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeneralFeedbackSubmit.kt\nfeedback/FeedbackRequestDataWithDetailedAnswer\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n29#2,2:235\n52#2,2:237\n54#2:241\n31#2:242\n1863#3,2:239\n*S KotlinDebug\n*F\n+ 1 GeneralFeedbackSubmit.kt\nfeedback/FeedbackRequestDataWithDetailedAnswer\n*L\n87#1:235,2\n97#1:237,2\n97#1:241\n87#1:242\n97#1:239,2\n*E\n"})
/*     */ public final class FeedbackRequestDataWithDetailedAnswer
/*     */   implements FeedbackRequestDataHolder
/*     */ {
/*     */   @NotNull
/*     */   private final String email;
/*     */   @NotNull
/*     */   private final String title;
/*     */   @NotNull
/*     */   private final String description;
/*     */   @NotNull
/*     */   private final String privacyConsentType;
/*     */   private final boolean autoSolveTicket;
/*     */   @NotNull
/*     */   private final List<String> ticketTags;
/*     */   @NotNull
/*     */   private final String feedbackType;
/*     */   @NotNull
/*     */   private final JsonObject collectedData;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public final String getEmail() {
/*     */     return this.email;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getTitle() {
/*     */     return this.title;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getDescription() {
/*     */     return this.description;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getPrivacyConsentType() {
/*     */     return this.privacyConsentType;
/*     */   }
/*     */   
/*     */   public final boolean getAutoSolveTicket() {
/*     */     return this.autoSolveTicket;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<String> getTicketTags() {
/*     */     return this.ticketTags;
/*     */   }
/*     */   
/*     */   public FeedbackRequestDataWithDetailedAnswer(@NotNull String email, @NotNull String title, @NotNull String description, @NotNull String privacyConsentType, boolean autoSolveTicket, @NotNull List<String> ticketTags, @NotNull String feedbackType, @NotNull JsonObject collectedData) {
/*  78 */     this.email = email;
/*  79 */     this.title = title;
/*  80 */     this.description = description;
/*  81 */     this.privacyConsentType = privacyConsentType;
/*  82 */     this.autoSolveTicket = autoSolveTicket;
/*  83 */     this.ticketTags = ticketTags;
/*  84 */     this.feedbackType = feedbackType;
/*  85 */     this.collectedData = collectedData; } @NotNull public String getFeedbackType() { return this.feedbackType; } @NotNull public JsonObject getCollectedData() { return this.collectedData; } @NotNull
/*     */   public JsonObject toJsonObject() {
/*  87 */     int $i$f$buildJsonObject = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 235 */     JsonObjectBuilder builder$iv = new JsonObjectBuilder();
/* 236 */     JsonObjectBuilder $this$toJsonObject_u24lambda_u242 = builder$iv; int $i$a$-buildJsonObject-FeedbackRequestDataWithDetailedAnswer$toJsonObject$1 = 0; JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u242, "formid", "v2/feedback/ide_with_detailed_answer"); JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u242, "autosolve", Boolean.valueOf(this.autoSolveTicket)); CharSequence charSequence = this.email; JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u242, "email", EmailBlockKt.getEMAIL_REGEX().matches(charSequence) ? this.email : ""); JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u242, "subject", this.title); JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u242, "comment", this.description); JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u242, "intellij_product", GeneralFeedbackSubmitKt.getProductTag()); JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u242, "feedback_type", getFeedbackType()); JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u242, "privacy_consent", Boolean.valueOf(true)); JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u242, "privacy_consent_type", this.privacyConsentType); int $i$f$buildJsonArray = 0;
/* 237 */     JsonArrayBuilder jsonArrayBuilder1 = new JsonArrayBuilder();
/* 238 */     JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder1; String str = "tags"; JsonObjectBuilder jsonObjectBuilder1 = $this$toJsonObject_u24lambda_u242; int $i$a$-buildJsonArray-FeedbackRequestDataWithDetailedAnswer$toJsonObject$1$1 = 0; Iterable<String> $this$forEach$iv = this.ticketTags; int $i$f$forEach = 0;
/* 239 */     Iterator<String> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); String it = (String)element$iv; int $i$a$-forEach-FeedbackRequestDataWithDetailedAnswer$toJsonObject$1$1$1 = 0; CharSequence charSequence1 = it; Regex regex = GeneralFeedbackSubmitKt.getSPACE_SYMBOL_REGEX(); String str1 = "_"; JsonElementBuildersKt.add(jsonArrayBuilder2, regex.replace(charSequence1, str1)); }
/*     */      Unit unit = Unit.INSTANCE;
/* 241 */     jsonObjectBuilder1.put(str, (JsonElement)jsonArrayBuilder1.build()); $this$toJsonObject_u24lambda_u242.put("collected_data", GeneralFeedbackSubmitKt.cleanFeedbackFromEmails((JsonElement)getCollectedData()));
/* 242 */     return builder$iv.build();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.email;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.title;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component3() {
/*     */     return this.description;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component4() {
/*     */     return this.privacyConsentType;
/*     */   }
/*     */   
/*     */   public final boolean component5() {
/*     */     return this.autoSolveTicket;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<String> component6() {
/*     */     return this.ticketTags;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component7() {
/*     */     return this.feedbackType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final JsonObject component8() {
/*     */     return this.collectedData;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FeedbackRequestDataWithDetailedAnswer copy(@NotNull String email, @NotNull String title, @NotNull String description, @NotNull String privacyConsentType, boolean autoSolveTicket, @NotNull List<String> ticketTags, @NotNull String feedbackType, @NotNull JsonObject collectedData) {
/*     */     Intrinsics.checkNotNullParameter(email, "email");
/*     */     Intrinsics.checkNotNullParameter(title, "title");
/*     */     Intrinsics.checkNotNullParameter(description, "description");
/*     */     Intrinsics.checkNotNullParameter(privacyConsentType, "privacyConsentType");
/*     */     Intrinsics.checkNotNullParameter(ticketTags, "ticketTags");
/*     */     Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
/*     */     Intrinsics.checkNotNullParameter(collectedData, "collectedData");
/*     */     return new FeedbackRequestDataWithDetailedAnswer(email, title, description, privacyConsentType, autoSolveTicket, ticketTags, feedbackType, collectedData);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "FeedbackRequestDataWithDetailedAnswer(email=" + this.email + ", title=" + this.title + ", description=" + this.description + ", privacyConsentType=" + this.privacyConsentType + ", autoSolveTicket=" + this.autoSolveTicket + ", ticketTags=" + this.ticketTags + ", feedbackType=" + this.feedbackType + ", collectedData=" + this.collectedData + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.email.hashCode();
/*     */     result = result * 31 + this.title.hashCode();
/*     */     result = result * 31 + this.description.hashCode();
/*     */     result = result * 31 + this.privacyConsentType.hashCode();
/*     */     result = result * 31 + Boolean.hashCode(this.autoSolveTicket);
/*     */     result = result * 31 + this.ticketTags.hashCode();
/*     */     result = result * 31 + this.feedbackType.hashCode();
/*     */     return result * 31 + this.collectedData.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof FeedbackRequestDataWithDetailedAnswer))
/*     */       return false; 
/*     */     FeedbackRequestDataWithDetailedAnswer feedbackRequestDataWithDetailedAnswer = (FeedbackRequestDataWithDetailedAnswer)other;
/*     */     return !Intrinsics.areEqual(this.email, feedbackRequestDataWithDetailedAnswer.email) ? false : (!Intrinsics.areEqual(this.title, feedbackRequestDataWithDetailedAnswer.title) ? false : (!Intrinsics.areEqual(this.description, feedbackRequestDataWithDetailedAnswer.description) ? false : (!Intrinsics.areEqual(this.privacyConsentType, feedbackRequestDataWithDetailedAnswer.privacyConsentType) ? false : ((this.autoSolveTicket != feedbackRequestDataWithDetailedAnswer.autoSolveTicket) ? false : (!Intrinsics.areEqual(this.ticketTags, feedbackRequestDataWithDetailedAnswer.ticketTags) ? false : (!Intrinsics.areEqual(this.feedbackType, feedbackRequestDataWithDetailedAnswer.feedbackType) ? false : (!!Intrinsics.areEqual(this.collectedData, feedbackRequestDataWithDetailedAnswer.collectedData))))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\FeedbackRequestDataWithDetailedAnswer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */