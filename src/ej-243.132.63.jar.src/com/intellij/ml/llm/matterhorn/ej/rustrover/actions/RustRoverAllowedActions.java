/*   */ package com.intellij.ml.llm.matterhorn.ej.rustrover.actions;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\020\016\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003R\032\020\004\032\b\022\004\022\0020\0060\0058VX\004¢\006\006\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rustrover/actions/RustRoverAllowedActions;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$CommandsProvider;", "<init>", "()V", "commands", "", "", "getCommands", "()Ljava/util/List;", "ej-rustrover"})
/*   */ public final class RustRoverAllowedActions implements ProductSpecificAllowedCommands.CommandsProvider {
/*   */   @NotNull
/*   */   public List<String> getCommands() {
/* 7 */     String[] arrayOfString = new String[3]; arrayOfString[0] = "cargo check"; arrayOfString[1] = "cargo build"; arrayOfString[2] = "cargo clippy"; return CollectionsKt.listOf((Object[])arrayOfString);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rustrover\actions\RustRoverAllowedActions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */