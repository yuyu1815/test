/*     */ package feedback;
/*     */ 
/*     */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
/*     */ import com.intellij.openapi.application.ApplicationInfo;
/*     */ import com.intellij.openapi.util.registry.RegistryValue;
/*     */ import com.intellij.ui.LicensingFacade;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000`\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\t\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\000\n\002\020 \n\002\b\t\n\002\030\002\n\002\b\020\n\002\030\002\n\000\n\002\030\002\n\002\b\021\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 E2\0020\001:\002EFBy\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\003\022\b\020\t\032\004\030\0010\n\022\f\020\013\032\b\022\004\022\0020\0030\f\022\006\020\r\032\0020\003\022\006\020\016\032\0020\n\022\f\020\017\032\b\022\004\022\0020\0030\f\022\f\020\020\032\b\022\004\022\0020\0030\f\022\f\020\021\032\b\022\004\022\0020\0030\f¢\006\004\b\022\020\023B\001\b\020\022\006\020\024\032\0020\007\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n\022\016\020\013\032\n\022\004\022\0020\003\030\0010\f\022\b\020\r\032\004\030\0010\003\022\006\020\016\032\0020\n\022\016\020\017\032\n\022\004\022\0020\003\030\0010\f\022\016\020\020\032\n\022\004\022\0020\003\030\0010\f\022\016\020\021\032\n\022\004\022\0020\003\030\0010\f\022\b\020\025\032\004\030\0010\026¢\006\004\b\022\020\027J\006\020\037\032\0020\003J\006\020 \032\0020\003J\006\020!\032\0020\003J\006\020\"\032\0020\003J\006\020#\032\0020\003J\006\020$\032\0020\003J\006\020%\032\0020\003J\020\020&\032\0020'2\006\020(\032\0020)H\026J\b\020*\032\0020\003H\026J\t\020+\032\0020\003HÆ\003J\t\020,\032\0020\005HÂ\003J\t\020-\032\0020\007HÆ\003J\t\020.\032\0020\003HÆ\003J\020\020/\032\004\030\0010\nHÂ\003¢\006\002\0200J\017\0201\032\b\022\004\022\0020\0030\fHÂ\003J\t\0202\032\0020\003HÆ\003J\t\0203\032\0020\nHÂ\003J\017\0204\032\b\022\004\022\0020\0030\fHÂ\003J\017\0205\032\b\022\004\022\0020\0030\fHÂ\003J\017\0206\032\b\022\004\022\0020\0030\fHÂ\003J\001\0207\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0032\n\b\002\020\t\032\004\030\0010\n2\016\b\002\020\013\032\b\022\004\022\0020\0030\f2\b\b\002\020\r\032\0020\0032\b\b\002\020\016\032\0020\n2\016\b\002\020\017\032\b\022\004\022\0020\0030\f2\016\b\002\020\020\032\b\022\004\022\0020\0030\f2\016\b\002\020\021\032\b\022\004\022\0020\0030\fHÆ\001¢\006\002\0208J\023\0209\032\0020\n2\b\020:\032\004\030\0010;HÖ\003J\t\020<\032\0020\007HÖ\001J%\020=\032\0020>2\006\020?\032\0020\0002\006\020@\032\0020A2\006\020B\032\0020CH\001¢\006\002\bDR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\030\020\031R\016\020\004\032\0020\005X\004¢\006\002\n\000R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\032\020\033R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\034\020\031R\022\020\t\032\004\030\0010\nX\004¢\006\004\n\002\020\035R\024\020\013\032\b\022\004\022\0020\0030\fX\004¢\006\002\n\000R\021\020\r\032\0020\003¢\006\b\n\000\032\004\b\036\020\031R\016\020\016\032\0020\nX\004¢\006\002\n\000R\024\020\017\032\b\022\004\022\0020\0030\fX\004¢\006\002\n\000R\024\020\020\032\b\022\004\022\0020\0030\fX\004¢\006\002\n\000R\024\020\021\032\b\022\004\022\0020\0030\fX\004¢\006\002\n\000¨\006G"}, d2 = {"Lfeedback/CommonFeedbackSystemData;", "Lfeedback/SystemDataJsonSerializable;", "osVersion", "", "memorySize", "", "coresNumber", "", "appVersionWithBuild", "isEvaluationLicense", "", "licenseRestrictions", "", "runtimeVersion", "isInternalModeEnabled", "registry", "disabledBundledPlugins", "nonBundledPlugins", "<init>", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JILjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOsVersion", "()Ljava/lang/String;", "getCoresNumber", "()I", "getAppVersionWithBuild", "Ljava/lang/Boolean;", "getRuntimeVersion", "getMemorySizeForDialog", "getLicenseRestrictionsForDialog", "getIsLicenseEvaluationForDialog", "getIsInternalModeForDialog", "getRegistryKeysForDialog", "getDisabledBundledPluginsForDialog", "getNonBundledPluginsForDialog", "serializeToJson", "Lkotlinx/serialization/json/JsonElement;", "json", "Lkotlinx/serialization/json/Json;", "toString", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;JILjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)Lfeedback/CommonFeedbackSystemData;", "equals", "other", "", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_ui", "Companion", "$serializer", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nCommonFeedbackSystemData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonFeedbackSystemData.kt\nfeedback/CommonFeedbackSystemData\n+ 2 Json.kt\nkotlinx/serialization/json/JsonKt\n*L\n1#1,201:1\n324#2:202\n*S KotlinDebug\n*F\n+ 1 CommonFeedbackSystemData.kt\nfeedback/CommonFeedbackSystemData\n*L\n170#1:202\n*E\n"})
/*     */ public final class CommonFeedbackSystemData implements SystemDataJsonSerializable {
/*  29 */   public CommonFeedbackSystemData(@NotNull String osVersion, long memorySize, int coresNumber, @NotNull String appVersionWithBuild, @Nullable Boolean isEvaluationLicense, @NotNull List<String> licenseRestrictions, @NotNull String runtimeVersion, boolean isInternalModeEnabled, @NotNull List<String> registry, @NotNull List<String> disabledBundledPlugins, @NotNull List<String> nonBundledPlugins) { this.osVersion = osVersion;
/*  30 */     this.memorySize = memorySize;
/*  31 */     this.coresNumber = coresNumber;
/*  32 */     this.appVersionWithBuild = appVersionWithBuild;
/*  33 */     this.isEvaluationLicense = isEvaluationLicense;
/*  34 */     this.licenseRestrictions = licenseRestrictions;
/*  35 */     this.runtimeVersion = runtimeVersion;
/*  36 */     this.isInternalModeEnabled = isInternalModeEnabled;
/*  37 */     this.registry = registry;
/*  38 */     this.disabledBundledPlugins = disabledBundledPlugins;
/*  39 */     this.nonBundledPlugins = nonBundledPlugins; }
/*     */   @NotNull public final String getOsVersion() { return this.osVersion; }
/*  41 */   public final int getCoresNumber() { return this.coresNumber; } @NotNull public final String getAppVersionWithBuild() { return this.appVersionWithBuild; } @NotNull public final String getRuntimeVersion() { return this.runtimeVersion; } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String osVersion; private final long memorySize; private final int coresNumber; @NotNull private final String appVersionWithBuild; @Nullable private final Boolean isEvaluationLicense; @NotNull private final List<String> licenseRestrictions; @NotNull private final String runtimeVersion; private final boolean isInternalModeEnabled; @NotNull private final List<String> registry; @NotNull private final List<String> disabledBundledPlugins; @NotNull private final List<String> nonBundledPlugins; public static final int $stable = 8; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[11]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[6] = null; arrayOfKSerializer[7] = null; arrayOfKSerializer[8] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[9] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[10] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\t\n\000\n\002\020\b\n\002\b\002\n\002\020 \n\000\n\002\020\013\n\002\b\b\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005J\b\020\006\032\0020\007H\002J\b\020\b\032\0020\tH\002J\b\020\n\032\0020\013H\002J\b\020\f\032\0020\007H\002J\016\020\r\032\b\022\004\022\0020\0070\016H\002J\017\020\017\032\004\030\0010\020H\002¢\006\002\020\021J\b\020\022\032\0020\007H\002J\b\020\023\032\0020\020H\002J\016\020\024\032\b\022\004\022\0020\0070\016H\002J\016\020\025\032\b\022\004\022\0020\0070\016H\002J\016\020\026\032\b\022\004\022\0020\0070\016H\002J\"\020\027\032\b\022\004\022\0020\0070\0162\022\020\030\032\016\022\004\022\0020\032\022\004\022\0020\0200\031H\002J\f\020\033\032\b\022\004\022\0020\0050\034¨\006\035"}, d2 = {"Lfeedback/CommonFeedbackSystemData$Companion;", "", "<init>", "()V", "getCurrentData", "Lfeedback/CommonFeedbackSystemData;", "getOsVersion", "", "getMemorySize", "", "getCoresNumber", "", "getAppVersionWithBuild", "getLicenseRestrictionsInfo", "", "getLicenseEvaluationInfo", "", "()Ljava/lang/Boolean;", "getRuntimeVersion", "getIsInternalMode", "getRegistryKeys", "getDisabledPlugins", "getNonBundledPlugins", "getPluginsNamesWithVersion", "filter", "Lkotlin/Function1;", "Lcom/intellij/ide/plugins/IdeaPluginDescriptor;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-ui"}) @SourceDebugExtension({"SMAP\nCommonFeedbackSystemData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonFeedbackSystemData.kt\nfeedback/CommonFeedbackSystemData$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,201:1\n774#2:202\n865#2,2:203\n1557#2:205\n1628#2,3:206\n774#2:209\n865#2,2:210\n1557#2:212\n1628#2,3:213\n*S KotlinDebug\n*F\n+ 1 CommonFeedbackSystemData.kt\nfeedback/CommonFeedbackSystemData$Companion\n*L\n92#1:202\n92#1:203,2\n96#1:205\n96#1:206,3\n104#1:209\n104#1:210,2\n105#1:212\n105#1:213,3\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<CommonFeedbackSystemData> serializer() { return (KSerializer<CommonFeedbackSystemData>)CommonFeedbackSystemData.$serializer.INSTANCE; } @NotNull
/*     */     public final CommonFeedbackSystemData getCurrentData() {
/*  43 */       return new CommonFeedbackSystemData(
/*  44 */           getOsVersion(), 
/*  45 */           getMemorySize(), 
/*  46 */           getCoresNumber(), 
/*  47 */           getAppVersionWithBuild(), 
/*  48 */           getLicenseEvaluationInfo(), 
/*  49 */           getLicenseRestrictionsInfo(), 
/*  50 */           getRuntimeVersion(), 
/*  51 */           getIsInternalMode(), 
/*  52 */           getRegistryKeys(), 
/*  53 */           getDisabledPlugins(), 
/*  54 */           getNonBundledPlugins());
/*     */     }
/*     */     
/*     */     private final String getOsVersion() {
/*  58 */       return SystemInfo.OS_NAME + " " + SystemInfo.OS_NAME;
/*  59 */     } private final long getMemorySize() { return Runtime.getRuntime().maxMemory() / 1048576L; } private final int getCoresNumber() {
/*  60 */       return Runtime.getRuntime().availableProcessors();
/*     */     } private final String getAppVersionWithBuild() {
/*  62 */       ApplicationInfo appInfo = ApplicationInfo.getInstance();
/*     */       
/*  64 */       Intrinsics.checkNotNullExpressionValue(appInfo.getFullApplicationName(), "getFullApplicationName(...)"); String appVersion = appInfo.getFullApplicationName();
/*  65 */       String edition = ApplicationNamesInfo.getInstance().getEditionName();
/*  66 */       if (edition != null) {
/*  67 */         appVersion = appVersion + " (" + appVersion + ")";
/*     */       }
/*  69 */       Intrinsics.checkNotNullExpressionValue(appInfo.getBuild(), "getBuild(...)"); BuildNumber appBuild = appInfo.getBuild();
/*  70 */       appVersion = appVersion + "\nBuild " + appVersion;
/*  71 */       Intrinsics.checkNotNullExpressionValue(appInfo.getBuildDate().getTime(), "getTime(...)"); Date timestamp = appInfo.getBuildDate().getTime();
/*  72 */       if (appBuild.isSnapshot()) {
/*  73 */         String time = (new SimpleDateFormat("HH:mm")).format(timestamp);
/*  74 */         appVersion = appVersion + ", built on " + appVersion + " at " + NlsMessages.formatDateLong(timestamp);
/*     */       } else {
/*     */         
/*  77 */         appVersion = appVersion + ", built on " + appVersion;
/*     */       } 
/*  79 */       return appVersion;
/*     */     }
/*     */     
/*     */     private final List<String> getLicenseRestrictionsInfo() {
/*  83 */       if (LicensingFacade.getInstance() == null || LicensingFacade.getInstance().getLicenseRestrictionsMessages() == null) LicensingFacade.getInstance().getLicenseRestrictionsMessages();  return CollectionsKt.emptyList();
/*     */     }
/*     */     
/*     */     private final Boolean getLicenseEvaluationInfo() {
/*  87 */       LicensingFacade.getInstance(); return (LicensingFacade.getInstance() != null) ? Boolean.valueOf(LicensingFacade.getInstance().isEvaluationLicense()) : null;
/*     */     }
/*     */     
/*  90 */     private final String getRuntimeVersion() { return SystemInfo.JAVA_RUNTIME_VERSION + SystemInfo.JAVA_RUNTIME_VERSION; }
/*  91 */     private final boolean getIsInternalMode() { return ApplicationManager.getApplication().isInternal(); }
/*  92 */     private final List<String> getRegistryKeys() { Iterable $this$filter$iv = Registry.Companion.getAll(); int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 202 */       Iterable iterable1 = $this$filter$iv; Collection<String> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 203 */       for (Object element$iv$iv : iterable1) { RegistryValue value = (RegistryValue)element$iv$iv; int $i$a$-filter-CommonFeedbackSystemData$Companion$getRegistryKeys$1 = 0; String pluginId = value.getPluginId(); }
/* 204 */        $this$filter$iv = destination$iv$iv; int $i$f$map = 0;
/* 205 */       Iterable $this$filterTo$iv$iv = $this$filter$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 206 */       for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 207 */         RegistryValue registryValue = (RegistryValue)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-CommonFeedbackSystemData$Companion$getRegistryKeys$2 = 0; collection.add(registryValue.getKey() + "=" + registryValue.getKey());
/* 208 */       }  return CollectionsKt.toList(destination$iv$iv); }
/* 209 */     private final List<String> getDisabledPlugins() { return getPluginsNamesWithVersion(Companion::getDisabledPlugins$lambda$2); } private static final boolean getDisabledPlugins$lambda$2(IdeaPluginDescriptor p) { Intrinsics.checkNotNullParameter(p, "p"); return !p.isEnabled(); } private final List<String> getNonBundledPlugins() { return getPluginsNamesWithVersion(Companion::getNonBundledPlugins$lambda$3); } private static final boolean getNonBundledPlugins$lambda$3(IdeaPluginDescriptor p) { Intrinsics.checkNotNullParameter(p, "p"); return !p.isBundled(); } private final List<String> getPluginsNamesWithVersion(Function1 filter) { List list1 = PluginManagerCore.getLoadedPlugins(); int $i$f$filter = 0; List list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 210 */       for (Object element$iv$iv : list2) { IdeaPluginDescriptor it = (IdeaPluginDescriptor)element$iv$iv; int $i$a$-filter-CommonFeedbackSystemData$Companion$getPluginsNamesWithVersion$1 = 0; if (((Boolean)filter.invoke(it)).booleanValue()) collection.add(element$iv$iv);  }
/* 211 */        Iterable $this$filter$iv = collection; int $i$f$map = 0;
/* 212 */       Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 213 */       for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 214 */         IdeaPluginDescriptor ideaPluginDescriptor = (IdeaPluginDescriptor)item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-CommonFeedbackSystemData$Companion$getPluginsNamesWithVersion$2 = 0; Intrinsics.checkNotNullExpressionValue(ideaPluginDescriptor.getPluginId(), "getPluginId(...)"); PluginId pluginId = ideaPluginDescriptor.getPluginId(); PluginInfo pluginInfo = PluginInfoDetectorKt.getPluginInfoById(pluginId);
/* 215 */       }  return CollectionsKt.toList(destination$iv$iv); }
/*     */      }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String getMemorySizeForDialog() {
/*     */     return "" + this.memorySize + "M";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getLicenseRestrictionsForDialog() {
/*     */     return this.licenseRestrictions.isEmpty() ? "No info" : CollectionsKt.joinToString$default(this.licenseRestrictions, "\n", null, null, 0, null, null, 62, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getIsLicenseEvaluationForDialog() {
/*     */     Boolean bool = this.isEvaluationLicense;
/*     */     if (bool == null) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return Intrinsics.areEqual(bool, Boolean.valueOf(true)) ? "True" : (Intrinsics.areEqual(bool, Boolean.valueOf(false)) ? "False" : "JD-Core does not support Kotlin");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getIsInternalModeForDialog() {
/*     */     boolean bool = this.isInternalModeEnabled;
/*     */     if (!bool) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (bool == true) ? "True" : "JD-Core does not support Kotlin";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getRegistryKeysForDialog() {
/*     */     String registryKeys = CollectionsKt.joinToString$default(this.registry, "\n", null, null, 0, null, null, 62, null);
/*     */     return !StringUtil.isEmpty(registryKeys) ? registryKeys : "Empty";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getDisabledBundledPluginsForDialog() {
/*     */     String disabledPlugins = CollectionsKt.joinToString$default(this.disabledBundledPlugins, "\n", null, null, 0, null, null, 62, null);
/*     */     return !StringUtil.isEmpty(disabledPlugins) ? disabledPlugins : "None";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getNonBundledPluginsForDialog() {
/*     */     String nonBundledPluginsString = CollectionsKt.joinToString$default(this.nonBundledPlugins, "\n", null, null, 0, null, null, 62, null);
/*     */     return !StringUtil.isEmpty(nonBundledPluginsString) ? nonBundledPluginsString : "None";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public JsonElement serializeToJson(@NotNull Json json) {
/*     */     Intrinsics.checkNotNullParameter(json, "json");
/*     */     Json $this$encodeToJsonElement$iv = json;
/*     */     int $i$f$encodeToJsonElement = 0;
/*     */     $this$encodeToJsonElement$iv.getSerializersModule();
/*     */     return $this$encodeToJsonElement$iv.encodeToJsonElement((SerializationStrategy)Companion.serializer(), this);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u240 = stringBuilder1;
/*     */     int $i$a$-buildString-CommonFeedbackSystemData$toString$1 = 0;
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("System Info"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("System Info").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("System Info").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("OS version:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("OS version:").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("OS version:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(this.osVersion), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(this.osVersion).append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append(this.osVersion).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Memory:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Memory:").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("Memory:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getMemorySizeForDialog()), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getMemorySizeForDialog()).append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append(getMemorySizeForDialog()).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Cores:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Cores:").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("Cores:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(this.coresNumber), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(this.coresNumber).append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append(this.coresNumber).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("App version:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("App version:").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("App version:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(this.appVersionWithBuild), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(this.appVersionWithBuild).append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append(this.appVersionWithBuild).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Evaluation license:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Evaluation license:").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("Evaluation license:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getIsLicenseEvaluationForDialog()), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getIsLicenseEvaluationForDialog()).append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append(getIsLicenseEvaluationForDialog()).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("License restrictions:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("License restrictions:").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("License restrictions:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getLicenseRestrictionsForDialog()), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getLicenseRestrictionsForDialog()).append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append(getLicenseRestrictionsForDialog()).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Runtime version:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Runtime version:").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("Runtime version:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(this.runtimeVersion), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(this.runtimeVersion).append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append(this.runtimeVersion).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Internal mode enabled:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Internal mode enabled:").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("Internal mode enabled:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(this.isInternalModeEnabled), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(this.isInternalModeEnabled).append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append(this.isInternalModeEnabled).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Registry:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Registry:").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("Registry:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getRegistryKeysForDialog()), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getRegistryKeysForDialog()).append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append(getRegistryKeysForDialog()).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Disabled bundled plugins:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Disabled bundled plugins:").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("Disabled bundled plugins:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getDisabledBundledPluginsForDialog()), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getDisabledBundledPluginsForDialog()).append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append(getDisabledBundledPluginsForDialog()).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Non-bundled plugins:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append("Non-bundled plugins:").append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append("Non-bundled plugins:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getNonBundledPluginsForDialog()), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u240.append(getNonBundledPluginsForDialog()).append('\n'), "append(...)");
/*     */     $this$toString_u24lambda_u240.append(getNonBundledPluginsForDialog()).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.osVersion;
/*     */   }
/*     */   
/*     */   private final long component2() {
/*     */     return this.memorySize;
/*     */   }
/*     */   
/*     */   public final int component3() {
/*     */     return this.coresNumber;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component4() {
/*     */     return this.appVersionWithBuild;
/*     */   }
/*     */   
/*     */   private final Boolean component5() {
/*     */     return this.isEvaluationLicense;
/*     */   }
/*     */   
/*     */   private final List<String> component6() {
/*     */     return this.licenseRestrictions;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component7() {
/*     */     return this.runtimeVersion;
/*     */   }
/*     */   
/*     */   private final boolean component8() {
/*     */     return this.isInternalModeEnabled;
/*     */   }
/*     */   
/*     */   private final List<String> component9() {
/*     */     return this.registry;
/*     */   }
/*     */   
/*     */   private final List<String> component10() {
/*     */     return this.disabledBundledPlugins;
/*     */   }
/*     */   
/*     */   private final List<String> component11() {
/*     */     return this.nonBundledPlugins;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CommonFeedbackSystemData copy(@NotNull String osVersion, long memorySize, int coresNumber, @NotNull String appVersionWithBuild, @Nullable Boolean isEvaluationLicense, @NotNull List<String> licenseRestrictions, @NotNull String runtimeVersion, boolean isInternalModeEnabled, @NotNull List<String> registry, @NotNull List<String> disabledBundledPlugins, @NotNull List<String> nonBundledPlugins) {
/*     */     Intrinsics.checkNotNullParameter(osVersion, "osVersion");
/*     */     Intrinsics.checkNotNullParameter(appVersionWithBuild, "appVersionWithBuild");
/*     */     Intrinsics.checkNotNullParameter(licenseRestrictions, "licenseRestrictions");
/*     */     Intrinsics.checkNotNullParameter(runtimeVersion, "runtimeVersion");
/*     */     Intrinsics.checkNotNullParameter(registry, "registry");
/*     */     Intrinsics.checkNotNullParameter(disabledBundledPlugins, "disabledBundledPlugins");
/*     */     Intrinsics.checkNotNullParameter(nonBundledPlugins, "nonBundledPlugins");
/*     */     return new CommonFeedbackSystemData(osVersion, memorySize, coresNumber, appVersionWithBuild, isEvaluationLicense, licenseRestrictions, runtimeVersion, isInternalModeEnabled, registry, disabledBundledPlugins, nonBundledPlugins);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.osVersion.hashCode();
/*     */     result = result * 31 + Long.hashCode(this.memorySize);
/*     */     result = result * 31 + Integer.hashCode(this.coresNumber);
/*     */     result = result * 31 + this.appVersionWithBuild.hashCode();
/*     */     result = result * 31 + ((this.isEvaluationLicense == null) ? 0 : this.isEvaluationLicense.hashCode());
/*     */     result = result * 31 + this.licenseRestrictions.hashCode();
/*     */     result = result * 31 + this.runtimeVersion.hashCode();
/*     */     result = result * 31 + Boolean.hashCode(this.isInternalModeEnabled);
/*     */     result = result * 31 + this.registry.hashCode();
/*     */     result = result * 31 + this.disabledBundledPlugins.hashCode();
/*     */     return result * 31 + this.nonBundledPlugins.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof CommonFeedbackSystemData))
/*     */       return false; 
/*     */     CommonFeedbackSystemData commonFeedbackSystemData = (CommonFeedbackSystemData)other;
/*     */     return !Intrinsics.areEqual(this.osVersion, commonFeedbackSystemData.osVersion) ? false : ((this.memorySize != commonFeedbackSystemData.memorySize) ? false : ((this.coresNumber != commonFeedbackSystemData.coresNumber) ? false : (!Intrinsics.areEqual(this.appVersionWithBuild, commonFeedbackSystemData.appVersionWithBuild) ? false : (!Intrinsics.areEqual(this.isEvaluationLicense, commonFeedbackSystemData.isEvaluationLicense) ? false : (!Intrinsics.areEqual(this.licenseRestrictions, commonFeedbackSystemData.licenseRestrictions) ? false : (!Intrinsics.areEqual(this.runtimeVersion, commonFeedbackSystemData.runtimeVersion) ? false : ((this.isInternalModeEnabled != commonFeedbackSystemData.isInternalModeEnabled) ? false : (!Intrinsics.areEqual(this.registry, commonFeedbackSystemData.registry) ? false : (!Intrinsics.areEqual(this.disabledBundledPlugins, commonFeedbackSystemData.disabledBundledPlugins) ? false : (!!Intrinsics.areEqual(this.nonBundledPlugins, commonFeedbackSystemData.nonBundledPlugins)))))))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\CommonFeedbackSystemData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */