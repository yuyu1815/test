/*   */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003¢\006\004\b\005\020\006J\036\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\017H@¢\006\002\020\020R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\t\020\b¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/TextContent;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;", "text", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTitle", "toChatMessagePart", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*   */ @SourceDebugExtension({"SMAP\nTextContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContent.kt\ncom/intellij/ml/llm/matterhorn/requests/builder/TextContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n1#2:19\n*E\n"})
/*   */ public final class TextContent implements GrazieRequest.Content {
/*   */   @NotNull
/*   */   private final String text;
/*   */   
/* 9 */   public TextContent(@NotNull String text, @Nullable String title) { this.text = text; this.title = title; } @Nullable private final String title; @NotNull public final String getText() { return this.text; } @Nullable public final String getTitle() { return this.title; }
/*   */ 
/*   */   
/*   */   @Nullable
/*   */   public Object toChatMessagePart(@NotNull ExecutionContext context, @NotNull ModelParameters modelParameters, @NotNull Continuation $completion) {
/*   */     // Byte code:
/*   */     //   0: new java/lang/StringBuilder
/*   */     //   3: dup
/*   */     //   4: invokespecial <init> : ()V
/*   */     //   7: astore #4
/*   */     //   9: aload #4
/*   */     //   11: astore #5
/*   */     //   13: iconst_0
/*   */     //   14: istore #6
/*   */     //   16: aload_0
/*   */     //   17: getfield title : Ljava/lang/String;
/*   */     //   20: dup
/*   */     //   21: ifnull -> 120
/*   */     //   24: astore #7
/*   */     //   26: aload #7
/*   */     //   28: astore #8
/*   */     //   30: iconst_0
/*   */     //   31: istore #9
/*   */     //   33: aload #8
/*   */     //   35: checkcast java/lang/CharSequence
/*   */     //   38: invokeinterface length : ()I
/*   */     //   43: ifle -> 50
/*   */     //   46: iconst_1
/*   */     //   47: goto -> 51
/*   */     //   50: iconst_0
/*   */     //   51: nop
/*   */     //   52: ifeq -> 60
/*   */     //   55: aload #7
/*   */     //   57: goto -> 61
/*   */     //   60: aconst_null
/*   */     //   61: dup
/*   */     //   62: ifnull -> 120
/*   */     //   65: astore #8
/*   */     //   67: iconst_0
/*   */     //   68: istore #9
/*   */     //   70: aload #5
/*   */     //   72: ldc '## '
/*   */     //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   77: dup
/*   */     //   78: ldc 'append(...)'
/*   */     //   80: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   83: aload #8
/*   */     //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   88: dup
/*   */     //   89: ldc 'append(...)'
/*   */     //   91: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   94: bipush #10
/*   */     //   96: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   99: dup
/*   */     //   100: ldc 'append(...)'
/*   */     //   102: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   105: bipush #10
/*   */     //   107: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   110: dup
/*   */     //   111: ldc 'append(...)'
/*   */     //   113: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   116: nop
/*   */     //   117: goto -> 122
/*   */     //   120: pop
/*   */     //   121: aconst_null
/*   */     //   122: pop
/*   */     //   123: aload #5
/*   */     //   125: aload_0
/*   */     //   126: getfield text : Ljava/lang/String;
/*   */     //   129: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   132: dup
/*   */     //   133: ldc 'append(...)'
/*   */     //   135: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   138: bipush #10
/*   */     //   140: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*   */     //   143: dup
/*   */     //   144: ldc 'append(...)'
/*   */     //   146: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   149: pop
/*   */     //   150: nop
/*   */     //   151: aload #4
/*   */     //   153: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   156: dup
/*   */     //   157: ldc 'toString(...)'
/*   */     //   159: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   162: astore #10
/*   */     //   164: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageTextPart
/*   */     //   167: dup
/*   */     //   168: aload #10
/*   */     //   170: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   173: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #11	-> 0
/*   */     //   #12	-> 16
/*   */     //   #19	-> 30
/*   */     //   #12	-> 33
/*   */     //   #12	-> 51
/*   */     //   #12	-> 52
/*   */     //   #12	-> 61
/*   */     //   #13	-> 70
/*   */     //   #13	-> 105
/*   */     //   #13	-> 116
/*   */     //   #12	-> 117
/*   */     //   #12	-> 120
/*   */     //   #15	-> 123
/*   */     //   #16	-> 150
/*   */     //   #11	-> 151
/*   */     //   #11	-> 162
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   33	19	9	$i$a$-takeIf-TextContent$toChatMessagePart$2$1	I
/*   */     //   30	22	8	it	Ljava/lang/String;
/*   */     //   70	47	9	$i$a$-let-TextContent$toChatMessagePart$2$2	I
/*   */     //   67	50	8	it	Ljava/lang/String;
/*   */     //   16	135	6	$i$a$-buildString-TextContent$toChatMessagePart$2	I
/*   */     //   13	138	5	$this$toChatMessagePart_u24lambda_u242	Ljava/lang/StringBuilder;
/*   */     //   0	174	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/TextContent;
/*   */     //   0	174	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*   */     //   0	174	2	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*   */     //   0	174	3	$completion	Lkotlin/coroutines/Continuation;
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\builder\TextContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */