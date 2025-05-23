/*     */ package feedback;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\f\032\0020\005H\026J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\005HÆ\003J\035\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\b\020\tR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\027"}, d2 = {"Lfeedback/FeedbackRequestData;", "Lfeedback/FeedbackRequestDataHolder;", "feedbackType", "", "collectedData", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "getFeedbackType", "()Ljava/lang/String;", "getCollectedData", "()Lkotlinx/serialization/json/JsonObject;", "toJsonObject", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nGeneralFeedbackSubmit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeneralFeedbackSubmit.kt\nfeedback/FeedbackRequestData\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,234:1\n29#2,3:235\n*S KotlinDebug\n*F\n+ 1 GeneralFeedbackSubmit.kt\nfeedback/FeedbackRequestData\n*L\n61#1:235,3\n*E\n"})
/*     */ public final class FeedbackRequestData
/*     */   implements FeedbackRequestDataHolder
/*     */ {
/*     */   @NotNull
/*     */   private final String feedbackType;
/*     */   @NotNull
/*     */   private final JsonObject collectedData;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public String getFeedbackType() {
/*     */     return this.feedbackType;
/*     */   }
/*     */   
/*     */   public FeedbackRequestData(@NotNull String feedbackType, @NotNull JsonObject collectedData) {
/*  58 */     this.feedbackType = feedbackType;
/*  59 */     this.collectedData = collectedData; } @NotNull public JsonObject getCollectedData() { return this.collectedData; } @NotNull
/*     */   public JsonObject toJsonObject() {
/*  61 */     int $i$f$buildJsonObject = 0;
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
/* 236 */     JsonObjectBuilder $this$toJsonObject_u24lambda_u240 = builder$iv; int $i$a$-buildJsonObject-FeedbackRequestData$toJsonObject$1 = 0; JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u240, "formid", "feedback/ide"); JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u240, "intellij_product", GeneralFeedbackSubmitKt.getProductTag()); JsonElementBuildersKt.put($this$toJsonObject_u24lambda_u240, "feedback_type", getFeedbackType()); $this$toJsonObject_u24lambda_u240.put("collected_data", GeneralFeedbackSubmitKt.cleanFeedbackFromEmails((JsonElement)getCollectedData()));
/* 237 */     return builder$iv.build();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.feedbackType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final JsonObject component2() {
/*     */     return this.collectedData;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FeedbackRequestData copy(@NotNull String feedbackType, @NotNull JsonObject collectedData) {
/*     */     Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
/*     */     Intrinsics.checkNotNullParameter(collectedData, "collectedData");
/*     */     return new FeedbackRequestData(feedbackType, collectedData);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "FeedbackRequestData(feedbackType=" + this.feedbackType + ", collectedData=" + this.collectedData + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.feedbackType.hashCode();
/*     */     return result * 31 + this.collectedData.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof FeedbackRequestData))
/*     */       return false; 
/*     */     FeedbackRequestData feedbackRequestData = (FeedbackRequestData)other;
/*     */     return !Intrinsics.areEqual(this.feedbackType, feedbackRequestData.feedbackType) ? false : (!!Intrinsics.areEqual(this.collectedData, feedbackRequestData.collectedData));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\FeedbackRequestData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */