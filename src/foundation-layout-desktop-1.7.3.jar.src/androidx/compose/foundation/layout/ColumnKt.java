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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000J\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\005\032M\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\034\020\016\032\030\022\004\022\0020\020\022\004\022\0020\0070\017¢\006\002\b\021¢\006\002\b\022H\bø\001\000¢\006\002\020\023\032\035\020\024\032\0020\0012\006\020\n\032\0020\0132\006\020\f\032\0020\rH\001¢\006\002\020\025\0325\020\026\032\0020\0272\006\020\030\032\0020\0312\006\020\032\032\0020\0332\006\020\034\032\0020\0332\006\020\035\032\0020\0332\006\020\036\032\0020\033H\000¢\006\002\020\037\"\034\020\000\032\0020\0018\000X\004¢\006\016\n\000\022\004\b\002\020\003\032\004\b\004\020\005\002\007\n\005\b20\001¨\006 "}, d2 = {"DefaultColumnMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy$annotations", "()V", "getDefaultColumnMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "Column", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "createColumnConstraints", "Landroidx/compose/ui/unit/Constraints;", "isPrioritizing", "", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "(ZIIII)J", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,398:1\n79#2,6:399\n86#2,4:414\n90#2,2:424\n94#2:429\n368#3,9:405\n377#3,3:426\n4034#4,6:418\n1225#5,6:430\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n88#1:399,6\n88#1:414,4\n88#1:424,2\n88#1:429\n88#1:405,9\n88#1:426,3\n88#1:418,6\n110#1:430,6\n*E\n"})
/*     */ public final class ColumnKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void Column(@Nullable Modifier modifier, @Nullable Arrangement.Vertical verticalArrangement, @Nullable Alignment.Horizontal horizontalAlignment, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*  86 */     Intrinsics.checkNotNullParameter(content, "content"); int $i$f$Column = 0; ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"); if ((paramInt1 & 0x1) != 0) modifier = (Modifier)Modifier.Companion;  if ((paramInt1 & 0x2) != 0) verticalArrangement = Arrangement.INSTANCE.getTop();  if ((paramInt1 & 0x4) != 0)
/*  87 */       horizontalAlignment = Alignment.Companion.getStart();  MeasurePolicy measurePolicy = columnMeasurePolicy(verticalArrangement, horizontalAlignment, $composer, 0xE & $changed >> 3 | 0x70 & $changed >> 3); int $changed$iv = 0x70 & $changed << 3;
/*  88 */     int $i$f$Layout = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 399 */     ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 400 */     int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 401 */     CompositionLocalMap localMap$iv = $composer.getCurrentCompositionLocalMap();
/* 402 */     Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer, modifier);
/*     */     
/* 404 */     Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv = 0x6 | 0x380 & $changed$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 405 */     ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 406 */     if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 407 */       .startReusableNode();
/* 408 */     if ($composer.getInserting()) { $composer
/* 409 */         .createNode(function0); } else { $composer
/*     */         
/* 411 */         .useNode(); }
/*     */     
/* 413 */     Composer $this$Layout_u24lambda_u240$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv = 0;
/* 414 */     Updater.set-impl($this$Layout_u24lambda_u240$iv, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 415 */     Updater.set-impl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */     
/* 417 */     Function2 block$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 418 */     Composer $this$set_impl_u24lambda_u240$iv$iv = $this$Layout_u24lambda_u240$iv; int $i$a$-with-Updater$set$1$iv$iv = 0;
/* 419 */     if ($this$set_impl_u24lambda_u240$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv))) {
/* 420 */       $this$set_impl_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
/* 421 */       $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), block$iv$iv);
/*     */     } 
/*     */     
/* 424 */     Updater.set-impl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
/*     */     
/* 426 */     int i = 0xE & $changed$iv$iv >> 6; Composer composer1 = $composer; int $i$a$-Layout-ColumnKt$Column$1 = 0; ComposerKt.sourceInformationMarkerStart(composer1, -384784025, "C88@4444L9:Column.kt#2w3rfo"); content.invoke(ColumnScopeInstance.INSTANCE, composer1, Integer.valueOf(0x6 | 0x70 & $changed >> 6)); ComposerKt.sourceInformationMarkerEnd(composer1); $composer
/* 427 */       .endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 428 */     ComposerKt.sourceInformationMarkerEnd($composer);
/* 429 */     ComposerKt.sourceInformationMarkerEnd($composer); } @PublishedApi @Composable @NotNull public static final MeasurePolicy columnMeasurePolicy(@NotNull Arrangement.Vertical verticalArrangement, @NotNull Alignment.Horizontal horizontalAlignment, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement"); Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment"); ComposerKt.sourceInformationMarkerStart($composer, 1089876336, "C(columnMeasurePolicy)P(1):Column.kt#2w3rfo"); if (ComposerKt.isTraceInProgress())
/* 430 */       ComposerKt.traceEventStart(1089876336, $changed, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:106)");  $composer.startReplaceGroup(-1789957655); ComposerKt.sourceInformation($composer, "109@5034L227"); if (Intrinsics.areEqual(verticalArrangement, Arrangement.INSTANCE.getTop()) && Intrinsics.areEqual(horizontalAlignment, Alignment.Companion.getStart())) {  } else { ComposerKt.sourceInformationMarkerStart($composer, -1789953197, "CC(remember):Column.kt#9igjgp"); Composer composer = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(verticalArrangement)) || ($changed & 0x6) == 4) ? 1 : 0) | (((($changed & 0x70 ^ 0x30) > 32 && $composer.changed(horizontalAlignment)) || ($changed & 0x30) == 32) ? 1 : 0), $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 431 */       if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 432 */         int $i$a$-cache-ColumnKt$columnMeasurePolicy$1 = 0;
/*     */       } }
/*     */     
/* 435 */     Object object2 = it$iv;
/*     */     $composer.endReplaceGroup();
/*     */     Object object1 = object2;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return (MeasurePolicy)object1; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final MeasurePolicy DefaultColumnMeasurePolicy = new ColumnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart());
/*     */   
/*     */   @NotNull
/*     */   public static final MeasurePolicy getDefaultColumnMeasurePolicy() {
/*     */     return DefaultColumnMeasurePolicy;
/*     */   }
/*     */   
/*     */   public static final long createColumnConstraints(boolean isPrioritizing, int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax) {
/*     */     return !isPrioritizing ? ConstraintsKt.Constraints(crossAxisMin, crossAxisMax, mainAxisMin, mainAxisMax) : Constraints.Companion.fitPrioritizingHeight-Zbe2FdA(crossAxisMin, crossAxisMax, mainAxisMin, mainAxisMax);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\ColumnKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */