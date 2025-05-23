/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.modifier.ModifierLocalKt;
/*     */ import androidx.compose.ui.modifier.ProvidableModifierLocal;
/*     */ import androidx.compose.ui.platform.InspectableValueKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\032\024\020\005\032\0020\006*\0020\0062\006\020\007\032\0020\bH\007\032\024\020\005\032\0020\006*\0020\0062\006\020\t\032\0020\002H\007\032/\020\n\032\0020\006*\0020\0062!\020\013\032\035\022\023\022\0210\002¢\006\f\b\r\022\b\b\016\022\004\b\b(\017\022\004\022\0020\0200\fH\007\032\024\020\021\032\0020\006*\0020\0062\006\020\t\032\0020\002H\007\"\032\020\000\032\b\022\004\022\0020\0020\001X\004¢\006\b\n\000\032\004\b\003\020\004¨\006\022"}, d2 = {"ModifierLocalConsumedWindowInsets", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/foundation/layout/WindowInsets;", "getModifierLocalConsumedWindowInsets", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "consumeWindowInsets", "Landroidx/compose/ui/Modifier;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "insets", "onConsumedWindowInsetsChanged", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "consumedWindowInsets", "", "windowInsetsPadding", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,490:1\n135#2:491\n135#2:492\n135#2:493\n135#2:494\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n57#1:491\n77#1:492\n101#1:493\n121#1:494\n*E\n"})
/*     */ public final class WindowInsetsPaddingKt
/*     */ {
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier windowInsetsPadding(@NotNull Modifier $this$windowInsetsPadding, @NotNull WindowInsets insets) {
/*  56 */     Intrinsics.checkNotNullParameter($this$windowInsetsPadding, "<this>"); Intrinsics.checkNotNullParameter(insets, "insets");
/*  57 */     int $i$f$debugInspectorInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 491 */     return ComposedModifierKt.composed($this$windowInsetsPadding, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1(insets) : InspectableValueKt.getNoInspectorInfo(), new WindowInsetsPaddingKt$windowInsetsPadding$2(insets)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\001H\013¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}) @SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$windowInsetsPadding$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,490:1\n1225#2,6:491\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$windowInsetsPadding$2\n*L\n62#1:491,6\n*E\n"}) static final class WindowInsetsPaddingKt$windowInsetsPadding$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> { WindowInsetsPaddingKt$windowInsetsPadding$2(WindowInsets $insets) { super(3); } @Composable @NotNull public final Modifier invoke(@NotNull Modifier $this$composed, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$composed, "$this$composed"); $composer.startReplaceGroup(-1415685722); ComposerKt.sourceInformation($composer, "C61@2466L50:WindowInsetsPadding.kt#2w3rfo"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1415685722, $changed, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:61)");  ComposerKt.sourceInformationMarkerStart($composer, -324934766, "CC(remember):WindowInsetsPadding.kt#9igjgp"); Composer composer = $composer; boolean bool = $composer.changed(this.$insets); WindowInsets windowInsets = this.$insets; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 492 */       if (bool || it$iv == Composer.Companion.getEmpty()) {
/* 493 */         int $i$a$-cache-WindowInsetsPaddingKt$windowInsetsPadding$2$1 = 0; Object value$iv = new InsetsPaddingModifier(windowInsets);
/* 494 */         composer.updateRememberedValue(value$iv);
/*     */       } 
/* 496 */       InsetsPaddingModifier insetsPaddingModifier2 = (InsetsPaddingModifier)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); InsetsPaddingModifier insetsPaddingModifier1 = insetsPaddingModifier2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (Modifier)insetsPaddingModifier1; } } @Stable @NotNull public static final Modifier consumeWindowInsets(@NotNull Modifier $this$consumeWindowInsets, @NotNull WindowInsets insets) { Intrinsics.checkNotNullParameter($this$consumeWindowInsets, "<this>"); Intrinsics.checkNotNullParameter(insets, "insets"); int $i$f$debugInspectorInfo = 0; return ComposedModifierKt.composed($this$consumeWindowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$1(insets) : InspectableValueKt.getNoInspectorInfo(), new WindowInsetsPaddingKt$consumeWindowInsets$2(insets)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\001H\013¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}) @SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,490:1\n1225#2,6:491\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$2\n*L\n82#1:491,6\n*E\n"}) static final class WindowInsetsPaddingKt$consumeWindowInsets$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> { @Composable @NotNull public final Modifier invoke(@NotNull Modifier $this$composed, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$composed, "$this$composed"); $composer.startReplaceGroup(788931215); ComposerKt.sourceInformation($composer, "C81@3188L57:WindowInsetsPadding.kt#2w3rfo"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(788931215, $changed, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:81)");  ComposerKt.sourceInformationMarkerStart($composer, -261086064, "CC(remember):WindowInsetsPadding.kt#9igjgp"); Composer composer = $composer; boolean bool = $composer.changed(this.$insets); WindowInsets windowInsets = this.$insets; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; if (bool || it$iv == Composer.Companion.getEmpty()) { int $i$a$-cache-WindowInsetsPaddingKt$consumeWindowInsets$2$1 = 0; Object value$iv = new UnionInsetsConsumingModifier(windowInsets); composer.updateRememberedValue(value$iv); }  UnionInsetsConsumingModifier unionInsetsConsumingModifier2 = (UnionInsetsConsumingModifier)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); UnionInsetsConsumingModifier unionInsetsConsumingModifier1 = unionInsetsConsumingModifier2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (Modifier)unionInsetsConsumingModifier1; } WindowInsetsPaddingKt$consumeWindowInsets$2(WindowInsets $insets) { super(3); } } @Stable @NotNull public static final Modifier consumeWindowInsets(@NotNull Modifier $this$consumeWindowInsets, @NotNull PaddingValues paddingValues) { Intrinsics.checkNotNullParameter($this$consumeWindowInsets, "<this>"); Intrinsics.checkNotNullParameter(paddingValues, "paddingValues"); int $i$f$debugInspectorInfo = 0; return ComposedModifierKt.composed($this$consumeWindowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2(paddingValues) : InspectableValueKt.getNoInspectorInfo(), new WindowInsetsPaddingKt$consumeWindowInsets$4(paddingValues)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\001H\013¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}) @SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,490:1\n1225#2,6:491\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$consumeWindowInsets$4\n*L\n106#1:491,6\n*E\n"}) static final class WindowInsetsPaddingKt$consumeWindowInsets$4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> { @Composable @NotNull public final Modifier invoke(@NotNull Modifier $this$composed, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$composed, "$this$composed"); $composer.startReplaceGroup(114694318); ComposerKt.sourceInformation($composer, "C105@4277L85:WindowInsetsPadding.kt#2w3rfo"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(114694318, $changed, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:105)");  ComposerKt.sourceInformationMarkerStart($composer, -261051188, "CC(remember):WindowInsetsPadding.kt#9igjgp"); Composer composer = $composer; boolean bool = $composer.changed(this.$paddingValues); PaddingValues paddingValues = this.$paddingValues; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; if (bool || it$iv == Composer.Companion.getEmpty()) { int $i$a$-cache-WindowInsetsPaddingKt$consumeWindowInsets$4$1 = 0; Object value$iv = new PaddingValuesConsumingModifier(paddingValues); composer.updateRememberedValue(value$iv); }  PaddingValuesConsumingModifier paddingValuesConsumingModifier2 = (PaddingValuesConsumingModifier)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); PaddingValuesConsumingModifier paddingValuesConsumingModifier1 = paddingValuesConsumingModifier2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (Modifier)paddingValuesConsumingModifier1; } WindowInsetsPaddingKt$consumeWindowInsets$4(PaddingValues $paddingValues) { super(3); } } @Stable @NotNull public static final Modifier onConsumedWindowInsetsChanged(@NotNull Modifier $this$onConsumedWindowInsetsChanged, @NotNull Function1<? super WindowInsets, Unit> block) { Intrinsics.checkNotNullParameter($this$onConsumedWindowInsetsChanged, "<this>"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$debugInspectorInfo = 0; return ComposedModifierKt.composed($this$onConsumedWindowInsetsChanged, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1(block) : InspectableValueKt.getNoInspectorInfo(), new WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2(block)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\001H\013¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}) @SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,490:1\n1225#2,6:491\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2\n*L\n126#1:491,6\n*E\n"}) static final class WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> { @Composable @NotNull public final Modifier invoke(@NotNull Modifier $this$composed, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$composed, "$this$composed"); $composer.startReplaceGroup(-1608161351); ComposerKt.sourceInformation($composer, "C125@4856L61:WindowInsetsPadding.kt#2w3rfo"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1608161351, $changed, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:125)");  ComposerKt.sourceInformationMarkerStart($composer, 16130585, "CC(remember):WindowInsetsPadding.kt#9igjgp"); Composer composer = $composer; boolean bool = $composer.changed(this.$block); Function1<WindowInsets, Unit> function1 = this.$block; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; if (bool || it$iv == Composer.Companion.getEmpty()) { int $i$a$-cache-WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2$1 = 0; Object value$iv = new ConsumedInsetsModifier(function1); composer.updateRememberedValue(value$iv); }  ConsumedInsetsModifier consumedInsetsModifier2 = (ConsumedInsetsModifier)it$iv;
/*     */       ComposerKt.sourceInformationMarkerEnd($composer);
/*     */       ConsumedInsetsModifier consumedInsetsModifier1 = consumedInsetsModifier2;
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */       $composer.endReplaceGroup();
/*     */       return (Modifier)consumedInsetsModifier1; }
/*     */ 
/*     */     
/*     */     WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2(Function1<WindowInsets, Unit> $block) {
/*     */       super(3);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final ProvidableModifierLocal<WindowInsets> ModifierLocalConsumedWindowInsets = ModifierLocalKt.modifierLocalOf(WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1.INSTANCE);
/*     */   
/*     */   @NotNull
/*     */   public static final ProvidableModifierLocal<WindowInsets> getModifierLocalConsumedWindowInsets() {
/*     */     return ModifierLocalConsumedWindowInsets;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/layout/WindowInsets;", "invoke"})
/*     */   static final class WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1 extends Lambda implements Function0<WindowInsets> {
/*     */     public static final WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1 INSTANCE = new WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1();
/*     */     
/*     */     @NotNull
/*     */     public final WindowInsets invoke() {
/*     */       return WindowInsetsKt.WindowInsets(0, 0, 0, 0);
/*     */     }
/*     */     
/*     */     WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\WindowInsetsPaddingKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */