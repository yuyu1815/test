/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.input.pointer.PointerEvent;
/*     */ import androidx.compose.ui.input.pointer.PointerEvent_skikoKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.InternalJewelApi;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableColumnKeybindings;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectionMode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\000\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\000\n\002\030\002\n\002\b\002\b\027\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J>\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\f\020\020\032\b\022\004\022\0020\0220\0212\006\020\023\032\0020\024H\026J`\020\026\032\0020\007\"\004\b\000\020\0272\f\020\030\032\b\022\004\022\002H\0270\0312\006\020\032\032\0020\0332\006\020\034\032\0020\0352\030\020\036\032\024\022\n\022\b\022\004\022\002H\0270\031\022\004\022\0020\0070\0372\030\020 \032\024\022\n\022\b\022\004\022\002H\0270\031\022\004\022\0020\0070\037H\007R\016\020\002\032\0020\003X\004¢\006\002\n\000R\020\020\025\032\004\030\0010\024X\016¢\006\002\n\000¨\006!"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction;", "Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnEventAction;", "treeState", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;", "<init>", "(Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)V", "handlePointerEventPress", "", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "keybindings", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "selectableLazyListState", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "selectionMode", "Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;", "allKeys", "", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "key", "", "elementClickedTmpHolder", "notifyItemClicked", "T", "item", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "doubleClickTimeDelayMillis", "", "onElementClick", "Lkotlin/Function1;", "onElementDoubleClick", "foundation"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public class DefaultTreeViewPointerEventAction
/*     */   extends DefaultSelectableLazyColumnEventAction
/*     */ {
/*     */   @NotNull
/*     */   private final TreeState treeState;
/*     */   @Nullable
/*     */   private Object elementClickedTmpHolder;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public DefaultTreeViewPointerEventAction(@NotNull TreeState treeState) {
/* 145 */     this.treeState = treeState;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void handlePointerEventPress(@NotNull PointerEvent pointerEvent, @NotNull SelectableColumnKeybindings keybindings, @NotNull SelectableLazyListState selectableLazyListState, @NotNull SelectionMode selectionMode, @NotNull List<? extends SelectableLazyListKey> allKeys, @NotNull Object key) {
/* 155 */     Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent"); Intrinsics.checkNotNullParameter(keybindings, "keybindings"); Intrinsics.checkNotNullParameter(selectableLazyListState, "selectableLazyListState"); Intrinsics.checkNotNullParameter(selectionMode, "selectionMode"); Intrinsics.checkNotNullParameter(allKeys, "allKeys"); Intrinsics.checkNotNullParameter(key, "key"); SelectableColumnKeybindings $this$handlePointerEventPress_u24lambda_u240 = keybindings; int $i$a$-with-DefaultTreeViewPointerEventAction$handlePointerEventPress$1 = 0;
/*     */     
/* 157 */     if (!$this$handlePointerEventPress_u24lambda_u240.isContiguousSelectionKeyPressed-5xRPYO0(pointerEvent.getKeyboardModifiers-k7X9c1A()) || 
/* 158 */       !PointerEvent_skikoKt.isCtrlPressed-5xRPYO0(pointerEvent.getKeyboardModifiers-k7X9c1A()))
/*     */     {
/* 160 */       if ($this$handlePointerEventPress_u24lambda_u240.isContiguousSelectionKeyPressed-5xRPYO0(pointerEvent.getKeyboardModifiers-k7X9c1A())) {
/* 161 */         onExtendSelectionToKey(key, allKeys, selectableLazyListState, selectionMode);
/*     */       
/*     */       }
/* 164 */       else if ($this$handlePointerEventPress_u24lambda_u240.isMultiSelectionKeyPressed-5xRPYO0(pointerEvent.getKeyboardModifiers-k7X9c1A())) {
/* 165 */         selectableLazyListState.setLastKeyEventUsedMouse$foundation(false);
/* 166 */         toggleKeySelection(key, allKeys, selectableLazyListState, selectionMode);
/*     */       }
/*     */       else {
/*     */         
/* 170 */         selectableLazyListState.setSelectedKeys(SetsKt.setOf(key));
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @InternalJewelApi
/*     */   public final <T> void notifyItemClicked(@NotNull Tree.Element<T> item, @NotNull CoroutineScope scope, long doubleClickTimeDelayMillis, @NotNull Function1 onElementClick, @NotNull Function1 onElementDoubleClick) {
/* 188 */     Intrinsics.checkNotNullParameter(item, "item"); Intrinsics.checkNotNullParameter(scope, "scope"); Intrinsics.checkNotNullParameter(onElementClick, "onElementClick"); Intrinsics.checkNotNullParameter(onElementDoubleClick, "onElementDoubleClick"); if (Intrinsics.areEqual(this.elementClickedTmpHolder, item.getId())) {
/*     */       
/* 190 */       if (item instanceof Tree.Element.Node) {
/* 191 */         this.treeState.toggleNode(((Tree.Element.Node)item).getId());
/*     */       }
/* 193 */       onElementDoubleClick.invoke(item);
/* 194 */       this.elementClickedTmpHolder = null;
/*     */     } else {
/* 196 */       this.elementClickedTmpHolder = item.getId();
/*     */       
/* 198 */       onElementClick.invoke(item);
/* 199 */       BuildersKt.launch$default(scope, null, null, new DefaultTreeViewPointerEventAction$notifyItemClicked$1(this, item, null), 3, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "KeyActions.kt", l = {200}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.foundation.lazy.tree.DefaultTreeViewPointerEventAction$notifyItemClicked$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class DefaultTreeViewPointerEventAction$notifyItemClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     DefaultTreeViewPointerEventAction$notifyItemClicked$1(DefaultTreeViewPointerEventAction $receiver, Tree.Element<T> $item, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 99, 0 -> 32, 1 -> 59
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $doubleClickTimeDelayMillis : J
/*     */       //   40: aload_0
/*     */       //   41: checkcast kotlin/coroutines/Continuation
/*     */       //   44: aload_0
/*     */       //   45: iconst_1
/*     */       //   46: putfield label : I
/*     */       //   49: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   52: dup
/*     */       //   53: aload_2
/*     */       //   54: if_acmpne -> 64
/*     */       //   57: aload_2
/*     */       //   58: areturn
/*     */       //   59: aload_1
/*     */       //   60: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   63: aload_1
/*     */       //   64: pop
/*     */       //   65: aload_0
/*     */       //   66: getfield this$0 : Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction;
/*     */       //   69: invokestatic access$getElementClickedTmpHolder$p : (Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction;)Ljava/lang/Object;
/*     */       //   72: aload_0
/*     */       //   73: getfield $item : Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*     */       //   76: invokeinterface getId : ()Ljava/lang/Object;
/*     */       //   81: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   84: ifeq -> 95
/*     */       //   87: aload_0
/*     */       //   88: getfield this$0 : Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction;
/*     */       //   91: aconst_null
/*     */       //   92: invokestatic access$setElementClickedTmpHolder$p : (Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction;Ljava/lang/Object;)V
/*     */       //   95: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   98: areturn
/*     */       //   99: new java/lang/IllegalStateException
/*     */       //   102: dup
/*     */       //   103: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   105: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   108: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #199	-> 3
/*     */       //   #200	-> 36
/*     */       //   #199	-> 57
/*     */       //   #201	-> 64
/*     */       //   #202	-> 95
/*     */       //   #199	-> 99
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	109	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction$notifyItemClicked$1;
/*     */       //   36	63	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super DefaultTreeViewPointerEventAction$notifyItemClicked$1> $completion) {
/*     */       return (Continuation<Unit>)new DefaultTreeViewPointerEventAction$notifyItemClicked$1(DefaultTreeViewPointerEventAction.this, this.$item, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((DefaultTreeViewPointerEventAction$notifyItemClicked$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\DefaultTreeViewPointerEventAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */