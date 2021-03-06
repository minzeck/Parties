package com.alessiodp.parties.api.events.common.player;

import com.alessiodp.parties.api.events.PartiesEvent;
import com.alessiodp.parties.api.interfaces.Party;
import com.alessiodp.parties.api.interfaces.PartyPlayer;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.UUID;

public interface IPlayerPostJoinEvent extends PartiesEvent {
	/**
	 * Get the player that joined the party
	 *
	 * @return Returns the {@link PartyPlayer}
	 */
	@NonNull
	PartyPlayer getPartyPlayer();
	
	/**
	 * Get the party
	 *
	 * @return Returns the {@link Party}
	 */
	@NonNull
	Party getParty();
	
	/**
	 * Has been invited?
	 *
	 * @return Returns {@code true} if the player has been invited
	 */
	boolean isInvited();
	
	/**
	 * Get the inviter
	 *
	 * @return Returns the {@code UUID} of the inviter, {@code null} if the player joined via join command
	 */
	@Nullable
	UUID getInviter();
	
}
