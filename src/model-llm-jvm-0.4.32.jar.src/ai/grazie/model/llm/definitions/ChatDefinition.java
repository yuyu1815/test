/*    */ package ai.grazie.model.llm.definitions;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.Map;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\b\n\002\020\"\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\020 \n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\b\030\0002\0020\001B;\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022$\b\002\020\006\032\036\022\004\022\0020\b\022\024\022\022\022\004\022\0020\n\022\004\022\0020\n0\tj\002`\0130\007¢\006\002\020\fJ$\020\030\032\0020\n2\006\020\031\032\0020\0322\006\020\033\032\0020\n2\f\020\006\032\b\022\004\022\0020\b0\034J\t\020\035\032\0020\003HÆ\003J\t\020\036\032\0020\005HÆ\003J%\020\037\032\036\022\004\022\0020\b\022\024\022\022\022\004\022\0020\n\022\004\022\0020\n0\tj\002`\0130\007HÆ\003JC\020 \032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052$\b\002\020\006\032\036\022\004\022\0020\b\022\024\022\022\022\004\022\0020\n\022\004\022\0020\n0\tj\002`\0130\007HÆ\001J\023\020!\032\0020\"2\b\020#\032\004\030\0010$HÖ\003J\t\020%\032\0020&HÖ\001J\t\020'\032\0020\032HÖ\001J\026\020(\032\0020)2\006\020*\032\0020\0322\006\020+\032\0020,R-\020\006\032\036\022\004\022\0020\b\022\024\022\022\022\004\022\0020\n\022\004\022\0020\n0\tj\002`\0130\007¢\006\b\n\000\032\004\b\r\020\016R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\017\020\020R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\021\020\022R\027\020\023\032\b\022\004\022\0020\0250\0248F¢\006\006\032\004\b\026\020\027¨\006-"}, d2 = {"Lai/grazie/model/llm/definitions/ChatDefinition;", "Lai/grazie/model/llm/definitions/LLMFeatureDefinition;", "roleDefinition", "Lai/grazie/model/llm/definitions/RoleDefinition;", "parameterDefinition", "Lai/grazie/model/llm/definitions/ParameterDefinition;", "options", "", "Lai/grazie/utils/attributes/Attributes$Key;", "Lkotlin/Function1;", "Lai/grazie/utils/attributes/Attributes;", "Lai/grazie/model/llm/definitions/OptionConfigurer;", "(Lai/grazie/model/llm/definitions/RoleDefinition;Lai/grazie/model/llm/definitions/ParameterDefinition;Ljava/util/Map;)V", "getOptions", "()Ljava/util/Map;", "getParameterDefinition", "()Lai/grazie/model/llm/definitions/ParameterDefinition;", "getRoleDefinition", "()Lai/grazie/model/llm/definitions/RoleDefinition;", "supportedRoles", "", "Lai/grazie/model/llm/chat/LLMChatRole;", "getSupportedRoles", "()Ljava/util/Set;", "applyOptions", "profileName", "", "attributes", "", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "validateChat", "", "name", "chat", "Lai/grazie/model/llm/chat/v5/LLMChat;", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nChatDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatDefinition.kt\nai/grazie/model/llm/definitions/ChatDefinition\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1797#2,3:81\n*S KotlinDebug\n*F\n+ 1 ChatDefinition.kt\nai/grazie/model/llm/definitions/ChatDefinition\n*L\n42#1:81,3\n*E\n"})
/*    */ public final class ChatDefinition implements LLMFeatureDefinition {
/*    */   @NotNull
/*    */   private final RoleDefinition roleDefinition;
/*    */   @NotNull
/*    */   private final ParameterDefinition parameterDefinition;
/*    */   @NotNull
/*    */   private final Map<Attributes.Key, Function1<Attributes, Attributes>> options;
/*    */   
/* 19 */   public ChatDefinition(@NotNull RoleDefinition roleDefinition, @NotNull ParameterDefinition parameterDefinition, @NotNull Map<Attributes.Key, Function1<Attributes, Attributes>> options) { this.roleDefinition = roleDefinition;
/* 20 */     this.parameterDefinition = parameterDefinition;
/* 21 */     this.options = options; } @NotNull public final RoleDefinition getRoleDefinition() { return this.roleDefinition; } @NotNull public final Map<Attributes.Key, Function1<Attributes, Attributes>> getOptions() { return this.options; } @NotNull
/*    */   public ParameterDefinition getParameterDefinition() {
/*    */     return this.parameterDefinition;
/*    */   } public final void validateChat(@NotNull String name, @NotNull LLMChat chat) {
/* 25 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(chat, "chat"); ExtensionsKt.requireOrBadRequest(!(((chat.getMessages()).length == 0) ? 1 : 0), ChatDefinition$validateChat$1.INSTANCE);
/* 26 */     this.roleDefinition.validateMessages(name, chat.getMessages());
/*    */   } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class ChatDefinition$validateChat$1 extends Lambda implements Function0<String> {
/*    */     public static final ChatDefinition$validateChat$1 INSTANCE = new ChatDefinition$validateChat$1(); ChatDefinition$validateChat$1() { super(0); } public final String invoke() { return "Chat messages cannot be empty"; } }
/*    */   @NotNull
/* 30 */   public final Set<LLMChatRole> getSupportedRoles() { return this.roleDefinition.getSupportedRoles(); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Attributes applyOptions(@NotNull String profileName, @NotNull Attributes attributes, @NotNull List options) {
/* 42 */     Intrinsics.checkNotNullParameter(profileName, "profileName"); Intrinsics.checkNotNullParameter(attributes, "attributes"); Intrinsics.checkNotNullParameter(options, "options"); Iterable $this$fold$iv = options; int $i$f$fold = 0;
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
/* 81 */     Object accumulator$iv = attributes;
/* 82 */     for (Object element$iv : $this$fold$iv) { Attributes.Key key = (Attributes.Key)element$iv; Object object1 = accumulator$iv; int $i$a$-fold-ChatDefinition$applyOptions$1 = 0; Function1 configurator = this.options.get(key); ExtensionsKt.requireNotNullOrBadRequest(configurator, new ChatDefinition$applyOptions$1$1(key, profileName)); accumulator$iv = configurator.invoke(object1); }
/* 83 */      return (Attributes)accumulator$iv;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final RoleDefinition component1() {
/*    */     return this.roleDefinition;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ParameterDefinition component2() {
/*    */     return this.parameterDefinition;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<Attributes.Key, Function1<Attributes, Attributes>> component3() {
/*    */     return this.options;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ChatDefinition copy(@NotNull RoleDefinition roleDefinition, @NotNull ParameterDefinition parameterDefinition, @NotNull Map<Attributes.Key, ? extends Function1<? super Attributes, ? extends Attributes>> options) {
/*    */     Intrinsics.checkNotNullParameter(roleDefinition, "roleDefinition");
/*    */     Intrinsics.checkNotNullParameter(parameterDefinition, "parameterDefinition");
/*    */     Intrinsics.checkNotNullParameter(options, "options");
/*    */     return new ChatDefinition(roleDefinition, parameterDefinition, options);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ChatDefinition(roleDefinition=" + this.roleDefinition + ", parameterDefinition=" + this.parameterDefinition + ", options=" + this.options + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.roleDefinition.hashCode();
/*    */     result = result * 31 + this.parameterDefinition.hashCode();
/*    */     return result * 31 + this.options.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ChatDefinition))
/*    */       return false; 
/*    */     ChatDefinition chatDefinition = (ChatDefinition)other;
/*    */     return !Intrinsics.areEqual(this.roleDefinition, chatDefinition.roleDefinition) ? false : (!Intrinsics.areEqual(this.parameterDefinition, chatDefinition.parameterDefinition) ? false : (!!Intrinsics.areEqual(this.options, chatDefinition.options)));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class ChatDefinition$applyOptions$1$1 extends Lambda implements Function0<String> {
/*    */     ChatDefinition$applyOptions$1$1(Attributes.Key $option, String $profileName) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final String invoke() {
/*    */       return "Option " + this.$option.getFqdn() + "} is not supported for " + this.$profileName + " profile";
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\ChatDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */