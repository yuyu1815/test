/*     */ package org.jetbrains.compose.resources;
/*     */ 
/*     */ import androidx.compose.foundation.DarkThemeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.CompositionLocalKt;
/*     */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*     */ import androidx.compose.ui.platform.CompositionLocalsKt;
/*     */ import androidx.compose.ui.text.intl.Locale;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KFunction;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000L\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\b\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\b\020\017\032\0020\nH\007\032\r\020\020\032\0020\nH\007¢\006\002\020\021\032 \020\022\032\b\022\004\022\0020\0240\023*\b\022\004\022\0020\0240\0232\006\020\025\032\0020\026H\002\032 \020\027\032\b\022\004\022\0020\0240\023*\b\022\004\022\0020\0240\0232\006\020\030\032\0020\031H\002\032(\020\032\032\b\022\004\022\0020\0240\023*\b\022\004\022\0020\0240\0232\006\020\033\032\0020\0342\006\020\035\032\0020\036H\002\032\024\020\037\032\0020\024*\0020 2\006\020!\032\0020\nH\000\"\024\020\000\032\0020\001X\004¢\006\b\n\000\032\004\b\002\020\003\"\032\020\004\032\b\022\004\022\0020\0010\005X\004¢\006\b\n\000\032\004\b\006\020\007\" \020\b\032\b\022\004\022\0020\n0\tX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016¨\006\""}, d2 = {"DefaultComposeEnvironment", "Lorg/jetbrains/compose/resources/ComposeEnvironment;", "getDefaultComposeEnvironment", "()Lorg/jetbrains/compose/resources/ComposeEnvironment;", "LocalComposeEnvironment", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalComposeEnvironment", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getResourceEnvironment", "Lkotlin/reflect/KFunction0;", "Lorg/jetbrains/compose/resources/ResourceEnvironment;", "getGetResourceEnvironment", "()Lkotlin/reflect/KFunction;", "setGetResourceEnvironment", "(Lkotlin/reflect/KFunction;)V", "getSystemResourceEnvironment", "rememberResourceEnvironment", "(Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/compose/resources/ResourceEnvironment;", "filterBy", "", "Lorg/jetbrains/compose/resources/ResourceItem;", "qualifier", "Lorg/jetbrains/compose/resources/Qualifier;", "filterByDensity", "density", "Lorg/jetbrains/compose/resources/DensityQualifier;", "filterByLocale", "language", "Lorg/jetbrains/compose/resources/LanguageQualifier;", "region", "Lorg/jetbrains/compose/resources/RegionQualifier;", "getResourceItemByEnvironment", "Lorg/jetbrains/compose/resources/Resource;", "environment", "library"})
/*     */ @SourceDebugExtension({"SMAP\nResourceEnvironment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceEnvironment.kt\norg/jetbrains/compose/resources/ResourceEnvironmentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,203:1\n77#2:204\n1#3:205\n766#4:206\n857#4:207\n1747#4,3:208\n858#4:211\n766#4:212\n857#4:213\n2624#4,3:214\n858#4:217\n766#4:218\n857#4,2:219\n1045#4:221\n766#4:222\n857#4:223\n1747#4,3:224\n858#4:227\n766#4:228\n857#4,2:229\n1054#4:231\n766#4:232\n857#4:233\n1747#4,3:234\n858#4:237\n766#4:238\n857#4:239\n2624#4,3:240\n858#4:243\n766#4:244\n857#4:245\n1747#4,3:246\n858#4:249\n766#4:250\n857#4:251\n1747#4,3:252\n858#4:255\n766#4:256\n857#4:257\n1747#4,3:258\n858#4:261\n766#4:262\n857#4:263\n2624#4,3:264\n858#4:267\n766#4:268\n857#4:269\n2624#4,3:270\n858#4:273\n*S KotlinDebug\n*F\n+ 1 ResourceEnvironment.kt\norg/jetbrains/compose/resources/ResourceEnvironmentKt\n*L\n75#1:204\n116#1:206\n116#1:207\n117#1:208,3\n116#1:211\n123#1:212\n123#1:213\n124#1:214,3\n123#1:217\n136#1:218\n136#1:219,2\n137#1:221\n140#1:222\n140#1:223\n140#1:224,3\n140#1:227\n148#1:228\n148#1:229,2\n149#1:231\n151#1:232\n151#1:233\n151#1:234,3\n151#1:237\n161#1:238\n161#1:239\n162#1:240,3\n161#1:243\n167#1:244\n167#1:245\n168#1:246,3\n167#1:249\n181#1:250\n181#1:251\n182#1:252,3\n181#1:255\n185#1:256\n185#1:257\n186#1:258,3\n185#1:261\n192#1:262\n192#1:263\n193#1:264,3\n192#1:267\n200#1:268\n200#1:269\n201#1:270,3\n200#1:273\n*E\n"})
/*     */ public final class ResourceEnvironmentKt
/*     */ {
/*     */   @NotNull
/*  43 */   private static final ComposeEnvironment DefaultComposeEnvironment = new ResourceEnvironmentKt$DefaultComposeEnvironment$1(); @NotNull public static final ComposeEnvironment getDefaultComposeEnvironment() { return DefaultComposeEnvironment; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\023\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\r\020\002\032\0020\003H\027¢\006\002\020\004¨\006\005"}, d2 = {"org/jetbrains/compose/resources/ResourceEnvironmentKt$DefaultComposeEnvironment$1", "Lorg/jetbrains/compose/resources/ComposeEnvironment;", "rememberEnvironment", "Lorg/jetbrains/compose/resources/ResourceEnvironment;", "(Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/compose/resources/ResourceEnvironment;", "library"}) @SourceDebugExtension({"SMAP\nResourceEnvironment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceEnvironment.kt\norg/jetbrains/compose/resources/ResourceEnvironmentKt$DefaultComposeEnvironment$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,203:1\n77#2:204\n1225#3,6:205\n*S KotlinDebug\n*F\n+ 1 ResourceEnvironment.kt\norg/jetbrains/compose/resources/ResourceEnvironmentKt$DefaultComposeEnvironment$1\n*L\n48#1:204\n51#1:205,6\n*E\n"}) public static final class ResourceEnvironmentKt$DefaultComposeEnvironment$1 implements ComposeEnvironment { @Composable
/*     */     @NotNull
/*  45 */     public ResourceEnvironment rememberEnvironment(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(1808039825); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1808039825, $changed, -1, "org.jetbrains.compose.resources.DefaultComposeEnvironment.<no name provided>.rememberEnvironment (ResourceEnvironment.kt:44)"); 
/*  46 */       Locale composeLocale = Locale.Companion.getCurrent();
/*  47 */       boolean composeTheme = DarkThemeKt.isSystemInDarkTheme($composer, 0);
/*  48 */       CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalDensity(); int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 204 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object1 = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); Density composeDensity = (Density)object1; $composer.startReplaceGroup(1697238779); Composer composer = $composer; int i = $composer.changed(composeLocale) | $composer.changed(composeTheme) | $composer.changed(composeDensity), $i$f$cache = 0;
/* 205 */       Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 206 */       if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 207 */         int $i$a$-cache-ResourceEnvironmentKt$DefaultComposeEnvironment$1$rememberEnvironment$1 = 0;
/*     */       }
/*     */       
/* 210 */       ResourceEnvironment resourceEnvironment2 = (ResourceEnvironment)it$iv; $composer.endReplaceGroup(); ResourceEnvironment resourceEnvironment1 = resourceEnvironment2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return resourceEnvironment1; } }
/* 211 */    @NotNull private static final ProvidableCompositionLocal<ComposeEnvironment> LocalComposeEnvironment = CompositionLocalKt.staticCompositionLocalOf(ResourceEnvironmentKt$LocalComposeEnvironment$1.INSTANCE); @NotNull public static final ProvidableCompositionLocal<ComposeEnvironment> getLocalComposeEnvironment() { return LocalComposeEnvironment; } private static final List<ResourceItem> filterBy(List $this$filterBy, Qualifier qualifier) { Iterable $this$filter$iv = $this$filterBy; int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; for (Object element$iv$iv : iterable1) { ResourceItem item = (ResourceItem)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterBy$withQualifier$1 = 0; Iterable<Qualifier> $this$any$iv = item.getQualifiers$library(); int $i$f$any = 0; }  List<ResourceItem> withQualifier = (List)destination$iv$iv; if (!withQualifier.isEmpty())
/* 212 */       return withQualifier;  $this$filter$iv = $this$filterBy; $i$f$filter = 0; Iterable $this$filterTo$iv$iv = $this$filter$iv; destination$iv$iv = new ArrayList(); $i$f$filterTo = 0;
/* 213 */     for (Object element$iv$iv : $this$filterTo$iv$iv) { ResourceItem item = (ResourceItem)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterBy$1 = 0;
/*     */       Iterable<Qualifier> $this$none$iv = item.getQualifiers$library();
/*     */       int $i$f$none = 0; }
/*     */     
/* 217 */     return (List<ResourceItem>)destination$iv$iv; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lorg/jetbrains/compose/resources/ComposeEnvironment;", "invoke"}) static final class ResourceEnvironmentKt$LocalComposeEnvironment$1 extends Lambda implements Function0<ComposeEnvironment> {
/* 218 */     public static final ResourceEnvironmentKt$LocalComposeEnvironment$1 INSTANCE = new ResourceEnvironmentKt$LocalComposeEnvironment$1(); ResourceEnvironmentKt$LocalComposeEnvironment$1() { super(0); } @NotNull public final ComposeEnvironment invoke() { return ResourceEnvironmentKt.getDefaultComposeEnvironment(); } } @ExperimentalResourceApi @Composable @NotNull public static final ResourceEnvironment rememberResourceEnvironment(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(707674437); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(707674437, $changed, -1, "org.jetbrains.compose.resources.rememberResourceEnvironment (ResourceEnvironment.kt:73)");  CompositionLocal compositionLocal = (CompositionLocal)LocalComposeEnvironment; int $changed$iv = 6, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ComposeEnvironment composeEnvironment = (ComposeEnvironment)object; ResourceEnvironment resourceEnvironment = composeEnvironment.rememberEnvironment($composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return resourceEnvironment; } @NotNull private static KFunction<ResourceEnvironment> getResourceEnvironment = (KFunction<ResourceEnvironment>)ResourceEnvironmentKt$getResourceEnvironment$1.INSTANCE; @NotNull public static final KFunction<ResourceEnvironment> getGetResourceEnvironment() { return getResourceEnvironment; } public static final void setGetResourceEnvironment(@NotNull KFunction<ResourceEnvironment> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); getResourceEnvironment = <set-?>; } @ExperimentalResourceApi @NotNull public static final ResourceEnvironment getSystemResourceEnvironment() { return (ResourceEnvironment)((Function0)getResourceEnvironment).invoke(); } @NotNull public static final ResourceItem getResourceItemByEnvironment(@NotNull Resource $this$getResourceItemByEnvironment, @NotNull ResourceEnvironment environment) { Intrinsics.checkNotNullParameter($this$getResourceItemByEnvironment, "<this>"); Intrinsics.checkNotNullParameter(environment, "environment"); List<ResourceItem> list1 = filterByLocale(CollectionsKt.toList($this$getResourceItemByEnvironment.getItems$library()), environment.getLanguage$library(), environment.getRegion$library()); List<ResourceItem> list3 = list1; int $i$a$-also-ResourceEnvironmentKt$getResourceItemByEnvironment$1 = 0; if (list3.size() == 1) return (ResourceItem)CollectionsKt.first(list3);  list1 = filterBy(list1, environment.getTheme$library()); List<ResourceItem> list2 = list1; int $i$a$-also-ResourceEnvironmentKt$getResourceItemByEnvironment$2 = 0; if (list2.size() == 1) return (ResourceItem)CollectionsKt.first(list2);  list1 = filterByDensity(list1, environment.getDensity$library()); List<ResourceItem> it = list1; int $i$a$-also-ResourceEnvironmentKt$getResourceItemByEnvironment$3 = 0; if (it.size() == 1) return (ResourceItem)CollectionsKt.first(it);  List<ResourceItem> items = list1; int $i$a$-let-ResourceEnvironmentKt$getResourceItemByEnvironment$4 = 0; if (items.isEmpty()) throw new IllegalStateException(("Resource with ID='" + $this$getResourceItemByEnvironment.getId$library() + "' not found").toString());  throw new IllegalStateException(("Resource with ID='" + $this$getResourceItemByEnvironment.getId$library() + "' has more than one file: " + CollectionsKt.joinToString$default(items, null, null, null, 0, null, ResourceEnvironmentKt$getResourceItemByEnvironment$4$1.INSTANCE, 31, null)).toString()); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lorg/jetbrains/compose/resources/ResourceItem;", "invoke"}) static final class ResourceEnvironmentKt$getResourceItemByEnvironment$4$1 extends Lambda implements Function1<ResourceItem, CharSequence> { public static final ResourceEnvironmentKt$getResourceItemByEnvironment$4$1 INSTANCE = new ResourceEnvironmentKt$getResourceItemByEnvironment$4$1(); ResourceEnvironmentKt$getResourceItemByEnvironment$4$1() { super(1); } @NotNull public final CharSequence invoke(@NotNull ResourceItem it) { Intrinsics.checkNotNullParameter(it, "it"); return it.getPath$library(); } } private static final List<ResourceItem> filterByDensity(List $this$filterByDensity, DensityQualifier density) { List items = $this$filterByDensity; List<ResourceItem> withQualifier = CollectionsKt.emptyList(); Iterable iterable1 = (Iterable)DensityQualifier.getEntries(); int $i$f$filter = 0; Iterable iterable4 = iterable1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 219 */     for (Object element$iv$iv : iterable4) { DensityQualifier it = (DensityQualifier)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterByDensity$exactAndHigherQualifiers$1 = 0; if ((it.getDpi() >= density.getDpi())) destination$iv$iv.add(element$iv$iv);  }
/* 220 */      Iterable $this$filter$iv = destination$iv$iv; int $i$f$sortedBy = 0;
/* 221 */     List exactAndHigherQualifiers = CollectionsKt.sortedWith($this$filter$iv, new ResourceEnvironmentKt$filterByDensity$$inlined$sortedBy$1()); for (DensityQualifier qualifier : exactAndHigherQualifiers)
/* 222 */     { Iterable iterable5 = items; int n = 0; Iterable iterable6 = iterable5; Collection collection2 = new ArrayList(); int i1 = 0;
/* 223 */       for (Object element$iv$iv : iterable6) { ResourceItem item = (ResourceItem)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterByDensity$1 = 0;
/*     */         Iterable<Qualifier> $this$any$iv = item.getQualifiers$library();
/*     */         int $i$f$any = 0; }
/*     */       
/* 227 */       withQualifier = (List)collection2; if (!withQualifier.isEmpty()) break;  }  if (!withQualifier.isEmpty())
/* 228 */       return withQualifier;  List<Object> list = CollectionsKt.minus((Iterable)DensityQualifier.getEntries(), DensityQualifier.LDPI); int i = 0; destination$iv$iv = list; Collection<Object> collection1 = new ArrayList(); int k = 0;
/* 229 */     for (Object element$iv$iv : destination$iv$iv) { DensityQualifier it = (DensityQualifier)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterByDensity$lowQualifiers$1 = 0; if ((it.getDpi() < density.getDpi())) collection1.add(element$iv$iv);  }
/* 230 */      Iterable iterable2 = collection1; int $i$f$sortedByDescending = 0;
/* 231 */     List lowQualifiers = CollectionsKt.sortedWith(iterable2, new ResourceEnvironmentKt$filterByDensity$$inlined$sortedByDescending$1()); for (DensityQualifier qualifier : lowQualifiers)
/* 232 */     { Iterable iterable5 = items; int n = 0; Iterable iterable6 = iterable5; Collection collection2 = new ArrayList(); int i1 = 0;
/* 233 */       for (Object element$iv$iv : iterable6) { ResourceItem item = (ResourceItem)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterByDensity$2 = 0;
/*     */         Iterable<Qualifier> $this$any$iv = item.getQualifiers$library();
/*     */         int $i$f$any = 0; }
/*     */       
/* 237 */       withQualifier = (List<ResourceItem>)collection2; if (!withQualifier.isEmpty()) break;  }  if (!withQualifier.isEmpty())
/* 238 */       return withQualifier;  Iterable iterable3 = items; int j = 0; Iterable $this$filterTo$iv$iv = iterable3; Collection collection = new ArrayList(); int m = 0;
/* 239 */     for (Object element$iv$iv : $this$filterTo$iv$iv) { ResourceItem item = (ResourceItem)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterByDensity$withNoDensity$1 = 0;
/*     */       Iterable<Qualifier> $this$none$iv = item.getQualifiers$library();
/*     */       int $i$f$none = 0; }
/*     */     
/* 243 */     List<ResourceItem> withNoDensity = (List)collection; if (!withNoDensity.isEmpty())
/* 244 */       return withNoDensity;  iterable3 = items; j = 0; $this$filterTo$iv$iv = iterable3; collection = new ArrayList(); m = 0;
/* 245 */     for (Object element$iv$iv : $this$filterTo$iv$iv) { ResourceItem item = (ResourceItem)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterByDensity$3 = 0;
/*     */       Iterable<Qualifier> $this$any$iv = item.getQualifiers$library();
/*     */       int $i$f$any = 0; }
/*     */     
/* 249 */     return (List<ResourceItem>)collection; } private static final List<ResourceItem> filterByLocale(List $this$filterByLocale, LanguageQualifier language, RegionQualifier region) { Iterable $this$filter$iv = $this$filterByLocale; int $i$f$filter = 0;
/* 250 */     Iterable iterable3 = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 251 */     for (Object element$iv$iv : iterable3) { ResourceItem item = (ResourceItem)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterByLocale$withLanguage$1 = 0;
/*     */       Iterable<Qualifier> $this$any$iv = item.getQualifiers$library();
/*     */       int $i$f$any = 0; }
/*     */     
/* 255 */     List withLanguage = (List)destination$iv$iv; Iterable iterable1 = withLanguage; int i = 0;
/* 256 */     Iterable iterable4 = iterable1; Collection collection1 = new ArrayList(); int k = 0;
/* 257 */     for (Object element$iv$iv : iterable4) { ResourceItem item = (ResourceItem)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterByLocale$withExactLocale$1 = 0;
/*     */       Iterable<Qualifier> $this$any$iv = item.getQualifiers$library();
/*     */       int $i$f$any = 0; }
/*     */     
/* 261 */     List<ResourceItem> withExactLocale = (List)collection1; if (!withExactLocale.isEmpty())
/* 262 */       return withExactLocale;  Iterable iterable2 = withLanguage; int j = 0; Iterable iterable5 = iterable2; Collection collection2 = new ArrayList(); int m = 0;
/* 263 */     for (Object element$iv$iv : iterable5) { ResourceItem item = (ResourceItem)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterByLocale$withDefaultRegion$1 = 0;
/*     */       Iterable<Qualifier> $this$none$iv = item.getQualifiers$library();
/*     */       int $i$f$none = 0; }
/*     */     
/* 267 */     List<ResourceItem> withDefaultRegion = (List)collection2; if (!withDefaultRegion.isEmpty())
/* 268 */       return withDefaultRegion;  iterable2 = $this$filterByLocale; j = 0; Iterable $this$filterTo$iv$iv = iterable2; collection2 = new ArrayList(); m = 0;
/* 269 */     for (Object element$iv$iv : $this$filterTo$iv$iv) { ResourceItem item = (ResourceItem)element$iv$iv; int $i$a$-filter-ResourceEnvironmentKt$filterByLocale$1 = 0;
/*     */       Iterable<Qualifier> $this$none$iv = item.getQualifiers$library();
/*     */       int $i$f$none = 0; }
/*     */     
/* 273 */     return (List<ResourceItem>)collection2; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ResourceEnvironmentKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */