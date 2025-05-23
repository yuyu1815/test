/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;
/*    */ import com.intellij.openapi.actionSystem.AnAction;
/*    */ import com.intellij.openapi.extensions.ExtensionPointName;
/*    */ import com.intellij.psi.PsiNameIdentifierOwner;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\032\020\b\032\004\030\0010\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026J\024\020\016\032\004\030\0010\017*\0020\0202\006\020\021\032\0020\022R\027\020\004\032\b\022\004\022\0020\0010\005¢\006\b\n\000\032\004\b\006\020\007¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor$Companion;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor;", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "findActionLocation", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "name", "", "identifierOwner", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "findFirstRunAction", "Lcom/intellij/openapi/actionSystem/AnAction;", "Lcom/intellij/execution/lineMarker/RunLineMarkerContributor;", "psiElement", "Lcom/intellij/psi/PsiElement;", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nTestRunActionLocationContributor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestRunActionLocationContributor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,40:1\n1#2:41\n1310#3,2:42\n*S KotlinDebug\n*F\n+ 1 TestRunActionLocationContributor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor$Companion\n*L\n22#1:42,2\n*E\n"})
/*    */ public final class Companion implements TestRunActionLocationContributor {
/*    */   @NotNull
/* 13 */   private static final ExtensionPointName<TestRunActionLocationContributor> EP_NAME = new ExtensionPointName(
/* 14 */       "com.intellij.ml.llm.matterhorn.actions.tests.testRunActionLocationContributor");
/*    */   
/*    */   @NotNull
/*    */   public final ExtensionPointName<TestRunActionLocationContributor> getEP_NAME() {
/*    */     return EP_NAME;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public ActionLocation findActionLocation(@NotNull String name, @NotNull PsiNameIdentifierOwner identifierOwner) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'name'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'identifierOwner'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor$Companion.EP_NAME : Lcom/intellij/openapi/extensions/ExtensionPointName;
/*    */     //   15: invokevirtual getExtensionList : ()Ljava/util/List;
/*    */     //   18: checkcast java/lang/Iterable
/*    */     //   21: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   26: astore_3
/*    */     //   27: aload_3
/*    */     //   28: invokeinterface hasNext : ()Z
/*    */     //   33: ifeq -> 71
/*    */     //   36: aload_3
/*    */     //   37: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   42: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor
/*    */     //   45: astore #4
/*    */     //   47: iconst_0
/*    */     //   48: istore #5
/*    */     //   50: aload #4
/*    */     //   52: aload_1
/*    */     //   53: aload_2
/*    */     //   54: invokeinterface findActionLocation : (Ljava/lang/String;Lcom/intellij/psi/PsiNameIdentifierOwner;)Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;
/*    */     //   59: astore #4
/*    */     //   61: aload #4
/*    */     //   63: ifnull -> 27
/*    */     //   66: aload #4
/*    */     //   68: goto -> 72
/*    */     //   71: aconst_null
/*    */     //   72: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 12
/*    */     //   #41	-> 47
/*    */     //   #18	-> 50
/*    */     //   #18	-> 59
/*    */     //   #18	-> 72
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   50	9	5	$i$a$-firstNotNullOfOrNull-TestRunActionLocationContributor$Companion$findActionLocation$1	I
/*    */     //   47	12	4	it	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor;
/*    */     //   0	73	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor$Companion;
/*    */     //   0	73	1	name	Ljava/lang/String;
/*    */     //   0	73	2	identifierOwner	Lcom/intellij/psi/PsiNameIdentifierOwner;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AnAction findFirstRunAction(@NotNull RunLineMarkerContributor $this$findFirstRunAction, @NotNull PsiElement psiElement) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'psiElement'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_1
/*    */     //   13: aload_2
/*    */     //   14: invokevirtual getInfo : (Lcom/intellij/psi/PsiElement;)Lcom/intellij/execution/lineMarker/RunLineMarkerContributor$Info;
/*    */     //   17: dup
/*    */     //   18: ifnonnull -> 34
/*    */     //   21: pop
/*    */     //   22: aload_1
/*    */     //   23: aload_2
/*    */     //   24: invokevirtual getSlowInfo : (Lcom/intellij/psi/PsiElement;)Lcom/intellij/execution/lineMarker/RunLineMarkerContributor$Info;
/*    */     //   27: dup
/*    */     //   28: ifnonnull -> 34
/*    */     //   31: pop
/*    */     //   32: aconst_null
/*    */     //   33: areturn
/*    */     //   34: astore_3
/*    */     //   35: aload_3
/*    */     //   36: getfield actions : [Lcom/intellij/openapi/actionSystem/AnAction;
/*    */     //   39: dup
/*    */     //   40: ldc 'actions'
/*    */     //   42: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   45: checkcast [Ljava/lang/Object;
/*    */     //   48: astore #4
/*    */     //   50: iconst_0
/*    */     //   51: istore #5
/*    */     //   53: iconst_0
/*    */     //   54: istore #6
/*    */     //   56: aload #4
/*    */     //   58: arraylength
/*    */     //   59: istore #7
/*    */     //   61: iload #6
/*    */     //   63: iload #7
/*    */     //   65: if_icmpge -> 124
/*    */     //   68: aload #4
/*    */     //   70: iload #6
/*    */     //   72: aaload
/*    */     //   73: astore #8
/*    */     //   75: aload #8
/*    */     //   77: checkcast com/intellij/openapi/actionSystem/AnAction
/*    */     //   80: astore #9
/*    */     //   82: iconst_0
/*    */     //   83: istore #10
/*    */     //   85: aload #9
/*    */     //   87: invokevirtual getTemplateText : ()Ljava/lang/String;
/*    */     //   90: dup
/*    */     //   91: ldc 'getTemplateText(...)'
/*    */     //   93: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   96: checkcast java/lang/CharSequence
/*    */     //   99: ldc 'Run'
/*    */     //   101: checkcast java/lang/CharSequence
/*    */     //   104: iconst_0
/*    */     //   105: iconst_2
/*    */     //   106: aconst_null
/*    */     //   107: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*    */     //   110: ifeq -> 118
/*    */     //   113: aload #8
/*    */     //   115: goto -> 125
/*    */     //   118: iinc #6, 1
/*    */     //   121: goto -> 61
/*    */     //   124: aconst_null
/*    */     //   125: checkcast com/intellij/openapi/actionSystem/AnAction
/*    */     //   128: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 12
/*    */     //   #22	-> 35
/*    */     //   #42	-> 53
/*    */     //   #22	-> 85
/*    */     //   #42	-> 110
/*    */     //   #43	-> 124
/*    */     //   #22	-> 128
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   85	25	10	$i$a$-firstOrNull-TestRunActionLocationContributor$Companion$findFirstRunAction$1	I
/*    */     //   82	28	9	it	Lcom/intellij/openapi/actionSystem/AnAction;
/*    */     //   75	43	8	element$iv	Ljava/lang/Object;
/*    */     //   53	72	5	$i$f$firstOrNull	I
/*    */     //   50	75	4	$this$firstOrNull$iv	[Ljava/lang/Object;
/*    */     //   35	94	3	info	Lcom/intellij/execution/lineMarker/RunLineMarkerContributor$Info;
/*    */     //   0	129	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor$Companion;
/*    */     //   0	129	1	$this$findFirstRunAction	Lcom/intellij/execution/lineMarker/RunLineMarkerContributor;
/*    */     //   0	129	2	psiElement	Lcom/intellij/psi/PsiElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\TestRunActionLocationContributor$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */