/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import java.util.HashMap;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000l\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\032\025\020\023\032\0020\0242\006\020\025\032\0020\026H\007¢\006\002\020\027\032M\020\023\032\0020\0242\b\b\002\020\025\032\0020\0262\b\b\002\020\030\032\0020\0072\b\b\002\020\031\032\0020\0202\034\020\032\032\030\022\004\022\0020\034\022\004\022\0020\0240\033¢\006\002\b\035¢\006\002\b\036H\bø\001\000¢\006\002\020\037\032,\020 \032\036\022\004\022\0020\007\022\004\022\0020\0010\006j\016\022\004\022\0020\007\022\004\022\0020\001`\b2\006\020\031\032\0020\020H\002\032\030\020!\032\0020\0012\006\020\"\032\0020\0072\006\020\031\032\0020\020H\001\032\035\020#\032\0020\0012\006\020\"\032\0020\0072\006\020\031\032\0020\020H\001¢\006\002\020$\032<\020%\032\0020\024*\0020&2\006\020'\032\0020(2\006\020)\032\0020\f2\006\020*\032\0020+2\006\020,\032\0020-2\006\020.\032\0020-2\006\020\"\032\0020\007H\002\"\016\020\000\032\0020\001X\004¢\006\002\n\000\"\024\020\002\032\0020\001X\004¢\006\b\n\000\032\004\b\003\020\004\"*\020\005\032\036\022\004\022\0020\007\022\004\022\0020\0010\006j\016\022\004\022\0020\007\022\004\022\0020\001`\bX\004¢\006\002\n\000\"*\020\t\032\036\022\004\022\0020\007\022\004\022\0020\0010\006j\016\022\004\022\0020\007\022\004\022\0020\001`\bX\004¢\006\002\n\000\"\032\020\n\032\004\030\0010\013*\0020\f8BX\004¢\006\006\032\004\b\r\020\016\"\030\020\017\032\0020\020*\0020\f8BX\004¢\006\006\032\004\b\021\020\022\002\007\n\005\b20\001¨\006/"}, d2 = {"DefaultBoxMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "EmptyBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "cache1", "Ljava/util/HashMap;", "Landroidx/compose/ui/Alignment;", "Lkotlin/collections/HashMap;", "cache2", "boxChildDataNode", "Landroidx/compose/foundation/layout/BoxChildDataNode;", "Landroidx/compose/ui/layout/Measurable;", "getBoxChildDataNode", "(Landroidx/compose/ui/layout/Measurable;)Landroidx/compose/foundation/layout/BoxChildDataNode;", "matchesParentSize", "", "getMatchesParentSize", "(Landroidx/compose/ui/layout/Measurable;)Z", "Box", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "contentAlignment", "propagateMinConstraints", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "cacheFor", "maybeCachedBoxMeasurePolicy", "alignment", "rememberBoxMeasurePolicy", "(Landroidx/compose/ui/Alignment;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "placeInBox", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "measurable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "boxWidth", "", "boxHeight", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,339:1\n79#2,6:340\n86#2,4:355\n90#2,2:365\n94#2:370\n125#2,6:377\n132#2,5:392\n137#2:403\n139#2:406\n368#3,9:346\n377#3,3:367\n289#3,9:383\n298#3,2:404\n4034#4,6:359\n4034#4,6:397\n1225#5,6:371\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n73#1:340,6\n73#1:355,4\n73#1:365,2\n73#1:370\n238#1:377,6\n238#1:392,5\n238#1:403\n238#1:406\n73#1:346,9\n73#1:367,3\n238#1:383,9\n238#1:404,2\n73#1:359,6\n238#1:397,6\n117#1:371,6\n*E\n"})
/*     */ public final class BoxKt {
/*     */   private static final HashMap<Alignment, MeasurePolicy> cacheFor(boolean propagateMinConstraints) {
/*     */     HashMap<Object, Object> hashMap1 = new HashMap<>(9), $this$cacheFor_u24lambda_u241 = hashMap1;
/*     */     int $i$a$-apply-BoxKt$cacheFor$1 = 0;
/*     */     cacheFor$lambda$1$putAlignment((HashMap)$this$cacheFor_u24lambda_u241, propagateMinConstraints, Alignment.Companion.getTopStart());
/*     */     cacheFor$lambda$1$putAlignment((HashMap)$this$cacheFor_u24lambda_u241, propagateMinConstraints, Alignment.Companion.getTopCenter());
/*     */     cacheFor$lambda$1$putAlignment((HashMap)$this$cacheFor_u24lambda_u241, propagateMinConstraints, Alignment.Companion.getTopEnd());
/*     */     cacheFor$lambda$1$putAlignment((HashMap)$this$cacheFor_u24lambda_u241, propagateMinConstraints, Alignment.Companion.getCenterStart());
/*     */     cacheFor$lambda$1$putAlignment((HashMap)$this$cacheFor_u24lambda_u241, propagateMinConstraints, Alignment.Companion.getCenter());
/*     */     cacheFor$lambda$1$putAlignment((HashMap)$this$cacheFor_u24lambda_u241, propagateMinConstraints, Alignment.Companion.getCenterEnd());
/*     */     cacheFor$lambda$1$putAlignment((HashMap)$this$cacheFor_u24lambda_u241, propagateMinConstraints, Alignment.Companion.getBottomStart());
/*     */     cacheFor$lambda$1$putAlignment((HashMap)$this$cacheFor_u24lambda_u241, propagateMinConstraints, Alignment.Companion.getBottomCenter());
/*     */     cacheFor$lambda$1$putAlignment((HashMap)$this$cacheFor_u24lambda_u241, propagateMinConstraints, Alignment.Companion.getBottomEnd());
/*     */     return (HashMap)hashMap1;
/*     */   }
/*     */   
/*     */   private static final void cacheFor$lambda$1$putAlignment(HashMap<Alignment, BoxMeasurePolicy> $this_apply, boolean $propagateMinConstraints, Alignment it) {
/*     */     $this_apply.put(it, new BoxMeasurePolicy(it, $propagateMinConstraints));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final HashMap<Alignment, MeasurePolicy> cache1 = cacheFor(true);
/*     */   @NotNull
/*     */   private static final HashMap<Alignment, MeasurePolicy> cache2 = cacheFor(false);
/*     */   
/*     */   @PublishedApi
/*     */   @NotNull
/*     */   public static final MeasurePolicy maybeCachedBoxMeasurePolicy(@NotNull Alignment alignment, boolean propagateMinConstraints) {
/*     */     Intrinsics.checkNotNullParameter(alignment, "alignment");
/*     */     HashMap<Alignment, MeasurePolicy> cache = propagateMinConstraints ? cache1 : cache2;
/*     */     if ((MeasurePolicy)cache.get(alignment) == null)
/*     */       (MeasurePolicy)cache.get(alignment); 
/*     */     return new BoxMeasurePolicy(alignment, propagateMinConstraints);
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*  71 */   public static final void Box(@Nullable Modifier modifier, @Nullable Alignment contentAlignment, boolean propagateMinConstraints, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter(content, "content"); int $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); if ((paramInt1 & 0x1) != 0) modifier = (Modifier)Modifier.Companion;  if ((paramInt1 & 0x2) != 0) contentAlignment = Alignment.Companion.getTopStart();  if ((paramInt1 & 0x4) != 0)
/*  72 */       propagateMinConstraints = false;  MeasurePolicy measurePolicy = maybeCachedBoxMeasurePolicy(contentAlignment, propagateMinConstraints); int $changed$iv = 0x70 & $changed << 3;
/*  73 */     int $i$f$Layout = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 340 */     ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 341 */     int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 342 */     CompositionLocalMap localMap$iv = $composer.getCurrentCompositionLocalMap();
/* 343 */     Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer, modifier);
/*     */     
/* 345 */     Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv = 0x6 | 0x380 & $changed$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 346 */     ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 347 */     if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 348 */       .startReusableNode();
/* 349 */     if ($composer.getInserting()) { $composer
/* 350 */         .createNode(function0); } else { $composer
/*     */         
/* 352 */         .useNode(); }
/*     */     
/* 354 */     Composer $this$Layout_u24lambda_u240$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv = 0;
/* 355 */     Updater.set-impl($this$Layout_u24lambda_u240$iv, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 356 */     Updater.set-impl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */     
/* 358 */     Function2 block$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 359 */     Composer $this$set_impl_u24lambda_u240$iv$iv = $this$Layout_u24lambda_u240$iv; int $i$a$-with-Updater$set$1$iv$iv = 0;
/* 360 */     if ($this$set_impl_u24lambda_u240$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv))) {
/* 361 */       $this$set_impl_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
/* 362 */       $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), block$iv$iv);
/*     */     } 
/*     */     
/* 365 */     Updater.set-impl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
/*     */     
/* 367 */     int i = 0xE & $changed$iv$iv >> 6; Composer composer1 = $composer; int $i$a$-Layout-BoxKt$Box$1 = 0; ComposerKt.sourceInformationMarkerStart(composer1, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); content.invoke(BoxScopeInstance.INSTANCE, composer1, Integer.valueOf(0x6 | 0x70 & $changed >> 6)); ComposerKt.sourceInformationMarkerEnd(composer1); $composer
/* 368 */       .endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 369 */     ComposerKt.sourceInformationMarkerEnd($composer);
/* 370 */     ComposerKt.sourceInformationMarkerEnd($composer); } @PublishedApi @Composable @NotNull public static final MeasurePolicy rememberBoxMeasurePolicy(@NotNull Alignment alignment, boolean propagateMinConstraints, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(alignment, "alignment"); ComposerKt.sourceInformationMarkerStart($composer, 56522820, "C(rememberBoxMeasurePolicy):Box.kt#2w3rfo"); if (ComposerKt.isTraceInProgress())
/* 371 */       ComposerKt.traceEventStart(56522820, $changed, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:113)");  $composer.startReplaceGroup(-55167685); ComposerKt.sourceInformation($composer, "116@4696L113"); if (Intrinsics.areEqual(alignment, Alignment.Companion.getTopStart()) && !propagateMinConstraints) {  } else { ComposerKt.sourceInformationMarkerStart($composer, -55164339, "CC(remember):Box.kt#9igjgp"); Composer composer = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(alignment)) || ($changed & 0x6) == 4) ? 1 : 0) | (((($changed & 0x70 ^ 0x30) > 32 && $composer.changed(propagateMinConstraints)) || ($changed & 0x30) == 32) ? 1 : 0), $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 372 */       if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 373 */         int $i$a$-cache-BoxKt$rememberBoxMeasurePolicy$1 = 0; Object value$iv = new BoxMeasurePolicy(alignment, propagateMinConstraints);
/* 374 */         composer.updateRememberedValue(value$iv);
/*     */       }  }
/* 376 */      Object object2 = it$iv; $composer.endReplaceGroup(); Object object1 = object2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return (MeasurePolicy)object1; } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void Box(@NotNull Modifier modifier, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(modifier, "modifier"); $composer = $composer.startRestartGroup(-211209833); ComposerKt.sourceInformation($composer, "C(Box)237@9098L66:Box.kt#2w3rfo"); int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changed(modifier) ? 4 : 2;  if (($dirty & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress())
/* 377 */         ComposerKt.traceEventStart(-211209833, $dirty, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");  MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy; int $changed$iv = 0x30 | 0xE & $dirty, $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
/* 378 */       int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 379 */       Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer, modifier);
/* 380 */       CompositionLocalMap localMap$iv = $composer.getCurrentCompositionLocalMap();
/*     */       
/* 382 */       Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv = 6; int $i$f$ReusableComposeNode = 0;
/* 383 */       ComposerKt.sourceInformationMarkerStart($composer, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
/* 384 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 385 */         .startReusableNode();
/* 386 */       if ($composer.getInserting()) { $composer
/* 387 */           .createNode(function0); } else { $composer
/*     */           
/* 389 */           .useNode(); }
/*     */       
/* 391 */       Composer $this$Layout_u24lambda_u241$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$2$iv = 0;
/* 392 */       Updater.set-impl($this$Layout_u24lambda_u241$iv, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 393 */       Updater.set-impl($this$Layout_u24lambda_u241$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/* 394 */       Updater.set-impl($this$Layout_u24lambda_u241$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 396 */       Function2 block$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 397 */       Composer $this$set_impl_u24lambda_u240$iv$iv = $this$Layout_u24lambda_u241$iv; int $i$a$-with-Updater$set$1$iv$iv = 0;
/* 398 */       if ($this$set_impl_u24lambda_u240$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv))) {
/* 399 */         $this$set_impl_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
/* 400 */         $this$Layout_u24lambda_u241$iv.apply(Integer.valueOf(compositeKeyHash$iv), block$iv$iv);
/*     */       } 
/*     */ 
/*     */       
/* 404 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 405 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 406 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */     
/*     */     if ($composer.endRestartGroup() != null) {
/*     */       $composer.endRestartGroup().updateScope(new BoxKt$Box$2(modifier, $changed));
/*     */     } else {
/*     */       $composer.endRestartGroup();
/*     */     }  }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final MeasurePolicy DefaultBoxMeasurePolicy = new BoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
/*     */   
/*     */   private static final void placeInBox(Placeable.PlacementScope $this$placeInBox, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int boxWidth, int boxHeight, Alignment alignment) {
/*     */     if (getBoxChildDataNode(measurable) == null || getBoxChildDataNode(measurable).getAlignment() == null)
/*     */       getBoxChildDataNode(measurable).getAlignment(); 
/*     */     Alignment childAlignment = alignment;
/*     */     long position = childAlignment.align-KFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(boxWidth, boxHeight), layoutDirection);
/*     */     Placeable.PlacementScope.place-70tqf50$default($this$placeInBox, placeable, position, 0.0F, 2, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final MeasurePolicy EmptyBoxMeasurePolicy = BoxKt$EmptyBoxMeasurePolicy$1.INSTANCE;
/*     */   
/*     */   @NotNull
/*     */   public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
/*     */     return EmptyBoxMeasurePolicy;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\0022\f\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H\n¢\006\004\b\b\020\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "<anonymous parameter 0>", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"})
/*     */   static final class BoxKt$EmptyBoxMeasurePolicy$1 implements MeasurePolicy {
/*     */     public static final BoxKt$EmptyBoxMeasurePolicy$1 INSTANCE = new BoxKt$EmptyBoxMeasurePolicy$1();
/*     */     
/*     */     @NotNull
/*     */     public final MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$MeasurePolicy, @NotNull List<? extends Measurable> param1List, long constraints) {
/*     */       Intrinsics.checkNotNullParameter($this$MeasurePolicy, "$this$MeasurePolicy");
/*     */       Intrinsics.checkNotNullParameter(param1List, "<anonymous parameter 0>");
/*     */       return MeasureScope.layout$default($this$MeasurePolicy, Constraints.getMinWidth-impl(constraints), Constraints.getMinHeight-impl(constraints), null, null.INSTANCE, 4, null);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final BoxChildDataNode getBoxChildDataNode(Measurable $this$boxChildDataNode) {
/*     */     Object object = $this$boxChildDataNode.getParentData();
/*     */     return (object instanceof BoxChildDataNode) ? (BoxChildDataNode)object : null;
/*     */   }
/*     */   
/*     */   private static final boolean getMatchesParentSize(Measurable $this$matchesParentSize) {
/*     */     getBoxChildDataNode($this$matchesParentSize);
/*     */     return (getBoxChildDataNode($this$matchesParentSize) != null) ? getBoxChildDataNode($this$matchesParentSize).getMatchParentSize() : false;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class BoxKt$Box$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     BoxKt$Box$2(Modifier $modifier, int $$changed) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       BoxKt.Box(this.$modifier, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\BoxKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */