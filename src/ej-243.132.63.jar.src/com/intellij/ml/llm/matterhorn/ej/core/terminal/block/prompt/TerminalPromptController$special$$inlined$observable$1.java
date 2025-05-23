/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
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
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J)\020\002\032\0020\0032\n\020\004\032\006\022\002\b\0030\0052\006\020\006\032\0028\0002\006\020\007\032\0028\000H\024¢\006\002\020\b¨\006\t¸\006\000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"})
/*    */ @SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 TerminalPromptController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n36#2:35\n37#2:38\n1863#3,2:36\n*S KotlinDebug\n*F\n+ 1 TerminalPromptController.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController\n*L\n36#1:36,2\n*E\n"})
/*    */ public final class TerminalPromptController$special$$inlined$observable$1
/*    */   extends ObservableProperty<Boolean>
/*    */ {
/*    */   public TerminalPromptController$special$$inlined$observable$1(TerminalPromptController paramTerminalPromptController) {
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
/*    */     //   8: checkcast java/lang/Boolean
/*    */     //   11: invokevirtual booleanValue : ()Z
/*    */     //   14: istore #4
/*    */     //   16: checkcast java/lang/Boolean
/*    */     //   19: invokevirtual booleanValue : ()Z
/*    */     //   22: istore #5
/*    */     //   24: iconst_0
/*    */     //   25: istore #6
/*    */     //   27: iload #4
/*    */     //   29: iload #5
/*    */     //   31: if_icmpeq -> 101
/*    */     //   34: aload_0
/*    */     //   35: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController;
/*    */     //   38: invokestatic access$getListeners$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController;)Ljava/util/List;
/*    */     //   41: checkcast java/lang/Iterable
/*    */     //   44: astore #7
/*    */     //   46: iconst_0
/*    */     //   47: istore #8
/*    */     //   49: aload #7
/*    */     //   51: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   56: astore #9
/*    */     //   58: aload #9
/*    */     //   60: invokeinterface hasNext : ()Z
/*    */     //   65: ifeq -> 100
/*    */     //   68: aload #9
/*    */     //   70: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   75: astore #10
/*    */     //   77: aload #10
/*    */     //   79: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController$PromptStateListener
/*    */     //   82: astore #11
/*    */     //   84: iconst_0
/*    */     //   85: istore #12
/*    */     //   87: aload #11
/*    */     //   89: iload #4
/*    */     //   91: invokeinterface promptVisibilityChanged : (Z)V
/*    */     //   96: nop
/*    */     //   97: goto -> 58
/*    */     //   100: nop
/*    */     //   101: nop
/*    */     //   102: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 6
/*    */     //   #35	-> 27
/*    */     //   #36	-> 49
/*    */     //   #35	-> 87
/*    */     //   #36	-> 96
/*    */     //   #37	-> 100
/*    */     //   #38	-> 101
/*    */     //   #34	-> 102
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   87	9	12	$i$a$-forEach-TerminalPromptController$promptIsVisible$2$1	I
/*    */     //   84	12	11	it	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController$PromptStateListener;
/*    */     //   77	20	10	element$iv	Ljava/lang/Object;
/*    */     //   49	52	8	$i$f$forEach	I
/*    */     //   46	55	7	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   27	75	6	$i$a$-observable-TerminalPromptController$promptIsVisible$2	I
/*    */     //   24	78	5	oldValue	Z
/*    */     //   24	78	4	newValue	Z
/*    */     //   0	103	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController$special$$inlined$observable$1;
/*    */     //   0	103	1	property	Lkotlin/reflect/KProperty;
/*    */     //   0	103	2	oldValue	Ljava/lang/Object;
/*    */     //   0	103	3	newValue	Ljava/lang/Object;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptController$special$$inlined$observable$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */