/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020 \n\002\b\002\032 \020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0042\006\020\005\032\0020\004H\002\032&\020\006\032\0020\0012\f\020\007\032\b\022\004\022\0020\0010\b2\006\020\003\032\0020\0042\006\020\t\032\0020\004H\002¨\006\n"}, d2 = {"truncateMessageIfNeeded", "", "message", "maxLines", "", "maxLineLength", "truncateTraceIfNeeded", "frames", "", "maxCharPerLine", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nTestPresentationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/TestPresentationUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1734#2,3:226\n1734#2,3:229\n1557#2:232\n1628#2,3:233\n*S KotlinDebug\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/TestPresentationUtilsKt\n*L\n9#1:226,3\n22#1:229,3\n26#1:232\n26#1:233,3\n*E\n"})
/*    */ public final class TestPresentationUtilsKt {
/*    */   private static final String truncateMessageIfNeeded(String message, int maxLines, int maxLineLength) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: checkcast java/lang/CharSequence
/*    */     //   4: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
/*    */     //   7: astore_3
/*    */     //   8: aload_3
/*    */     //   9: invokeinterface size : ()I
/*    */     //   14: istore #4
/*    */     //   16: iload #4
/*    */     //   18: iload_1
/*    */     //   19: if_icmpgt -> 121
/*    */     //   22: aload_3
/*    */     //   23: checkcast java/lang/Iterable
/*    */     //   26: astore #5
/*    */     //   28: iconst_0
/*    */     //   29: istore #6
/*    */     //   31: aload #5
/*    */     //   33: instanceof java/util/Collection
/*    */     //   36: ifeq -> 56
/*    */     //   39: aload #5
/*    */     //   41: checkcast java/util/Collection
/*    */     //   44: invokeinterface isEmpty : ()Z
/*    */     //   49: ifeq -> 56
/*    */     //   52: iconst_1
/*    */     //   53: goto -> 116
/*    */     //   56: aload #5
/*    */     //   58: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   63: astore #7
/*    */     //   65: aload #7
/*    */     //   67: invokeinterface hasNext : ()Z
/*    */     //   72: ifeq -> 115
/*    */     //   75: aload #7
/*    */     //   77: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   82: astore #8
/*    */     //   84: aload #8
/*    */     //   86: checkcast java/lang/String
/*    */     //   89: astore #9
/*    */     //   91: iconst_0
/*    */     //   92: istore #10
/*    */     //   94: aload #9
/*    */     //   96: invokevirtual length : ()I
/*    */     //   99: iload_2
/*    */     //   100: if_icmpgt -> 107
/*    */     //   103: iconst_1
/*    */     //   104: goto -> 108
/*    */     //   107: iconst_0
/*    */     //   108: ifne -> 65
/*    */     //   111: iconst_0
/*    */     //   112: goto -> 116
/*    */     //   115: iconst_1
/*    */     //   116: ifeq -> 121
/*    */     //   119: aload_0
/*    */     //   120: areturn
/*    */     //   121: aload_3
/*    */     //   122: checkcast java/lang/Iterable
/*    */     //   125: iload_1
/*    */     //   126: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*    */     //   129: checkcast java/lang/Iterable
/*    */     //   132: ldc '\\n'
/*    */     //   134: checkcast java/lang/CharSequence
/*    */     //   137: aconst_null
/*    */     //   138: aconst_null
/*    */     //   139: iconst_0
/*    */     //   140: aconst_null
/*    */     //   141: iload_2
/*    */     //   142: <illegal opcode> invoke : (I)Lkotlin/jvm/functions/Function1;
/*    */     //   147: bipush #30
/*    */     //   149: aconst_null
/*    */     //   150: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   153: astore #5
/*    */     //   155: new java/lang/StringBuilder
/*    */     //   158: dup
/*    */     //   159: invokespecial <init> : ()V
/*    */     //   162: astore #6
/*    */     //   164: aload #6
/*    */     //   166: astore #7
/*    */     //   168: iconst_0
/*    */     //   169: istore #8
/*    */     //   171: aload #7
/*    */     //   173: iload_1
/*    */     //   174: iload_2
/*    */     //   175: <illegal opcode> makeConcatWithConstants : (II)Ljava/lang/String;
/*    */     //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   183: dup
/*    */     //   184: ldc 'append(...)'
/*    */     //   186: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   189: bipush #10
/*    */     //   191: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   194: dup
/*    */     //   195: ldc 'append(...)'
/*    */     //   197: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   200: pop
/*    */     //   201: aload #7
/*    */     //   203: aload #5
/*    */     //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   208: dup
/*    */     //   209: ldc 'append(...)'
/*    */     //   211: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   214: bipush #10
/*    */     //   216: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   219: dup
/*    */     //   220: ldc 'append(...)'
/*    */     //   222: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   225: pop
/*    */     //   226: nop
/*    */     //   227: aload #6
/*    */     //   229: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   232: dup
/*    */     //   233: ldc 'toString(...)'
/*    */     //   235: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   238: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 0
/*    */     //   #8	-> 8
/*    */     //   #9	-> 16
/*    */     //   #226	-> 31
/*    */     //   #227	-> 56
/*    */     //   #9	-> 94
/*    */     //   #227	-> 108
/*    */     //   #228	-> 115
/*    */     //   #9	-> 116
/*    */     //   #10	-> 119
/*    */     //   #13	-> 121
/*    */     //   #14	-> 155
/*    */     //   #15	-> 171
/*    */     //   #16	-> 201
/*    */     //   #17	-> 226
/*    */     //   #14	-> 227
/*    */     //   #14	-> 238
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   94	14	10	$i$a$-all-TestPresentationUtilsKt$truncateMessageIfNeeded$1	I
/*    */     //   91	17	9	it	Ljava/lang/String;
/*    */     //   84	31	8	element$iv	Ljava/lang/Object;
/*    */     //   31	85	6	$i$f$all	I
/*    */     //   28	88	5	$this$all$iv	Ljava/lang/Iterable;
/*    */     //   171	56	8	$i$a$-buildString-TestPresentationUtilsKt$truncateMessageIfNeeded$2	I
/*    */     //   168	59	7	$this$truncateMessageIfNeeded_u24lambda_u242	Ljava/lang/StringBuilder;
/*    */     //   8	231	3	lines	Ljava/util/List;
/*    */     //   16	223	4	totalLines	I
/*    */     //   155	84	5	truncatedMessage	Ljava/lang/String;
/*    */     //   0	239	0	message	Ljava/lang/String;
/*    */     //   0	239	1	maxLines	I
/*    */     //   0	239	2	maxLineLength	I
/*    */   }
/*    */   
/*    */   private static final CharSequence truncateMessageIfNeeded$lambda$1(int $maxLineLength, String it) {
/* 13 */     Intrinsics.checkNotNullParameter(it, "it"); return StringsKt.take(it, $maxLineLength);
/*    */   }
/*    */ 
/*    */   
/*    */   private static final String truncateTraceIfNeeded(List frames, int maxLines, int maxCharPerLine) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokeinterface size : ()I
/*    */     //   6: iload_1
/*    */     //   7: if_icmpgt -> 128
/*    */     //   10: aload_0
/*    */     //   11: checkcast java/lang/Iterable
/*    */     //   14: astore_3
/*    */     //   15: iconst_0
/*    */     //   16: istore #4
/*    */     //   18: aload_3
/*    */     //   19: instanceof java/util/Collection
/*    */     //   22: ifeq -> 41
/*    */     //   25: aload_3
/*    */     //   26: checkcast java/util/Collection
/*    */     //   29: invokeinterface isEmpty : ()Z
/*    */     //   34: ifeq -> 41
/*    */     //   37: iconst_1
/*    */     //   38: goto -> 100
/*    */     //   41: aload_3
/*    */     //   42: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   47: astore #5
/*    */     //   49: aload #5
/*    */     //   51: invokeinterface hasNext : ()Z
/*    */     //   56: ifeq -> 99
/*    */     //   59: aload #5
/*    */     //   61: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   66: astore #6
/*    */     //   68: aload #6
/*    */     //   70: checkcast java/lang/String
/*    */     //   73: astore #7
/*    */     //   75: iconst_0
/*    */     //   76: istore #8
/*    */     //   78: aload #7
/*    */     //   80: invokevirtual length : ()I
/*    */     //   83: iload_2
/*    */     //   84: if_icmpgt -> 91
/*    */     //   87: iconst_1
/*    */     //   88: goto -> 92
/*    */     //   91: iconst_0
/*    */     //   92: ifne -> 49
/*    */     //   95: iconst_0
/*    */     //   96: goto -> 100
/*    */     //   99: iconst_1
/*    */     //   100: ifeq -> 128
/*    */     //   103: aload_0
/*    */     //   104: checkcast java/lang/Iterable
/*    */     //   107: ldc '\\n'
/*    */     //   109: checkcast java/lang/CharSequence
/*    */     //   112: aconst_null
/*    */     //   113: aconst_null
/*    */     //   114: iconst_0
/*    */     //   115: aconst_null
/*    */     //   116: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   121: bipush #30
/*    */     //   123: aconst_null
/*    */     //   124: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   127: areturn
/*    */     //   128: aload_0
/*    */     //   129: checkcast java/lang/Iterable
/*    */     //   132: iload_1
/*    */     //   133: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*    */     //   136: checkcast java/lang/Iterable
/*    */     //   139: astore #4
/*    */     //   141: iconst_0
/*    */     //   142: istore #5
/*    */     //   144: aload #4
/*    */     //   146: astore #6
/*    */     //   148: new java/util/ArrayList
/*    */     //   151: dup
/*    */     //   152: aload #4
/*    */     //   154: bipush #10
/*    */     //   156: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   159: invokespecial <init> : (I)V
/*    */     //   162: checkcast java/util/Collection
/*    */     //   165: astore #7
/*    */     //   167: iconst_0
/*    */     //   168: istore #8
/*    */     //   170: aload #6
/*    */     //   172: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   177: astore #9
/*    */     //   179: aload #9
/*    */     //   181: invokeinterface hasNext : ()Z
/*    */     //   186: ifeq -> 230
/*    */     //   189: aload #9
/*    */     //   191: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   196: astore #10
/*    */     //   198: aload #7
/*    */     //   200: aload #10
/*    */     //   202: checkcast java/lang/String
/*    */     //   205: astore #11
/*    */     //   207: astore #13
/*    */     //   209: iconst_0
/*    */     //   210: istore #12
/*    */     //   212: aload #11
/*    */     //   214: iload_2
/*    */     //   215: invokestatic take : (Ljava/lang/String;I)Ljava/lang/String;
/*    */     //   218: aload #13
/*    */     //   220: swap
/*    */     //   221: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   226: pop
/*    */     //   227: goto -> 179
/*    */     //   230: aload #7
/*    */     //   232: checkcast java/util/List
/*    */     //   235: nop
/*    */     //   236: checkcast java/lang/Iterable
/*    */     //   239: ldc '\\n'
/*    */     //   241: checkcast java/lang/CharSequence
/*    */     //   244: aconst_null
/*    */     //   245: aconst_null
/*    */     //   246: iconst_0
/*    */     //   247: aconst_null
/*    */     //   248: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   253: bipush #30
/*    */     //   255: aconst_null
/*    */     //   256: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   259: astore_3
/*    */     //   260: aload_0
/*    */     //   261: invokeinterface size : ()I
/*    */     //   266: iload_1
/*    */     //   267: if_icmpgt -> 272
/*    */     //   270: aload_3
/*    */     //   271: areturn
/*    */     //   272: new java/lang/StringBuilder
/*    */     //   275: dup
/*    */     //   276: invokespecial <init> : ()V
/*    */     //   279: astore #4
/*    */     //   281: aload #4
/*    */     //   283: astore #5
/*    */     //   285: iconst_0
/*    */     //   286: istore #6
/*    */     //   288: aload #5
/*    */     //   290: aload_3
/*    */     //   291: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   294: dup
/*    */     //   295: ldc 'append(...)'
/*    */     //   297: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   300: bipush #10
/*    */     //   302: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   305: dup
/*    */     //   306: ldc 'append(...)'
/*    */     //   308: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   311: pop
/*    */     //   312: aload #5
/*    */     //   314: aload_0
/*    */     //   315: invokeinterface size : ()I
/*    */     //   320: iload_1
/*    */     //   321: isub
/*    */     //   322: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*    */     //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   330: dup
/*    */     //   331: ldc 'append(...)'
/*    */     //   333: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   336: bipush #10
/*    */     //   338: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   341: dup
/*    */     //   342: ldc 'append(...)'
/*    */     //   344: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   347: pop
/*    */     //   348: nop
/*    */     //   349: aload #4
/*    */     //   351: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   354: dup
/*    */     //   355: ldc 'toString(...)'
/*    */     //   357: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   360: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 0
/*    */     //   #229	-> 18
/*    */     //   #230	-> 41
/*    */     //   #22	-> 78
/*    */     //   #230	-> 92
/*    */     //   #231	-> 99
/*    */     //   #22	-> 100
/*    */     //   #23	-> 103
/*    */     //   #26	-> 128
/*    */     //   #232	-> 144
/*    */     //   #233	-> 170
/*    */     //   #234	-> 198
/*    */     //   #26	-> 212
/*    */     //   #234	-> 221
/*    */     //   #235	-> 230
/*    */     //   #232	-> 235
/*    */     //   #26	-> 239
/*    */     //   #27	-> 260
/*    */     //   #28	-> 270
/*    */     //   #31	-> 272
/*    */     //   #32	-> 288
/*    */     //   #33	-> 312
/*    */     //   #34	-> 348
/*    */     //   #31	-> 349
/*    */     //   #31	-> 360
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   78	14	8	$i$a$-all-TestPresentationUtilsKt$truncateTraceIfNeeded$1	I
/*    */     //   75	17	7	it	Ljava/lang/String;
/*    */     //   68	31	6	element$iv	Ljava/lang/Object;
/*    */     //   18	82	4	$i$f$all	I
/*    */     //   15	85	3	$this$all$iv	Ljava/lang/Iterable;
/*    */     //   212	6	12	$i$a$-map-TestPresentationUtilsKt$truncateTraceIfNeeded$truncatedTrace$1	I
/*    */     //   209	9	11	it	Ljava/lang/String;
/*    */     //   198	29	10	item$iv$iv	Ljava/lang/Object;
/*    */     //   170	62	8	$i$f$mapTo	I
/*    */     //   167	65	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   167	65	7	destination$iv$iv	Ljava/util/Collection;
/*    */     //   144	92	5	$i$f$map	I
/*    */     //   141	95	4	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   288	61	6	$i$a$-buildString-TestPresentationUtilsKt$truncateTraceIfNeeded$3	I
/*    */     //   285	64	5	$this$truncateTraceIfNeeded_u24lambda_u247	Ljava/lang/StringBuilder;
/*    */     //   260	101	3	truncatedTrace	Ljava/lang/String;
/*    */     //   0	361	0	frames	Ljava/util/List;
/*    */     //   0	361	1	maxLines	I
/*    */     //   0	361	2	maxCharPerLine	I
/*    */   }
/*    */ 
/*    */   
/*    */   private static final CharSequence truncateTraceIfNeeded$lambda$4(String it) {
/* 23 */     Intrinsics.checkNotNullParameter(it, "it"); return "\tat " + it;
/*    */   }
/*    */   private static final CharSequence truncateTraceIfNeeded$lambda$6(String it) {
/* 26 */     Intrinsics.checkNotNullParameter(it, "it"); return "\tat " + it;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\TestPresentationUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */