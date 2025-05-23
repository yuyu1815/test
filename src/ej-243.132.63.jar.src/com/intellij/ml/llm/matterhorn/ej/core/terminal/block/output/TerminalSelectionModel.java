/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ import java.util.List;
/*    */ import kotlin.reflect.KProperty;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\020\n\002\020!\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001:\001 B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\033\032\0020\0342\006\020\035\032\0020\0322\n\b\002\020\036\032\004\030\0010\037R7\020\t\032\b\022\004\022\0020\b0\0072\f\020\006\032\b\022\004\022\0020\b0\0078F@FX\002¢\006\022\n\004\b\016\020\017\032\004\b\n\020\013\"\004\b\f\020\rR\023\020\020\032\004\030\0010\b8F¢\006\006\032\004\b\021\020\022R(\020\024\032\004\030\0010\b2\b\020\023\032\004\030\0010\b@FX\016¢\006\016\n\000\032\004\b\025\020\022\"\004\b\026\020\027R\024\020\030\032\b\022\004\022\0020\0320\031X\004¢\006\002\n\000¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;", "", "outputModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;)V", "<set-?>", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "selectedBlocks", "getSelectedBlocks", "()Ljava/util/List;", "setSelectedBlocks", "(Ljava/util/List;)V", "selectedBlocks$delegate", "Lkotlin/properties/ReadWriteProperty;", "primarySelection", "getPrimarySelection", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "value", "hoveredBlock", "getHoveredBlock", "setHoveredBlock", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;)V", "listeners", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener;", "addListener", "", "listener", "disposable", "Lcom/intellij/openapi/Disposable;", "TerminalSelectionListener", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nTerminalSelectionModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalSelectionModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n33#2,3:55\n1863#3,2:58\n*S KotlinDebug\n*F\n+ 1 TerminalSelectionModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel\n*L\n11#1:55,3\n23#1:58,2\n*E\n"})
/*    */ public final class TerminalSelectionModel {
/*    */   public TerminalSelectionModel(@NotNull TerminalOutputModel outputModel) {
/* 11 */     Delegates delegates = Delegates.INSTANCE; Object initialValue$iv = CollectionsKt.emptyList(); int $i$f$observable = 0; this.selectedBlocks$delegate = 
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
/* 55 */       (ReadWriteProperty)new TerminalSelectionModel$special$$inlined$observable$1(initialValue$iv, this);
/*    */     this.listeners = new CopyOnWriteArrayList<>();
/*    */     TerminalOutputModel.DefaultImpls.addListener$default(outputModel, new TerminalOutputModelListener() {
/*    */           public void blockInfoUpdated(CommandBlock block, CommandBlockInfo newInfo) {
/*    */             TerminalOutputModelListener.DefaultImpls.blockInfoUpdated(this, block, newInfo);
/*    */           }
/*    */           
/*    */           public void blockFinalized(CommandBlock block) {
/*    */             TerminalOutputModelListener.DefaultImpls.blockFinalized(this, block);
/*    */           }
/*    */           
/*    */           public void blockCreated(CommandBlock block) {
/*    */             TerminalOutputModelListener.DefaultImpls.blockCreated(this, block);
/*    */           }
/*    */           
/*    */           public void blockRemoved(CommandBlock block) {
/*    */             Intrinsics.checkNotNullParameter(block, "block");
/*    */             TerminalSelectionModel.this.setSelectedBlocks(CollectionsKt.minus(TerminalSelectionModel.this.getSelectedBlocks(), block));
/*    */             if (TerminalSelectionModel.this.getHoveredBlock() == block)
/*    */               TerminalSelectionModel.this.setHoveredBlock(null); 
/*    */           }
/*    */         }null, 2, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final ReadWriteProperty selectedBlocks$delegate;
/*    */   @Nullable
/*    */   private CommandBlock hoveredBlock;
/*    */   @NotNull
/*    */   private final List<TerminalSelectionListener> listeners;
/*    */   
/*    */   @NotNull
/*    */   public final List<CommandBlock> getSelectedBlocks() {
/*    */     return (List<CommandBlock>)this.selectedBlocks$delegate.getValue(this, $$delegatedProperties[0]);
/*    */   }
/*    */   
/*    */   public final void setSelectedBlocks(@NotNull List <set-?>) {
/*    */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */     this.selectedBlocks$delegate.setValue(this, $$delegatedProperties[0], <set-?>);
/*    */   }
/*    */   
/*    */   static {
/*    */     KProperty[] arrayOfKProperty = new KProperty[1];
/*    */     arrayOfKProperty[0] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(TerminalSelectionModel.class, "selectedBlocks", "getSelectedBlocks()Ljava/util/List;", 0));
/*    */     $$delegatedProperties = (KProperty<Object>[])arrayOfKProperty;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final CommandBlock getPrimarySelection() {
/*    */     return (CommandBlock)CollectionsKt.lastOrNull(getSelectedBlocks());
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final CommandBlock getHoveredBlock() {
/*    */     return this.hoveredBlock;
/*    */   }
/*    */   
/*    */   public final void setHoveredBlock(@Nullable CommandBlock value) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield hoveredBlock : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*    */     //   4: aload_1
/*    */     //   5: if_acmpeq -> 72
/*    */     //   8: aload_0
/*    */     //   9: getfield listeners : Ljava/util/List;
/*    */     //   12: checkcast java/lang/Iterable
/*    */     //   15: astore_2
/*    */     //   16: iconst_0
/*    */     //   17: istore_3
/*    */     //   18: aload_2
/*    */     //   19: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   24: astore #4
/*    */     //   26: aload #4
/*    */     //   28: invokeinterface hasNext : ()Z
/*    */     //   33: ifeq -> 71
/*    */     //   36: aload #4
/*    */     //   38: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   43: astore #5
/*    */     //   45: aload #5
/*    */     //   47: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener
/*    */     //   50: astore #6
/*    */     //   52: iconst_0
/*    */     //   53: istore #7
/*    */     //   55: aload #6
/*    */     //   57: aload_0
/*    */     //   58: getfield hoveredBlock : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*    */     //   61: aload_1
/*    */     //   62: invokeinterface hoverChanged : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;)V
/*    */     //   67: nop
/*    */     //   68: goto -> 26
/*    */     //   71: nop
/*    */     //   72: aload_0
/*    */     //   73: aload_1
/*    */     //   74: putfield hoveredBlock : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*    */     //   77: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 0
/*    */     //   #23	-> 8
/*    */     //   #58	-> 18
/*    */     //   #23	-> 55
/*    */     //   #58	-> 67
/*    */     //   #59	-> 71
/*    */     //   #25	-> 72
/*    */     //   #26	-> 77
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   55	12	7	$i$a$-forEach-TerminalSelectionModel$hoveredBlock$1	I
/*    */     //   52	15	6	it	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener;
/*    */     //   45	23	5	element$iv	Ljava/lang/Object;
/*    */     //   18	54	3	$i$f$forEach	I
/*    */     //   16	56	2	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   0	78	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;
/*    */     //   0	78	1	value	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*    */   }
/*    */   
/*    */   public final void addListener(@NotNull TerminalSelectionListener listener, @Nullable Disposable disposable) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'listener'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield listeners : Ljava/util/List;
/*    */     //   10: aload_1
/*    */     //   11: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   16: pop
/*    */     //   17: aload_2
/*    */     //   18: ifnull -> 32
/*    */     //   21: aload_2
/*    */     //   22: aload_0
/*    */     //   23: aload_1
/*    */     //   24: <illegal opcode> dispose : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener;)Lcom/intellij/openapi/Disposable;
/*    */     //   29: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*    */     //   32: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #42	-> 6
/*    */     //   #43	-> 17
/*    */     //   #44	-> 21
/*    */     //   #46	-> 32
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;
/*    */     //   0	33	1	listener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener;
/*    */     //   0	33	2	disposable	Lcom/intellij/openapi/Disposable;
/*    */   }
/*    */   
/*    */   private static final void addListener$lambda$3(TerminalSelectionModel this$0, TerminalSelectionListener $listener) {
/*    */     this$0.listeners.remove($listener);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\bf\030\0002\0020\001J$\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\0052\f\020\007\032\b\022\004\022\0020\0060\005H\026J\034\020\b\032\0020\0032\b\020\t\032\004\030\0010\0062\b\020\n\032\004\030\0010\006H\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener;", "", "selectionChanged", "", "oldSelection", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "newSelection", "hoverChanged", "oldHovered", "newHovered", "ej-core"})
/*    */   public static interface TerminalSelectionListener {
/*    */     void selectionChanged(@NotNull List<? extends CommandBlock> param1List1, @NotNull List<? extends CommandBlock> param1List2);
/*    */     
/*    */     void hoverChanged(@Nullable CommandBlock param1CommandBlock1, @Nullable CommandBlock param1CommandBlock2);
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */     public static final class DefaultImpls {
/*    */       public static void selectionChanged(@NotNull TerminalSelectionModel.TerminalSelectionListener $this, @NotNull List oldSelection, @NotNull List newSelection) {
/*    */         Intrinsics.checkNotNullParameter(oldSelection, "oldSelection");
/*    */         Intrinsics.checkNotNullParameter(newSelection, "newSelection");
/*    */       }
/*    */       
/*    */       public static void hoverChanged(@NotNull TerminalSelectionModel.TerminalSelectionListener $this, @Nullable CommandBlock oldHovered, @Nullable CommandBlock newHovered) {}
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalSelectionModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */