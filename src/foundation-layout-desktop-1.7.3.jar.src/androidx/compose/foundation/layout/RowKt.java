/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000J\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\007\032M\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\034\020\016\032\030\022\004\022\0020\020\022\004\022\0020\0070\017¢\006\002\b\021¢\006\002\b\022H\bø\001\000¢\006\002\020\023\0325\020\024\032\0020\0252\006\020\026\032\0020\0272\006\020\030\032\0020\0312\006\020\032\032\0020\0312\006\020\033\032\0020\0312\006\020\034\032\0020\031H\000¢\006\002\020\035\032\035\020\036\032\0020\0012\006\020\n\032\0020\0132\006\020\f\032\0020\rH\001¢\006\002\020\037\"\034\020\000\032\0020\0018\000X\004¢\006\016\n\000\022\004\b\002\020\003\032\004\b\004\020\005\002\007\n\005\b20\001¨\006 "}, d2 = {"DefaultRowMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy$annotations", "()V", "getDefaultRowMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "Row", "", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "createRowConstraints", "Landroidx/compose/ui/unit/Constraints;", "isPrioritizing", "", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "(ZIIII)J", "rowMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,429:1\n79#2,6:430\n86#2,4:445\n90#2,2:455\n94#2:460\n368#3,9:436\n377#3,3:457\n4034#4,6:449\n1225#5,6:461\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n101#1:430,6\n101#1:445,4\n101#1:455,2\n101#1:460\n101#1:436,9\n101#1:457,3\n101#1:449,6\n126#1:461,6\n*E\n"})
/*     */ public final class RowKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void Row(@Nullable Modifier modifier, @Nullable Arrangement.Horizontal horizontalArrangement, @Nullable Alignment.Vertical verticalAlignment, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*  99 */     Intrinsics.checkNotNullParameter(content, "content"); int $i$f$Row = 0; ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo"); if ((paramInt1 & 0x1) != 0) modifier = (Modifier)Modifier.Companion;  if ((paramInt1 & 0x2) != 0) horizontalArrangement = Arrangement.INSTANCE.getStart();  if ((paramInt1 & 0x4) != 0)
/* 100 */       verticalAlignment = Alignment.Companion.getTop();  MeasurePolicy measurePolicy = rowMeasurePolicy(horizontalArrangement, verticalAlignment, $composer, 0xE & $changed >> 3 | 0x70 & $changed >> 3); int $changed$iv = 0x70 & $changed << 3;
/* 101 */     int $i$f$Layout = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 430 */     ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 431 */     int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 432 */     CompositionLocalMap localMap$iv = $composer.getCurrentCompositionLocalMap();
/* 433 */     Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer, modifier);
/*     */     
/* 435 */     Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv = 0x6 | 0x380 & $changed$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 436 */     ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 437 */     if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 438 */       .startReusableNode();
/* 439 */     if ($composer.getInserting()) { $composer
/* 440 */         .createNode(function0); } else { $composer
/*     */         
/* 442 */         .useNode(); }
/*     */     
/* 444 */     Composer $this$Layout_u24lambda_u240$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv = 0;
/* 445 */     Updater.set-impl($this$Layout_u24lambda_u240$iv, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 446 */     Updater.set-impl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */     
/* 448 */     Function2 block$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 449 */     Composer $this$set_impl_u24lambda_u240$iv$iv = $this$Layout_u24lambda_u240$iv; int $i$a$-with-Updater$set$1$iv$iv = 0;
/* 450 */     if ($this$set_impl_u24lambda_u240$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv))) {
/* 451 */       $this$set_impl_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
/* 452 */       $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), block$iv$iv);
/*     */     } 
/*     */     
/* 455 */     Updater.set-impl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
/*     */     
/* 457 */     int i = 0xE & $changed$iv$iv >> 6; Composer composer1 = $composer; int $i$a$-Layout-RowKt$Row$1 = 0; ComposerKt.sourceInformationMarkerStart(composer1, -407840262, "C101@5126L9:Row.kt#2w3rfo"); content.invoke(RowScopeInstance.INSTANCE, composer1, Integer.valueOf(0x6 | 0x70 & $changed >> 6)); ComposerKt.sourceInformationMarkerEnd(composer1); $composer
/* 458 */       .endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 459 */     ComposerKt.sourceInformationMarkerEnd($composer);
/* 460 */     ComposerKt.sourceInformationMarkerEnd($composer); } @PublishedApi @Composable @NotNull public static final MeasurePolicy rowMeasurePolicy(@NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Alignment.Vertical verticalAlignment, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement"); Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment"); ComposerKt.sourceInformationMarkerStart($composer, -837807694, "C(rowMeasurePolicy):Row.kt#2w3rfo"); if (ComposerKt.isTraceInProgress())
/* 461 */       ComposerKt.traceEventStart(-837807694, $changed, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:122)");  $composer.startReplaceGroup(-1828507469); ComposerKt.sourceInformation($composer, "125@5803L224"); if (Intrinsics.areEqual(horizontalArrangement, Arrangement.INSTANCE.getStart()) && Intrinsics.areEqual(verticalAlignment, Alignment.Companion.getTop())) {  } else { ComposerKt.sourceInformationMarkerStart($composer, -1828503104, "CC(remember):Row.kt#9igjgp"); Composer composer = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(horizontalArrangement)) || ($changed & 0x6) == 4) ? 1 : 0) | (((($changed & 0x70 ^ 0x30) > 32 && $composer.changed(verticalAlignment)) || ($changed & 0x30) == 32) ? 1 : 0), $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 462 */       if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 463 */         int $i$a$-cache-RowKt$rowMeasurePolicy$1 = 0;
/*     */       } }
/*     */     
/* 466 */     Object object2 = it$iv;
/*     */     $composer.endReplaceGroup();
/*     */     Object object1 = object2;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return (MeasurePolicy)object1; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final MeasurePolicy DefaultRowMeasurePolicy = new RowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop());
/*     */   
/*     */   @NotNull
/*     */   public static final MeasurePolicy getDefaultRowMeasurePolicy() {
/*     */     return DefaultRowMeasurePolicy;
/*     */   }
/*     */   
/*     */   public static final long createRowConstraints(boolean isPrioritizing, int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax) {
/*     */     return !isPrioritizing ? ConstraintsKt.Constraints(mainAxisMin, mainAxisMax, crossAxisMin, crossAxisMax) : Constraints.Companion.fitPrioritizingWidth-Zbe2FdA(mainAxisMin, mainAxisMax, crossAxisMin, crossAxisMax);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\RowKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */