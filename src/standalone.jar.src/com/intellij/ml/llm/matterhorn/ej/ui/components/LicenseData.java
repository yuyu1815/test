/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.datetime.Instant;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\036\n\002\020\013\n\002\b\003\b\b\030\0002\0020\001Bc\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\006\020\005\032\0020\003\022\b\b\002\020\006\032\0020\003\022\b\020\007\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t\022\006\020\n\032\0020\003\022\006\020\013\032\0020\f\022\006\020\r\032\0020\f\022\b\020\016\032\004\030\0010\t¢\006\004\b\017\020\020J\b\020\036\032\0020\003H\026J\013\020\037\032\004\030\0010\003HÆ\003J\013\020 \032\004\030\0010\003HÆ\003J\t\020!\032\0020\003HÆ\003J\t\020\"\032\0020\003HÆ\003J\013\020#\032\004\030\0010\003HÆ\003J\013\020$\032\004\030\0010\tHÆ\003J\t\020%\032\0020\003HÆ\003J\t\020&\032\0020\fHÆ\003J\t\020'\032\0020\fHÆ\003J\013\020(\032\004\030\0010\tHÆ\003Jw\020)\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0032\n\b\002\020\007\032\004\030\0010\0032\n\b\002\020\b\032\004\030\0010\t2\b\b\002\020\n\032\0020\0032\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\f2\n\b\002\020\016\032\004\030\0010\tHÆ\001J\023\020*\032\0020+2\b\020,\032\004\030\0010\001HÖ\003J\t\020-\032\0020\fHÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\021\020\022R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\023\020\022R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\024\020\022R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\025\020\022R\023\020\007\032\004\030\0010\003¢\006\b\n\000\032\004\b\026\020\022R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\027\020\030R\021\020\n\032\0020\003¢\006\b\n\000\032\004\b\031\020\022R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\032\020\033R\021\020\r\032\0020\f¢\006\b\n\000\032\004\b\034\020\033R\023\020\016\032\004\030\0010\t¢\006\b\n\000\032\004\b\035\020\030¨\006."}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData;", "", "accountName", "", "accountEmail", "licenseTypeFullName", "licenseTypeShortName", "licensedTo", "billingDate", "Lkotlinx/datetime/Instant;", "licenseId", "usedCredits", "", "maxCredits", "nextRefillDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/datetime/Instant;Ljava/lang/String;IILkotlinx/datetime/Instant;)V", "getAccountName", "()Ljava/lang/String;", "getAccountEmail", "getLicenseTypeFullName", "getLicenseTypeShortName", "getLicensedTo", "getBillingDate", "()Lkotlinx/datetime/Instant;", "getLicenseId", "getUsedCredits", "()I", "getMaxCredits", "getNextRefillDate", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "standalone"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nLicenseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LicenseDialog.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1#2:221\n*E\n"})
/*    */ public final class LicenseData
/*    */ {
/*    */   @Nullable
/*    */   private final String accountName;
/*    */   @Nullable
/*    */   private final String accountEmail;
/*    */   @NotNull
/*    */   private final String licenseTypeFullName;
/*    */   @NotNull
/*    */   private final String licenseTypeShortName;
/*    */   @Nullable
/*    */   private final String licensedTo;
/*    */   @Nullable
/*    */   private final Instant billingDate;
/*    */   @NotNull
/*    */   private final String licenseId;
/*    */   private final int usedCredits;
/*    */   private final int maxCredits;
/*    */   @Nullable
/*    */   private final Instant nextRefillDate;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public LicenseData(@Nullable String accountName, @Nullable String accountEmail, @NotNull String licenseTypeFullName, @NotNull String licenseTypeShortName, @Nullable String licensedTo, @Nullable Instant billingDate, @NotNull String licenseId, int usedCredits, int maxCredits, @Nullable Instant nextRefillDate) {
/* 38 */     this.accountName = accountName;
/* 39 */     this.accountEmail = accountEmail;
/* 40 */     this.licenseTypeFullName = licenseTypeFullName;
/* 41 */     this.licenseTypeShortName = licenseTypeShortName;
/* 42 */     this.licensedTo = licensedTo;
/* 43 */     this.billingDate = billingDate;
/* 44 */     this.licenseId = licenseId;
/* 45 */     this.usedCredits = usedCredits;
/* 46 */     this.maxCredits = maxCredits;
/* 47 */     this.nextRefillDate = nextRefillDate; } @Nullable public final Instant getNextRefillDate() { return this.nextRefillDate; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final String getAccountName() {
/*    */     return this.accountName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getAccountEmail() {
/*    */     return this.accountEmail;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getLicenseTypeFullName() {
/*    */     return this.licenseTypeFullName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getLicenseTypeShortName() {
/*    */     return this.licenseTypeShortName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getLicensedTo() {
/*    */     return this.licensedTo;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Instant getBillingDate() {
/*    */     return this.billingDate;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getLicenseId() {
/*    */     return this.licenseId;
/*    */   }
/*    */   
/*    */   public final int getUsedCredits() {
/*    */     return this.usedCredits;
/*    */   }
/*    */   
/*    */   public final int getMaxCredits() {
/*    */     return this.maxCredits;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     // Byte code:
/*    */     //   0: new java/text/SimpleDateFormat
/*    */     //   3: dup
/*    */     //   4: ldc 'yyyy-MM-dd'
/*    */     //   6: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   9: astore_1
/*    */     //   10: aload_0
/*    */     //   11: getfield billingDate : Lkotlinx/datetime/Instant;
/*    */     //   14: dup
/*    */     //   15: ifnull -> 44
/*    */     //   18: astore #6
/*    */     //   20: iconst_0
/*    */     //   21: istore #7
/*    */     //   23: aload_1
/*    */     //   24: new java/util/Date
/*    */     //   27: dup
/*    */     //   28: aload #6
/*    */     //   30: invokevirtual toEpochMilliseconds : ()J
/*    */     //   33: invokespecial <init> : (J)V
/*    */     //   36: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
/*    */     //   39: nop
/*    */     //   40: dup
/*    */     //   41: ifnonnull -> 47
/*    */     //   44: pop
/*    */     //   45: ldc 'unknown'
/*    */     //   47: astore_2
/*    */     //   48: aload_0
/*    */     //   49: getfield nextRefillDate : Lkotlinx/datetime/Instant;
/*    */     //   52: dup
/*    */     //   53: ifnull -> 82
/*    */     //   56: astore #7
/*    */     //   58: iconst_0
/*    */     //   59: istore #8
/*    */     //   61: aload_1
/*    */     //   62: new java/util/Date
/*    */     //   65: dup
/*    */     //   66: aload #7
/*    */     //   68: invokevirtual toEpochMilliseconds : ()J
/*    */     //   71: invokespecial <init> : (J)V
/*    */     //   74: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
/*    */     //   77: nop
/*    */     //   78: dup
/*    */     //   79: ifnonnull -> 85
/*    */     //   82: pop
/*    */     //   83: ldc 'unknown'
/*    */     //   85: astore_3
/*    */     //   86: aload_0
/*    */     //   87: getfield accountName : Ljava/lang/String;
/*    */     //   90: dup
/*    */     //   91: ifnonnull -> 97
/*    */     //   94: pop
/*    */     //   95: ldc 'Unknown name'
/*    */     //   97: astore #4
/*    */     //   99: aload_0
/*    */     //   100: getfield accountEmail : Ljava/lang/String;
/*    */     //   103: dup
/*    */     //   104: ifnonnull -> 110
/*    */     //   107: pop
/*    */     //   108: ldc 'Unknown email'
/*    */     //   110: astore #5
/*    */     //   112: aload_0
/*    */     //   113: getfield licenseTypeFullName : Ljava/lang/String;
/*    */     //   116: astore #6
/*    */     //   118: aload_0
/*    */     //   119: getfield licensedTo : Ljava/lang/String;
/*    */     //   122: dup
/*    */     //   123: ifnonnull -> 129
/*    */     //   126: pop
/*    */     //   127: ldc 'Unknown licensed user'
/*    */     //   129: astore #7
/*    */     //   131: new java/lang/StringBuilder
/*    */     //   134: dup
/*    */     //   135: invokespecial <init> : ()V
/*    */     //   138: astore #8
/*    */     //   140: aload #8
/*    */     //   142: astore #9
/*    */     //   144: iconst_0
/*    */     //   145: istore #10
/*    */     //   147: aload #9
/*    */     //   149: aload #4
/*    */     //   151: aload #5
/*    */     //   153: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   161: bipush #10
/*    */     //   163: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   166: pop
/*    */     //   167: aload #9
/*    */     //   169: aload #6
/*    */     //   171: aload #7
/*    */     //   173: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   181: bipush #10
/*    */     //   183: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   186: pop
/*    */     //   187: aload #9
/*    */     //   189: aload_2
/*    */     //   190: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   198: bipush #10
/*    */     //   200: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   203: pop
/*    */     //   204: aload #9
/*    */     //   206: aload_0
/*    */     //   207: getfield usedCredits : I
/*    */     //   210: aload_0
/*    */     //   211: getfield maxCredits : I
/*    */     //   214: aload_3
/*    */     //   215: <illegal opcode> makeConcatWithConstants : (IILjava/lang/String;)Ljava/lang/String;
/*    */     //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   223: bipush #10
/*    */     //   225: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   228: pop
/*    */     //   229: aload #9
/*    */     //   231: aload_0
/*    */     //   232: getfield licenseId : Ljava/lang/String;
/*    */     //   235: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   240: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   243: bipush #10
/*    */     //   245: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   248: pop
/*    */     //   249: nop
/*    */     //   250: aload #8
/*    */     //   252: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   255: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #50	-> 0
/*    */     //   #52	-> 10
/*    */     //   #221	-> 20
/*    */     //   #52	-> 23
/*    */     //   #52	-> 39
/*    */     //   #52	-> 40
/*    */     //   #53	-> 48
/*    */     //   #221	-> 58
/*    */     //   #53	-> 61
/*    */     //   #53	-> 77
/*    */     //   #53	-> 78
/*    */     //   #55	-> 86
/*    */     //   #56	-> 99
/*    */     //   #57	-> 112
/*    */     //   #58	-> 118
/*    */     //   #60	-> 131
/*    */     //   #61	-> 147
/*    */     //   #62	-> 167
/*    */     //   #63	-> 187
/*    */     //   #64	-> 204
/*    */     //   #65	-> 229
/*    */     //   #66	-> 249
/*    */     //   #60	-> 250
/*    */     //   #60	-> 255
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   23	16	7	$i$a$-let-LicenseData$toString$billingDateStr$1	I
/*    */     //   20	19	6	it	Lkotlinx/datetime/Instant;
/*    */     //   61	16	8	$i$a$-let-LicenseData$toString$nextRefillDateStr$1	I
/*    */     //   58	19	7	it	Lkotlinx/datetime/Instant;
/*    */     //   147	103	10	$i$a$-buildString-LicenseData$toString$1	I
/*    */     //   144	106	9	$this$toString_u24lambda_u242	Ljava/lang/StringBuilder;
/*    */     //   10	246	1	dateFormat	Ljava/text/SimpleDateFormat;
/*    */     //   48	208	2	billingDateStr	Ljava/lang/String;
/*    */     //   86	170	3	nextRefillDateStr	Ljava/lang/String;
/*    */     //   99	157	4	name	Ljava/lang/String;
/*    */     //   112	144	5	email	Ljava/lang/String;
/*    */     //   118	138	6	licenseTypeStr	Ljava/lang/String;
/*    */     //   131	125	7	licensedToStr	Ljava/lang/String;
/*    */     //   0	256	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.accountName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.accountEmail;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.licenseTypeFullName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.licenseTypeShortName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.licensedTo;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Instant component6() {
/*    */     return this.billingDate;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component7() {
/*    */     return this.licenseId;
/*    */   }
/*    */   
/*    */   public final int component8() {
/*    */     return this.usedCredits;
/*    */   }
/*    */   
/*    */   public final int component9() {
/*    */     return this.maxCredits;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Instant component10() {
/*    */     return this.nextRefillDate;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LicenseData copy(@Nullable String accountName, @Nullable String accountEmail, @NotNull String licenseTypeFullName, @NotNull String licenseTypeShortName, @Nullable String licensedTo, @Nullable Instant billingDate, @NotNull String licenseId, int usedCredits, int maxCredits, @Nullable Instant nextRefillDate) {
/*    */     Intrinsics.checkNotNullParameter(licenseTypeFullName, "licenseTypeFullName");
/*    */     Intrinsics.checkNotNullParameter(licenseTypeShortName, "licenseTypeShortName");
/*    */     Intrinsics.checkNotNullParameter(licenseId, "licenseId");
/*    */     return new LicenseData(accountName, accountEmail, licenseTypeFullName, licenseTypeShortName, licensedTo, billingDate, licenseId, usedCredits, maxCredits, nextRefillDate);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.accountName == null) ? 0 : this.accountName.hashCode();
/*    */     result = result * 31 + ((this.accountEmail == null) ? 0 : this.accountEmail.hashCode());
/*    */     result = result * 31 + this.licenseTypeFullName.hashCode();
/*    */     result = result * 31 + this.licenseTypeShortName.hashCode();
/*    */     result = result * 31 + ((this.licensedTo == null) ? 0 : this.licensedTo.hashCode());
/*    */     result = result * 31 + ((this.billingDate == null) ? 0 : this.billingDate.hashCode());
/*    */     result = result * 31 + this.licenseId.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.usedCredits);
/*    */     result = result * 31 + Integer.hashCode(this.maxCredits);
/*    */     return result * 31 + ((this.nextRefillDate == null) ? 0 : this.nextRefillDate.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LicenseData))
/*    */       return false; 
/*    */     LicenseData licenseData = (LicenseData)other;
/*    */     return !Intrinsics.areEqual(this.accountName, licenseData.accountName) ? false : (!Intrinsics.areEqual(this.accountEmail, licenseData.accountEmail) ? false : (!Intrinsics.areEqual(this.licenseTypeFullName, licenseData.licenseTypeFullName) ? false : (!Intrinsics.areEqual(this.licenseTypeShortName, licenseData.licenseTypeShortName) ? false : (!Intrinsics.areEqual(this.licensedTo, licenseData.licensedTo) ? false : (!Intrinsics.areEqual(this.billingDate, licenseData.billingDate) ? false : (!Intrinsics.areEqual(this.licenseId, licenseData.licenseId) ? false : ((this.usedCredits != licenseData.usedCredits) ? false : ((this.maxCredits != licenseData.maxCredits) ? false : (!!Intrinsics.areEqual(this.nextRefillDate, licenseData.nextRefillDate))))))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\LicenseData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */