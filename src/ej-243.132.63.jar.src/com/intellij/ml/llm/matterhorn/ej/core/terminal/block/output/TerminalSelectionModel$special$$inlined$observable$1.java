/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.properties.ObservableProperty;
/*    */ import kotlin.reflect.KProperty;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J)\020\002\032\0020\0032\n\020\004\032\006\022\002\b\0030\0052\006\020\006\032\0028\0002\006\020\007\032\0028\000H\024¢\006\002\020\b¨\006\t¸\006\000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"})
/*    */ @SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 TerminalSelectionModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n12#2,2:35\n15#2:39\n1863#3,2:37\n*S KotlinDebug\n*F\n+ 1 TerminalSelectionModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel\n*L\n13#1:37,2\n*E\n"})
/*    */ public final class TerminalSelectionModel$special$$inlined$observable$1
/*    */   extends ObservableProperty<List<? extends CommandBlock>>
/*    */ {
/*    */   public TerminalSelectionModel$special$$inlined$observable$1(TerminalSelectionModel paramTerminalSelectionModel) {
/* 33 */     super($initialValue);
/*    */   }
/*    */   
/*    */   protected void afterChange(KProperty property, Object oldValue, Object newValue) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'property'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: aload_3
/*    */     //   8: checkcast java/util/List
/*    */     //   11: astore #4
/*    */     //   13: checkcast java/util/List
/*    */     //   16: astore #5
/*    */     //   18: iconst_0
/*    */     //   19: istore #6
/*    */     //   21: aload #4
/*    */     //   23: aload #5
/*    */     //   25: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   28: ifne -> 100
/*    */     //   31: aload_0
/*    */     //   32: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;
/*    */     //   35: invokestatic access$getListeners$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;)Ljava/util/List;
/*    */     //   38: checkcast java/lang/Iterable
/*    */     //   41: astore #7
/*    */     //   43: iconst_0
/*    */     //   44: istore #8
/*    */     //   46: aload #7
/*    */     //   48: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   53: astore #9
/*    */     //   55: aload #9
/*    */     //   57: invokeinterface hasNext : ()Z
/*    */     //   62: ifeq -> 99
/*    */     //   65: aload #9
/*    */     //   67: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   72: astore #10
/*    */     //   74: aload #10
/*    */     //   76: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener
/*    */     //   79: astore #11
/*    */     //   81: iconst_0
/*    */     //   82: istore #12
/*    */     //   84: aload #11
/*    */     //   86: aload #5
/*    */     //   88: aload #4
/*    */     //   90: invokeinterface selectionChanged : (Ljava/util/List;Ljava/util/List;)V
/*    */     //   95: nop
/*    */     //   96: goto -> 55
/*    */     //   99: nop
/*    */     //   100: nop
/*    */     //   101: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 6
/*    */     //   #35	-> 21
/*    */     //   #36	-> 31
/*    */     //   #37	-> 46
/*    */     //   #36	-> 84
/*    */     //   #37	-> 95
/*    */     //   #38	-> 99
/*    */     //   #39	-> 100
/*    */     //   #34	-> 101
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   84	11	12	$i$a$-forEach-TerminalSelectionModel$selectedBlocks$2$1	I
/*    */     //   81	14	11	it	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$TerminalSelectionListener;
/*    */     //   74	22	10	element$iv	Ljava/lang/Object;
/*    */     //   46	54	8	$i$f$forEach	I
/*    */     //   43	57	7	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   21	80	6	$i$a$-observable-TerminalSelectionModel$selectedBlocks$2	I
/*    */     //   18	83	5	oldValue	Ljava/util/List;
/*    */     //   18	83	4	newValue	Ljava/util/List;
/*    */     //   0	102	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel$special$$inlined$observable$1;
/*    */     //   0	102	1	property	Lkotlin/reflect/KProperty;
/*    */     //   0	102	2	oldValue	Ljava/lang/Object;
/*    */     //   0	102	3	newValue	Ljava/lang/Object;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalSelectionModel$special$$inlined$observable$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */