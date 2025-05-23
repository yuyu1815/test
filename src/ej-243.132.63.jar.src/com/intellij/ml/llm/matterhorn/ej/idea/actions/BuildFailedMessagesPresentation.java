/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*     */ 
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\b\002\n\002\020\013\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\002J\026\020\f\032\0020\t2\f\020\r\032\b\022\004\022\0020\0130\016H\002J\034\020\017\032\0020\t2\f\020\r\032\b\022\004\022\0020\0130\0162\006\020\020\032\0020\021R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/BuildFailedMessagesPresentation;", "", "<init>", "()V", "MAX_CHARACTERS_PER_LINE", "", "MAX_LINES_PER_MESSAGE", "MAX_ERROR_BUILD_MESSAGES_DISPLAY_COUNT", "formatMessage", "", "message", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/BuildMessage;", "presentBuildMessages", "messages", "", "present", "success", "", "ej-idea"})
/*     */ @SourceDebugExtension({"SMAP\nTestPresentationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/BuildFailedMessagesPresentation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1053#2:226\n1557#2:227\n1628#2,3:228\n*S KotlinDebug\n*F\n+ 1 TestPresentationUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/BuildFailedMessagesPresentation\n*L\n178#1:226\n180#1:227\n180#1:228,3\n*E\n"})
/*     */ public final class BuildFailedMessagesPresentation
/*     */ {
/*     */   @NotNull
/*     */   public static final BuildFailedMessagesPresentation INSTANCE = new BuildFailedMessagesPresentation();
/*     */   private static final int MAX_CHARACTERS_PER_LINE = 700;
/*     */   private static final int MAX_LINES_PER_MESSAGE = 50;
/*     */   private static final int MAX_ERROR_BUILD_MESSAGES_DISPLAY_COUNT = 10;
/*     */   
/*     */   private final String formatMessage(BuildMessage message) {
/* 166 */     String messageText = TestPresentationUtilsKt.access$truncateMessageIfNeeded(message.getText(), 50, 700);
/* 167 */     if (message.getPosition() == null) {
/* 168 */       return messageText;
/*     */     }
/*     */     
/* 171 */     Path path = message.getPosition().getFile().toPath();
/* 172 */     return "" + path + " " + path + ":" + message.getPosition().getStartLine() + ": " + message.getPosition().getStartColumn();
/*     */   }
/*     */   
/*     */   private final String presentBuildMessages(List messages) {
/* 176 */     boolean exceededMessageLimitCount = (messages.size() > 10);
/* 177 */     List list1 = messages;
/* 178 */     int $i$f$sortedBy = 0;
/* 179 */     Iterable $this$sortedBy$iv = CollectionsKt.take(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 226 */         CollectionsKt.sortedWith(list1, new BuildFailedMessagesPresentation$presentBuildMessages$$inlined$sortedBy$1()), 10); int $i$f$map = 0;
/* 227 */     Iterable iterable1 = $this$sortedBy$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$sortedBy$iv, 10)); int $i$f$mapTo = 0;
/* 228 */     for (Object item$iv$iv : iterable1) {
/* 229 */       BuildMessage buildMessage = (BuildMessage)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-BuildFailedMessagesPresentation$presentBuildMessages$messageTexts$2 = 0; collection.add(INSTANCE.formatMessage(buildMessage));
/* 230 */     }  List messageTexts = (List)destination$iv$iv;
/*     */     StringBuilder stringBuilder1 = new StringBuilder(), $this$presentBuildMessages_u24lambda_u242 = stringBuilder1;
/*     */     int $i$a$-buildString-BuildFailedMessagesPresentation$presentBuildMessages$1 = 0;
/*     */     if (exceededMessageLimitCount) {
/*     */       Intrinsics.checkNotNullExpressionValue($this$presentBuildMessages_u24lambda_u242.append("Showed first 10 of " + messages.size() + " build error messages."), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue($this$presentBuildMessages_u24lambda_u242.append("Showed first 10 of " + messages.size() + " build error messages.").append('\n'), "append(...)");
/*     */       $this$presentBuildMessages_u24lambda_u242.append("Showed first 10 of " + messages.size() + " build error messages.").append('\n');
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue($this$presentBuildMessages_u24lambda_u242.append(CollectionsKt.joinToString$default(messageTexts, "\n", null, null, 0, null, null, 62, null)), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$presentBuildMessages_u24lambda_u242.append(CollectionsKt.joinToString$default(messageTexts, "\n", null, null, 0, null, null, 62, null)).append('\n'), "append(...)");
/*     */     $this$presentBuildMessages_u24lambda_u242.append(CollectionsKt.joinToString$default(messageTexts, "\n", null, null, 0, null, null, 62, null)).append('\n');
/*     */     if (exceededMessageLimitCount) {
/*     */       Intrinsics.checkNotNullExpressionValue($this$presentBuildMessages_u24lambda_u242.append("... and " + messages.size() - 10 + " more build error messages."), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue($this$presentBuildMessages_u24lambda_u242.append("... and " + messages.size() - 10 + " more build error messages.").append('\n'), "append(...)");
/*     */       $this$presentBuildMessages_u24lambda_u242.append("... and " + messages.size() - 10 + " more build error messages.").append('\n');
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String present(@NotNull List<BuildMessage> messages, boolean success) {
/*     */     Intrinsics.checkNotNullParameter(messages, "messages");
/*     */     StringBuilder stringBuilder1 = new StringBuilder(), $this$present_u24lambda_u243 = stringBuilder1;
/*     */     int $i$a$-buildString-BuildFailedMessagesPresentation$present$1 = 0;
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u243.append("ERROR: Build completed with errors during test run:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u243.append("ERROR: Build completed with errors during test run:").append('\n'), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u243.append("ERROR: Build failed with following errors:"), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u243.append("ERROR: Build failed with following errors:").append('\n'), "append(...)");
/*     */     success ? $this$present_u24lambda_u243.append("ERROR: Build completed with errors during test run:").append('\n') : $this$present_u24lambda_u243.append("ERROR: Build failed with following errors:").append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u243.append(INSTANCE.presentBuildMessages(messages)), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue($this$present_u24lambda_u243.append(INSTANCE.presentBuildMessages(messages)).append('\n'), "append(...)");
/*     */     $this$present_u24lambda_u243.append(INSTANCE.presentBuildMessages(messages)).append('\n');
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\BuildFailedMessagesPresentation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */