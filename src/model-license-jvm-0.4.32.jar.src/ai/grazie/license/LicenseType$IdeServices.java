/*    */ package ai.grazie.license;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\r\n\002\020 \n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\027\020\021\032\b\022\004\022\0020\0040\022¢\006\b\n\000\032\004\b\023\020\024¨\006\025"}, d2 = {"Lai/grazie/license/LicenseType$IdeServices;", "", "()V", "CloudPayAsYouGo", "Lai/grazie/license/LicenseType;", "getCloudPayAsYouGo", "()Lai/grazie/license/LicenseType;", "CloudPayAsYouGoTrial", "getCloudPayAsYouGoTrial", "PayAsYouGo", "getPayAsYouGo", "PayAsYouGoTrial", "getPayAsYouGoTrial", "Prepaid", "getPrepaid", "PrepaidTrial", "getPrepaidTrial", "all", "", "getAll", "()Ljava/util/List;", "model-license"})
/*    */ public final class IdeServices
/*    */ {
/*    */   @NotNull
/* 71 */   public static final IdeServices INSTANCE = new IdeServices(); @NotNull private static final LicenseType Prepaid = new LicenseType("jetbrains-ai.enterprise.prepaid"); @NotNull public final LicenseType getPrepaid() { return Prepaid; } @NotNull
/* 72 */   private static final LicenseType PrepaidTrial = new LicenseType("jetbrains-ai.enterprise.prepaid.trial"); @NotNull public final LicenseType getPrepaidTrial() { return PrepaidTrial; } @NotNull
/* 73 */   private static final LicenseType PayAsYouGo = new LicenseType("jetbrains-ai.enterprise.pay-as-you-go"); @NotNull public final LicenseType getPayAsYouGo() { return PayAsYouGo; } @NotNull
/* 74 */   private static final LicenseType PayAsYouGoTrial = new LicenseType("jetbrains-ai.enterprise.pay-as-you-go.trial"); @NotNull public final LicenseType getPayAsYouGoTrial() { return PayAsYouGoTrial; } @NotNull
/* 75 */   private static final LicenseType CloudPayAsYouGo = new LicenseType("jetbrains-ai.enterprise.cloud-pay-as-you-go"); @NotNull public final LicenseType getCloudPayAsYouGo() { return CloudPayAsYouGo; } @NotNull
/* 76 */   private static final LicenseType CloudPayAsYouGoTrial = new LicenseType("jetbrains-ai.enterprise.cloud-pay-as-you-go.trial"); @NotNull public final LicenseType getCloudPayAsYouGoTrial() { return CloudPayAsYouGoTrial; } @NotNull
/*    */   private static final List<LicenseType> all; @NotNull
/* 78 */   public final List<LicenseType> getAll() { return all; } static {
/* 79 */     LicenseType[] arrayOfLicenseType = new LicenseType[6]; arrayOfLicenseType[0] = Prepaid; arrayOfLicenseType[1] = 
/* 80 */       PrepaidTrial;
/* 81 */     arrayOfLicenseType[2] = PayAsYouGo;
/* 82 */     arrayOfLicenseType[3] = PayAsYouGoTrial;
/* 83 */     arrayOfLicenseType[4] = CloudPayAsYouGo;
/* 84 */     arrayOfLicenseType[5] = CloudPayAsYouGoTrial;
/*    */     all = CollectionsKt.listOf((Object[])arrayOfLicenseType);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\LicenseType$IdeServices.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */