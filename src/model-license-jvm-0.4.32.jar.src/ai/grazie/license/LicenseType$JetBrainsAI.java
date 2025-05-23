/*     */ package ai.grazie.license;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001:\002\b\tB\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\n"}, d2 = {"Lai/grazie/license/LicenseType$JetBrainsAI;", "", "()V", "all", "", "Lai/grazie/license/LicenseType;", "getAll", "()Ljava/util/List;", "Individual", "Organizational", "model-license"})
/*     */ public final class JetBrainsAI
/*     */ {
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\024\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\034\020\013\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\f\020\002\032\004\b\r\020\006R\021\020\016\032\0020\004¢\006\b\n\000\032\004\b\017\020\006R\021\020\020\032\0020\004¢\006\b\n\000\032\004\b\021\020\006R\021\020\022\032\0020\004¢\006\b\n\000\032\004\b\023\020\006R\021\020\024\032\0020\004¢\006\b\n\000\032\004\b\025\020\006R\021\020\026\032\0020\004¢\006\b\n\000\032\004\b\027\020\006¨\006\030"}, d2 = {"Lai/grazie/license/LicenseType$JetBrainsAI$Individual;", "", "()V", "EAP", "Lai/grazie/license/LicenseType;", "getEAP", "()Lai/grazie/license/LicenseType;", "EAP_BUILD", "getEAP_BUILD", "FreeTier", "getFreeTier", "Lite", "getLite$annotations", "getLite", "Pro", "getPro", "RiderNext", "getRiderNext", "RiderNextTrial", "getRiderNextTrial", "Trial", "getTrial", "Ultimate", "getUltimate", "model-license"})
/*     */   public static final class Individual
/*     */   {
/*     */     @NotNull
/* 102 */     public static final Individual INSTANCE = new Individual(); @NotNull private static final LicenseType EAP = new LicenseType("jetbrains-ai.individual.eap"); @NotNull public final LicenseType getEAP() { return EAP; }
/*     */      @NotNull
/* 104 */     private static final LicenseType Lite = new LicenseType("jetbrains-ai.individual.lite"); @NotNull public final LicenseType getLite() { return Lite; } @NotNull
/* 105 */     private static final LicenseType Pro = new LicenseType("jetbrains-ai.individual.pro"); @NotNull public final LicenseType getPro() { return Pro; } @NotNull
/* 106 */     private static final LicenseType Trial = new LicenseType("jetbrains-ai.individual.trial"); @NotNull public final LicenseType getTrial() { return Trial; } @NotNull
/* 107 */     private static final LicenseType EAP_BUILD = new LicenseType("jetbrains-ai.individual.eap-build"); @NotNull public final LicenseType getEAP_BUILD() { return EAP_BUILD; } @NotNull
/* 108 */     private static final LicenseType FreeTier = new LicenseType("jetbrains-ai.individual.free-tier"); @NotNull public final LicenseType getFreeTier() { return FreeTier; }
/*     */      @NotNull
/* 110 */     private static final LicenseType RiderNext = new LicenseType("jetbrains-ai.individual.rider-next"); @NotNull public final LicenseType getRiderNext() { return RiderNext; } @NotNull
/* 111 */     private static final LicenseType RiderNextTrial = new LicenseType("jetbrains-ai.individual.rider-next.trial"); @NotNull public final LicenseType getRiderNextTrial() { return RiderNextTrial; } @NotNull
/* 112 */     private static final LicenseType Ultimate = new LicenseType("jetbrains-ai.individual.ultimate"); @NotNull public final LicenseType getUltimate() { return Ultimate; }
/*     */      }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\020\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\034\020\007\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\b\020\002\032\004\b\t\020\006R\021\020\n\032\0020\004¢\006\b\n\000\032\004\b\013\020\006R\021\020\f\032\0020\004¢\006\b\n\000\032\004\b\r\020\006R\021\020\016\032\0020\004¢\006\b\n\000\032\004\b\017\020\006R\021\020\020\032\0020\004¢\006\b\n\000\032\004\b\021\020\006R\021\020\022\032\0020\004¢\006\b\n\000\032\004\b\023\020\006¨\006\024"}, d2 = {"Lai/grazie/license/LicenseType$JetBrainsAI$Organizational;", "", "()V", "FreeTier", "Lai/grazie/license/LicenseType;", "getFreeTier", "()Lai/grazie/license/LicenseType;", "Lite", "getLite$annotations", "getLite", "Pro", "getPro", "RiderNext", "getRiderNext", "RiderNextTrial", "getRiderNextTrial", "Trial", "getTrial", "Ultimate", "getUltimate", "model-license"})
/*     */   public static final class Organizational { @NotNull
/* 117 */     public static final Organizational INSTANCE = new Organizational(); @NotNull private static final LicenseType Lite = new LicenseType("jetbrains-ai.organizational.lite"); @NotNull public final LicenseType getLite() { return Lite; } @NotNull
/* 118 */     private static final LicenseType Pro = new LicenseType("jetbrains-ai.organizational.pro"); @NotNull public final LicenseType getPro() { return Pro; } @NotNull
/* 119 */     private static final LicenseType Trial = new LicenseType("jetbrains-ai.organizational.trial"); @NotNull public final LicenseType getTrial() { return Trial; } @NotNull
/* 120 */     private static final LicenseType FreeTier = new LicenseType("jetbrains-ai.organizational.free-tier"); @NotNull public final LicenseType getFreeTier() { return FreeTier; }
/*     */      @NotNull
/* 122 */     private static final LicenseType RiderNext = new LicenseType("jetbrains-ai.organizational.rider-next"); @NotNull public final LicenseType getRiderNext() { return RiderNext; } @NotNull
/* 123 */     private static final LicenseType RiderNextTrial = new LicenseType("jetbrains-ai.organizational.rider-next.trial"); @NotNull public final LicenseType getRiderNextTrial() { return RiderNextTrial; } @NotNull
/* 124 */     private static final LicenseType Ultimate = new LicenseType("jetbrains-ai.organizational.ultimate"); @NotNull public final LicenseType getUltimate() { return Ultimate; }
/*     */      } @NotNull
/*     */   private static final List<LicenseType> all; @NotNull
/* 127 */   public static final JetBrainsAI INSTANCE = new JetBrainsAI(); @NotNull public final List<LicenseType> getAll() { return all; } static {
/* 128 */     LicenseType[] arrayOfLicenseType = new LicenseType[16]; arrayOfLicenseType[0] = Individual.INSTANCE.getEAP(); arrayOfLicenseType[1] = 
/* 129 */       Individual.INSTANCE.getLite();
/* 130 */     arrayOfLicenseType[2] = Individual.INSTANCE.getPro();
/* 131 */     arrayOfLicenseType[3] = Individual.INSTANCE.getFreeTier();
/* 132 */     arrayOfLicenseType[4] = Individual.INSTANCE.getTrial();
/* 133 */     arrayOfLicenseType[5] = Individual.INSTANCE.getEAP_BUILD();
/* 134 */     arrayOfLicenseType[6] = Individual.INSTANCE.getUltimate();
/* 135 */     arrayOfLicenseType[7] = Individual.INSTANCE.getRiderNext();
/* 136 */     arrayOfLicenseType[8] = Individual.INSTANCE.getRiderNextTrial();
/* 137 */     arrayOfLicenseType[9] = Organizational.INSTANCE.getLite();
/* 138 */     arrayOfLicenseType[10] = Organizational.INSTANCE.getPro();
/* 139 */     arrayOfLicenseType[11] = Organizational.INSTANCE.getTrial();
/* 140 */     arrayOfLicenseType[12] = Organizational.INSTANCE.getFreeTier();
/* 141 */     arrayOfLicenseType[13] = Organizational.INSTANCE.getUltimate();
/* 142 */     arrayOfLicenseType[14] = Organizational.INSTANCE.getRiderNext();
/* 143 */     arrayOfLicenseType[15] = Organizational.INSTANCE.getRiderNextTrial();
/*     */     all = CollectionsKt.listOf((Object[])arrayOfLicenseType);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\LicenseType$JetBrainsAI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */