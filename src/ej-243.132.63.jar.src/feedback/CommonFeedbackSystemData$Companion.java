/*     */ package feedback;
/*     */ 
/*     */ import com.intellij.ide.nls.NlsMessages;
/*     */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
/*     */ import com.intellij.ide.plugins.PluginManagerCore;
/*     */ import com.intellij.internal.statistic.utils.PluginInfo;
/*     */ import com.intellij.internal.statistic.utils.PluginInfoDetectorKt;
/*     */ import com.intellij.openapi.application.ApplicationInfo;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.openapi.application.ApplicationNamesInfo;
/*     */ import com.intellij.openapi.extensions.PluginId;
/*     */ import com.intellij.openapi.util.BuildNumber;
/*     */ import com.intellij.openapi.util.SystemInfo;
/*     */ import com.intellij.openapi.util.registry.Registry;
/*     */ import com.intellij.openapi.util.registry.RegistryValue;
/*     */ import com.intellij.ui.LicensingFacade;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\t\n\000\n\002\020\b\n\002\b\002\n\002\020 \n\000\n\002\020\013\n\002\b\b\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005J\b\020\006\032\0020\007H\002J\b\020\b\032\0020\tH\002J\b\020\n\032\0020\013H\002J\b\020\f\032\0020\007H\002J\016\020\r\032\b\022\004\022\0020\0070\016H\002J\017\020\017\032\004\030\0010\020H\002¢\006\002\020\021J\b\020\022\032\0020\007H\002J\b\020\023\032\0020\020H\002J\016\020\024\032\b\022\004\022\0020\0070\016H\002J\016\020\025\032\b\022\004\022\0020\0070\016H\002J\016\020\026\032\b\022\004\022\0020\0070\016H\002J\"\020\027\032\b\022\004\022\0020\0070\0162\022\020\030\032\016\022\004\022\0020\032\022\004\022\0020\0200\031H\002J\f\020\033\032\b\022\004\022\0020\0050\034¨\006\035"}, d2 = {"Lfeedback/CommonFeedbackSystemData$Companion;", "", "<init>", "()V", "getCurrentData", "Lfeedback/CommonFeedbackSystemData;", "getOsVersion", "", "getMemorySize", "", "getCoresNumber", "", "getAppVersionWithBuild", "getLicenseRestrictionsInfo", "", "getLicenseEvaluationInfo", "", "()Ljava/lang/Boolean;", "getRuntimeVersion", "getIsInternalMode", "getRegistryKeys", "getDisabledPlugins", "getNonBundledPlugins", "getPluginsNamesWithVersion", "filter", "Lkotlin/Function1;", "Lcom/intellij/ide/plugins/IdeaPluginDescriptor;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nCommonFeedbackSystemData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonFeedbackSystemData.kt\nfeedback/CommonFeedbackSystemData$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,201:1\n774#2:202\n865#2,2:203\n1557#2:205\n1628#2,3:206\n774#2:209\n865#2,2:210\n1557#2:212\n1628#2,3:213\n*S KotlinDebug\n*F\n+ 1 CommonFeedbackSystemData.kt\nfeedback/CommonFeedbackSystemData$Companion\n*L\n92#1:202\n92#1:203,2\n96#1:205\n96#1:206,3\n104#1:209\n104#1:210,2\n105#1:212\n105#1:213,3\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<CommonFeedbackSystemData> serializer() {
/*  41 */     return (KSerializer<CommonFeedbackSystemData>)CommonFeedbackSystemData.$serializer.INSTANCE; } @NotNull
/*     */   public final CommonFeedbackSystemData getCurrentData() {
/*  43 */     return new CommonFeedbackSystemData(
/*  44 */         getOsVersion(), 
/*  45 */         getMemorySize(), 
/*  46 */         getCoresNumber(), 
/*  47 */         getAppVersionWithBuild(), 
/*  48 */         getLicenseEvaluationInfo(), 
/*  49 */         getLicenseRestrictionsInfo(), 
/*  50 */         getRuntimeVersion(), 
/*  51 */         getIsInternalMode(), 
/*  52 */         getRegistryKeys(), 
/*  53 */         getDisabledPlugins(), 
/*  54 */         getNonBundledPlugins());
/*     */   }
/*     */   
/*     */   private final String getOsVersion() {
/*  58 */     return SystemInfo.OS_NAME + " " + SystemInfo.OS_NAME;
/*  59 */   } private final long getMemorySize() { return Runtime.getRuntime().maxMemory() / 1048576L; } private final int getCoresNumber() {
/*  60 */     return Runtime.getRuntime().availableProcessors();
/*     */   } private final String getAppVersionWithBuild() {
/*  62 */     ApplicationInfo appInfo = ApplicationInfo.getInstance();
/*     */     
/*  64 */     Intrinsics.checkNotNullExpressionValue(appInfo.getFullApplicationName(), "getFullApplicationName(...)"); String appVersion = appInfo.getFullApplicationName();
/*  65 */     String edition = ApplicationNamesInfo.getInstance().getEditionName();
/*  66 */     if (edition != null) {
/*  67 */       appVersion = appVersion + " (" + appVersion + ")";
/*     */     }
/*  69 */     Intrinsics.checkNotNullExpressionValue(appInfo.getBuild(), "getBuild(...)"); BuildNumber appBuild = appInfo.getBuild();
/*  70 */     appVersion = appVersion + "\nBuild " + appVersion;
/*  71 */     Intrinsics.checkNotNullExpressionValue(appInfo.getBuildDate().getTime(), "getTime(...)"); Date timestamp = appInfo.getBuildDate().getTime();
/*  72 */     if (appBuild.isSnapshot()) {
/*  73 */       String time = (new SimpleDateFormat("HH:mm")).format(timestamp);
/*  74 */       appVersion = appVersion + ", built on " + appVersion + " at " + NlsMessages.formatDateLong(timestamp);
/*     */     } else {
/*     */       
/*  77 */       appVersion = appVersion + ", built on " + appVersion;
/*     */     } 
/*  79 */     return appVersion;
/*     */   }
/*     */   
/*     */   private final List<String> getLicenseRestrictionsInfo() {
/*  83 */     if (LicensingFacade.getInstance() == null || LicensingFacade.getInstance().getLicenseRestrictionsMessages() == null) LicensingFacade.getInstance().getLicenseRestrictionsMessages();  return CollectionsKt.emptyList();
/*     */   }
/*     */   
/*     */   private final Boolean getLicenseEvaluationInfo() {
/*  87 */     LicensingFacade.getInstance(); return (LicensingFacade.getInstance() != null) ? Boolean.valueOf(LicensingFacade.getInstance().isEvaluationLicense()) : null;
/*     */   }
/*     */   
/*  90 */   private final String getRuntimeVersion() { return SystemInfo.JAVA_RUNTIME_VERSION + SystemInfo.JAVA_RUNTIME_VERSION; }
/*  91 */   private final boolean getIsInternalMode() { return ApplicationManager.getApplication().isInternal(); }
/*  92 */   private final List<String> getRegistryKeys() { Iterable $this$filter$iv = Registry.Companion.getAll(); int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 202 */     Iterable iterable1 = $this$filter$iv; Collection<String> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 203 */     for (Object element$iv$iv : iterable1) { RegistryValue value = (RegistryValue)element$iv$iv; int $i$a$-filter-CommonFeedbackSystemData$Companion$getRegistryKeys$1 = 0; String pluginId = value.getPluginId(); }
/* 204 */      $this$filter$iv = destination$iv$iv; int $i$f$map = 0;
/* 205 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 206 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 207 */       RegistryValue registryValue = (RegistryValue)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-CommonFeedbackSystemData$Companion$getRegistryKeys$2 = 0; collection.add(registryValue.getKey() + "=" + registryValue.getKey());
/* 208 */     }  return CollectionsKt.toList(destination$iv$iv); } private final List<String> getPluginsNamesWithVersion(Function1 filter) { List list1 = PluginManagerCore.getLoadedPlugins(); int $i$f$filter = 0;
/* 209 */     List list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 210 */     for (Object element$iv$iv : list2) { IdeaPluginDescriptor it = (IdeaPluginDescriptor)element$iv$iv; int $i$a$-filter-CommonFeedbackSystemData$Companion$getPluginsNamesWithVersion$1 = 0; if (((Boolean)filter.invoke(it)).booleanValue()) collection.add(element$iv$iv);  }
/* 211 */      Iterable $this$filter$iv = collection; int $i$f$map = 0;
/* 212 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 213 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 214 */       IdeaPluginDescriptor ideaPluginDescriptor = (IdeaPluginDescriptor)item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-CommonFeedbackSystemData$Companion$getPluginsNamesWithVersion$2 = 0; Intrinsics.checkNotNullExpressionValue(ideaPluginDescriptor.getPluginId(), "getPluginId(...)"); PluginId pluginId = ideaPluginDescriptor.getPluginId(); PluginInfo pluginInfo = PluginInfoDetectorKt.getPluginInfoById(pluginId);
/* 215 */     }  return CollectionsKt.toList(destination$iv$iv); }
/*     */ 
/*     */   
/*     */   private final List<String> getDisabledPlugins() {
/*     */     return getPluginsNamesWithVersion(Companion::getDisabledPlugins$lambda$2);
/*     */   }
/*     */   
/*     */   private static final boolean getDisabledPlugins$lambda$2(IdeaPluginDescriptor p) {
/*     */     Intrinsics.checkNotNullParameter(p, "p");
/*     */     return !p.isEnabled();
/*     */   }
/*     */   
/*     */   private final List<String> getNonBundledPlugins() {
/*     */     return getPluginsNamesWithVersion(Companion::getNonBundledPlugins$lambda$3);
/*     */   }
/*     */   
/*     */   private static final boolean getNonBundledPlugins$lambda$3(IdeaPluginDescriptor p) {
/*     */     Intrinsics.checkNotNullParameter(p, "p");
/*     */     return !p.isBundled();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\CommonFeedbackSystemData$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */