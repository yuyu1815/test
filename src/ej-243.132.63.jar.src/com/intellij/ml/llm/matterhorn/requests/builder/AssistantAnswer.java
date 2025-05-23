/*   */ package com.intellij.ml.llm.matterhorn.requests.builder;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;", "", "message", "", "hasToolCalls", "", "<init>", "(Ljava/lang/String;Z)V", "getMessage", "()Ljava/lang/String;", "getHasToolCalls", "()Z", "core"})
/*   */ public final class AssistantAnswer { @NotNull
/* 3 */   private final String message; public AssistantAnswer(@NotNull String message, boolean hasToolCalls) { this.message = message; this.hasToolCalls = hasToolCalls; } private final boolean hasToolCalls; @NotNull public final String getMessage() { return this.message; } public final boolean getHasToolCalls() { return this.hasToolCalls; }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\AssistantAnswer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */