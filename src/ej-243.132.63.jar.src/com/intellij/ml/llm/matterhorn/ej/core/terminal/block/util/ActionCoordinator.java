/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.util;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020%\n\002\b\007\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003BY\022\b\b\002\020\004\032\0020\005\022\030\020\006\032\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0020\b0\007\022\030\020\t\032\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0020\b0\007\022\022\020\n\032\016\022\004\022\0028\000\022\004\022\0020\b0\013¢\006\004\b\f\020\rJ\033\020\020\032\0020\b2\006\020\021\032\0028\0002\006\020\022\032\0028\001¢\006\002\020\023J\023\020\024\032\0020\b2\006\020\021\032\0028\000¢\006\002\020\025R\016\020\004\032\0020\005X\004¢\006\002\n\000R \020\006\032\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0020\b0\007X\004¢\006\002\n\000R \020\t\032\024\022\004\022\0028\000\022\004\022\0028\001\022\004\022\0020\b0\007X\004¢\006\002\n\000R\032\020\n\032\016\022\004\022\0028\000\022\004\022\0020\b0\013X\004¢\006\002\n\000R\032\020\016\032\016\022\004\022\0028\000\022\004\022\0028\0010\017X\004¢\006\002\n\000¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/ActionCoordinator;", "ID", "DATA", "", "capacity", "", "onActionComplete", "Lkotlin/Function2;", "", "onActionDiscarded", "onActionUnknown", "Lkotlin/Function1;", "<init>", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "storage", "", "started", "actionId", "actionData", "(Ljava/lang/Object;Ljava/lang/Object;)V", "finished", "(Ljava/lang/Object;)V", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nActionCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionCoordinator.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/ActionCoordinator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
/*    */ public final class ActionCoordinator<ID, DATA> {
/*    */   private final int capacity;
/*    */   @NotNull
/*    */   private final Function2<ID, DATA, Unit> onActionComplete;
/*    */   
/* 18 */   public ActionCoordinator(int capacity, @NotNull Function2<ID, DATA, Unit> onActionComplete, @NotNull Function2<ID, DATA, Unit> onActionDiscarded, @NotNull Function1<ID, Unit> onActionUnknown) { this.capacity = capacity;
/* 19 */     this.onActionComplete = onActionComplete;
/* 20 */     this.onActionDiscarded = onActionDiscarded;
/* 21 */     this.onActionUnknown = onActionUnknown;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 29 */     int i = this.capacity; Intrinsics.checkNotNullExpressionValue(Collections.synchronizedMap(new ActionCoordinator$storage$1(i)), "synchronizedMap(...)"); this.storage = Collections.synchronizedMap(new ActionCoordinator$storage$1(i)); } @NotNull private final Function2<ID, DATA, Unit> onActionDiscarded; @NotNull private final Function1<ID, Unit> onActionUnknown; @NotNull private final Map<ID, DATA> storage; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020'\n\000*\001\000\b\n\030\0002\036\022\004\022\0028\000\022\004\022\0028\0010\001j\016\022\004\022\0028\000\022\004\022\0028\001`\002J\036\020\003\032\0020\0042\024\020\005\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\006H\024¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/ActionCoordinator$storage$1", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "removeEldestEntry", "", "eldest", "", "ej-core"}) public static final class ActionCoordinator$storage$1 extends LinkedHashMap<ID, DATA> { ActionCoordinator$storage$1(int $super_call_param$1) { super($super_call_param$1); }
/*    */      protected boolean removeEldestEntry(Map.Entry eldest) {
/* 31 */       boolean removeEldestEntry = (size() > ActionCoordinator.this.capacity);
/*    */       
/* 33 */       if (removeEldestEntry && eldest != null) {
/* 34 */         ActionCoordinator.this.onActionDiscarded.invoke(eldest.getKey(), eldest.getValue());
/*    */       }
/*    */       
/* 37 */       return removeEldestEntry;
/*    */     } }
/*    */ 
/*    */ 
/*    */   
/*    */   public final void started(Object actionId, Object actionData) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield storage : Ljava/util/Map;
/*    */     //   4: aload_1
/*    */     //   5: aload_0
/*    */     //   6: aload_1
/*    */     //   7: aload_2
/*    */     //   8: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/ActionCoordinator;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;
/*    */     //   13: <illegal opcode> apply : (Lkotlin/jvm/functions/Function2;)Ljava/util/function/BiFunction;
/*    */     //   18: invokeinterface compute : (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
/*    */     //   23: pop
/*    */     //   24: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 0
/*    */     //   #57	-> 24
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/ActionCoordinator;
/*    */     //   0	25	1	actionId	Ljava/lang/Object;
/*    */     //   0	25	2	actionData	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */   
/*    */   private static final Object started$lambda$1(Function2 $tmp0, Object p0, Object p1) {
/* 48 */     return $tmp0.invoke(p0, p1);
/*    */   }
/*    */   private static final Object started$lambda$0(ActionCoordinator this$0, Object $actionId, Object $actionData, Object paramObject1, Object existingData) {
/* 51 */     this$0.onActionDiscarded.invoke($actionId, $actionData);
/* 52 */     return (existingData != null) ? existingData : 
/*    */       
/* 54 */       $actionData;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void finished(Object actionId) {
/* 65 */     Object it = this.storage.remove(actionId);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 70 */     int $i$a$-let-ActionCoordinator$finished$1 = 0;
/*    */     this.onActionComplete.invoke(actionId, it);
/*    */     this.storage.remove(actionId);
/*    */     this.onActionUnknown.invoke(actionId);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\util\ActionCoordinator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */