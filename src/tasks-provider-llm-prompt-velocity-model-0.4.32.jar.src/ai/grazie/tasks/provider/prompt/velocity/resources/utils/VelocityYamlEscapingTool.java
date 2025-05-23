/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.utils;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\004\bÆ\002\030\0002\0020\001:\001\bB\t\b\002¢\006\004\b\002\020\003J\016\020\006\032\0020\0052\006\020\007\032\0020\005R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\t"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/utils/VelocityYamlEscapingTool;", "", "<init>", "()V", "CONTENT_STRING", "", "escape", "text", "Wrapper", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityYamlEscapingTool { @NotNull
/*    */   public static final VelocityYamlEscapingTool INSTANCE = new VelocityYamlEscapingTool(); @NotNull
/*    */   private static final String CONTENT_STRING = "content: \""; @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\001HÖ\003J\t\020\r\032\0020\016HÖ\001J\t\020\017\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/utils/VelocityYamlEscapingTool$Wrapper;", "", "content", "", "<init>", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */   private static final class Wrapper { @NotNull
/*    */     private final String content;
/*  7 */     public Wrapper(@NotNull String content) { this.content = content; } @NotNull public final String component1() { return this.content; } @NotNull public final Wrapper copy(@NotNull String content) { Intrinsics.checkNotNullParameter(content, "content"); return new Wrapper(content); } @NotNull public String toString() { return "Wrapper(content=" + this.content + ")"; } @NotNull public final String getContent() { return this.content; }
/*    */     public int hashCode() { return this.content.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other)
/*    */         return true;  if (!(other instanceof Wrapper))
/*    */         return false;  Wrapper wrapper = (Wrapper)other;
/*    */       return !!Intrinsics.areEqual(this.content, wrapper.content); } }
/* 12 */    @NotNull public final String escape(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); Wrapper wrap = new Wrapper(text);
/* 13 */     ObjectMapper mapper = new ObjectMapper((JsonFactory)new YAMLFactory());
/* 14 */     String yamlRepresentation = mapper.writeValueAsString(wrap);
/* 15 */     Intrinsics.checkNotNull(yamlRepresentation); return StringsKt.substringBeforeLast$default(StringsKt.substringAfter$default(yamlRepresentation, "content: \"", null, 2, null), "\"\n", null, 2, null); }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resource\\utils\VelocityYamlEscapingTool.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */