/*     */ package org.jetbrains.jewel.foundation.lazy;
/*     */ 
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.lazy.LazyItemScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusRequester;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.foundation.lazy.tree.KeyActions;
/*     */ import org.jetbrains.jewel.foundation.lazy.tree.PointerEventActions;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nSelectableLazyColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,245:1\n71#2:246\n68#2,6:247\n74#2:281\n78#2:285\n79#3,6:253\n86#3,4:268\n90#3,2:278\n94#3:284\n368#4,9:259\n377#4:280\n378#4,2:282\n4034#5,6:272\n*S KotlinDebug\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$1\n*L\n146#1:246\n146#1:247,6\n146#1:281\n146#1:285\n146#1:253,6\n146#1:268,4\n146#1:278,2\n146#1:284\n146#1:259,9\n146#1:280\n146#1:282,2\n146#1:272,6\n*E\n"})
/*     */ final class SelectableLazyColumnKt$appendEntry$1
/*     */   implements Function3<LazyItemScope, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(LazyItemScope $this$item, Composer $composer, int $changed) {
/* 143 */     Intrinsics.checkNotNullParameter($this$item, "$this$item"); int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changed($this$item) ? 4 : 2;  if (($dirty & 0x13) != 18 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1060296196, $dirty, -1, "org.jetbrains.jewel.foundation.lazy.appendEntry.<anonymous> (SelectableLazyColumn.kt:142)");  SelectableLazyItemScope itemScope = 
/* 144 */         SelectableLazyListScopeKt.SelectableLazyItemScope($this$item, this.$state.getSelectedKeys().contains(((SelectableLazyListScopeContainer.Entry.Item)this.$entry).getKey()), this.$isFocused, $composer, 0xE & $dirty, 0);
/* 145 */       if (((Boolean)this.$isKeySelectable.invoke(((SelectableLazyListScopeContainer.Entry.Item)this.$entry).getKey())).booleanValue()) { $composer.startReplaceGroup(-1957364625);
/*     */ 
/*     */         
/* 148 */         Modifier modifier1 = SelectableLazyColumnKt.access$selectable((Modifier)Modifier.Companion, 
/* 149 */             this.$focusRequester, 
/* 150 */             this.$keyActions.getKeybindings(), 
/* 151 */             this.$pointerEventActions, 
/* 152 */             this.$selectionMode, 
/* 153 */             this.$state, 
/* 154 */             this.$keys, (
/* 155 */             (SelectableLazyListScopeContainer.Entry.Item)this.$entry).getKey());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         SelectableLazyListScopeContainer.Entry entry = this.$entry;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         int $changed$iv = 0, $i$f$Box = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 246 */         ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 247 */         Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 248 */         boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */         
/* 251 */         MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 252 */         int $i$f$Layout = 0;
/* 253 */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 254 */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 255 */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 256 */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */         
/* 258 */         Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 259 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 260 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 261 */           .startReusableNode();
/* 262 */         if ($composer.getInserting()) { $composer
/* 263 */             .createNode(function0); } else { $composer
/*     */             
/* 265 */             .useNode(); }
/*     */         
/* 267 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 268 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 269 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 271 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 272 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 273 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 274 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 275 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         
/* 278 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 280 */         int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 281 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-SelectableLazyColumnKt$appendEntry$1$1 = 0; ((SelectableLazyListScopeContainer.Entry.Item)entry).getContent().invoke(itemScope, composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 282 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 283 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 284 */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         $composer.endReplaceGroup(); }
/*     */       else
/*     */       { $composer.startReplaceGroup(-1956702992);
/*     */         ((SelectableLazyListScopeContainer.Entry.Item)this.$entry).getContent().invoke(itemScope, $composer, Integer.valueOf(0));
/*     */         $composer.endReplaceGroup(); }
/*     */       
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   SelectableLazyColumnKt$appendEntry$1(SelectableLazyListState $state, SelectableLazyListScopeContainer.Entry $entry, boolean $isFocused, Function1<Object, Boolean> $isKeySelectable, FocusRequester $focusRequester, KeyActions $keyActions, PointerEventActions $pointerEventActions, SelectionMode $selectionMode, List<SelectableLazyListKey> $keys) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyColumnKt$appendEntry$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */