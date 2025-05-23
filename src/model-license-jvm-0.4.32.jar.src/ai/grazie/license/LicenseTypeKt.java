/*     */ package ai.grazie.license;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020$\n\002\030\002\n\002\020 \n\000\n\002\020\013\n\002\030\002\n\002\b\003\032\032\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\0022\006\020\b\032\0020\002\" \020\000\032\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0020\0030\001X\004¢\006\002\n\000¨\006\t"}, d2 = {"allowedUpgrades", "", "Lai/grazie/license/LicenseType;", "", "isUpgradeAllowed", "", "Lai/grazie/license/LicenseType$Companion;", "fromType", "toType", "model-license"})
/*     */ public final class LicenseTypeKt
/*     */ {
/*     */   @NotNull
/*     */   private static final Map<LicenseType, List<LicenseType>> allowedUpgrades;
/*     */   
/*     */   public static final boolean isUpgradeAllowed(@NotNull LicenseType.Companion $this$isUpgradeAllowed, @NotNull LicenseType fromType, @NotNull LicenseType toType) {
/*     */     List allowedTypes;
/* 160 */     Intrinsics.checkNotNullParameter($this$isUpgradeAllowed, "<this>"); Intrinsics.checkNotNullParameter(fromType, "fromType"); Intrinsics.checkNotNullParameter(toType, "toType"); if ((List)allowedUpgrades.get(fromType) == null) { (List)allowedUpgrades.get(fromType); return false; }
/* 161 */      return allowedTypes.contains(toType);
/*     */   }
/*     */   
/*     */   static {
/* 165 */     Pair[] arrayOfPair = new Pair[18]; LicenseType[] arrayOfLicenseType = new LicenseType[3]; arrayOfLicenseType[0] = LicenseType.JetBrainsAI.Individual.INSTANCE.getPro(); arrayOfLicenseType[1] = LicenseType.JetBrainsAI.Individual.INSTANCE.getUltimate(); arrayOfLicenseType[2] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getTrial(); arrayOfPair[0] = TuplesKt.to(LicenseType.JetBrainsAI.Individual.INSTANCE.getTrial(), CollectionsKt.listOf((Object[])arrayOfLicenseType)); arrayOfPair[1] = 
/* 166 */       TuplesKt.to(LicenseType.JetBrainsAI.Individual.INSTANCE.getLite(), CollectionsKt.listOf(LicenseType.JetBrainsAI.Organizational.INSTANCE.getLite()));
/* 167 */     arrayOfLicenseType = new LicenseType[3]; arrayOfLicenseType[0] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getPro(); arrayOfLicenseType[1] = LicenseType.JetBrainsAI.Individual.INSTANCE.getTrial(); arrayOfLicenseType[2] = LicenseType.JetBrainsAI.Individual.INSTANCE.getUltimate(); arrayOfPair[2] = TuplesKt.to(LicenseType.JetBrainsAI.Individual.INSTANCE.getPro(), CollectionsKt.listOf((Object[])arrayOfLicenseType));
/* 168 */     arrayOfLicenseType = new LicenseType[3]; arrayOfLicenseType[0] = LicenseType.JetBrainsAI.Individual.INSTANCE.getPro(); arrayOfLicenseType[1] = LicenseType.JetBrainsAI.Individual.INSTANCE.getTrial(); arrayOfLicenseType[2] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getUltimate(); arrayOfPair[3] = TuplesKt.to(LicenseType.JetBrainsAI.Individual.INSTANCE.getUltimate(), CollectionsKt.listOf((Object[])arrayOfLicenseType));
/*     */     
/* 170 */     arrayOfLicenseType = new LicenseType[2]; arrayOfLicenseType[0] = LicenseType.JetBrainsAI.Individual.INSTANCE.getRiderNextTrial(); arrayOfLicenseType[1] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getRiderNext(); arrayOfPair[4] = TuplesKt.to(LicenseType.JetBrainsAI.Individual.INSTANCE.getRiderNext(), CollectionsKt.listOf((Object[])arrayOfLicenseType));
/* 171 */     arrayOfLicenseType = new LicenseType[2]; arrayOfLicenseType[0] = LicenseType.JetBrainsAI.Individual.INSTANCE.getRiderNext(); arrayOfLicenseType[1] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getRiderNextTrial(); arrayOfPair[5] = TuplesKt.to(LicenseType.JetBrainsAI.Individual.INSTANCE.getRiderNextTrial(), CollectionsKt.listOf((Object[])arrayOfLicenseType));
/*     */     
/* 173 */     arrayOfLicenseType = new LicenseType[3]; arrayOfLicenseType[0] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getPro(); arrayOfLicenseType[1] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getUltimate(); arrayOfLicenseType[2] = LicenseType.JetBrainsAI.Individual.INSTANCE.getTrial(); arrayOfPair[6] = TuplesKt.to(LicenseType.JetBrainsAI.Organizational.INSTANCE.getTrial(), CollectionsKt.listOf((Object[])arrayOfLicenseType));
/* 174 */     arrayOfPair[7] = TuplesKt.to(LicenseType.JetBrainsAI.Organizational.INSTANCE.getLite(), CollectionsKt.listOf(LicenseType.JetBrainsAI.Individual.INSTANCE.getLite()));
/* 175 */     arrayOfLicenseType = new LicenseType[3]; arrayOfLicenseType[0] = LicenseType.JetBrainsAI.Individual.INSTANCE.getPro(); arrayOfLicenseType[1] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getTrial(); arrayOfLicenseType[2] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getUltimate(); arrayOfPair[8] = TuplesKt.to(LicenseType.JetBrainsAI.Organizational.INSTANCE.getPro(), CollectionsKt.listOf((Object[])arrayOfLicenseType));
/* 176 */     arrayOfLicenseType = new LicenseType[3]; arrayOfLicenseType[0] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getPro(); arrayOfLicenseType[1] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getTrial(); arrayOfLicenseType[2] = LicenseType.JetBrainsAI.Individual.INSTANCE.getUltimate(); arrayOfPair[9] = TuplesKt.to(LicenseType.JetBrainsAI.Organizational.INSTANCE.getUltimate(), CollectionsKt.listOf((Object[])arrayOfLicenseType));
/*     */     
/* 178 */     arrayOfLicenseType = new LicenseType[2]; arrayOfLicenseType[0] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getRiderNextTrial(); arrayOfLicenseType[1] = LicenseType.JetBrainsAI.Individual.INSTANCE.getRiderNext(); arrayOfPair[10] = TuplesKt.to(LicenseType.JetBrainsAI.Organizational.INSTANCE.getRiderNext(), CollectionsKt.listOf((Object[])arrayOfLicenseType));
/* 179 */     arrayOfLicenseType = new LicenseType[2]; arrayOfLicenseType[0] = LicenseType.JetBrainsAI.Organizational.INSTANCE.getRiderNext(); arrayOfLicenseType[1] = LicenseType.JetBrainsAI.Individual.INSTANCE.getRiderNextTrial(); arrayOfPair[11] = TuplesKt.to(LicenseType.JetBrainsAI.Organizational.INSTANCE.getRiderNextTrial(), CollectionsKt.listOf((Object[])arrayOfLicenseType));
/*     */ 
/*     */     
/* 182 */     arrayOfPair[12] = TuplesKt.to(LicenseType.IdeServices.INSTANCE.getPrepaid(), CollectionsKt.listOf(LicenseType.IdeServices.INSTANCE.getPrepaidTrial()));
/* 183 */     arrayOfPair[13] = TuplesKt.to(LicenseType.IdeServices.INSTANCE.getPrepaidTrial(), CollectionsKt.listOf(LicenseType.IdeServices.INSTANCE.getPrepaid()));
/*     */     
/* 185 */     arrayOfPair[14] = TuplesKt.to(LicenseType.IdeServices.INSTANCE.getPayAsYouGo(), CollectionsKt.listOf(LicenseType.IdeServices.INSTANCE.getPayAsYouGoTrial()));
/* 186 */     arrayOfPair[15] = TuplesKt.to(LicenseType.IdeServices.INSTANCE.getPayAsYouGoTrial(), CollectionsKt.listOf(LicenseType.IdeServices.INSTANCE.getPayAsYouGo()));
/*     */     
/* 188 */     arrayOfPair[16] = TuplesKt.to(LicenseType.IdeServices.INSTANCE.getCloudPayAsYouGo(), CollectionsKt.listOf(LicenseType.IdeServices.INSTANCE.getCloudPayAsYouGoTrial()));
/* 189 */     arrayOfPair[17] = TuplesKt.to(LicenseType.IdeServices.INSTANCE.getCloudPayAsYouGoTrial(), CollectionsKt.listOf(LicenseType.IdeServices.INSTANCE.getCloudPayAsYouGo()));
/*     */     allowedUpgrades = MapsKt.mapOf(arrayOfPair);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\LicenseTypeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */