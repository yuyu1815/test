/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseDeniedReason;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseRequestFailure;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseResult;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.enums.EnumEntries;
/*     */ import kotlin.enums.EnumEntriesKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\020\n\000\n\002\030\002\n\002\b\013\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\002\030\000 \0272\b\022\004\022\0020\0000\001:\001\027B\025\b\002\022\n\b\002\020\002\032\004\030\0010\003¢\006\004\b\004\020\005J\016\020\022\032\0020\0232\006\020\024\032\0020\017J\b\020\025\032\004\030\0010\026R\020\020\002\032\004\030\0010\003X\004¢\006\002\n\000R\021\020\016\032\0020\0178F¢\006\006\032\004\b\020\020\021j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\r¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason;", "", "resultReason", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseDeniedReason;", "<init>", "(Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseDeniedReason;)V", "TOS_NOT_ACCEPTED_BY_INDIVIDUAL", "MAX_TRIAL_COUNT_EXCEEDED", "MAX_TRIAL_COUNT_PER_USER_EXCEEDED", "PAYMENT_PROOF_REQUIRED", "COUNTRY_IS_UNKNOWN", "COUNTRY_IS_RESTRICTED", "ACCOUNT_NOT_FOUND_ERROR", "TRIAL_STARTED_TRY_TO_RELOGIN", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "toAipLicenseDenied", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "message", "asAuthRequired", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$AuthRequired;", "Companion", "data.repos"})
/*     */ enum KnownRequestDeclinedReason
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion;
/*     */   @Nullable
/*     */   private final AipLicenseDeniedReason resultReason;
/*     */   
/*     */   KnownRequestDeclinedReason(AipLicenseDeniedReason resultReason) {
/*     */     this.resultReason = resultReason;
/*     */   }
/*     */   
/* 154 */   TOS_NOT_ACCEPTED_BY_INDIVIDUAL(AipLicenseDeniedReason.PersonalTosNotAccepted),
/*     */   
/* 156 */   MAX_TRIAL_COUNT_EXCEEDED(AipLicenseDeniedReason.TrialMaxCountExceeded),
/* 157 */   MAX_TRIAL_COUNT_PER_USER_EXCEEDED(AipLicenseDeniedReason.TrialMaxCountExceeded),
/* 158 */   PAYMENT_PROOF_REQUIRED(AipLicenseDeniedReason.TrialNoLinkedPaymentMethod),
/* 159 */   COUNTRY_IS_UNKNOWN(AipLicenseDeniedReason.CountryUnknown),
/* 160 */   COUNTRY_IS_RESTRICTED(AipLicenseDeniedReason.CountryRestricted),
/*     */ 
/*     */   
/* 163 */   ACCOUNT_NOT_FOUND_ERROR(null, 1, null),
/* 164 */   TRIAL_STARTED_TRY_TO_RELOGIN(null, 1, null); static { Companion = new Companion(null); }
/*     */   
/*     */   @NotNull
/*     */   public final String getErrorCode() {
/* 168 */     return name();
/*     */   }
/*     */   @NotNull
/* 171 */   public final AipLicenseResult toAipLicenseDenied(@NotNull String message) { Intrinsics.checkNotNullParameter(message, "message"); return (AipLicenseResult)new AipLicenseRequestFailure.LicenseDenied(this.resultReason, message); } @Nullable
/*     */   public final AipLicenseRequestFailure.AuthRequired asAuthRequired() { AipLicenseRequestFailure.AuthRequired authRequired1;
/*     */     AipLicenseRequestFailure.AuthRequired it;
/*     */     int $i$a$-also-KnownRequestDeclinedReason$asAuthRequired$1;
/* 175 */     switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) { case 1: case 2:
/* 176 */         it = authRequired1 = AipLicenseRequestFailure.AuthRequired.INSTANCE; $i$a$-also-KnownRequestDeclinedReason$asAuthRequired$1 = 0;
/* 177 */         JunieAipLicenseRepositoryKt.access$getLOG$p().warn("Received unexpected relogin-like result: " + this); }
/*     */ 
/*     */     
/* 180 */     return null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static EnumEntries<KnownRequestDeclinedReason> getEntries() {
/* 189 */     return $ENTRIES;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\004\030\0010\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason$Companion;", "", "<init>", "()V", "fromErrorCode", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason;", "errorCode", "", "data.repos"})
/*     */   @SourceDebugExtension({"SMAP\nJunieAipLicenseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAipLicenseRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @Nullable
/*     */     public final KnownRequestDeclinedReason fromErrorCode(@NotNull String errorCode) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'errorCode'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: invokestatic getEntries : ()Lkotlin/enums/EnumEntries;
/*     */       //   9: checkcast java/lang/Iterable
/*     */       //   12: astore_2
/*     */       //   13: aload_2
/*     */       //   14: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   19: astore_3
/*     */       //   20: aload_3
/*     */       //   21: invokeinterface hasNext : ()Z
/*     */       //   26: ifeq -> 64
/*     */       //   29: aload_3
/*     */       //   30: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   35: astore #4
/*     */       //   37: aload #4
/*     */       //   39: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason
/*     */       //   42: astore #5
/*     */       //   44: iconst_0
/*     */       //   45: istore #6
/*     */       //   47: aload #5
/*     */       //   49: invokevirtual getErrorCode : ()Ljava/lang/String;
/*     */       //   52: aload_1
/*     */       //   53: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   56: ifeq -> 20
/*     */       //   59: aload #4
/*     */       //   61: goto -> 65
/*     */       //   64: aconst_null
/*     */       //   65: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason
/*     */       //   68: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #186	-> 6
/*     */       //   #209	-> 44
/*     */       //   #186	-> 47
/*     */       //   #186	-> 56
/*     */       //   #186	-> 68
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   47	9	6	$i$a$-find-KnownRequestDeclinedReason$Companion$fromErrorCode$1	I
/*     */       //   44	12	5	it	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason;
/*     */       //   0	69	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason$Companion;
/*     */       //   0	69	1	errorCode	Ljava/lang/String;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\KnownRequestDeclinedReason.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */