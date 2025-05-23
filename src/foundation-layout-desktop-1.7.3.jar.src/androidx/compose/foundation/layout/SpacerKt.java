/*    */ package androidx.compose.foundation.layout;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.ComposablesKt;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocalMap;
/*    */ import androidx.compose.runtime.Updater;
/*    */ import androidx.compose.ui.ComposedModifierKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.node.ComposeUiNode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\007¢\006\002\020\004¨\006\005"}, d2 = {"Spacer", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "foundation-layout"})
/*    */ @SourceDebugExtension({"SMAP\nSpacer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,56:1\n125#2,6:57\n132#2,5:72\n137#2:83\n139#2:86\n289#3,9:63\n298#3,2:84\n4034#4,6:77\n*S KotlinDebug\n*F\n+ 1 Spacer.kt\nandroidx/compose/foundation/layout/SpacerKt\n*L\n40#1:57,6\n40#1:72,5\n40#1:83\n40#1:86\n40#1:63,9\n40#1:84,2\n40#1:77,6\n*E\n"})
/*    */ public final class SpacerKt
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void Spacer(@NotNull Modifier modifier, @Nullable Composer $composer, int $changed) {
/* 39 */     Intrinsics.checkNotNullParameter(modifier, "modifier"); ComposerKt.sourceInformationMarkerStart($composer, -72882467, "C(Spacer)39@1433L64:Spacer.kt#2w3rfo"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-72882467, $changed, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)"); 
/* 40 */     SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.INSTANCE; int $changed$iv = 0x30 | 0xE & $changed, $i$f$Layout = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 57 */     ComposerKt.sourceInformationMarkerStart($composer, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
/* 58 */     int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 59 */     Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer, modifier);
/* 60 */     CompositionLocalMap localMap$iv = $composer.getCurrentCompositionLocalMap();
/*    */     
/* 62 */     Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv = 6; int $i$f$ReusableComposeNode = 0;
/* 63 */     ComposerKt.sourceInformationMarkerStart($composer, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
/* 64 */     if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 65 */       .startReusableNode();
/* 66 */     if ($composer.getInserting()) { $composer
/* 67 */         .createNode(function0); } else { $composer
/*    */         
/* 69 */         .useNode(); }
/*    */     
/* 71 */     Composer $this$Layout_u24lambda_u241$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$2$iv = 0;
/* 72 */     Updater.set-impl($this$Layout_u24lambda_u241$iv, spacerMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 73 */     Updater.set-impl($this$Layout_u24lambda_u241$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/* 74 */     Updater.set-impl($this$Layout_u24lambda_u241$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
/*    */     
/* 76 */     Function2 block$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 77 */     Composer $this$set_impl_u24lambda_u240$iv$iv = $this$Layout_u24lambda_u241$iv; int $i$a$-with-Updater$set$1$iv$iv = 0;
/* 78 */     if ($this$set_impl_u24lambda_u240$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv))) {
/* 79 */       $this$set_impl_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
/* 80 */       $this$Layout_u24lambda_u241$iv.apply(Integer.valueOf(compositeKeyHash$iv), block$iv$iv);
/*    */     } 
/*    */ 
/*    */     
/* 84 */     $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 85 */     ComposerKt.sourceInformationMarkerEnd($composer);
/* 86 */     if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\SpacerKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */