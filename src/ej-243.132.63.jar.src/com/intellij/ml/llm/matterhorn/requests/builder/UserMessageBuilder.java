/*    */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*    */ import com.intellij.ml.llm.matterhorn.collections.AddOnlyList;
/*    */ import com.intellij.ml.llm.matterhorn.requests.GrazieRequest;
/*    */ 
/*    */ @JvmInline
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\005\n\002\030\002\n\000\n\002\020\022\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020 \n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\006\b@\030\0002\0020\001B\027\b\000\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006B\t\b\026¢\006\004\b\005\020\007J!\020\b\032\0020\0002\006\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\n¢\006\004\b\f\020\rJ)\020\016\032\0020\0002\006\020\017\032\0020\0202\006\020\021\032\0020\0222\n\b\002\020\023\032\004\030\0010\n¢\006\004\b\024\020\025J!\020\026\032\0020\0272\006\020\030\032\0020\n2\n\b\002\020\031\032\004\030\0010\032¢\006\004\b\033\020\034J\025\020\035\032\0020\0272\006\020\036\032\0020\000¢\006\004\b\037\020 J\023\020!\032\b\022\004\022\0020\0040\"¢\006\004\b#\020$J\032\020%\032\0020&2\b\020'\032\004\030\0010\001HÖ\003¢\006\004\b(\020)J\020\020*\032\0020+HÖ\001¢\006\004\b,\020-J\020\020.\032\0020\nHÖ\001¢\006\004\b/\0200R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000\001\002\001\b\022\004\022\0020\0040\003¨\0061"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/UserMessageBuilder;", "", "contentParts", "Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;", "constructor-impl", "(Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;)Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "()Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "addText", "message", "", "title", "addText-aPqWSj0", "(Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;Ljava/lang/String;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "addImage", "contentType", "Lio/ktor/http/ContentType;", "imageData", "", "imageName", "addImage-AgeAp1E", "(Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;Lio/ktor/http/ContentType;[BLjava/lang/String;)Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "addFile", "", "filePath", "source", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "addFile-impl", "(Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;)V", "addFrom", "builder", "addFrom-U-FbYDk", "(Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;)V", "build", "", "build-impl", "(Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;)Ljava/util/List;", "equals", "", "other", "equals-impl", "(Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;)I", "toString", "toString-impl", "(Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;)Ljava/lang/String;", "core"})
/*    */ @SourceDebugExtension({"SMAP\nUserMessageBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMessageBuilder.kt\ncom/intellij/ml/llm/matterhorn/requests/builder/UserMessageBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/*    */ public final class UserMessageBuilder {
/*    */   @NotNull
/*    */   public static AddOnlyList<GrazieRequest.Content> constructor-impl() {
/* 11 */     return constructor-impl(new AddOnlyList());
/*    */   }
/*    */   @NotNull
/*    */   private final AddOnlyList<GrazieRequest.Content> contentParts;
/*    */   @NotNull
/*    */   public static final AddOnlyList<GrazieRequest.Content> addText-aPqWSj0(AddOnlyList<GrazieRequest.Content> arg0, @NotNull String message, @Nullable String title) {
/* 17 */     Intrinsics.checkNotNullParameter(message, "message"); arg0.add(new TextContent(message, title));
/* 18 */     return arg0;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final AddOnlyList<GrazieRequest.Content> addImage-AgeAp1E(AddOnlyList<GrazieRequest.Content> arg0, @NotNull ContentType contentType, @NotNull byte[] imageData, @Nullable String imageName) {
/* 26 */     Intrinsics.checkNotNullParameter(contentType, "contentType"); Intrinsics.checkNotNullParameter(imageData, "imageData"); if (imageName != null) { String it = imageName;
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
/* 50 */       int $i$a$-let-UserMessageBuilder$addImage$1 = 0;
/*    */       arg0.add(new TextContent(imageName + ": ", null, 2, null)); }
/*    */     else
/*    */     {  }
/*    */     
/*    */     arg0.add(new ImageContent(contentType, imageData));
/*    */     return arg0;
/*    */   }
/*    */   
/*    */   public static final void addFile-impl(AddOnlyList arg0, @NotNull String filePath, @Nullable ProjectFileStructure source) {
/*    */     Intrinsics.checkNotNullParameter(filePath, "filePath");
/*    */     arg0.add(new FileContent(filePath, source));
/*    */   }
/*    */   
/*    */   public static final void addFrom-U-FbYDk(AddOnlyList arg0, @NotNull AddOnlyList builder) {
/*    */     Intrinsics.checkNotNullParameter(builder, "builder");
/*    */     for (GrazieRequest.Content content : builder)
/*    */       arg0.add(content); 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final List<GrazieRequest.Content> build-impl(AddOnlyList arg0) {
/*    */     return arg0.subList(0, arg0.size());
/*    */   }
/*    */   
/*    */   public static String toString-impl(AddOnlyList arg0) {
/*    */     return "UserMessageBuilder(contentParts=" + arg0 + ")";
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     return toString-impl(this.contentParts);
/*    */   }
/*    */   
/*    */   public static int hashCode-impl(AddOnlyList arg0) {
/*    */     return arg0.hashCode();
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return hashCode-impl(this.contentParts);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(AddOnlyList arg0, Object other) {
/*    */     return !(other instanceof UserMessageBuilder) ? false : (!!Intrinsics.areEqual(arg0, ((UserMessageBuilder)other).unbox-impl()));
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.contentParts, other);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static AddOnlyList<GrazieRequest.Content> constructor-impl(@NotNull AddOnlyList<GrazieRequest.Content> contentParts) {
/*    */     Intrinsics.checkNotNullParameter(contentParts, "contentParts");
/*    */     return contentParts;
/*    */   }
/*    */   
/*    */   public static final boolean equals-impl0(AddOnlyList p1, AddOnlyList p2) {
/*    */     return Intrinsics.areEqual(p1, p2);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\UserMessageBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */