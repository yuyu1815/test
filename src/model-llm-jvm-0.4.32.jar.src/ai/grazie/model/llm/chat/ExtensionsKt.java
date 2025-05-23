/*    */ package ai.grazie.model.llm.chat;
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002¨\006\003"}, d2 = {"toV5", "Lai/grazie/model/llm/chat/v5/LLMChat;", "Lai/grazie/model/llm/chat/LLMChat;", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nai/grazie/model/llm/chat/ExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,17:1\n11158#2:18\n11493#2,3:19\n37#3:22\n36#3,3:23\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nai/grazie/model/llm/chat/ExtensionsKt\n*L\n8#1:18\n8#1:19,3\n15#1:22\n15#1:23,3\n*E\n"})
/*    */ public final class ExtensionsKt {
/*    */   @NotNull
/*    */   public static final LLMChat toV5(@NotNull LLMChat $this$toV5) {
/*  7 */     Intrinsics.checkNotNullParameter($this$toV5, "<this>");
/*  8 */     LLMChatMessage[] arrayOfLLMChatMessage1 = $this$toV5.getMessages(); int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     LLMChatMessage[] arrayOfLLMChatMessage2 = arrayOfLLMChatMessage1; Collection destination$iv$iv = new ArrayList(arrayOfLLMChatMessage1.length); int $i$f$mapTo = 0; byte b; int i;
/* 19 */     for (b = 0, i = arrayOfLLMChatMessage2.length; b < i; ) { Object item$iv$iv = arrayOfLLMChatMessage2[b];
/* 20 */       Object object1 = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-ExtensionsKt$toV5$1 = 0; switch (WhenMappings.$EnumSwitchMapping$0[object1.getRole().ordinal()]) { case 1: case 2: case 3: case 4: throw new IllegalStateException("Chat with functions cannot be migrated to V5".toString());
/* 21 */         default: throw new NoWhenBranchMatchedException(); }  }  List list = (List)destination$iv$iv;
/*    */     int $i$f$toTypedArray = 0;
/* 23 */     Collection thisCollection$iv = list;
/*    */     
/* 25 */     LLMChatMessage[] arrayOfLLMChatMessage = (LLMChatMessage[])thisCollection$iv.toArray((Object[])new LLMChatMessage[0]);
/*    */     return new LLMChat(arrayOfLLMChatMessage);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */