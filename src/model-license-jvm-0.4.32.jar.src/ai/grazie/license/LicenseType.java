/*     */ package ai.grazie.license;
/*     */ @Serializable(with = LicenseType.Serializer.class)
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\023\b\b\030\000 \0272\0020\001:\t\027\030\031\032\033\034\035\036\037B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\006\020\016\032\0020\nJ\006\020\017\032\0020\nJ\006\020\020\032\0020\nJ\006\020\021\032\0020\nJ\006\020\022\032\0020\nJ\006\020\023\032\0020\nJ\006\020\024\032\0020\nJ\006\020\025\032\0020\nJ\t\020\026\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006 "}, d2 = {"Lai/grazie/license/LicenseType;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "isAIL", "isAIP", "isAIPUltimate", "isFreeTier", "isGZL", "isOrganizational", "isRiderNext", "isTrial", "toString", "Companion", "CustomApplication", "Datalore", "Grazie", "IdeServices", "JetBrainsAI", "LicenseServer", "Serializer", "YouTrack", "model-license"})
/*     */ public final class LicenseType {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String id;
/*     */   
/*  10 */   public LicenseType(@NotNull String id) { this.id = id; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/LicenseType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/LicenseType;", "model-license"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LicenseType> serializer() { return (KSerializer<LicenseType>)LicenseType.Serializer.INSTANCE; } } @NotNull public final String getId() { return this.id; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/license/LicenseType$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/license/LicenseType;", "()V", "model-license"}) public static final class Serializer extends StringValueClassSerializer<LicenseType> { @NotNull
/*  11 */     public static final Serializer INSTANCE = new Serializer(); private Serializer() { super("LicenseType", null.INSTANCE, null.INSTANCE); }
/*     */      } public final boolean isAIL() {
/*  13 */     LicenseType[] arrayOfLicenseType = new LicenseType[2]; arrayOfLicenseType[0] = JetBrainsAI.Individual.INSTANCE.getLite(); arrayOfLicenseType[1] = JetBrainsAI.Organizational.INSTANCE.getLite(); return CollectionsKt.listOf((Object[])arrayOfLicenseType).contains(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isAIP() {
/*  18 */     LicenseType[] arrayOfLicenseType = new LicenseType[2]; arrayOfLicenseType[0] = JetBrainsAI.Individual.INSTANCE.getPro(); arrayOfLicenseType[1] = JetBrainsAI.Organizational.INSTANCE.getPro(); return CollectionsKt.listOf((Object[])arrayOfLicenseType).contains(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isAIPUltimate() {
/*  23 */     LicenseType[] arrayOfLicenseType = new LicenseType[2]; arrayOfLicenseType[0] = JetBrainsAI.Individual.INSTANCE.getUltimate(); arrayOfLicenseType[1] = JetBrainsAI.Organizational.INSTANCE.getUltimate(); return CollectionsKt.listOf((Object[])arrayOfLicenseType).contains(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isFreeTier() {
/*  28 */     LicenseType[] arrayOfLicenseType = new LicenseType[2]; arrayOfLicenseType[0] = JetBrainsAI.Individual.INSTANCE.getFreeTier(); arrayOfLicenseType[1] = JetBrainsAI.Organizational.INSTANCE.getFreeTier(); return CollectionsKt.listOf((Object[])arrayOfLicenseType).contains(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isRiderNext() {
/*  33 */     LicenseType[] arrayOfLicenseType = new LicenseType[2]; arrayOfLicenseType[0] = JetBrainsAI.Individual.INSTANCE.getRiderNext(); arrayOfLicenseType[1] = JetBrainsAI.Organizational.INSTANCE.getRiderNext(); return CollectionsKt.listOf((Object[])arrayOfLicenseType).contains(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean isOrganizational() {
/*  39 */     LicenseType[] arrayOfLicenseType = new LicenseType[5]; arrayOfLicenseType[0] = JetBrainsAI.Organizational.INSTANCE.getLite(); arrayOfLicenseType[1] = 
/*  40 */       JetBrainsAI.Organizational.INSTANCE.getPro();
/*  41 */     arrayOfLicenseType[2] = JetBrainsAI.Organizational.INSTANCE.getTrial();
/*  42 */     arrayOfLicenseType[3] = JetBrainsAI.Organizational.INSTANCE.getRiderNext();
/*  43 */     arrayOfLicenseType[4] = JetBrainsAI.Organizational.INSTANCE.getRiderNextTrial();
/*     */     return CollectionsKt.listOf((Object[])arrayOfLicenseType).contains(this);
/*     */   }
/*     */   public final boolean isGZL() {
/*  47 */     LicenseType[] arrayOfLicenseType = new LicenseType[3]; arrayOfLicenseType[0] = Grazie.Individual.INSTANCE.getLite(); arrayOfLicenseType[1] = 
/*  48 */       JetBrainsAI.Individual.INSTANCE.getPro();
/*  49 */     arrayOfLicenseType[2] = JetBrainsAI.Organizational.INSTANCE.getPro();
/*     */     return CollectionsKt.listOf((Object[])arrayOfLicenseType).contains(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean isTrial() {
/*  56 */     LicenseType[] arrayOfLicenseType = new LicenseType[7]; arrayOfLicenseType[0] = JetBrainsAI.Individual.INSTANCE.getTrial(); arrayOfLicenseType[1] = 
/*  57 */       JetBrainsAI.Organizational.INSTANCE.getTrial();
/*  58 */     arrayOfLicenseType[2] = JetBrainsAI.Individual.INSTANCE.getRiderNextTrial();
/*  59 */     arrayOfLicenseType[3] = JetBrainsAI.Organizational.INSTANCE.getRiderNextTrial();
/*     */     
/*  61 */     arrayOfLicenseType[4] = IdeServices.INSTANCE.getPrepaidTrial();
/*  62 */     arrayOfLicenseType[5] = IdeServices.INSTANCE.getPayAsYouGoTrial();
/*  63 */     arrayOfLicenseType[6] = IdeServices.INSTANCE.getCloudPayAsYouGoTrial(); return CollectionsKt.listOf((Object[])arrayOfLicenseType).contains(this);
/*     */   }
/*     */   @NotNull public final String component1() { return this.id; } @NotNull public final LicenseType copy(@NotNull String id) { Intrinsics.checkNotNullParameter(id, "id"); return new LicenseType(id); } @NotNull public String toString() { return "LicenseType(id=" + this.id + ")"; } public int hashCode() { return this.id.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof LicenseType)) return false;  LicenseType licenseType = (LicenseType)other; return !!Intrinsics.areEqual(this.id, licenseType.id); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/license/LicenseType$YouTrack;", "", "()V", "Standard", "Lai/grazie/license/LicenseType;", "getStandard", "()Lai/grazie/license/LicenseType;", "model-license"}) public static final class YouTrack
/*     */   {
/*  67 */     @NotNull public static final YouTrack INSTANCE = new YouTrack(); @NotNull private static final LicenseType Standard = new LicenseType("jetbrains-ai.youtrack.standard"); @NotNull public final LicenseType getStandard() { return Standard; }
/*     */      }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\r\n\002\020 \n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\027\020\021\032\b\022\004\022\0020\0040\022¢\006\b\n\000\032\004\b\023\020\024¨\006\025"}, d2 = {"Lai/grazie/license/LicenseType$IdeServices;", "", "()V", "CloudPayAsYouGo", "Lai/grazie/license/LicenseType;", "getCloudPayAsYouGo", "()Lai/grazie/license/LicenseType;", "CloudPayAsYouGoTrial", "getCloudPayAsYouGoTrial", "PayAsYouGo", "getPayAsYouGo", "PayAsYouGoTrial", "getPayAsYouGoTrial", "Prepaid", "getPrepaid", "PrepaidTrial", "getPrepaidTrial", "all", "", "getAll", "()Ljava/util/List;", "model-license"})
/*     */   public static final class IdeServices { @NotNull
/*  71 */     public static final IdeServices INSTANCE = new IdeServices(); @NotNull private static final LicenseType Prepaid = new LicenseType("jetbrains-ai.enterprise.prepaid"); @NotNull public final LicenseType getPrepaid() { return Prepaid; } @NotNull
/*  72 */     private static final LicenseType PrepaidTrial = new LicenseType("jetbrains-ai.enterprise.prepaid.trial"); @NotNull public final LicenseType getPrepaidTrial() { return PrepaidTrial; } @NotNull
/*  73 */     private static final LicenseType PayAsYouGo = new LicenseType("jetbrains-ai.enterprise.pay-as-you-go"); @NotNull public final LicenseType getPayAsYouGo() { return PayAsYouGo; } @NotNull
/*  74 */     private static final LicenseType PayAsYouGoTrial = new LicenseType("jetbrains-ai.enterprise.pay-as-you-go.trial"); @NotNull public final LicenseType getPayAsYouGoTrial() { return PayAsYouGoTrial; } @NotNull
/*  75 */     private static final LicenseType CloudPayAsYouGo = new LicenseType("jetbrains-ai.enterprise.cloud-pay-as-you-go"); @NotNull public final LicenseType getCloudPayAsYouGo() { return CloudPayAsYouGo; } @NotNull
/*  76 */     private static final LicenseType CloudPayAsYouGoTrial = new LicenseType("jetbrains-ai.enterprise.cloud-pay-as-you-go.trial"); @NotNull private static final List<LicenseType> all; @NotNull public final LicenseType getCloudPayAsYouGoTrial() { return CloudPayAsYouGoTrial; }
/*     */     @NotNull
/*  78 */     public final List<LicenseType> getAll() { return all; } static {
/*  79 */       LicenseType[] arrayOfLicenseType = new LicenseType[6]; arrayOfLicenseType[0] = Prepaid; arrayOfLicenseType[1] = 
/*  80 */         PrepaidTrial;
/*  81 */       arrayOfLicenseType[2] = PayAsYouGo;
/*  82 */       arrayOfLicenseType[3] = PayAsYouGoTrial;
/*  83 */       arrayOfLicenseType[4] = CloudPayAsYouGo;
/*  84 */       arrayOfLicenseType[5] = CloudPayAsYouGoTrial;
/*     */       all = CollectionsKt.listOf((Object[])arrayOfLicenseType);
/*     */     } }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/license/LicenseType$CustomApplication;", "", "()V", "Standard", "Lai/grazie/license/LicenseType;", "getStandard", "()Lai/grazie/license/LicenseType;", "model-license"})
/*     */   public static final class CustomApplication { @NotNull
/*  89 */     public static final CustomApplication INSTANCE = new CustomApplication(); @NotNull private static final LicenseType Standard = new LicenseType("jetbrains-ai.application.standard"); @NotNull public final LicenseType getStandard() { return Standard; }
/*     */      }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/license/LicenseType$Datalore;", "", "()V", "Standard", "Lai/grazie/license/LicenseType;", "getStandard", "()Lai/grazie/license/LicenseType;", "model-license"})
/*     */   public static final class Datalore { @NotNull
/*  93 */     public static final Datalore INSTANCE = new Datalore(); @NotNull private static final LicenseType Standard = new LicenseType("jetbrains-ai.datalore.standard"); @NotNull public final LicenseType getStandard() { return Standard; }
/*     */      }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/license/LicenseType$LicenseServer;", "", "()V", "Standard", "Lai/grazie/license/LicenseType;", "getStandard", "()Lai/grazie/license/LicenseType;", "model-license"})
/*     */   public static final class LicenseServer { @NotNull
/*  97 */     public static final LicenseServer INSTANCE = new LicenseServer(); @NotNull private static final LicenseType Standard = new LicenseType("jetbrains-ai.ls.standard"); @NotNull public final LicenseType getStandard() { return Standard; }
/*     */      }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001:\002\b\tB\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\n"}, d2 = {"Lai/grazie/license/LicenseType$JetBrainsAI;", "", "()V", "all", "", "Lai/grazie/license/LicenseType;", "getAll", "()Ljava/util/List;", "Individual", "Organizational", "model-license"})
/*     */   public static final class JetBrainsAI { @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\024\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\034\020\013\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\f\020\002\032\004\b\r\020\006R\021\020\016\032\0020\004¢\006\b\n\000\032\004\b\017\020\006R\021\020\020\032\0020\004¢\006\b\n\000\032\004\b\021\020\006R\021\020\022\032\0020\004¢\006\b\n\000\032\004\b\023\020\006R\021\020\024\032\0020\004¢\006\b\n\000\032\004\b\025\020\006R\021\020\026\032\0020\004¢\006\b\n\000\032\004\b\027\020\006¨\006\030"}, d2 = {"Lai/grazie/license/LicenseType$JetBrainsAI$Individual;", "", "()V", "EAP", "Lai/grazie/license/LicenseType;", "getEAP", "()Lai/grazie/license/LicenseType;", "EAP_BUILD", "getEAP_BUILD", "FreeTier", "getFreeTier", "Lite", "getLite$annotations", "getLite", "Pro", "getPro", "RiderNext", "getRiderNext", "RiderNextTrial", "getRiderNextTrial", "Trial", "getTrial", "Ultimate", "getUltimate", "model-license"})
/*     */     public static final class Individual { @NotNull
/* 102 */       public static final Individual INSTANCE = new Individual(); @NotNull private static final LicenseType EAP = new LicenseType("jetbrains-ai.individual.eap"); @NotNull public final LicenseType getEAP() { return EAP; }
/*     */        @NotNull
/* 104 */       private static final LicenseType Lite = new LicenseType("jetbrains-ai.individual.lite"); @NotNull public final LicenseType getLite() { return Lite; } @NotNull
/* 105 */       private static final LicenseType Pro = new LicenseType("jetbrains-ai.individual.pro"); @NotNull public final LicenseType getPro() { return Pro; } @NotNull
/* 106 */       private static final LicenseType Trial = new LicenseType("jetbrains-ai.individual.trial"); @NotNull public final LicenseType getTrial() { return Trial; } @NotNull
/* 107 */       private static final LicenseType EAP_BUILD = new LicenseType("jetbrains-ai.individual.eap-build"); @NotNull public final LicenseType getEAP_BUILD() { return EAP_BUILD; } @NotNull
/* 108 */       private static final LicenseType FreeTier = new LicenseType("jetbrains-ai.individual.free-tier"); @NotNull public final LicenseType getFreeTier() { return FreeTier; }
/*     */        @NotNull
/* 110 */       private static final LicenseType RiderNext = new LicenseType("jetbrains-ai.individual.rider-next"); @NotNull public final LicenseType getRiderNext() { return RiderNext; } @NotNull
/* 111 */       private static final LicenseType RiderNextTrial = new LicenseType("jetbrains-ai.individual.rider-next.trial"); @NotNull public final LicenseType getRiderNextTrial() { return RiderNextTrial; } @NotNull
/* 112 */       private static final LicenseType Ultimate = new LicenseType("jetbrains-ai.individual.ultimate"); @NotNull public final LicenseType getUltimate() { return Ultimate; }
/*     */        }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\020\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\034\020\007\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\b\020\002\032\004\b\t\020\006R\021\020\n\032\0020\004¢\006\b\n\000\032\004\b\013\020\006R\021\020\f\032\0020\004¢\006\b\n\000\032\004\b\r\020\006R\021\020\016\032\0020\004¢\006\b\n\000\032\004\b\017\020\006R\021\020\020\032\0020\004¢\006\b\n\000\032\004\b\021\020\006R\021\020\022\032\0020\004¢\006\b\n\000\032\004\b\023\020\006¨\006\024"}, d2 = {"Lai/grazie/license/LicenseType$JetBrainsAI$Organizational;", "", "()V", "FreeTier", "Lai/grazie/license/LicenseType;", "getFreeTier", "()Lai/grazie/license/LicenseType;", "Lite", "getLite$annotations", "getLite", "Pro", "getPro", "RiderNext", "getRiderNext", "RiderNextTrial", "getRiderNextTrial", "Trial", "getTrial", "Ultimate", "getUltimate", "model-license"})
/*     */     public static final class Organizational { @NotNull
/* 117 */       public static final Organizational INSTANCE = new Organizational(); @NotNull private static final LicenseType Lite = new LicenseType("jetbrains-ai.organizational.lite"); @NotNull public final LicenseType getLite() { return Lite; } @NotNull
/* 118 */       private static final LicenseType Pro = new LicenseType("jetbrains-ai.organizational.pro"); @NotNull public final LicenseType getPro() { return Pro; } @NotNull
/* 119 */       private static final LicenseType Trial = new LicenseType("jetbrains-ai.organizational.trial"); @NotNull public final LicenseType getTrial() { return Trial; } @NotNull
/* 120 */       private static final LicenseType FreeTier = new LicenseType("jetbrains-ai.organizational.free-tier"); @NotNull public final LicenseType getFreeTier() { return FreeTier; }
/*     */        @NotNull
/* 122 */       private static final LicenseType RiderNext = new LicenseType("jetbrains-ai.organizational.rider-next"); @NotNull public final LicenseType getRiderNext() { return RiderNext; } @NotNull
/* 123 */       private static final LicenseType RiderNextTrial = new LicenseType("jetbrains-ai.organizational.rider-next.trial"); @NotNull public final LicenseType getRiderNextTrial() { return RiderNextTrial; } @NotNull
/* 124 */       private static final LicenseType Ultimate = new LicenseType("jetbrains-ai.organizational.ultimate"); @NotNull public final LicenseType getUltimate() { return Ultimate; }
/*     */        }
/*     */     @NotNull
/* 127 */     public static final JetBrainsAI INSTANCE = new JetBrainsAI(); @NotNull private static final List<LicenseType> all; @NotNull public final List<LicenseType> getAll() { return all; }
/* 128 */     static { LicenseType[] arrayOfLicenseType = new LicenseType[16]; arrayOfLicenseType[0] = Individual.INSTANCE.getEAP(); arrayOfLicenseType[1] = 
/* 129 */         Individual.INSTANCE.getLite();
/* 130 */       arrayOfLicenseType[2] = Individual.INSTANCE.getPro();
/* 131 */       arrayOfLicenseType[3] = Individual.INSTANCE.getFreeTier();
/* 132 */       arrayOfLicenseType[4] = Individual.INSTANCE.getTrial();
/* 133 */       arrayOfLicenseType[5] = Individual.INSTANCE.getEAP_BUILD();
/* 134 */       arrayOfLicenseType[6] = Individual.INSTANCE.getUltimate();
/* 135 */       arrayOfLicenseType[7] = Individual.INSTANCE.getRiderNext();
/* 136 */       arrayOfLicenseType[8] = Individual.INSTANCE.getRiderNextTrial();
/* 137 */       arrayOfLicenseType[9] = Organizational.INSTANCE.getLite();
/* 138 */       arrayOfLicenseType[10] = Organizational.INSTANCE.getPro();
/* 139 */       arrayOfLicenseType[11] = Organizational.INSTANCE.getTrial();
/* 140 */       arrayOfLicenseType[12] = Organizational.INSTANCE.getFreeTier();
/* 141 */       arrayOfLicenseType[13] = Organizational.INSTANCE.getUltimate();
/* 142 */       arrayOfLicenseType[14] = Organizational.INSTANCE.getRiderNext();
/* 143 */       arrayOfLicenseType[15] = Organizational.INSTANCE.getRiderNextTrial(); all = CollectionsKt.listOf((Object[])arrayOfLicenseType); } }
/*     */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\024\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\034\020\013\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\f\020\002\032\004\b\r\020\006R\021\020\016\032\0020\004¢\006\b\n\000\032\004\b\017\020\006R\021\020\020\032\0020\004¢\006\b\n\000\032\004\b\021\020\006R\021\020\022\032\0020\004¢\006\b\n\000\032\004\b\023\020\006R\021\020\024\032\0020\004¢\006\b\n\000\032\004\b\025\020\006R\021\020\026\032\0020\004¢\006\b\n\000\032\004\b\027\020\006¨\006\030"}, d2 = {"Lai/grazie/license/LicenseType$JetBrainsAI$Individual;", "", "()V", "EAP", "Lai/grazie/license/LicenseType;", "getEAP", "()Lai/grazie/license/LicenseType;", "EAP_BUILD", "getEAP_BUILD", "FreeTier", "getFreeTier", "Lite", "getLite$annotations", "getLite", "Pro", "getPro", "RiderNext", "getRiderNext", "RiderNextTrial", "getRiderNextTrial", "Trial", "getTrial", "Ultimate", "getUltimate", "model-license"}) public static final class Individual {
/*     */     @NotNull public static final Individual INSTANCE = new Individual(); @NotNull private static final LicenseType EAP = new LicenseType("jetbrains-ai.individual.eap"); @NotNull public final LicenseType getEAP() { return EAP; } @NotNull private static final LicenseType Lite = new LicenseType("jetbrains-ai.individual.lite"); @NotNull public final LicenseType getLite() { return Lite; } @NotNull private static final LicenseType Pro = new LicenseType("jetbrains-ai.individual.pro"); @NotNull public final LicenseType getPro() { return Pro; } @NotNull private static final LicenseType Trial = new LicenseType("jetbrains-ai.individual.trial"); @NotNull public final LicenseType getTrial() { return Trial; } @NotNull private static final LicenseType EAP_BUILD = new LicenseType("jetbrains-ai.individual.eap-build"); @NotNull public final LicenseType getEAP_BUILD() { return EAP_BUILD; } @NotNull private static final LicenseType FreeTier = new LicenseType("jetbrains-ai.individual.free-tier"); @NotNull public final LicenseType getFreeTier() { return FreeTier; } @NotNull private static final LicenseType RiderNext = new LicenseType("jetbrains-ai.individual.rider-next"); @NotNull public final LicenseType getRiderNext() { return RiderNext; } @NotNull private static final LicenseType RiderNextTrial = new LicenseType("jetbrains-ai.individual.rider-next.trial"); @NotNull public final LicenseType getRiderNextTrial() { return RiderNextTrial; } @NotNull private static final LicenseType Ultimate = new LicenseType("jetbrains-ai.individual.ultimate"); @NotNull public final LicenseType getUltimate() { return Ultimate; }
/*     */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\020\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\034\020\007\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\b\020\002\032\004\b\t\020\006R\021\020\n\032\0020\004¢\006\b\n\000\032\004\b\013\020\006R\021\020\f\032\0020\004¢\006\b\n\000\032\004\b\r\020\006R\021\020\016\032\0020\004¢\006\b\n\000\032\004\b\017\020\006R\021\020\020\032\0020\004¢\006\b\n\000\032\004\b\021\020\006R\021\020\022\032\0020\004¢\006\b\n\000\032\004\b\023\020\006¨\006\024"}, d2 = {"Lai/grazie/license/LicenseType$JetBrainsAI$Organizational;", "", "()V", "FreeTier", "Lai/grazie/license/LicenseType;", "getFreeTier", "()Lai/grazie/license/LicenseType;", "Lite", "getLite$annotations", "getLite", "Pro", "getPro", "RiderNext", "getRiderNext", "RiderNextTrial", "getRiderNextTrial", "Trial", "getTrial", "Ultimate", "getUltimate", "model-license"}) public static final class Organizational {
/*     */     @NotNull public static final Organizational INSTANCE = new Organizational(); @NotNull private static final LicenseType Lite = new LicenseType("jetbrains-ai.organizational.lite"); @NotNull public final LicenseType getLite() { return Lite; } @NotNull private static final LicenseType Pro = new LicenseType("jetbrains-ai.organizational.pro"); @NotNull public final LicenseType getPro() { return Pro; } @NotNull private static final LicenseType Trial = new LicenseType("jetbrains-ai.organizational.trial"); @NotNull public final LicenseType getTrial() { return Trial; } @NotNull private static final LicenseType FreeTier = new LicenseType("jetbrains-ai.organizational.free-tier"); @NotNull public final LicenseType getFreeTier() { return FreeTier; } @NotNull private static final LicenseType RiderNext = new LicenseType("jetbrains-ai.organizational.rider-next"); @NotNull public final LicenseType getRiderNext() { return RiderNext; } @NotNull private static final LicenseType RiderNextTrial = new LicenseType("jetbrains-ai.organizational.rider-next.trial"); @NotNull public final LicenseType getRiderNextTrial() { return RiderNextTrial; } @NotNull private static final LicenseType Ultimate = new LicenseType("jetbrains-ai.organizational.ultimate"); @NotNull public final LicenseType getUltimate() { return Ultimate; }
/*     */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\004\bÆ\002\030\0002\0020\001:\001\bB\007\b\002¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\t"}, d2 = {"Lai/grazie/license/LicenseType$Grazie;", "", "()V", "all", "", "Lai/grazie/license/LicenseType;", "getAll", "()Ljava/util/List;", "Individual", "model-license"}) public static final class Grazie { @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/license/LicenseType$Grazie$Individual;", "", "()V", "Lite", "Lai/grazie/license/LicenseType;", "getLite", "()Lai/grazie/license/LicenseType;", "model-license"}) public static final class Individual {
/* 149 */       @NotNull public static final Individual INSTANCE = new Individual(); @NotNull private static final LicenseType Lite = new LicenseType("grazie.individual.lite"); @NotNull public final LicenseType getLite() { return Lite; }
/*     */        }
/*     */     @NotNull
/* 152 */     public static final Grazie INSTANCE = new Grazie(); @NotNull private static final List<LicenseType> all = CollectionsKt.listOf(
/* 153 */         Individual.INSTANCE.getLite());
/*     */     
/*     */     @NotNull
/*     */     public final List<LicenseType> getAll() {
/*     */       return all;
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/license/LicenseType$Grazie$Individual;", "", "()V", "Lite", "Lai/grazie/license/LicenseType;", "getLite", "()Lai/grazie/license/LicenseType;", "model-license"})
/*     */   public static final class Individual {
/*     */     @NotNull
/*     */     public static final Individual INSTANCE = new Individual();
/*     */     @NotNull
/*     */     private static final LicenseType Lite = new LicenseType("grazie.individual.lite");
/*     */     
/*     */     @NotNull
/*     */     public final LicenseType getLite() {
/*     */       return Lite;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\LicenseType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */