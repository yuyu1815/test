/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*     */ 
/*     */ import ai.grazie.utils.mpp.time.Timestamp;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseProductType;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.StateFlow;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\030\b\007\030\0002\0020\001Bs\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t\022\b\020\013\032\004\030\0010\f\022\f\020\r\032\b\022\004\022\0020\0030\016\022\f\020\017\032\b\022\004\022\0020\0210\020\022\f\020\022\032\b\022\004\022\0020\0210\020\022\f\020\023\032\b\022\004\022\0020\0210\020¢\006\004\b\024\020\025J\006\020(\032\0020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\026R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\027\020\030R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\031\020\032R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\033\020\034R\021\020\n\032\0020\t¢\006\b\n\000\032\004\b\035\020\034R\023\020\013\032\004\030\0010\f¢\006\b\n\000\032\004\b\036\020\037R\027\020\r\032\b\022\004\022\0020\0030\016¢\006\b\n\000\032\004\b \020!R\027\020\017\032\b\022\004\022\0020\0210\020¢\006\b\n\000\032\004\b\"\020#R\027\020\022\032\b\022\004\022\0020\0210\020¢\006\b\n\000\032\004\b$\020#R\027\020\023\032\b\022\004\022\0020\0210\020¢\006\b\n\000\032\004\b%\020#R\021\020&\032\0020\0038F¢\006\006\032\004\b'\020\026¨\006)"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;", "", "isOver", "", "productType", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "license", "", "current", "", "maximum", "until", "Lai/grazie/utils/mpp/time/Timestamp;", "hideWarning", "Lkotlinx/coroutines/flow/StateFlow;", "doHideWarning", "Lkotlin/Function0;", "", "onUpgradeLicense", "onOpenSupport", "<init>", "(ZLcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Ljava/lang/String;IILai/grazie/utils/mpp/time/Timestamp;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "()Z", "getProductType", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "getLicense", "()Ljava/lang/String;", "getCurrent", "()I", "getMaximum", "getUntil", "()Lai/grazie/utils/mpp/time/Timestamp;", "getHideWarning", "()Lkotlinx/coroutines/flow/StateFlow;", "getDoHideWarning", "()Lkotlin/jvm/functions/Function0;", "getOnUpgradeLicense", "getOnOpenSupport", "suggestUpgrade", "getSuggestUpgrade", "getText", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nJunieGrazieQuota.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieGrazieQuota.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
/*     */ public final class GrazieQuotaWarning
/*     */ {
/*     */   private final boolean isOver;
/*     */   @Nullable
/*     */   private final AipLicenseProductType productType;
/*     */   @NotNull
/*     */   private final String license;
/*     */   private final int current;
/*     */   private final int maximum;
/*     */   @Nullable
/*     */   private final Timestamp until;
/*     */   @NotNull
/*     */   private final StateFlow<Boolean> hideWarning;
/*     */   @NotNull
/*     */   private final Function0<Unit> doHideWarning;
/*     */   @NotNull
/*     */   private final Function0<Unit> onUpgradeLicense;
/*     */   @NotNull
/*     */   private final Function0<Unit> onOpenSupport;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public final boolean isOver() {
/*     */     return this.isOver;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final AipLicenseProductType getProductType() {
/*     */     return this.productType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getLicense() {
/*     */     return this.license;
/*     */   }
/*     */   
/*     */   public final int getCurrent() {
/*     */     return this.current;
/*     */   }
/*     */   
/*     */   public final int getMaximum() {
/*     */     return this.maximum;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Timestamp getUntil() {
/*     */     return this.until;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StateFlow<Boolean> getHideWarning() {
/*     */     return this.hideWarning;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function0<Unit> getDoHideWarning() {
/*     */     return this.doHideWarning;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function0<Unit> getOnUpgradeLicense() {
/*     */     return this.onUpgradeLicense;
/*     */   }
/*     */   
/*     */   public GrazieQuotaWarning(boolean isOver, @Nullable AipLicenseProductType productType, @NotNull String license, int current, int maximum, @Nullable Timestamp until, @NotNull StateFlow<Boolean> hideWarning, @NotNull Function0<Unit> doHideWarning, @NotNull Function0<Unit> onUpgradeLicense, @NotNull Function0<Unit> onOpenSupport) {
/* 188 */     this.isOver = isOver;
/* 189 */     this.productType = productType;
/* 190 */     this.license = license;
/* 191 */     this.current = current;
/* 192 */     this.maximum = maximum;
/* 193 */     this.until = until;
/* 194 */     this.hideWarning = hideWarning;
/* 195 */     this.doHideWarning = doHideWarning;
/* 196 */     this.onUpgradeLicense = onUpgradeLicense;
/* 197 */     this.onOpenSupport = onOpenSupport; } @NotNull public final Function0<Unit> getOnOpenSupport() { return this.onOpenSupport; }
/*     */    public final boolean getSuggestUpgrade() {
/* 199 */     return (this.productType != AipLicenseProductType.AIPU);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getText() {
/*     */     // Byte code:
/*     */     //   0: getstatic kotlin/jvm/internal/StringCompanionObject.INSTANCE : Lkotlin/jvm/internal/StringCompanionObject;
/*     */     //   3: pop
/*     */     //   4: ldc 'Quota Low: %,d of %,d available until %s'
/*     */     //   6: astore_1
/*     */     //   7: iconst_3
/*     */     //   8: anewarray java/lang/Object
/*     */     //   11: astore_2
/*     */     //   12: aload_2
/*     */     //   13: iconst_0
/*     */     //   14: aload_0
/*     */     //   15: getfield current : I
/*     */     //   18: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   21: aastore
/*     */     //   22: aload_2
/*     */     //   23: iconst_1
/*     */     //   24: aload_0
/*     */     //   25: getfield maximum : I
/*     */     //   28: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   31: aastore
/*     */     //   32: aload_2
/*     */     //   33: iconst_2
/*     */     //   34: aload_0
/*     */     //   35: getfield until : Lai/grazie/utils/mpp/time/Timestamp;
/*     */     //   38: dup
/*     */     //   39: ifnull -> 86
/*     */     //   42: astore_3
/*     */     //   43: istore #6
/*     */     //   45: astore #5
/*     */     //   47: iconst_0
/*     */     //   48: istore #4
/*     */     //   50: new java/text/SimpleDateFormat
/*     */     //   53: dup
/*     */     //   54: ldc 'yyyy-MM-dd'
/*     */     //   56: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   59: new java/util/Date
/*     */     //   62: dup
/*     */     //   63: aload_3
/*     */     //   64: invokevirtual getMillis : ()J
/*     */     //   67: invokespecial <init> : (J)V
/*     */     //   70: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
/*     */     //   73: astore #7
/*     */     //   75: aload #5
/*     */     //   77: iload #6
/*     */     //   79: aload #7
/*     */     //   81: nop
/*     */     //   82: dup
/*     */     //   83: ifnonnull -> 89
/*     */     //   86: pop
/*     */     //   87: ldc 'unknown'
/*     */     //   89: aastore
/*     */     //   90: aload_2
/*     */     //   91: astore_2
/*     */     //   92: aload_1
/*     */     //   93: aload_2
/*     */     //   94: aload_2
/*     */     //   95: arraylength
/*     */     //   96: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   99: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   102: dup
/*     */     //   103: ldc 'format(...)'
/*     */     //   105: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   108: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #202	-> 0
/*     */     //   #205	-> 4
/*     */     //   #206	-> 7
/*     */     //   #207	-> 24
/*     */     //   #206	-> 32
/*     */     //   #208	-> 34
/*     */     //   #213	-> 43
/*     */     //   #208	-> 50
/*     */     //   #208	-> 81
/*     */     //   #208	-> 82
/*     */     //   #206	-> 90
/*     */     //   #202	-> 92
/*     */     //   #202	-> 108
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   50	23	4	$i$a$-let-GrazieQuotaWarning$getText$1	I
/*     */     //   47	26	3	it	Lai/grazie/utils/mpp/time/Timestamp;
/*     */     //   0	109	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\GrazieQuotaWarning.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */