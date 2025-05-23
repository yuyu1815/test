/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\r\030\000 \026*\004\b\000\020\0012\0020\002:\001\026B;\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0028\0000\006\022\022\020\007\032\016\022\002\b\003\022\004\022\0028\000\030\0010\b\022\b\b\002\020\t\032\0020\n¢\006\004\b\013\020\fJ\b\020\025\032\0020\004H\026R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\r\020\016R\027\020\005\032\b\022\004\022\0028\0000\006¢\006\b\n\000\032\004\b\017\020\020R\035\020\007\032\016\022\002\b\003\022\004\022\0028\000\030\0010\b¢\006\b\n\000\032\004\b\021\020\022R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\023\020\024¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "O", "", "name", "", "serializer", "Lkotlinx/serialization/KSerializer;", "executor", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "rebuildRoot", "", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;Z)V", "getName", "()Ljava/lang/String;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "getExecutor", "()Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "getRebuildRoot", "()Z", "toString", "Companion", "core"})
/*    */ public final class ArtifactType<O> { @NotNull
/*    */   public final String getName() {
/*    */     return this.name;
/*    */   }
/*    */   @NotNull
/*    */   public final KSerializer<O> getSerializer() {
/*    */     return this.serializer;
/*    */   }
/*    */   
/* 12 */   public ArtifactType(@NotNull String name, @NotNull KSerializer<O> serializer, @Nullable ArtifactRequestExecutor<?, O> executor, boolean rebuildRoot) { this.name = name; this.serializer = serializer; this.executor = executor; this.rebuildRoot = rebuildRoot;
/*    */     
/* 14 */     nameToType.put(this.name, this); }
/*    */   @Nullable public final ArtifactRequestExecutor<?, O> getExecutor() { return this.executor; }
/*    */   public final boolean getRebuildRoot() { return this.rebuildRoot; } @NotNull
/* 17 */   public String toString() { return this.name; }
/*    */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020%\n\002\020\016\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\b\032\b\022\002\b\003\030\0010\0072\006\020\t\032\0020\006R\036\020\004\032\022\022\004\022\0020\006\022\b\022\006\022\002\b\0030\0070\005X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactType$Companion;", "", "<init>", "()V", "nameToType", "", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "findByName", "name", "core"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @Nullable
/*    */     public final ArtifactType<?> findByName(@NotNull String name) {
/* 22 */       Intrinsics.checkNotNullParameter(name, "name"); return (ArtifactType)ArtifactType.nameToType.get(name);
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final KSerializer<O> serializer;
/*    */   @Nullable
/*    */   private final ArtifactRequestExecutor<?, O> executor;
/*    */   private final boolean rebuildRoot;
/*    */   @NotNull
/*    */   private static final Map<String, ArtifactType<?>> nameToType = new LinkedHashMap<>(); }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */